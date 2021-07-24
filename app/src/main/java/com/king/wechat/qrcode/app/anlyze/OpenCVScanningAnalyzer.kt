package com.king.wechat.qrcode.app.anlyze

import androidx.camera.core.ImageProxy
import com.king.mlkit.vision.camera.AnalyzeResult
import com.king.mlkit.vision.camera.analyze.Analyzer
import com.king.mlkit.vision.camera.util.ImageUtils
import org.opencv.OpenCVQRCodeDetector

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class OpenCVScanningAnalyzer : Analyzer<String> {
    private val detector by lazy {
        OpenCVQRCodeDetector()
    }

    override fun analyze(
        imageProxy: ImageProxy,
        listener: Analyzer.OnAnalyzeListener<AnalyzeResult<String>>) {
        val bitmap = ImageUtils.imageProxyToBitmap(imageProxy,imageProxy.imageInfo.rotationDegrees)
        val result = detector.detectAndDecode(bitmap)

        result?.let {
            listener.onSuccess(AnalyzeResult(bitmap,it))
        } ?: kotlin.run {
            listener.onFailure()
        }
    }
}