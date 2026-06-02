package com.king.wechat.qrcode.scanning.analyze

import android.graphics.ImageFormat
import androidx.camera.core.ImageProxy
import com.king.camera.scan.AnalyzeResult
import com.king.camera.scan.FrameMetadata
import com.king.camera.scan.analyze.Analyzer
import com.king.camera.scan.util.ImageUtils
import com.king.logx.LogX
import com.king.wechat.qrcode.WeChatQRCodeDetector
import org.opencv.core.Core
import org.opencv.core.CvType
import org.opencv.core.Mat
import org.opencv.imgproc.Imgproc
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicBoolean

/**
 * 微信二维码分析器：分析相机预览的帧数据，从中检测识别二维码
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
open class WeChatScanningAnalyzer @JvmOverloads constructor(
    /**
     * 是否需要输出二维码的各个顶点
     */
    private val isOutputVertices: Boolean = false
) : Analyzer<List<String>> {

    private val queue = ConcurrentLinkedQueue<ByteArray>()
    private val joinQueue = AtomicBoolean(false)

    override fun analyze(imageProxy: ImageProxy, listener: Analyzer.OnAnalyzeListener<List<String>>) {
        if (!joinQueue.get()) {
            val imageSize = imageProxy.width * imageProxy.height
            val bytes = ByteArray(imageSize + 2 * (imageSize / 4))
            queue.add(bytes)
            joinQueue.set(true)
        }

        val nv21Data = queue.poll() ?: return

        var result: AnalyzeResult<List<String>>? = null
        try {
            ImageUtils.yuv_420_888toNv21(imageProxy, nv21Data)
            val frameMetadata = FrameMetadata(
                imageProxy.width,
                imageProxy.height,
                imageProxy.imageInfo.rotationDegrees
            )
            result = detectAndDecode(nv21Data, frameMetadata)
        } catch (e: Exception) {
            LogX.w(e)
        }
        if (result != null) {
            joinQueue.set(false)
            listener.onSuccess(result)
        } else {
            queue.add(nv21Data)
            listener.onFailure(null)
        }
    }

    /**
     * 检测并识别二维码
     *
     * @param nv21          nv21帧数据
     * @param frameMetadata [FrameMetadata]
     * @return 返回识别的二维码结果
     */
    private fun detectAndDecode(nv21: ByteArray, frameMetadata: FrameMetadata): AnalyzeResult<List<String>>? {
        val mat = Mat(frameMetadata.height + frameMetadata.height / 2, frameMetadata.width, CvType.CV_8UC1)
        mat.put(0, 0, nv21)
        val bgrMat = Mat()
        Imgproc.cvtColor(mat, bgrMat, Imgproc.COLOR_YUV2BGR_NV21)
        mat.release()
        rotation(bgrMat, frameMetadata.rotation)
        return if (isOutputVertices) {
            // 如果需要返回二维码的各个顶点
            val points = ArrayList<Mat>()
            val result = WeChatQRCodeDetector.detectAndDecode(bgrMat, points)
            bgrMat.release()
            if (result != null && result.isNotEmpty()) {
                QRCodeAnalyzeResult(nv21, ImageFormat.NV21, frameMetadata, result, points)
            } else {
                null
            }
        } else {
            // 反之则需识别结果即可
            val result = WeChatQRCodeDetector.detectAndDecode(bgrMat)
            bgrMat.release()
            if (result != null && result.isNotEmpty()) {
                QRCodeAnalyzeResult(nv21, ImageFormat.NV21, frameMetadata, result)
            } else {
                null
            }
        }
    }

    /**
     * 旋转指定角度
     *
     * @param mat      [Mat]
     * @param rotation 旋转角度
     */
    private fun rotation(mat: Mat, rotation: Int) {
        when (rotation) {
            ROTATION_90 -> {
                // 将图像逆时针旋转90°，然后再关于x轴对称
                Core.transpose(mat, mat)
                // 然后再绕Y轴旋转180° （顺时针）
                Core.flip(mat, mat, 1)
            }
            ROTATION_180 -> {
                // 将图片绕X轴旋转180°（顺时针）
                Core.flip(mat, mat, 0)
                // 将图片绕Y轴旋转180°（顺时针）
                Core.flip(mat, mat, 1)
            }
            ROTATION_270 -> {
                // 将图像逆时针旋转90°，然后再关于x轴对称
                Core.transpose(mat, mat)
                // 将图片绕X轴旋转180°（顺时针）
                Core.flip(mat, mat, 0)
            }
        }
    }

    /**
     * 二维码分析结果
     */
    open class QRCodeAnalyzeResult<T> @JvmOverloads constructor(
        imageData: ByteArray,
        imageFormat: Int,
        frameMetadata: FrameMetadata,
        result: T,
        /**
         * 二维码的位置点信息
         */
        val points: List<Mat>? = null
    ) : AnalyzeResult<T>(imageData, imageFormat, frameMetadata, result)

    companion object {
        private const val ROTATION_90 = 90
        private const val ROTATION_180 = 180
        private const val ROTATION_270 = 270
    }
}
