//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.objdetect.CChecker;
import org.opencv.utils.Converters;

// C++: class CChecker
/**
 * CChecker
 *
 * checker object
 *
 * This class contains the information about the detected checkers,i.e, their
 * type, the corners of the chart, the color profile, the cost, centers chart,
 * etc.
 */
public class CChecker extends Algorithm {

    protected CChecker(long addr) { super(addr); }

    // internal usage only
    public static CChecker __fromPtr__(long addr) { return new CChecker(addr); }

    //
    // C++: static Ptr_CChecker cv::mcc::CChecker::create()
    //

    /**
     * Create a new CChecker object.
     *
     * @return A pointer to the implementation of the CChecker
     */
    public static CChecker create() {
        return CChecker.__fromPtr__(create_0());
    }


    //
    // C++:  void cv::mcc::CChecker::setTarget(ColorChart _target)
    //

    // Unknown type 'ColorChart' (I), skipping the function


    //
    // C++:  void cv::mcc::CChecker::setBox(vector_Point2f _box)
    //

    public void setBox(MatOfPoint2f _box) {
        Mat _box_mat = _box;
        setBox_0(nativeObj, _box_mat.nativeObj);
    }


    //
    // C++:  void cv::mcc::CChecker::setChartsRGB(Mat _chartsRGB)
    //

    public void setChartsRGB(Mat _chartsRGB) {
        setChartsRGB_0(nativeObj, _chartsRGB.nativeObj);
    }


    //
    // C++:  void cv::mcc::CChecker::setChartsYCbCr(Mat _chartsYCbCr)
    //

    public void setChartsYCbCr(Mat _chartsYCbCr) {
        setChartsYCbCr_0(nativeObj, _chartsYCbCr.nativeObj);
    }


    //
    // C++:  void cv::mcc::CChecker::setCost(float _cost)
    //

    public void setCost(float _cost) {
        setCost_0(nativeObj, _cost);
    }


    //
    // C++:  void cv::mcc::CChecker::setCenter(Point2f _center)
    //

    public void setCenter(Point _center) {
        setCenter_0(nativeObj, _center.x, _center.y);
    }


    //
    // C++:  ColorChart cv::mcc::CChecker::getTarget()
    //

    // Return type 'ColorChart' is not supported, skipping the function


    //
    // C++:  vector_Point2f cv::mcc::CChecker::getBox()
    //

    public MatOfPoint2f getBox() {
        return MatOfPoint2f.fromNativeAddr(getBox_0(nativeObj));
    }


    //
    // C++:  vector_Point2f cv::mcc::CChecker::getColorCharts()
    //

    /**
     * Computes and returns the coordinates of the central parts of the charts modules.
     *
     * This method computes transformation matrix from the checkers's coordinates ({@code CChecker::getBox()})
     * and find by this the coordinates of the central parts of the charts modules.
     * It is used in {@code CCheckerDetector::draw()} and in {@code ChartsRGB} calculation.
     * @return automatically generated
     */
    public MatOfPoint2f getColorCharts() {
        return MatOfPoint2f.fromNativeAddr(getColorCharts_0(nativeObj));
    }


    //
    // C++:  Mat cv::mcc::CChecker::getChartsRGB(bool getStats = true)
    //

    public Mat getChartsRGB(boolean getStats) {
        return new Mat(getChartsRGB_0(nativeObj, getStats));
    }

    public Mat getChartsRGB() {
        return new Mat(getChartsRGB_1(nativeObj));
    }


    //
    // C++:  Mat cv::mcc::CChecker::getChartsYCbCr()
    //

    public Mat getChartsYCbCr() {
        return new Mat(getChartsYCbCr_0(nativeObj));
    }


    //
    // C++:  float cv::mcc::CChecker::getCost()
    //

    public float getCost() {
        return getCost_0(nativeObj);
    }


    //
    // C++:  Point2f cv::mcc::CChecker::getCenter()
    //

    public Point getCenter() {
        return new Point(getCenter_0(nativeObj));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_CChecker cv::mcc::CChecker::create()
    private static native long create_0();

    // C++:  void cv::mcc::CChecker::setBox(vector_Point2f _box)
    private static native void setBox_0(long nativeObj, long _box_mat_nativeObj);

    // C++:  void cv::mcc::CChecker::setChartsRGB(Mat _chartsRGB)
    private static native void setChartsRGB_0(long nativeObj, long _chartsRGB_nativeObj);

    // C++:  void cv::mcc::CChecker::setChartsYCbCr(Mat _chartsYCbCr)
    private static native void setChartsYCbCr_0(long nativeObj, long _chartsYCbCr_nativeObj);

    // C++:  void cv::mcc::CChecker::setCost(float _cost)
    private static native void setCost_0(long nativeObj, float _cost);

    // C++:  void cv::mcc::CChecker::setCenter(Point2f _center)
    private static native void setCenter_0(long nativeObj, double _center_x, double _center_y);

    // C++:  vector_Point2f cv::mcc::CChecker::getBox()
    private static native long getBox_0(long nativeObj);

    // C++:  vector_Point2f cv::mcc::CChecker::getColorCharts()
    private static native long getColorCharts_0(long nativeObj);

    // C++:  Mat cv::mcc::CChecker::getChartsRGB(bool getStats = true)
    private static native long getChartsRGB_0(long nativeObj, boolean getStats);
    private static native long getChartsRGB_1(long nativeObj);

    // C++:  Mat cv::mcc::CChecker::getChartsYCbCr()
    private static native long getChartsYCbCr_0(long nativeObj);

    // C++:  float cv::mcc::CChecker::getCost()
    private static native float getCost_0(long nativeObj);

    // C++:  Point2f cv::mcc::CChecker::getCenter()
    private static native double[] getCenter_0(long nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
