package com.king.opencv.qrcode.scanning.analyze

import android.graphics.ImageFormat
import androidx.camera.core.ImageProxy
import com.king.camera.scan.AnalyzeResult
import com.king.camera.scan.FrameMetadata
import com.king.camera.scan.analyze.Analyzer
import com.king.camera.scan.util.ImageUtils
import com.king.logx.LogX
import com.king.opencv.qrcode.OpenCVQRCodeDetector
import org.opencv.core.Core
import org.opencv.core.CvType
import org.opencv.core.Mat
import org.opencv.imgproc.Imgproc
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicBoolean

/**
 * OpenCV二维码分析器：分析相机预览的帧数据，从中检测识别二维码
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
open class OpenCVScanningAnalyzer @JvmOverloads constructor(
    /**
     * 是否需要输出二维码的各个顶点
     */
    private val isOutputVertices: Boolean = false,
    /**
     * 是否检测多个二维码
     */
    private val isDetectMultiple: Boolean = false
) : Analyzer<List<String>> {

    private val queue = ConcurrentLinkedQueue<ByteArray>()
    private val joinQueue = AtomicBoolean(false)
    private val detector = OpenCVQRCodeDetector()

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
     * @param nv21 nv21帧数据
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
            val points = Mat()
            val result = if (isDetectMultiple) {
                ArrayList<String>().apply {
                    detector.detectAndDecodeMulti(bgrMat, this, points)
                }
            } else {
                detector.detectAndDecode(bgrMat, points)?.takeIf { it.isNotEmpty() }?.let {
                    arrayListOf(it)
                }
            }
            bgrMat.release()
            if (!result.isNullOrEmpty()) {
                QRCodeAnalyzeResult(nv21, ImageFormat.NV21, frameMetadata, result, points)
            } else {
                null
            }
        } else {
            // 反之则需识别结果即可
            val result = if (isDetectMultiple) {
                ArrayList<String>().apply {
                    detector.detectAndDecodeMulti(bgrMat, this)
                }
            } else {
                detector.detectAndDecode(bgrMat)?.takeIf { it.isNotEmpty() }?.let {
                    arrayListOf(it)
                }
            }
            bgrMat.release()
            if (!result.isNullOrEmpty()) {
                QRCodeAnalyzeResult(nv21, ImageFormat.NV21, frameMetadata, result)
            } else {
                null
            }
        }
    }

    /**
     * 旋转指定角度
     *
     * @param mat [Mat]
     * @param rotation 旋转角度
     */
    private fun rotation(mat: Mat, rotation: Int) {
        // 旋转90°
        if (rotation == ROTATION_90) {
            // 将图像逆时针旋转90°，然后再关于x轴对称
            Core.transpose(mat, mat)
            // 然后再绕Y轴旋转180° （顺时针）
            Core.flip(mat, mat, 1)
        } else if (rotation == ROTATION_180) {
            // 将图片绕X轴旋转180°（顺时针）
            Core.flip(mat, mat, 0)
            // 将图片绕Y轴旋转180°（顺时针）
            Core.flip(mat, mat, 1)
        } else if (rotation == ROTATION_270) {
            // 将图像逆时针旋转90°，然后再关于x轴对称
            Core.transpose(mat, mat)
            // 将图片绕X轴旋转180°（顺时针）
            Core.flip(mat, mat, 0)
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
        val points: Mat? = null
    ) : AnalyzeResult<T>(imageData, imageFormat, frameMetadata, result)

    companion object {
        private const val ROTATION_90 = 90
        private const val ROTATION_180 = 180
        private const val ROTATION_270 = 270
    }
}
