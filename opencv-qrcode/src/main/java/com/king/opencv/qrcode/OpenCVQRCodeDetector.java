package com.king.opencv.qrcode;

import android.graphics.Bitmap;

import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.objdetect.QRCodeDetector;

import java.util.List;

/**
 * OpenCV二维码检测器
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class OpenCVQRCodeDetector extends QRCodeDetector {

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap {@link Bitmap}
     * @return decoded string.
     */
    public String detectAndDecode(Bitmap bitmap) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat);
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap {@link Bitmap}
     * @param points points optional output array of vertices of the found QR code quadrangle. Will be empty if not found.
     * @return decoded string.
     */
    public String detectAndDecode(Bitmap bitmap, Mat points) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecode(mat, points);
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap      {@link Bitmap}
     * @param decodedInfo UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @return automatically generated
     */
    public boolean detectAndDecodeMulti(Bitmap bitmap, List<String> decodedInfo) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecodeMulti(mat, decodedInfo);
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap      {@link Bitmap}
     * @param decodedInfo UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @param points      optional output vector of vertices of the found QR code quadrangles. Will be empty if not found.
     * @return automatically generated
     */
    public boolean detectAndDecodeMulti(Bitmap bitmap, List<String> decodedInfo, Mat points) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap, mat);
        return detectAndDecodeMulti(mat, decodedInfo, points);
    }

}
