package com.king.wechat.qrcode.scanning.analyze;

import android.graphics.ImageFormat;

import com.king.camera.scan.AnalyzeResult;
import com.king.camera.scan.FrameMetadata;
import com.king.camera.scan.analyze.Analyzer;
import com.king.camera.scan.util.LogUtils;
import com.king.wechat.qrcode.WeChatQRCodeDetector;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;

/**
 * 微信二维码分析器：分析相机预览的帧数据，从中检测识别二维码
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class WeChatScanningAnalyzer implements Analyzer<List<String>> {

    private static final int ROTATION_90 = 90;
    private static final int ROTATION_180 = 180;
    private static final int ROTATION_270 = 270;
    private final Queue<byte[]> queue = new ConcurrentLinkedQueue<>();

    private final AtomicBoolean joinQueue = new AtomicBoolean(false);

    /**
     * 是否需要输出二维码的各个顶点
     */
    private final boolean isOutputVertices;

    public WeChatScanningAnalyzer() {
        this(false);
    }

    /**
     * 构造
     *
     * @param isOutputVertices 是否需要返回二维码的各个顶点
     */
    public WeChatScanningAnalyzer(boolean isOutputVertices) {
        this.isOutputVertices = isOutputVertices;
    }

    @Override
    public void analyze(@NonNull ImageProxy imageProxy, @NonNull Analyzer.OnAnalyzeListener<AnalyzeResult<List<String>>> listener) {
        if (!joinQueue.get()) {
            int imageSize = imageProxy.getWidth() * imageProxy.getHeight();
            byte[] bytes = new byte[imageSize + 2 * (imageSize / 4)];
            queue.add(bytes);
            joinQueue.set(true);
        }
        if (queue.isEmpty()) {
            return;
        }
        final byte[] nv21Data = queue.poll();
        AnalyzeResult<List<String>> result = null;
        try {
            yuv_420_888toNv21(imageProxy, nv21Data);
            FrameMetadata frameMetadata = new FrameMetadata(
                    imageProxy.getWidth(),
                    imageProxy.getHeight(),
                    imageProxy.getImageInfo().getRotationDegrees());
            result = detectAndDecode(nv21Data, frameMetadata, isOutputVertices);
        } catch (Exception e) {
            LogUtils.w(e);
        }
        if (result != null) {
            joinQueue.set(false);
            listener.onSuccess(result);
        } else {
            queue.add(nv21Data);
            listener.onFailure(null);
        }
    }

    /**
     * 检测并识别二维码
     *
     * @param nv21
     * @param isOutputVertices 是否输出二维码顶点坐标
     * @return
     */
    @Nullable
    private AnalyzeResult<List<String>> detectAndDecode(byte[] nv21, FrameMetadata frameMetadata, boolean isOutputVertices) {
        Mat mat = new Mat(frameMetadata.getHeight() + frameMetadata.getHeight() / 2, frameMetadata.getWidth(), CvType.CV_8UC1);
        mat.put(0,0, nv21);
        Mat bgrMat = new Mat();
        Imgproc.cvtColor(mat, bgrMat, Imgproc.COLOR_YUV2BGR_NV21);
        mat.release();
        rotation(bgrMat, frameMetadata.getRotation());
        if (isOutputVertices) {
            // 如果需要返回二维码的各个顶点
            final List<Mat> points = new ArrayList<>();
            List<String> result = WeChatQRCodeDetector.detectAndDecode(bgrMat, points);
            bgrMat.release();
            if (result != null && !result.isEmpty()) {
                return new QRCodeAnalyzeResult<>(nv21, ImageFormat.NV21, frameMetadata, result, points);
            }
        } else {
            // 反之则需识别结果即可
            List<String> result = WeChatQRCodeDetector.detectAndDecode(bgrMat);
            bgrMat.release();
            if (result != null && !result.isEmpty()) {
                return new QRCodeAnalyzeResult<>(nv21, ImageFormat.NV21, frameMetadata, result);
            }
        }

        return null;
    }

    /**
     * 旋转指定角度
     * @param mat
     * @param rotation
     */
    private void rotation(Mat mat, int rotation) {
        //  旋转90°
        if (rotation == ROTATION_90) {
            // 将图像逆时针旋转90°，然后再关于x轴对称
            Core.transpose(mat, mat);
            // 然后再绕Y轴旋转180° （顺时针）
            Core.flip(mat, mat, 1);
        } else if (rotation == ROTATION_180) {
            //将图片绕X轴旋转180°（顺时针）
            Core.flip(mat, mat, 0);
            //将图片绕Y轴旋转180°（顺时针）
            Core.flip(mat, mat, 1);
        } else if (rotation == ROTATION_270) {
            // 将图像逆时针旋转90°，然后再关于x轴对称
            Core.transpose(mat, mat);
            // 将图片绕X轴旋转180°（顺时针）
            Core.flip(mat, mat, 0);
        }
    }

    /**
     * YUV420_888转NV21
     *
     * @param image
     * @param nv21
     */
    private void yuv_420_888toNv21(@NonNull ImageProxy image, byte[] nv21) {
        ImageProxy.PlaneProxy yPlane = image.getPlanes()[0];
        ImageProxy.PlaneProxy uPlane = image.getPlanes()[1];
        ImageProxy.PlaneProxy vPlane = image.getPlanes()[2];

        ByteBuffer yBuffer = yPlane.getBuffer();
        ByteBuffer uBuffer = uPlane.getBuffer();
        ByteBuffer vBuffer = vPlane.getBuffer();
        yBuffer.rewind();
        uBuffer.rewind();
        vBuffer.rewind();

        int ySize = yBuffer.remaining();

        int position = 0;

        // Add the full y buffer to the array. If rowStride > 1, some padding may be skipped.
        for (int row = 0; row < image.getHeight(); row++) {
            yBuffer.get(nv21, position, image.getWidth());
            position += image.getWidth();
            yBuffer.position(Math.min(ySize, yBuffer.position() - image.getWidth() + yPlane.getRowStride()));
        }

        int chromaHeight = image.getHeight() / 2;
        int chromaWidth = image.getWidth() / 2;
        int vRowStride = vPlane.getRowStride();
        int uRowStride = uPlane.getRowStride();
        int vPixelStride = vPlane.getPixelStride();
        int uPixelStride = uPlane.getPixelStride();

        // Interleave the u and v frames, filling up the rest of the buffer. Use two line buffers to
        // perform faster bulk gets from the byte buffers.
        byte[] vLineBuffer = new byte[vRowStride];
        byte[] uLineBuffer = new byte[uRowStride];
        for (int row = 0; row < chromaHeight; row++) {
            vBuffer.get(vLineBuffer, 0, Math.min(vRowStride, vBuffer.remaining()));
            uBuffer.get(uLineBuffer, 0, Math.min(uRowStride, uBuffer.remaining()));
            int vLineBufferPosition = 0;
            int uLineBufferPosition = 0;
            for (int col = 0; col < chromaWidth; col++) {
                nv21[position++] = vLineBuffer[vLineBufferPosition];
                nv21[position++] = uLineBuffer[uLineBufferPosition];
                vLineBufferPosition += vPixelStride;
                uLineBufferPosition += uPixelStride;
            }
        }
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
        private List<Mat> points;

        public QRCodeAnalyzeResult(@NonNull byte[] imageData, int imageFormat, @NonNull FrameMetadata frameMetadata, @NonNull T result) {
            super(imageData, imageFormat, frameMetadata, result);
        }

        public QRCodeAnalyzeResult(@NonNull byte[] imageData, int imageFormat, @NonNull FrameMetadata frameMetadata, @NonNull T result, @Nullable List<Mat> points) {
            super(imageData, imageFormat, frameMetadata, result);
            this.points = points;
        }

        /**
         * 获取二维码的位置点信息
         *
         * @return
         */
        @Nullable
        public List<Mat> getPoints() {
            return points;
        }

    }
}
