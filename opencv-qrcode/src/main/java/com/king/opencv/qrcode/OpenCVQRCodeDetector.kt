package com.king.opencv.qrcode

import android.graphics.Bitmap
import org.opencv.android.Utils
import org.opencv.core.Mat
import org.opencv.objdetect.QRCodeDetector

/**
 * OpenCV二维码检测器
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
@Suppress("unused")
open class OpenCVQRCodeDetector : QRCodeDetector() {

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap [Bitmap]
     * @return decoded string.
     */
    fun detectAndDecode(bitmap: Bitmap): String? {
        val mat = Mat()
        try {
            Utils.bitmapToMat(bitmap, mat)
            return detectAndDecode(mat)
        } finally {
            mat.release()
        }
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap [Bitmap]
     * @param points points optional output array of vertices of the found QR code quadrangle. Will be empty if not found.
     * @return decoded string.
     */
    fun detectAndDecode(bitmap: Bitmap, points: Mat): String? {
        val mat = Mat()
        try {
            Utils.bitmapToMat(bitmap, mat)
            return detectAndDecode(mat, points)
        } finally {
            mat.release()
        }
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap [Bitmap]
     * @param decodedInfo UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @return automatically generated
     */
    fun detectAndDecodeMulti(bitmap: Bitmap, decodedInfo: MutableList<String>): Boolean {
        val mat = Mat()
        try {
            Utils.bitmapToMat(bitmap, mat)
            return detectAndDecodeMulti(mat, decodedInfo)
        } finally {
            mat.release()
        }
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap [Bitmap]
     * @param decodedInfo UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @param points optional output vector of vertices of the found QR code quadrangles. Will be empty if not found.
     * @return automatically generated
     */
    fun detectAndDecodeMulti(bitmap: Bitmap, decodedInfo: MutableList<String>, points: Mat): Boolean {
        val mat = Mat()
        try {
            Utils.bitmapToMat(bitmap, mat)
            return detectAndDecodeMulti(mat, decodedInfo, points)
        } finally {
            mat.release()
        }
    }
}
