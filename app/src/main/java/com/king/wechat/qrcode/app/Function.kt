package com.king.wechat.qrcode.app

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import com.king.mlkit.vision.camera.util.LogUtils

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
fun Bitmap.drawRect(block: (canvas: Canvas,paint: Paint) -> Unit): Bitmap {
    var result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    try {
        val canvas = Canvas(result)
        canvas.drawBitmap(this, 0f, 0f, null)
        val paint = Paint()
        paint.strokeWidth = 6f
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED

        block(canvas,paint)

        canvas.save()
        canvas.restore()
    } catch (e: Exception) {
        LogUtils.w(e.message)
    }
    return result
}

