//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;



// C++: class DetectorParametersMCC
/**
 * struct DetectorParametersMCC is used by CCheckerDetector
 */
public class DetectorParametersMCC {

    protected final long nativeObj;
    protected DetectorParametersMCC(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static DetectorParametersMCC __fromPtr__(long addr) { return new DetectorParametersMCC(addr); }

    //
    // C++:   cv::mcc::DetectorParametersMCC::DetectorParametersMCC()
    //

    public DetectorParametersMCC() {
        nativeObj = DetectorParametersMCC_0();
    }


    //
    // C++: int DetectorParametersMCC::adaptiveThreshWinSizeMin
    //

    public int get_adaptiveThreshWinSizeMin() {
        return get_adaptiveThreshWinSizeMin_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::adaptiveThreshWinSizeMin
    //

    public void set_adaptiveThreshWinSizeMin(int adaptiveThreshWinSizeMin) {
        set_adaptiveThreshWinSizeMin_0(nativeObj, adaptiveThreshWinSizeMin);
    }


    //
    // C++: int DetectorParametersMCC::adaptiveThreshWinSizeMax
    //

    public int get_adaptiveThreshWinSizeMax() {
        return get_adaptiveThreshWinSizeMax_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::adaptiveThreshWinSizeMax
    //

    public void set_adaptiveThreshWinSizeMax(int adaptiveThreshWinSizeMax) {
        set_adaptiveThreshWinSizeMax_0(nativeObj, adaptiveThreshWinSizeMax);
    }


    //
    // C++: int DetectorParametersMCC::adaptiveThreshWinSizeStep
    //

    public int get_adaptiveThreshWinSizeStep() {
        return get_adaptiveThreshWinSizeStep_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::adaptiveThreshWinSizeStep
    //

    public void set_adaptiveThreshWinSizeStep(int adaptiveThreshWinSizeStep) {
        set_adaptiveThreshWinSizeStep_0(nativeObj, adaptiveThreshWinSizeStep);
    }


    //
    // C++: double DetectorParametersMCC::adaptiveThreshConstant
    //

    public double get_adaptiveThreshConstant() {
        return get_adaptiveThreshConstant_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::adaptiveThreshConstant
    //

    public void set_adaptiveThreshConstant(double adaptiveThreshConstant) {
        set_adaptiveThreshConstant_0(nativeObj, adaptiveThreshConstant);
    }


    //
    // C++: double DetectorParametersMCC::minContoursAreaRate
    //

    public double get_minContoursAreaRate() {
        return get_minContoursAreaRate_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minContoursAreaRate
    //

    public void set_minContoursAreaRate(double minContoursAreaRate) {
        set_minContoursAreaRate_0(nativeObj, minContoursAreaRate);
    }


    //
    // C++: double DetectorParametersMCC::minContoursArea
    //

    public double get_minContoursArea() {
        return get_minContoursArea_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minContoursArea
    //

    public void set_minContoursArea(double minContoursArea) {
        set_minContoursArea_0(nativeObj, minContoursArea);
    }


    //
    // C++: double DetectorParametersMCC::confidenceThreshold
    //

    public double get_confidenceThreshold() {
        return get_confidenceThreshold_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::confidenceThreshold
    //

    public void set_confidenceThreshold(double confidenceThreshold) {
        set_confidenceThreshold_0(nativeObj, confidenceThreshold);
    }


    //
    // C++: double DetectorParametersMCC::minContourSolidity
    //

    public double get_minContourSolidity() {
        return get_minContourSolidity_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minContourSolidity
    //

    public void set_minContourSolidity(double minContourSolidity) {
        set_minContourSolidity_0(nativeObj, minContourSolidity);
    }


    //
    // C++: double DetectorParametersMCC::findCandidatesApproxPolyDPEpsMultiplier
    //

    public double get_findCandidatesApproxPolyDPEpsMultiplier() {
        return get_findCandidatesApproxPolyDPEpsMultiplier_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::findCandidatesApproxPolyDPEpsMultiplier
    //

    public void set_findCandidatesApproxPolyDPEpsMultiplier(double findCandidatesApproxPolyDPEpsMultiplier) {
        set_findCandidatesApproxPolyDPEpsMultiplier_0(nativeObj, findCandidatesApproxPolyDPEpsMultiplier);
    }


    //
    // C++: int DetectorParametersMCC::borderWidth
    //

    public int get_borderWidth() {
        return get_borderWidth_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::borderWidth
    //

    public void set_borderWidth(int borderWidth) {
        set_borderWidth_0(nativeObj, borderWidth);
    }


    //
    // C++: float DetectorParametersMCC::B0factor
    //

    public float get_B0factor() {
        return get_B0factor_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::B0factor
    //

    public void set_B0factor(float B0factor) {
        set_B0factor_0(nativeObj, B0factor);
    }


    //
    // C++: float DetectorParametersMCC::maxError
    //

    public float get_maxError() {
        return get_maxError_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::maxError
    //

    public void set_maxError(float maxError) {
        set_maxError_0(nativeObj, maxError);
    }


    //
    // C++: int DetectorParametersMCC::minContourPointsAllowed
    //

    public int get_minContourPointsAllowed() {
        return get_minContourPointsAllowed_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minContourPointsAllowed
    //

    public void set_minContourPointsAllowed(int minContourPointsAllowed) {
        set_minContourPointsAllowed_0(nativeObj, minContourPointsAllowed);
    }


    //
    // C++: int DetectorParametersMCC::minContourLengthAllowed
    //

    public int get_minContourLengthAllowed() {
        return get_minContourLengthAllowed_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minContourLengthAllowed
    //

    public void set_minContourLengthAllowed(int minContourLengthAllowed) {
        set_minContourLengthAllowed_0(nativeObj, minContourLengthAllowed);
    }


    //
    // C++: int DetectorParametersMCC::minInterContourDistance
    //

    public int get_minInterContourDistance() {
        return get_minInterContourDistance_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minInterContourDistance
    //

    public void set_minInterContourDistance(int minInterContourDistance) {
        set_minInterContourDistance_0(nativeObj, minInterContourDistance);
    }


    //
    // C++: int DetectorParametersMCC::minInterCheckerDistance
    //

    public int get_minInterCheckerDistance() {
        return get_minInterCheckerDistance_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minInterCheckerDistance
    //

    public void set_minInterCheckerDistance(int minInterCheckerDistance) {
        set_minInterCheckerDistance_0(nativeObj, minInterCheckerDistance);
    }


    //
    // C++: int DetectorParametersMCC::minImageSize
    //

    public int get_minImageSize() {
        return get_minImageSize_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minImageSize
    //

    public void set_minImageSize(int minImageSize) {
        set_minImageSize_0(nativeObj, minImageSize);
    }


    //
    // C++: int DetectorParametersMCC::minGroupSize
    //

    public int get_minGroupSize() {
        return get_minGroupSize_0(nativeObj);
    }


    //
    // C++: void DetectorParametersMCC::minGroupSize
    //

    public void set_minGroupSize(int minGroupSize) {
        set_minGroupSize_0(nativeObj, minGroupSize);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::mcc::DetectorParametersMCC::DetectorParametersMCC()
    private static native long DetectorParametersMCC_0();

    // C++: int DetectorParametersMCC::adaptiveThreshWinSizeMin
    private static native int get_adaptiveThreshWinSizeMin_0(long nativeObj);

    // C++: void DetectorParametersMCC::adaptiveThreshWinSizeMin
    private static native void set_adaptiveThreshWinSizeMin_0(long nativeObj, int adaptiveThreshWinSizeMin);

    // C++: int DetectorParametersMCC::adaptiveThreshWinSizeMax
    private static native int get_adaptiveThreshWinSizeMax_0(long nativeObj);

    // C++: void DetectorParametersMCC::adaptiveThreshWinSizeMax
    private static native void set_adaptiveThreshWinSizeMax_0(long nativeObj, int adaptiveThreshWinSizeMax);

    // C++: int DetectorParametersMCC::adaptiveThreshWinSizeStep
    private static native int get_adaptiveThreshWinSizeStep_0(long nativeObj);

    // C++: void DetectorParametersMCC::adaptiveThreshWinSizeStep
    private static native void set_adaptiveThreshWinSizeStep_0(long nativeObj, int adaptiveThreshWinSizeStep);

    // C++: double DetectorParametersMCC::adaptiveThreshConstant
    private static native double get_adaptiveThreshConstant_0(long nativeObj);

    // C++: void DetectorParametersMCC::adaptiveThreshConstant
    private static native void set_adaptiveThreshConstant_0(long nativeObj, double adaptiveThreshConstant);

    // C++: double DetectorParametersMCC::minContoursAreaRate
    private static native double get_minContoursAreaRate_0(long nativeObj);

    // C++: void DetectorParametersMCC::minContoursAreaRate
    private static native void set_minContoursAreaRate_0(long nativeObj, double minContoursAreaRate);

    // C++: double DetectorParametersMCC::minContoursArea
    private static native double get_minContoursArea_0(long nativeObj);

    // C++: void DetectorParametersMCC::minContoursArea
    private static native void set_minContoursArea_0(long nativeObj, double minContoursArea);

    // C++: double DetectorParametersMCC::confidenceThreshold
    private static native double get_confidenceThreshold_0(long nativeObj);

    // C++: void DetectorParametersMCC::confidenceThreshold
    private static native void set_confidenceThreshold_0(long nativeObj, double confidenceThreshold);

    // C++: double DetectorParametersMCC::minContourSolidity
    private static native double get_minContourSolidity_0(long nativeObj);

    // C++: void DetectorParametersMCC::minContourSolidity
    private static native void set_minContourSolidity_0(long nativeObj, double minContourSolidity);

    // C++: double DetectorParametersMCC::findCandidatesApproxPolyDPEpsMultiplier
    private static native double get_findCandidatesApproxPolyDPEpsMultiplier_0(long nativeObj);

    // C++: void DetectorParametersMCC::findCandidatesApproxPolyDPEpsMultiplier
    private static native void set_findCandidatesApproxPolyDPEpsMultiplier_0(long nativeObj, double findCandidatesApproxPolyDPEpsMultiplier);

    // C++: int DetectorParametersMCC::borderWidth
    private static native int get_borderWidth_0(long nativeObj);

    // C++: void DetectorParametersMCC::borderWidth
    private static native void set_borderWidth_0(long nativeObj, int borderWidth);

    // C++: float DetectorParametersMCC::B0factor
    private static native float get_B0factor_0(long nativeObj);

    // C++: void DetectorParametersMCC::B0factor
    private static native void set_B0factor_0(long nativeObj, float B0factor);

    // C++: float DetectorParametersMCC::maxError
    private static native float get_maxError_0(long nativeObj);

    // C++: void DetectorParametersMCC::maxError
    private static native void set_maxError_0(long nativeObj, float maxError);

    // C++: int DetectorParametersMCC::minContourPointsAllowed
    private static native int get_minContourPointsAllowed_0(long nativeObj);

    // C++: void DetectorParametersMCC::minContourPointsAllowed
    private static native void set_minContourPointsAllowed_0(long nativeObj, int minContourPointsAllowed);

    // C++: int DetectorParametersMCC::minContourLengthAllowed
    private static native int get_minContourLengthAllowed_0(long nativeObj);

    // C++: void DetectorParametersMCC::minContourLengthAllowed
    private static native void set_minContourLengthAllowed_0(long nativeObj, int minContourLengthAllowed);

    // C++: int DetectorParametersMCC::minInterContourDistance
    private static native int get_minInterContourDistance_0(long nativeObj);

    // C++: void DetectorParametersMCC::minInterContourDistance
    private static native void set_minInterContourDistance_0(long nativeObj, int minInterContourDistance);

    // C++: int DetectorParametersMCC::minInterCheckerDistance
    private static native int get_minInterCheckerDistance_0(long nativeObj);

    // C++: void DetectorParametersMCC::minInterCheckerDistance
    private static native void set_minInterCheckerDistance_0(long nativeObj, int minInterCheckerDistance);

    // C++: int DetectorParametersMCC::minImageSize
    private static native int get_minImageSize_0(long nativeObj);

    // C++: void DetectorParametersMCC::minImageSize
    private static native void set_minImageSize_0(long nativeObj, int minImageSize);

    // C++: int DetectorParametersMCC::minGroupSize
    private static native int get_minGroupSize_0(long nativeObj);

    // C++: void DetectorParametersMCC::minGroupSize
    private static native void set_minGroupSize_0(long nativeObj, int minGroupSize);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
