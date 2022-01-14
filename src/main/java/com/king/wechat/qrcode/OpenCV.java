package com.king.wechat.qrcode;

import org.opencv.core.Core;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class OpenCV {

    private OpenCV(){
        throw new AssertionError();
    }

    /**
     * 初始化 OpenCV
     */
    public static void init() throws Exception{
        init("lib");
    }

    /**
     * 初始化 OpenCV
     * @param libDirPath opencv_java*.dll 或 opencv_java*.so 所在文件夹
     */
    public static void init(String libDirPath) throws Exception{
        initOpenCV(libDirPath);
    }

    /**
     * 初始化 OpenCV
     * @param libDirPath opencv_java*.dll 或 opencv_java*.so 所在文件夹
     */
    private static void initOpenCV(String libDirPath) throws Exception {
        String os = System.getProperty("os.name");
        File libOpencvFile = null;
        if(os != null){
            os = os.toLowerCase();
            Logger.getLogger(OpenCV.class.getName()).log(Level.INFO, "os.name = " + os);
            if(os.indexOf("windows") >= 0){
                libOpencvFile = new File(libDirPath,"libopencv_java455.dll");
            }else if(os.indexOf("linux") >= 0){
                libOpencvFile = new File(libDirPath,"libopencv_java455.so");
            }else{
                throw new IllegalAccessException("os.name = " + os);
            }
        }
        if(libOpencvFile != null){
            System.load(libOpencvFile.getAbsolutePath());
        }else{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        }
        Core.setErrorVerbosity(false);
        Logger.getLogger(OpenCV.class.getName()).log(Level.INFO, "Successfully loaded OpenCV native library.");
    }
}
