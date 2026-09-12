//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.objdetect.BarcodeDetector;
import org.opencv.utils.Converters;

// C++: class BarcodeDetector

public class BarcodeDetector extends GraphicalCodeDetector {

    protected BarcodeDetector(long addr) { super(addr); }

    // internal usage only
    public static BarcodeDetector __fromPtr__(long addr) { return new BarcodeDetector(addr); }

    //
    // C++:   cv::barcode::BarcodeDetector::BarcodeDetector()
    //

    /**
     * Initialize the BarcodeDetector. Super resolution is disabled.
     */
    public BarcodeDetector() {
        super(BarcodeDetector_0());
    }


    //
    // C++:   cv::barcode::BarcodeDetector::BarcodeDetector(string super_resolution_model_path)
    //

    /**
     * Initialize the BarcodeDetector with a Super Resolution model.
     *
     * Loads a Super Resolution DNN model in ONNX format, used to upscale small/low-quality
     * barcode crops before decoding for better quality.
     *
     * <b>Note:</b> Caffe models ({@code sr.prototxt} / {@code sr.caffemodel}) are no longer supported; convert
     * the model to ONNX (a converted {@code sr.onnx} is available from
     * https://github.com/WeChatCV/opencv_3rdparty/tree/wechat_qrcode).
     *
     * @param super_resolution_model_path path to a single-file ONNX Super Resolution model.
     */
    public BarcodeDetector(String super_resolution_model_path) {
        super(BarcodeDetector_1(super_resolution_model_path));
    }


    //
    // C++:  bool cv::barcode::BarcodeDetector::decodeWithType(Mat img, Mat points, vector_string& decoded_info, vector_string& decoded_type)
    //

    /**
     * Decodes barcode in image once it's found by the detect() method.
     *
     * @param img grayscale or color (BGR) image containing bar code.
     * @param points vector of rotated rectangle vertices found by detect() method (or some other algorithm).
     * For N detected barcodes, the dimensions of this array should be [N][4].
     * Order of four points in vector&lt;Point2f&gt; is bottomLeft, topLeft, topRight, bottomRight.
     * @param decoded_info UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector strings, specifies the type of these barcodes
     * @return true if at least one valid barcode have been found
     */
    public boolean decodeWithType(Mat img, Mat points, List<String> decoded_info, List<String> decoded_type) {
        return decodeWithType_0(nativeObj, img.nativeObj, points.nativeObj, decoded_info, decoded_type);
    }


    //
    // C++:  bool cv::barcode::BarcodeDetector::detectAndDecodeWithType(Mat img, vector_string& decoded_info, vector_string& decoded_type, Mat& points = Mat())
    //

    /**
     * Both detects and decodes barcode
     *
     * @param img grayscale or color (BGR) image containing barcode.
     * @param decoded_info UTF8-encoded output vector of string(s) or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of strings, specifies the type of these barcodes
     * @param points optional output vector of vertices of the found  barcode rectangle. Will be empty if not found.
     * @return true if at least one valid barcode have been found
     */
    public boolean detectAndDecodeWithType(Mat img, List<String> decoded_info, List<String> decoded_type, Mat points) {
        return detectAndDecodeWithType_0(nativeObj, img.nativeObj, decoded_info, decoded_type, points.nativeObj);
    }

    /**
     * Both detects and decodes barcode
     *
     * @param img grayscale or color (BGR) image containing barcode.
     * @param decoded_info UTF8-encoded output vector of string(s) or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of strings, specifies the type of these barcodes
     * @return true if at least one valid barcode have been found
     */
    public boolean detectAndDecodeWithType(Mat img, List<String> decoded_info, List<String> decoded_type) {
        return detectAndDecodeWithType_1(nativeObj, img.nativeObj, decoded_info, decoded_type);
    }


    //
    // C++:  double cv::barcode::BarcodeDetector::getDownsamplingThreshold()
    //

    /**
     * Get detector downsampling threshold.
     *
     * @return detector downsampling threshold
     */
    public double getDownsamplingThreshold() {
        return getDownsamplingThreshold_0(nativeObj);
    }


    //
    // C++:  BarcodeDetector cv::barcode::BarcodeDetector::setDownsamplingThreshold(double thresh)
    //

    /**
     * Set detector downsampling threshold.
     *
     * By default, the detect method resizes the input image to this limit if the smallest image size is is greater than the threshold.
     * Increasing this value can improve detection accuracy and the number of results at the expense of performance.
     * Correlates with detector scales. Setting this to a large value will disable downsampling.
     * @param thresh downsampling limit to apply (default 512)
     * SEE: setDetectorScales
     * @return automatically generated
     */
    public BarcodeDetector setDownsamplingThreshold(double thresh) {
        return new BarcodeDetector(setDownsamplingThreshold_0(nativeObj, thresh));
    }


    //
    // C++:  void cv::barcode::BarcodeDetector::getDetectorScales(vector_float& sizes)
    //

    /**
     * Returns detector box filter sizes.
     *
     * @param sizes output parameter for returning the sizes.
     */
    public void getDetectorScales(MatOfFloat sizes) {
        Mat sizes_mat = sizes;
        getDetectorScales_0(nativeObj, sizes_mat.nativeObj);
    }


    //
    // C++:  BarcodeDetector cv::barcode::BarcodeDetector::setDetectorScales(vector_float sizes)
    //

    /**
     * Set detector box filter sizes.
     *
     * Adjusts the value and the number of box filters used in the detect step.
     * The filter sizes directly correlate with the expected line widths for a barcode. Corresponds to expected barcode distance.
     * If the downsampling limit is increased, filter sizes need to be adjusted in an inversely proportional way.
     * @param sizes box filter sizes, relative to minimum dimension of the image (default [0.01, 0.03, 0.06, 0.08])
     * @return automatically generated
     */
    public BarcodeDetector setDetectorScales(MatOfFloat sizes) {
        Mat sizes_mat = sizes;
        return new BarcodeDetector(setDetectorScales_0(nativeObj, sizes_mat.nativeObj));
    }


    //
    // C++:  double cv::barcode::BarcodeDetector::getGradientThreshold()
    //

    /**
     * Get detector gradient magnitude threshold.
     *
     * @return detector gradient magnitude threshold.
     */
    public double getGradientThreshold() {
        return getGradientThreshold_0(nativeObj);
    }


    //
    // C++:  BarcodeDetector cv::barcode::BarcodeDetector::setGradientThreshold(double thresh)
    //

    /**
     * Set detector gradient magnitude threshold.
     *
     * Sets the coherence threshold for detected bounding boxes.
     * Increasing this value will generate a closer fitted bounding box width and can reduce false-positives.
     * Values between 16 and 1024 generally work, while too high of a value will remove valid detections.
     * @param thresh gradient magnitude threshold (default 64).
     * @return automatically generated
     */
    public BarcodeDetector setGradientThreshold(double thresh) {
        return new BarcodeDetector(setGradientThreshold_0(nativeObj, thresh));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::barcode::BarcodeDetector::BarcodeDetector()
    private static native long BarcodeDetector_0();

    // C++:   cv::barcode::BarcodeDetector::BarcodeDetector(string super_resolution_model_path)
    private static native long BarcodeDetector_1(String super_resolution_model_path);

    // C++:  bool cv::barcode::BarcodeDetector::decodeWithType(Mat img, Mat points, vector_string& decoded_info, vector_string& decoded_type)
    private static native boolean decodeWithType_0(long nativeObj, long img_nativeObj, long points_nativeObj, List<String> decoded_info, List<String> decoded_type);

    // C++:  bool cv::barcode::BarcodeDetector::detectAndDecodeWithType(Mat img, vector_string& decoded_info, vector_string& decoded_type, Mat& points = Mat())
    private static native boolean detectAndDecodeWithType_0(long nativeObj, long img_nativeObj, List<String> decoded_info, List<String> decoded_type, long points_nativeObj);
    private static native boolean detectAndDecodeWithType_1(long nativeObj, long img_nativeObj, List<String> decoded_info, List<String> decoded_type);

    // C++:  double cv::barcode::BarcodeDetector::getDownsamplingThreshold()
    private static native double getDownsamplingThreshold_0(long nativeObj);

    // C++:  BarcodeDetector cv::barcode::BarcodeDetector::setDownsamplingThreshold(double thresh)
    private static native long setDownsamplingThreshold_0(long nativeObj, double thresh);

    // C++:  void cv::barcode::BarcodeDetector::getDetectorScales(vector_float& sizes)
    private static native void getDetectorScales_0(long nativeObj, long sizes_mat_nativeObj);

    // C++:  BarcodeDetector cv::barcode::BarcodeDetector::setDetectorScales(vector_float sizes)
    private static native long setDetectorScales_0(long nativeObj, long sizes_mat_nativeObj);

    // C++:  double cv::barcode::BarcodeDetector::getGradientThreshold()
    private static native double getGradientThreshold_0(long nativeObj);

    // C++:  BarcodeDetector cv::barcode::BarcodeDetector::setGradientThreshold(double thresh)
    private static native long setGradientThreshold_0(long nativeObj, double thresh);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
