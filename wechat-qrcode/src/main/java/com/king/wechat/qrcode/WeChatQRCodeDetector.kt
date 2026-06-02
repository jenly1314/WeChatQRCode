package com.king.wechat.qrcode

import android.content.Context
import android.graphics.Bitmap
import com.king.logx.LogX
import org.opencv.android.Utils
import org.opencv.core.Mat
import org.opencv.wechat_qrcode.WeChatQRCode
import java.io.File
import java.io.FileOutputStream

/**
 * 微信二维码检测器
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
@Suppress("unused")
object WeChatQRCodeDetector {

    private const val TAG = "WeChatQRCodeDetector"

    private const val MODEL_DIR = "models"
    private const val DETECT_PROTO_TXT = "detect.prototxt"
    private const val DETECT_CAFFE_MODEL = "detect.caffemodel"
    private const val SR_PROTO_TXT = "sr.prototxt"
    private const val SR_CAFFE_MODEL = "sr.caffemodel"

    @Volatile
    private var sWeChatQRCode: WeChatQRCode? = null

    /**
     * 初始化
     *
     * @param context [Context]
     */
    @JvmStatic
    fun init(context: Context) {
        initWeChatQRCode(context.applicationContext)
    }

    /**
     * 初始化 WeChatQRCode
     *
     * @param context [Context]
     */
    private fun initWeChatQRCode(context: Context) {
        try {
            val saveDirPath = getExternalFilesDir(context, MODEL_DIR)
            val models = arrayOf(DETECT_PROTO_TXT, DETECT_CAFFE_MODEL, SR_PROTO_TXT, SR_CAFFE_MODEL)

            val saveDir = File(saveDirPath)
            var exists = saveDir.exists()

            if (exists) {
                for (model in models) {
                    if (!File(saveDirPath, model).exists()) {
                        exists = false
                        break
                    }
                }
            }

            if (!exists) {
                // 模型文件只要有一个不存在，则遍历拷贝
                for (model in models) {
                    val inputStream = context.assets.open(MODEL_DIR + File.separatorChar + model)
                    val saveFile = File(saveDir, model)
                    val outputStream = FileOutputStream(saveFile)
                    val buffer = ByteArray(4096)
                    var len: Int
                    while (inputStream.read(buffer).also { len = it } != -1) {
                        outputStream.write(buffer, 0, len)
                    }
                    outputStream.flush()
                    inputStream.close()
                    outputStream.close()
                    LogX.d("file: %s", saveFile.absolutePath)
                }
            }
            sWeChatQRCode = WeChatQRCode(
                saveDirPath + File.separatorChar + models[0],
                saveDirPath + File.separatorChar + models[1],
                saveDirPath + File.separatorChar + models[2],
                saveDirPath + File.separatorChar + models[3]
            )
            LogX.d("WeChatQRCode loaded successfully")
        } catch (e: Exception) {
            LogX.e(e)
        }
    }

    /**
     * 获取外部存储目录
     *
     * @param context [Context]
     * @param path    目录路径
     * @return 外部存储目录
     */
    private fun getExternalFilesDir(context: Context, path: String): String {
        val files = context.getExternalFilesDirs(path)
        if (!files.isNullOrEmpty()) {
            val file = files[0]
            if (file != null) {
                return file.absolutePath
            }
        }
        val file = context.getExternalFilesDir(path) ?: File(context.filesDir, path)
        return file.absolutePath
    }

    /**
     * set scale factor
     * QR code detector use neural network to detect QR.
     * Before running the neural network, the input image is pre-processed by scaling.
     * By default, the input image is scaled to an image with an area of 160000 pixels.
     * The scale factor allows to use custom scale the input image:
     * width = scaleFactor*width
     * height = scaleFactor*width
     * <p>
     * scaleFactor valuse must be &gt; 0 and &lt;= 1, otherwise the scaleFactor value is set to -1
     * and use default scaled to an image with an area of 160000 pixels.
     *
     * @param scalingFactor automatically generated
     */
    @JvmStatic
    fun setScaleFactor(scalingFactor: Float) {
        val qrCode = sWeChatQRCode ?: return
        qrCode.setScaleFactor(scalingFactor)
    }

    /**
     * get scale factor
     */
    @JvmStatic
    fun getScaleFactor(): Float {
        val qrCode = sWeChatQRCode ?: return 0f
        return qrCode.getScaleFactor()
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param bitmap [Bitmap]
     * @return list of decoded string.
     */
    @JvmStatic
    fun detectAndDecode(bitmap: Bitmap): List<String> {
        val mat = Mat()
        try {
            Utils.bitmapToMat(bitmap, mat)
            return detectAndDecode(mat)
        } finally {
            mat.release()
        }
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param bitmap [Bitmap]
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     *               empty if not found.
     * @return list of decoded string.
     */
    @JvmStatic
    fun detectAndDecode(bitmap: Bitmap, points: List<Mat>): List<String> {
        val mat = Mat()
        try {
            Utils.bitmapToMat(bitmap, mat)
            return detectAndDecode(mat, points)
        } finally {
            mat.release()
        }
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     *            empty if not found.
     * @return list of decoded string.
     */
    @JvmStatic
    fun detectAndDecode(img: Mat): List<String> {
        val qrCode = sWeChatQRCode ?: return emptyList()
        return qrCode.detectAndDecode(img)
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
    @JvmStatic
    fun detectAndDecode(img: Mat, points: List<Mat>): List<String> {
        val qrCode = sWeChatQRCode ?: return emptyList()
        return qrCode.detectAndDecode(img, points)
    }

}
