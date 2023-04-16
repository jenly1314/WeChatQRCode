package com.king.wechat.qrcode.app

import android.content.Intent
import android.graphics.Path
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.king.app.dialog.AppDialog
import com.king.app.dialog.AppDialogConfig
import com.king.mlkit.vision.camera.AnalyzeResult
import com.king.mlkit.vision.camera.CameraScan
import com.king.mlkit.vision.camera.analyze.Analyzer
import com.king.wechat.qrcode.scanning.WeChatCameraScanActivity
import com.king.wechat.qrcode.scanning.analyze.WeChatScanningAnalyzer

/**
 * 微信多二维码扫描实现示例
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class WeChatMultiQRCodeActivity : WeChatCameraScanActivity() {

    override fun onScanResultCallback(result: AnalyzeResult<List<String>>) {
        // 停止分析
        cameraScan.setAnalyzeImage(false)
        Log.d(TAG, result.result.toString())
        // 当初始化 WeChatScanningAnalyzer 时，如果是需要二维码的位置信息，则会返回 WeChatScanningAnalyzer.QRCodeAnalyzeResult
        if (result is WeChatScanningAnalyzer.QRCodeAnalyzeResult) { // 如果需要处理结果二维码的位置信息

            val buffer = StringBuilder()
            val bitmap = result.bitmap.drawRect { canvas, paint ->
                // 扫码结果可能有多个
                result.result.forEachIndexed { index, data ->
                    buffer.append("[$index] ").append(data).append("\n")
                }

                result.points?.forEach { mat ->
                    // 扫码结果二维码的四个点（一个矩形）
                    Log.d(TAG, "point0: ${mat[0, 0][0]}, ${mat[0, 1][0]}")
                    Log.d(TAG, "point1: ${mat[1, 0][0]}, ${mat[1, 1][0]}")
                    Log.d(TAG, "point2: ${mat[2, 0][0]}, ${mat[2, 1][0]}")
                    Log.d(TAG, "point3: ${mat[3, 0][0]}, ${mat[3, 1][0]}")

                    val path = Path()
                    path.moveTo(mat[0, 0][0].toFloat(), mat[0, 1][0].toFloat())
                    path.lineTo(mat[1, 0][0].toFloat(), mat[1, 1][0].toFloat())
                    path.lineTo(mat[2, 0][0].toFloat(), mat[2, 1][0].toFloat())
                    path.lineTo(mat[3, 0][0].toFloat(), mat[3, 1][0].toFloat())
                    path.lineTo(mat[0, 0][0].toFloat(), mat[0, 1][0].toFloat())
                    // 将二维码位置在图片上框出来
                    canvas.drawPath(path, paint)
                }

            }

            val config = AppDialogConfig(this, R.layout.qrcode_result_dialog).apply {
                content = buffer
                onClickConfirm = View.OnClickListener {
                    AppDialog.INSTANCE.dismissDialog()
                    // 继续扫码分析
                    cameraScan.setAnalyzeImage(true)
                }
                onClickCancel = View.OnClickListener {
                    AppDialog.INSTANCE.dismissDialog()
                    finish()
                }
                val imageView = getView<ImageView>(R.id.ivDialogContent)
                imageView.setImageBitmap(bitmap)
            }
            AppDialog.INSTANCE.showDialog(config, false)

        } else {
            // 一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
            val text = result.result[0]
            val intent = Intent()
            intent.putExtra(CameraScan.SCAN_RESULT, text)
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun createAnalyzer(): Analyzer<MutableList<String>>? {
        // 分析器默认不会返回结果二维码的位置信息
//        return WeChatScanningAnalyzer()
        // 如果需要返回结果二维码位置信息，则初始化分析器时，参数传 true 即可
        return WeChatScanningAnalyzer(true)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_wechat_multi_qrcode
    }

    companion object {
        const val TAG = "WeChatMultiQRCodeActivity"
    }

}