package com.king.wechat.qrcode.app


import android.content.Intent
import android.util.Log
import com.king.mlkit.vision.camera.AnalyzeResult
import com.king.wechat.qrcode.scanning.WeChatCameraScanActivity

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class WeChatQRCodeActivity : WeChatCameraScanActivity() {

    companion object{
        const val TAG = "WeChatQRCodeActivity"
    }

    override fun onScanResultCallback(result: AnalyzeResult<List<String>>) {
        if(result.result.isNotEmpty()){
            //停止分析
            cameraScan.setAnalyzeImage(false)
            Log.d(TAG,result.result.toString())
            //一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
            val text = result.result[0]
            val intent = Intent()
            intent.putExtra(MainActivity.SCAN_RESULT,text)
            setResult(RESULT_OK,intent)
            finish()
        }
    }

}