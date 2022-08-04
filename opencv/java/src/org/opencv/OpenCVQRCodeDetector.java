package org.opencv;

import android.graphics.Bitmap;

import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.objdetect.QRCodeDetector;

import java.util.List;

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class OpenCVQRCodeDetector extends QRCodeDetector{


    /**
     * Both detects and decodes QR code
     *
     * @param bitmap {@link Bitmap}
     * @return decoded string.
     */
    public String detectAndDecode(Bitmap bitmap){
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap,mat);
        return detectAndDecode(mat);
    }

    /**
     * Both detects and decodes QR code
     *
     * @param bitmap {@link Bitmap}
     *     @param decodedInfo UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @return list of decoded string.
     */
    public boolean detectAndDecodeMulti(Bitmap bitmap,List<String> decodedInfo) {
        Mat mat = new Mat();
        Utils.bitmapToMat(bitmap,mat);
        return detectAndDecodeMulti(mat,decodedInfo);
    }

}
