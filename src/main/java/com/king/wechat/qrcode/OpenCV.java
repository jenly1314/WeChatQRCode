package com.king.wechat.qrcode;

import org.opencv.core.Core;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class OpenCV {

    /**
     * 初始化 OpenCV
     */
    public static void init() throws Exception{
        init("lib");
    }

    /**
     * 初始化 OpenCV
     * @param dllDirPath 动态链接库所在的文件夹
     */
    public static void init(String dllDirPath) throws Exception{
        initOpenCV(dllDirPath);
    }

    /**
     * 初始化 OpenCV
     * @param dllDirPath 动态链接库所在的文件夹
     */
    private static void initOpenCV(String dllDirPath) throws Exception {
        if(dllDirPath == null){//如果dllDirPath为空，使用 System.loadLibrary 的方式动态链接库
            // java.library.path
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        }else{//如果dllDirPath不为空，使用 System.load 的方式动态链接库
            File dllFile = new File(dllDirPath,"libopencv_java452.dll");
            // 加载动态链接库（libopencv_java452.dll）
            System.load(dllFile.getAbsolutePath());
        }
        Core.setErrorVerbosity(false);
        Logger.getLogger(OpenCV.class.getName()).log(Level.INFO, "Successfully loaded OpenCV native library.");
    }
}
