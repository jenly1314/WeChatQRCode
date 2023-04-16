package com.king.opencv.qrcode.scanning.analyze;

import android.graphics.Bitmap;

import com.king.mlkit.vision.camera.AnalyzeResult;
import com.king.mlkit.vision.camera.analyze.Analyzer;
import com.king.mlkit.vision.camera.util.BitmapUtils;
import com.king.mlkit.vision.camera.util.LogUtils;
import com.king.opencv.qrcode.OpenCVQRCodeDetector;

import org.opencv.core.Mat;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;

/**
 * OpenCV二维码分析器：分析相机预览的帧数据，从中检测识别二维码
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class OpenCVScanningAnalyzer implements Analyzer<List<String>> {

    private OpenCVQRCodeDetector mDetector = new OpenCVQRCodeDetector();
    /**
     * 是否需要输出二维码的各个顶点
     */
    private boolean isOutputVertices;

    public OpenCVScanningAnalyzer() {
        this(false);
    }

    /**
     * 构造
     *
     * @param isOutputVertices 是否需要返回二维码的各个顶点
     */
    public OpenCVScanningAnalyzer(boolean isOutputVertices) {
        this.isOutputVertices = isOutputVertices;
    }

    @Override
    public void analyze(@NonNull ImageProxy imageProxy, @NonNull OnAnalyzeListener<AnalyzeResult<List<String>>> listener) {
        AnalyzeResult<List<String>> result = null;
        try {
            final Bitmap bitmap = BitmapUtils.getBitmap(imageProxy);
            result = detectAndDecode(bitmap, isOutputVertices);
        } catch (Exception e) {
            LogUtils.w(e);
        }
        if (result != null && !result.getResult().isEmpty()) {
            listener.onSuccess(result);
        } else {
            listener.onFailure(null);
        }
    }

    /**
     * 检测并识别二维码
     *
     * @param bitmap
     * @param isOutputVertices
     * @return
     */
    @Nullable
    private AnalyzeResult<List<String>> detectAndDecode(Bitmap bitmap, boolean isOutputVertices) {
        if (isOutputVertices) {
            // 如果需要返回二维码的各个顶点
            final Mat points = new Mat();
            String result = mDetector.detectAndDecode(bitmap, points);
            if (result != null && !result.isEmpty()) {
                List<String> list = new ArrayList();
                list.add(result);
                return new QRCodeAnalyzeResult<>(bitmap, list, points);
            }
        } else {
            // 反之则需识别结果即可
            String result = mDetector.detectAndDecode(bitmap);
            if (result != null && !result.isEmpty()) {
                List<String> list = new ArrayList();
                list.add(result);
                return new QRCodeAnalyzeResult(bitmap, list);
            }
        }
        return null;
    }

    /**
     * 二维码分析结果
     *
     * @param <T>
     */
    public static class QRCodeAnalyzeResult<T> extends AnalyzeResult<T> {

        /**
         * 二维码的位置点信息
         */
        private Mat points;

        public QRCodeAnalyzeResult(Bitmap bitmap, T result) {
            super(bitmap, result);
        }

        public QRCodeAnalyzeResult(Bitmap bitmap, T result, Mat points) {
            super(bitmap, result);
            this.points = points;
        }

        /**
         * 获取二维码的位置点信息
         *
         * @return
         */
        public Mat getPoints() {
            return points;
        }

        @Deprecated
        public void setPoints(Mat points) {
            this.points = points;
        }
    }
}
