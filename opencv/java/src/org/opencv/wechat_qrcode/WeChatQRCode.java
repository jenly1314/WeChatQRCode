//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.wechat_qrcode;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class WeChatQRCode
/**
 * WeChat QRCode includes two CNN-based models:
 * A object detection model and a super resolution model.
 * Object detection model is applied to detect QRCode with the bounding box.
 * super resolution model is applied to zoom in QRCode when it is small.
 *
 */
public class WeChatQRCode {

    protected final long nativeObj;
    protected WeChatQRCode(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static WeChatQRCode __fromPtr__(long addr) { return new WeChatQRCode(addr); }

    //
    // C++:   cv::wechat_qrcode::WeChatQRCode::WeChatQRCode(string detector_prototxt_path = "", string detector_caffe_model_path = "", string super_resolution_prototxt_path = "", string super_resolution_caffe_model_path = "")
    //

    /**
     * Initialize the WeChatQRCode.
     * It includes two models, which are packaged with caffe format.
     * Therefore, there are prototxt and caffe models (In total, four paramenters).
     *
     * @param detector_prototxt_path prototxt file path for the detector
     * @param detector_caffe_model_path caffe model file path for the detector
     * @param super_resolution_prototxt_path prototxt file path for the super resolution model
     * @param super_resolution_caffe_model_path caffe file path for the super resolution model
     */
    public WeChatQRCode(String detector_prototxt_path, String detector_caffe_model_path, String super_resolution_prototxt_path, String super_resolution_caffe_model_path) {
        nativeObj = WeChatQRCode_0(detector_prototxt_path, detector_caffe_model_path, super_resolution_prototxt_path, super_resolution_caffe_model_path);
    }

    /**
     * Initialize the WeChatQRCode.
     * It includes two models, which are packaged with caffe format.
     * Therefore, there are prototxt and caffe models (In total, four paramenters).
     *
     * @param detector_prototxt_path prototxt file path for the detector
     * @param detector_caffe_model_path caffe model file path for the detector
     * @param super_resolution_prototxt_path prototxt file path for the super resolution model
     */
    public WeChatQRCode(String detector_prototxt_path, String detector_caffe_model_path, String super_resolution_prototxt_path) {
        nativeObj = WeChatQRCode_1(detector_prototxt_path, detector_caffe_model_path, super_resolution_prototxt_path);
    }

    /**
     * Initialize the WeChatQRCode.
     * It includes two models, which are packaged with caffe format.
     * Therefore, there are prototxt and caffe models (In total, four paramenters).
     *
     * @param detector_prototxt_path prototxt file path for the detector
     * @param detector_caffe_model_path caffe model file path for the detector
     */
    public WeChatQRCode(String detector_prototxt_path, String detector_caffe_model_path) {
        nativeObj = WeChatQRCode_2(detector_prototxt_path, detector_caffe_model_path);
    }

    /**
     * Initialize the WeChatQRCode.
     * It includes two models, which are packaged with caffe format.
     * Therefore, there are prototxt and caffe models (In total, four paramenters).
     *
     * @param detector_prototxt_path prototxt file path for the detector
     */
    public WeChatQRCode(String detector_prototxt_path) {
        nativeObj = WeChatQRCode_3(detector_prototxt_path);
    }

    /**
     * Initialize the WeChatQRCode.
     * It includes two models, which are packaged with caffe format.
     * Therefore, there are prototxt and caffe models (In total, four paramenters).
     *
     */
    public WeChatQRCode() {
        nativeObj = WeChatQRCode_4();
    }


    //
    // C++:  vector_string cv::wechat_qrcode::WeChatQRCode::detectAndDecode(Mat img, vector_Mat& points = vector_Mat())
    //

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     * @param points optional output array of vertices of the found QR code quadrangle. Will be
     * empty if not found.
     * @return list of decoded string.
     */
    public List<String> detectAndDecode(Mat img, List<Mat> points) {
        Mat points_mat = new Mat();
        List<String> retVal = detectAndDecode_0(nativeObj, img.nativeObj, points_mat.nativeObj);
        Converters.Mat_to_vector_Mat(points_mat, points);
        points_mat.release();
        return retVal;
    }

    /**
     * Both detects and decodes QR code.
     * To simplify the usage, there is a only API: detectAndDecode
     *
     * @param img supports grayscale or color (BGR) image.
     * empty if not found.
     * @return list of decoded string.
     */
    public List<String> detectAndDecode(Mat img) {
        return detectAndDecode_1(nativeObj, img.nativeObj);
    }


    //
    // C++:  void cv::wechat_qrcode::WeChatQRCode::setScaleFactor(float _scalingFactor)
    //

    /**
     * set scale factor
     * QR code detector use neural network to detect QR.
     * Before running the neural network, the input image is pre-processed by scaling.
     * By default, the input image is scaled to an image with an area of 160000 pixels.
     * The scale factor allows to use custom scale the input image:
     * width = scaleFactor*width
     * height = scaleFactor*width
     *
     * scaleFactor valuse must be &gt; 0 and &lt;= 1, otherwise the scaleFactor value is set to -1
     * and use default scaled to an image with an area of 160000 pixels.
     * @param _scalingFactor automatically generated
     */
    public void setScaleFactor(float _scalingFactor) {
        setScaleFactor_0(nativeObj, _scalingFactor);
    }


    //
    // C++:  float cv::wechat_qrcode::WeChatQRCode::getScaleFactor()
    //

    public float getScaleFactor() {
        return getScaleFactor_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::wechat_qrcode::WeChatQRCode::WeChatQRCode(string detector_prototxt_path = "", string detector_caffe_model_path = "", string super_resolution_prototxt_path = "", string super_resolution_caffe_model_path = "")
    private static native long WeChatQRCode_0(String detector_prototxt_path, String detector_caffe_model_path, String super_resolution_prototxt_path, String super_resolution_caffe_model_path);
    private static native long WeChatQRCode_1(String detector_prototxt_path, String detector_caffe_model_path, String super_resolution_prototxt_path);
    private static native long WeChatQRCode_2(String detector_prototxt_path, String detector_caffe_model_path);
    private static native long WeChatQRCode_3(String detector_prototxt_path);
    private static native long WeChatQRCode_4();

    // C++:  vector_string cv::wechat_qrcode::WeChatQRCode::detectAndDecode(Mat img, vector_Mat& points = vector_Mat())
    private static native List<String> detectAndDecode_0(long nativeObj, long img_nativeObj, long points_mat_nativeObj);
    private static native List<String> detectAndDecode_1(long nativeObj, long img_nativeObj);

    // C++:  void cv::wechat_qrcode::WeChatQRCode::setScaleFactor(float _scalingFactor)
    private static native void setScaleFactor_0(long nativeObj, float _scalingFactor);

    // C++:  float cv::wechat_qrcode::WeChatQRCode::getScaleFactor()
    private static native float getScaleFactor_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
