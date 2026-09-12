//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.dnn.Net;
import org.opencv.objdetect.CCheckerDetector;
import org.opencv.objdetect.DetectorParametersMCC;
import org.opencv.utils.Converters;

// C++: class CCheckerDetector
/**
 * A class to find the positions of the ColorCharts in the image.
 */
public class CCheckerDetector extends Algorithm {

    protected CCheckerDetector(long addr) { super(addr); }

    // internal usage only
    public static CCheckerDetector __fromPtr__(long addr) { return new CCheckerDetector(addr); }

    //
    // C++:  bool cv::mcc::CCheckerDetector::process(Mat image, vector_Rect regionsOfInterest, int nc = 1)
    //

    /**
     * Find the ColorCharts in the given image.
     *
     * The found charts are not returned but instead stored in the
     * detector, these can be accessed later on using getBestColorChecker()
     * and getListColorChecker()
     * @param image image in color space BGR
     * @param regionsOfInterest regions of image to look for the chart, if
     * it is empty, charts are looked for in the
     * entire image
     * @param nc number of charts in the image, if you don't know the exact
     * then keeping this number high helps.
     * @return true if atleast one chart is detected otherwise false
     */
    public boolean processWithROI(Mat image, MatOfRect regionsOfInterest, int nc) {
        Mat regionsOfInterest_mat = regionsOfInterest;
        return processWithROI_0(nativeObj, image.nativeObj, regionsOfInterest_mat.nativeObj, nc);
    }

    /**
     * Find the ColorCharts in the given image.
     *
     * The found charts are not returned but instead stored in the
     * detector, these can be accessed later on using getBestColorChecker()
     * and getListColorChecker()
     * @param image image in color space BGR
     * @param regionsOfInterest regions of image to look for the chart, if
     * it is empty, charts are looked for in the
     * entire image
     * then keeping this number high helps.
     * @return true if atleast one chart is detected otherwise false
     */
    public boolean processWithROI(Mat image, MatOfRect regionsOfInterest) {
        Mat regionsOfInterest_mat = regionsOfInterest;
        return processWithROI_1(nativeObj, image.nativeObj, regionsOfInterest_mat.nativeObj);
    }


    //
    // C++:  bool cv::mcc::CCheckerDetector::process(Mat image, int nc = 1)
    //

    /**
     * Find the ColorCharts in the given image.
     *
     * Differs from the above one only in the arguments.
     *
     * This version searches for the chart in the full image.
     *
     * The found charts are not returned but instead stored in the
     * detector, these can be accessed later on using getBestColorChecker()
     * and getListColorChecker()
     * @param image image in color space BGR
     * @param nc number of charts in the image, if you don't know the exact
     * then keeping this number high helps.
     * @return true if atleast one chart is detected otherwise false
     */
    public boolean process(Mat image, int nc) {
        return process_0(nativeObj, image.nativeObj, nc);
    }

    /**
     * Find the ColorCharts in the given image.
     *
     * Differs from the above one only in the arguments.
     *
     * This version searches for the chart in the full image.
     *
     * The found charts are not returned but instead stored in the
     * detector, these can be accessed later on using getBestColorChecker()
     * and getListColorChecker()
     * @param image image in color space BGR
     * then keeping this number high helps.
     * @return true if atleast one chart is detected otherwise false
     */
    public boolean process(Mat image) {
        return process_1(nativeObj, image.nativeObj);
    }


    //
    // C++:  Ptr_mcc_CChecker cv::mcc::CCheckerDetector::getBestColorChecker()
    //

    // Return type 'Ptr_mcc_CChecker' is not supported, skipping the function


    //
    // C++:  vector_Ptr_CChecker cv::mcc::CCheckerDetector::getListColorChecker()
    //

    // Return type 'vector_Ptr_CChecker' is not supported, skipping the function


    //
    // C++: static Ptr_CCheckerDetector cv::mcc::CCheckerDetector::create()
    //

    /**
     * Returns the implementation of the CCheckerDetector.
     *
     * @return automatically generated
     */
    public static CCheckerDetector create() {
        return CCheckerDetector.__fromPtr__(create_0());
    }


    //
    // C++: static Ptr_CCheckerDetector cv::mcc::CCheckerDetector::create(Net net)
    //

    /**
     * Set the net which will be used to find the approximate
     * bounding boxes for the color charts. And returns the implementation of the CCheckerDetector.
     *
     * It is not necessary to use this, but this usually results in
     * better detection rate.
     *
     * @param net the neural network, if the network in empty, then
     * the function will return false.
     * @return automatically generated
     */
    public static CCheckerDetector create(Net net) {
        return CCheckerDetector.__fromPtr__(create_1(net.getNativeObjAddr()));
    }


    //
    // C++:  void cv::mcc::CCheckerDetector::draw(vector_Ptr_CChecker checkers, Mat& img, Scalar color = CV_RGB(0,250,0), int thickness = 2)
    //

    // Unknown type 'vector_Ptr_CChecker' (I), skipping the function


    //
    // C++:  Mat cv::mcc::CCheckerDetector::getRefColors()
    //

    /**
     * Gets the reference color for chart.
     * @return automatically generated
     */
    public Mat getRefColors() {
        return new Mat(getRefColors_0(nativeObj));
    }


    //
    // C++:  void cv::mcc::CCheckerDetector::setDetectionParams(DetectorParametersMCC params)
    //

    /**
     * Sets the detection paramaters for mcc.
     * @param params DetectorParametersMCC structure containing detection configuration parameters.
     */
    public void setDetectionParams(DetectorParametersMCC params) {
        setDetectionParams_0(nativeObj, params.getNativeObjAddr());
    }


    //
    // C++:  void cv::mcc::CCheckerDetector::setColorChartType(ColorChart chartType)
    //

    // Unknown type 'ColorChart' (I), skipping the function


    //
    // C++:  void cv::mcc::CCheckerDetector::setUseDnnModel(bool useDnn)
    //

    /**
     * Enables or disables the use of the neural network for detection.
     * @param useDnn Boolean flag to indicate whether to use neural network (true) or not (false).
     */
    public void setUseDnnModel(boolean useDnn) {
        setUseDnnModel_0(nativeObj, useDnn);
    }


    //
    // C++:  bool cv::mcc::CCheckerDetector::getUseDnnModel()
    //

    public boolean getUseDnnModel() {
        return getUseDnnModel_0(nativeObj);
    }


    //
    // C++:  DetectorParametersMCC cv::mcc::CCheckerDetector::getDetectionParams()
    //

    public DetectorParametersMCC getDetectionParams() {
        return new DetectorParametersMCC(getDetectionParams_0(nativeObj));
    }


    //
    // C++:  ColorChart cv::mcc::CCheckerDetector::getColorChartType()
    //

    // Return type 'ColorChart' is not supported, skipping the function


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::mcc::CCheckerDetector::process(Mat image, vector_Rect regionsOfInterest, int nc = 1)
    private static native boolean processWithROI_0(long nativeObj, long image_nativeObj, long regionsOfInterest_mat_nativeObj, int nc);
    private static native boolean processWithROI_1(long nativeObj, long image_nativeObj, long regionsOfInterest_mat_nativeObj);

    // C++:  bool cv::mcc::CCheckerDetector::process(Mat image, int nc = 1)
    private static native boolean process_0(long nativeObj, long image_nativeObj, int nc);
    private static native boolean process_1(long nativeObj, long image_nativeObj);

    // C++: static Ptr_CCheckerDetector cv::mcc::CCheckerDetector::create()
    private static native long create_0();

    // C++: static Ptr_CCheckerDetector cv::mcc::CCheckerDetector::create(Net net)
    private static native long create_1(long net_nativeObj);

    // C++:  Mat cv::mcc::CCheckerDetector::getRefColors()
    private static native long getRefColors_0(long nativeObj);

    // C++:  void cv::mcc::CCheckerDetector::setDetectionParams(DetectorParametersMCC params)
    private static native void setDetectionParams_0(long nativeObj, long params_nativeObj);

    // C++:  void cv::mcc::CCheckerDetector::setUseDnnModel(bool useDnn)
    private static native void setUseDnnModel_0(long nativeObj, boolean useDnn);

    // C++:  bool cv::mcc::CCheckerDetector::getUseDnnModel()
    private static native boolean getUseDnnModel_0(long nativeObj);

    // C++:  DetectorParametersMCC cv::mcc::CCheckerDetector::getDetectionParams()
    private static native long getDetectionParams_0(long nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
