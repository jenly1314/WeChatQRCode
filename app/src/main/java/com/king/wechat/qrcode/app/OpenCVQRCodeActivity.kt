package com.king.wechat.qrcode.app


import android.content.Intent
import android.util.Log
import com.king.mlkit.vision.camera.AnalyzeResult
import com.king.mlkit.vision.camera.BaseCameraScanActivity
import com.king.mlkit.vision.camera.analyze.Analyzer
import com.king.mlkit.vision.camera.config.ResolutionCameraConfig
import com.king.wechat.qrcode.app.anlyze.OpenCVScanningAnalyzer

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class OpenCVQRCodeActivity : BaseCameraScanActivity<String>() {

    companion object{
        const val TAG = "OpenCVQRCodeActivity"
    }

    override fun onScanResultCallback(result: AnalyzeResult<String>) {
        if(result.result.isNotEmpty()){
            //停止分析
            cameraScan.setAnalyzeImage(false)
            val text = result.result
            Log.d(TAG,text)
            val intent = Intent()
            intent.putExtra(MainActivity.SCAN_RESULT,text)
            setResult(RESULT_OK,intent)
            finish()
        }
    }

    override fun createAnalyzer(): Analyzer<String>? {
        return OpenCVScanningAnalyzer()
    }

}