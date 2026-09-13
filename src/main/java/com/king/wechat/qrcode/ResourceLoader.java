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
     * Get a classpath resource that can be mapped directly to a local file.
     *
     * <p>If the resource protocol is not file, callers should decide whether to
     * fall back to copying it into a temporary directory.
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
     * Get a classpath resource as a local file, copying it to a temporary file when needed.
     *
     * <p>This is useful when the downstream API requires a real file path.
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
     * Copy a non-file resource into the temporary directory as a real local file.
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
     * Create the temporary resource directory reused during the current process.
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
