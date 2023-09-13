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
 * 微信二维码检测器
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@SuppressWarnings("unused")
public final class WeChatQRCodeDetector {

    private static final String TAG = "WeChatQRCodeDetector";

    private static final String MODEL_DIR = "models";
    private static final String DETECT_PROTO_TXT = "detect.prototxt";
    private static final String DETECT_CAFFE_MODEL = "detect.caffemodel";
    private static final String SR_PROTO_TXT = "sr.prototxt";
    private static final String SR_CAFFE_MODEL = "sr.caffemodel";

    private static WeChatQRCode sWeChatQRCode;

    private WeChatQRCodeDetector() {
        throw new AssertionError();
    }

    /**
     * 初始化
     *
     * @param context
     */
    public static void init(Context context) {
        initWeChatQRCode(context.getApplicationContext());
    }

    /**
     * 初始化 WeChatQRCode
     * @param context
     */
    private static void initWeChatQRCode(Context context) {
        try {
            String saveDirPath = getExternalFilesDir(context, MODEL_DIR);
            String[] models = new String[]{DETECT_PROTO_TXT, DETECT_CAFFE_MODEL, SR_PROTO_TXT, SR_CAFFE_MODEL};

            File saveDir = new File(saveDirPath);
            boolean exists = saveDir.exists();

            if (exists) {
                for (int i = 0; i < models.length; i++) {
                    if (!new File(saveDirPath, models[i]).exists()) {
                        exists = false;
                        break;
                    }
                }
            }

            if (!exists) {
                // 模型文件只要有一个不存在，则遍历拷贝
                for (String model : models) {
                    InputStream inputStream = context.getAssets()
                            .open(MODEL_DIR + File.separatorChar + model);
                    File saveFile = new File(saveDir, model);
                    FileOutputStream outputStream = new FileOutputStream(saveFile);
                    byte[] buffer = new byte[4096];
                    int len;
                    while ((len = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, len);
                    }
                    outputStream.flush();
                    inputStream.close();
                    outputStream.close();
                    Log.d(TAG, "file: " + saveFile.getAbsolutePath());
                }
            }
            sWeChatQRCode = new WeChatQRCode(
                    saveDirPath + File.separatorChar + models[0],
                    saveDirPath + File.separatorChar + models[1],
                    saveDirPath + File.separatorChar + models[2],
                    saveDirPath + File.separatorChar + models[3]);
            Log.d(TAG, "WeChatQRCode loaded successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取外部存储目录
     * @param context
     * @param path
     * @return
     */
    private static String getExternalFilesDir(Context context, String path) {
        File[] files = context.getExternalFilesDirs(path);
        if (files != null && files.length > 0) {
            return files[0].getAbsolutePath();
        }
        File file = context.getExternalFilesDir(path);
        if(file == null) {
            file = new File(context.getFilesDir(), path);
        }
        return file.getAbsolutePath();
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param bitmap {@link Bitmap}
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Bitmap bitmap) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param bitmap {@link Bitmap}
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     *               empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Bitmap bitmap, List<Mat> points) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat, points);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     *            empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Mat img) {
        return sWeChatQRCode.detectAndDecode(img);
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img    supports grayscale or color (BGR) image.
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     *               empty if not found.
     * @return list of decoded string.
     */
    public static List<String> detectAndDecode(Mat img, List<Mat> points) {
        return sWeChatQRCode.detectAndDecode(img, points);
    }

}
