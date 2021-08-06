package com.king.wechat.qrcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.wechat_qrcode.WeChatQRCode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public final class WeChatQRCodeDetector {

    private static final String TAG = "WeChatQRCodeDetector";

    private static WeChatQRCode sWeChatQRCode;

    private WeChatQRCodeDetector(){
        throw new AssertionError();
    }

    /**
     * 初始化 WeChatQRCode
     * @param context
     */
    public static void init(Context context){
        initWeChatQRCode(context.getApplicationContext());
    }

    private static void initWeChatQRCode(Context context){
        try {
            String modelDir = "models";
            String[] models = context.getAssets().list(modelDir);
            String saveDirPath = getExternalFilesDir(context,modelDir);
            File saveDir = new File(saveDirPath);
            if(!saveDir.exists()){
                saveDir.mkdirs();
            }
            File detect = new File(saveDirPath,"detect.prototxt");
            File detectModel = new File(saveDirPath,"detect.caffemodel");
            File resolution = new File(saveDirPath,"sr.prototxt");
            File resolutionModel = new File(saveDirPath,"sr.caffemodel");
            if(!(detect.exists() && detectModel.exists() && resolution.exists() && resolutionModel.exists())){
                //模型文件只要有一个不存在，则遍历拷贝
                for(String model: models){
                    Log.d(TAG,"model: " + model);
                    InputStream inputStream = context.getAssets().open(modelDir + "/" + model);
                    File saveFile = new File(saveDir,model);
                    FileOutputStream outputStream = new FileOutputStream(saveFile);
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = inputStream.read(buffer)) != -1){
                        outputStream.write(buffer,0,len);
                    }
                    outputStream.flush();
                    inputStream.close();
                    outputStream.close();
                    Log.d(TAG,"file:" + saveFile.getAbsolutePath());
                }
            }
            Log.d(TAG,"Initial WeChatQRCode");
            sWeChatQRCode = new WeChatQRCode(
                    detect.getAbsolutePath(),
                    detectModel.getAbsolutePath(),
                    resolution.getAbsolutePath(),
                    resolutionModel.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getExternalFilesDir(Context context,String path) {
        File[] files = context.getExternalFilesDirs(path);
        if(files!=null && files.length > 0){
            return files[0].getAbsolutePath();
        }
        return context.getExternalFilesDir(path).getAbsolutePath();

    }


    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param bitmap {@link Bitmap}
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Bitmap bitmap){
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap,mat);
        return sWeChatQRCode.detectAndDecode(mat);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     * empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Mat img){
        return sWeChatQRCode.detectAndDecode(img);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     * empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Mat img, List<Mat> points){
        return sWeChatQRCode.detectAndDecode(img,points);
    }


}
