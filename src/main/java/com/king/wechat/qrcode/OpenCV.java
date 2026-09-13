package com.king.wechat.qrcode;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Platform;
import org.opencv.core.Core;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * OpenCV
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
public final class OpenCV {

    private static final Logger LOGGER = Logger.getLogger(OpenCV.class.getName());

    private OpenCV() {
        throw new AssertionError();
    }

    /**
     * 初始化 OpenCV
     */
    public static void init() throws Exception {
        initOpenCVFromResources();
    }

    /**
     * 初始化 OpenCV
     *
     * @param libDirPath opencv_java*.dll 或 libopencv_java*.so 所在文件夹
     */
    public static void init(String libDirPath) throws Exception {
        initOpenCVFromFileSystem(libDirPath);
    }

    /**
     * 从 resources 目录初始化 OpenCV。
     */
    private static void initOpenCVFromResources() throws Exception {
        logPlatformInfo();
        File nativeLibraryFile = ResourceLoader.getResourceFileOrCopy(OpenCV.class, resolveNativeLibraryResourcePath());
        NativeLibrary.addSearchPath(Core.NATIVE_LIBRARY_NAME, nativeLibraryFile.getParentFile().getAbsolutePath());
        NativeLibrary nativeLibrary = NativeLibrary.getInstance(Core.NATIVE_LIBRARY_NAME);
        System.load(nativeLibrary.getFile().getAbsolutePath());
        onLibraryLoaded();
    }

    /**
     * 初始化 OpenCV
     *
     * @param libDirPath opencv_java*.dll 或 libopencv_java*.so 所在文件夹
     */
    private static void initOpenCVFromFileSystem(String libDirPath) throws Exception {
        logPlatformInfo();
        File libOpencvFile = new File(libDirPath, System.mapLibraryName(Core.NATIVE_LIBRARY_NAME));
        System.load(libOpencvFile.getAbsolutePath());
        onLibraryLoaded();
    }

    /**
     * 根据当前系统环境返回 native 库资源路径。
     */
    private static String resolveNativeLibraryResourcePath() {
        if (Platform.isWindows() && Platform.is64Bit()) {
            return "natives/windows-x86-64/" + System.mapLibraryName(Core.NATIVE_LIBRARY_NAME);
        }
        if (Platform.isLinux()) {
            if (Platform.isARM()) {
                return "natives/linux-aarch64/" + System.mapLibraryName(Core.NATIVE_LIBRARY_NAME);
            }
            if (Platform.is64Bit()) {
                return "natives/linux-x86-64/" + System.mapLibraryName(Core.NATIVE_LIBRARY_NAME);
            }
        }
        throw unsupportedPlatformException();
    }

    /**
     * 输出当前系统和架构信息。
     */
    private static void logPlatformInfo() {
        LOGGER.log(Level.INFO,
                "os.name = " + System.getProperty("os.name") + ", os.arch = " + System.getProperty("os.arch"));
    }

    /**
     * 构造不支持平台时的异常信息。
     */
    private static UnsupportedOperationException unsupportedPlatformException() {
        return new UnsupportedOperationException(
                "Unsupported platform: os.name=" + System.getProperty("os.name") + ", os.arch=" + System.getProperty("os.arch"));
    }

    /**
     * 在 native 库加载完成后执行必要的初始化。
     */
    private static void onLibraryLoaded() {
        Native.getNativeSize(Long.TYPE);
        Core.setErrorVerbosity(false);
        LOGGER.log(Level.INFO, "Successfully loaded OpenCV native library.");
    }
}
