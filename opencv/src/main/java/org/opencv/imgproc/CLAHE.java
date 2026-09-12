//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class CLAHE
/**
 * Base class for Contrast Limited Adaptive Histogram Equalization.
 */
public class CLAHE extends Algorithm {

    protected CLAHE(long addr) { super(addr); }

    // internal usage only
    public static CLAHE __fromPtr__(long addr) { return new CLAHE(addr); }

    //
    // C++:  void cv::CLAHE::apply(Mat src, Mat& dst)
    //

    /**
     * Equalizes the histogram of a grayscale image using Contrast Limited Adaptive Histogram Equalization.
     *
     *     @param src Source image of type CV_8UC1 or CV_16UC1.
     *     @param dst Destination image.
     */
    public void apply(Mat src, Mat dst) {
        apply_0(nativeObj, src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::CLAHE::setClipLimit(double clipLimit)
    //

    /**
     * Sets threshold for contrast limiting.
     *
     *     @param clipLimit threshold value.
     */
    public void setClipLimit(double clipLimit) {
        setClipLimit_0(nativeObj, clipLimit);
    }


    //
    // C++:  double cv::CLAHE::getClipLimit()
    //

    public double getClipLimit() {
        return getClipLimit_0(nativeObj);
    }


    //
    // C++:  void cv::CLAHE::setTilesGridSize(Size tileGridSize)
    //

    /**
     * Sets size of grid for histogram equalization. Input image will be divided into
     *     equally sized rectangular tiles.
     *
     *     @param tileGridSize defines the number of tiles in row and column.
     */
    public void setTilesGridSize(Size tileGridSize) {
        setTilesGridSize_0(nativeObj, tileGridSize.width, tileGridSize.height);
    }


    //
    // C++:  Size cv::CLAHE::getTilesGridSize()
    //

    public Size getTilesGridSize() {
        return new Size(getTilesGridSize_0(nativeObj));
    }


    //
    // C++:  void cv::CLAHE::setBitShift(int bitShift)
    //

    /**
     * Sets bit shift parameter for histogram bins.
     *
     *     @param bitShift bit shift value (default is 0).
     */
    public void setBitShift(int bitShift) {
        setBitShift_0(nativeObj, bitShift);
    }


    //
    // C++:  int cv::CLAHE::getBitShift()
    //

    /**
     * Returns the bit shift parameter for histogram bins.
     *
     *     @return current bit shift value.
     */
    public int getBitShift() {
        return getBitShift_0(nativeObj);
    }


    //
    // C++:  void cv::CLAHE::collectGarbage()
    //

    public void collectGarbage() {
        collectGarbage_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::CLAHE::apply(Mat src, Mat& dst)
    private static native void apply_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::CLAHE::setClipLimit(double clipLimit)
    private static native void setClipLimit_0(long nativeObj, double clipLimit);

    // C++:  double cv::CLAHE::getClipLimit()
    private static native double getClipLimit_0(long nativeObj);

    // C++:  void cv::CLAHE::setTilesGridSize(Size tileGridSize)
    private static native void setTilesGridSize_0(long nativeObj, double tileGridSize_width, double tileGridSize_height);

    // C++:  Size cv::CLAHE::getTilesGridSize()
    private static native double[] getTilesGridSize_0(long nativeObj);

    // C++:  void cv::CLAHE::setBitShift(int bitShift)
    private static native void setBitShift_0(long nativeObj, int bitShift);

    // C++:  int cv::CLAHE::getBitShift()
    private static native int getBitShift_0(long nativeObj);

    // C++:  void cv::CLAHE::collectGarbage()
    private static native void collectGarbage_0(long nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
