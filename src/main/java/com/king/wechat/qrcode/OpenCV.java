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
     * Initialize OpenCV.
     */
    public static void init() throws Exception {
        initOpenCVFromResources();
    }

    /**
     * Initialize OpenCV from the specified directory.
     *
     * @param libDirPath directory containing opencv_java*.dll or libopencv_java*.so
     */
    public static void init(String libDirPath) throws Exception {
        initOpenCVFromFileSystem(libDirPath);
    }

    /**
     * Initialize OpenCV from packaged resources.
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
     * Load the OpenCV native library from the file system.
     *
     * @param libDirPath directory containing opencv_java*.dll or libopencv_java*.so
     */
    private static void initOpenCVFromFileSystem(String libDirPath) throws Exception {
        logPlatformInfo();
        File libOpencvFile = new File(libDirPath, System.mapLibraryName(Core.NATIVE_LIBRARY_NAME));
        System.load(libOpencvFile.getAbsolutePath());
        onLibraryLoaded();
    }

    /**
     * Resolve the native library resource path for the current platform.
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
     * Log current operating system and architecture information.
     */
    private static void logPlatformInfo() {
        LOGGER.log(Level.INFO,
                "os.name = " + System.getProperty("os.name") + ", os.arch = " + System.getProperty("os.arch"));
    }

    /**
     * Create an exception for unsupported platforms.
     */
    private static UnsupportedOperationException unsupportedPlatformException() {
        return new UnsupportedOperationException(
                "Unsupported platform: os.name=" + System.getProperty("os.name") + ", os.arch=" + System.getProperty("os.arch"));
    }

    /**
     * Run required initialization after the native library is loaded.
     */
    private static void onLibraryLoaded() {
        Native.getNativeSize(Long.TYPE);
        Core.setErrorVerbosity(false);
        LOGGER.log(Level.INFO, "Successfully loaded OpenCV native library.");
    }
}
