package com.king.wechat.qrcode.app

import android.content.Intent
import android.graphics.Point
import android.util.Log
import android.widget.ImageView
import com.king.mlkit.vision.camera.AnalyzeResult
import com.king.mlkit.vision.camera.CameraScan
import com.king.mlkit.vision.camera.analyze.Analyzer
import com.king.mlkit.vision.camera.util.PointUtils
import com.king.view.viewfinderview.ViewfinderView
import com.king.wechat.qrcode.scanning.WeChatCameraScanActivity
import com.king.wechat.qrcode.scanning.analyze.WeChatScanningAnalyzer

/**
 * 微信二维码扫描实现示例
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class WeChatQRCodeActivity : WeChatCameraScanActivity() {

    private lateinit var ivResult: ImageView
    private lateinit var viewfinderView: ViewfinderView

    override fun initUI() {
        super.initUI()
        ivResult = findViewById(R.id.ivResult)
        viewfinderView = findViewById(R.id.viewfinderView)
    }

    override fun onScanResultCallback(result: AnalyzeResult<List<String>>) {
        // 停止分析
        cameraScan.setAnalyzeImage(false)
        Log.d(TAG, result.result.toString())

        // 当初始化 WeChatScanningAnalyzer 时，如果是需要二维码的位置信息，则会返回 WeChatScanningAnalyzer.QRCodeAnalyzeResult
        if (result is WeChatScanningAnalyzer.QRCodeAnalyzeResult) { // 如果需要处理结果二维码的位置信息
            //取预览当前帧图片并显示，为结果点提供参照
            ivResult.setImageBitmap(previewView.bitmap)
            val points = ArrayList<Point>()
            result.points?.forEach { mat ->
                // 扫码结果二维码的四个点（一个矩形）
                Log.d(TAG, "point0: ${mat[0, 0][0]}, ${mat[0, 1][0]}")
                Log.d(TAG, "point1: ${mat[1, 0][0]}, ${mat[1, 1][0]}")
                Log.d(TAG, "point2: ${mat[2, 0][0]}, ${mat[2, 1][0]}")
                Log.d(TAG, "point3: ${mat[3, 0][0]}, ${mat[3, 1][0]}")

                val point0 = Point(mat[0, 0][0].toInt(), mat[0, 1][0].toInt())
                val point1 = Point(mat[1, 0][0].toInt(), mat[1, 1][0].toInt())
                val point2 = Point(mat[2, 0][0].toInt(), mat[2, 1][0].toInt())
                val point3 = Point(mat[3, 0][0].toInt(), mat[3, 1][0].toInt())

                val centerX = (point0.x + point1.x + point2.x + point3.x) / 4
                val centerY = (point0.y + point1.y + point2.y + point3.y) / 4

                //将实际的结果中心点坐标转换成界面预览的坐标
                val point = PointUtils.transform(
                    centerX,
                    centerY,
                    result.bitmap.width,
                    result.bitmap.height,
                    viewfinderView.width,
                    viewfinderView.height
                )
                points.add(point)
            }
            //设置Item点击监听
            viewfinderView.setOnItemClickListener {
                //显示点击Item将所在位置扫码识别的结果返回
                val intent = Intent()
                intent.putExtra(CameraScan.SCAN_RESULT, result.result[it])
                setResult(RESULT_OK, intent)
                finish()
            }
            //显示结果点信息
            viewfinderView.showResultPoints(points)

            if(result.result.size == 1) {
                val intent = Intent()
                intent.putExtra(CameraScan.SCAN_RESULT, result.result[0])
                setResult(RESULT_OK, intent)
                finish()
            }
        } else {
            // 一般需求都是识别一个码，所以这里取第0个就可以；有识别多个码的需求，可以取全部
            val intent = Intent()
            intent.putExtra(CameraScan.SCAN_RESULT, result.result[0])
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
        return R.layout.activity_wechat_qrcode
    }

    override fun onBackPressed() {
        if (viewfinderView.isShowPoints) {// 如果是结果点显示时，用户点击了返回键，则认为是取消选择当前结果，重新开始扫码
            ivResult.setImageResource(0)
            viewfinderView.showScanner()
            cameraScan.setAnalyzeImage(true)
            return
        }
        super.onBackPressed()
    }

    companion object {
        const val TAG = "WeChatQRCodeActivity"
    }

}