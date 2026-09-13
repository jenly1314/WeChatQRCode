package com.king.wechat.qrcode;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

final class ResourceLoader {

    private static final File TEMP_RESOURCE_DIRECTORY = createTempResourceDirectory();

    private ResourceLoader() {
        throw new AssertionError();
    }

    /**
     * 获取 classpath 中可直接映射为本地文件的资源。
     *
     * <p>当资源协议不是 file 时，说明资源并不是一个可直接访问的本地文件，
     * 此时由调用方决定是否改用需要落地复制的方式处理。
     */
    static File getResourceFile(Class<?> owner, String resourcePath) throws IOException {
        URL url = owner.getClassLoader().getResource(resourcePath);
        if (url == null) {
            throw new IOException("Resource not found: " + resourcePath);
        }
        if (!"file".equalsIgnoreCase(url.getProtocol())) {
            throw new IOException("Resource is not a file: " + resourcePath + ", protocol: " + url.getProtocol());
        }
        try {
            return new File(url.toURI());
        } catch (Exception e) {
            throw new IOException("Failed to resolve resource path: " + resourcePath, e);
        }
    }

    /**
     * 获取 classpath 中的资源文件；如果资源不在本地文件系统中，则复制到临时目录后返回。
     *
     * <p>适用于调用方必须拿到一个真实 File 路径的场景，例如底层 API 仅接受文件绝对路径。
     */
    static File getResourceFileOrCopy(Class<?> owner, String resourcePath) throws IOException {
        URL url = owner.getClassLoader().getResource(resourcePath);
        if (url == null) {
            throw new IOException("Resource not found: " + resourcePath);
        }
        if ("file".equalsIgnoreCase(url.getProtocol())) {
            try {
                return new File(url.toURI());
            } catch (Exception e) {
                throw new IOException("Failed to resolve resource path: " + resourcePath, e);
            }
        }
        return copyResourceToTempFile(owner, resourcePath);
    }

    /**
     * 将非 file 协议的资源复制到临时目录，转换为可传递给本地 API 的真实文件。
     */
    private static File copyResourceToTempFile(Class<?> owner, String resourcePath) throws IOException {
        String fileName = new File(resourcePath).getName();
        String prefix = fileName;
        int dot = fileName.lastIndexOf('.');
        if (dot > 0) {
            prefix = fileName.substring(0, dot);
        }
        if (prefix.length() < 3) {
            throw new IOException("Invalid resource file name for temp file prefix: " + resourcePath);
        }
        Path tempFile = TEMP_RESOURCE_DIRECTORY.toPath().resolve(fileName);
        tempFile.toFile().deleteOnExit();
        try (InputStream inputStream = owner.getClassLoader().getResourceAsStream(resourcePath)) {
            if (inputStream == null) {
                throw new IOException("Resource not found: " + resourcePath);
            }
            Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
        }
        return tempFile.toFile();
    }

    /**
     * 创建当前进程生命周期内复用的临时资源目录。
     */
    private static File createTempResourceDirectory() {
        try {
            File tempDirectory = Files.createTempDirectory("wechat-qrcode-resources-").toFile();
            tempDirectory.deleteOnExit();
            return tempDirectory;
        } catch (IOException e) {
            throw new IllegalStateException("Failed to create temporary resource directory.", e);
        }
    }
}
