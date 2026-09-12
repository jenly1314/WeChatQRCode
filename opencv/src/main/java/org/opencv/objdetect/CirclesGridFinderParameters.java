//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import org.opencv.core.Size;

// C++: class CirclesGridFinderParameters

public class CirclesGridFinderParameters {

    protected final long nativeObj;
    protected CirclesGridFinderParameters(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static CirclesGridFinderParameters __fromPtr__(long addr) { return new CirclesGridFinderParameters(addr); }

    // C++: enum GridType (cv.CirclesGridFinderParameters.GridType)
    public static final int
            SYMMETRIC_GRID = 0,
            ASYMMETRIC_GRID = 1;


    //
    // C++:   cv::CirclesGridFinderParameters::CirclesGridFinderParameters()
    //

    public CirclesGridFinderParameters() {
        nativeObj = CirclesGridFinderParameters_0();
    }


    //
    // C++: Size2f CirclesGridFinderParameters::densityNeighborhoodSize
    //

    public Size get_densityNeighborhoodSize() {
        return new Size(get_densityNeighborhoodSize_0(nativeObj));
    }


    //
    // C++: void CirclesGridFinderParameters::densityNeighborhoodSize
    //

    public void set_densityNeighborhoodSize(Size densityNeighborhoodSize) {
        set_densityNeighborhoodSize_0(nativeObj, densityNeighborhoodSize.width, densityNeighborhoodSize.height);
    }


    //
    // C++: float CirclesGridFinderParameters::minDensity
    //

    public float get_minDensity() {
        return get_minDensity_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::minDensity
    //

    public void set_minDensity(float minDensity) {
        set_minDensity_0(nativeObj, minDensity);
    }


    //
    // C++: int CirclesGridFinderParameters::kmeansAttempts
    //

    public int get_kmeansAttempts() {
        return get_kmeansAttempts_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::kmeansAttempts
    //

    public void set_kmeansAttempts(int kmeansAttempts) {
        set_kmeansAttempts_0(nativeObj, kmeansAttempts);
    }


    //
    // C++: int CirclesGridFinderParameters::minDistanceToAddKeypoint
    //

    public int get_minDistanceToAddKeypoint() {
        return get_minDistanceToAddKeypoint_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::minDistanceToAddKeypoint
    //

    public void set_minDistanceToAddKeypoint(int minDistanceToAddKeypoint) {
        set_minDistanceToAddKeypoint_0(nativeObj, minDistanceToAddKeypoint);
    }


    //
    // C++: int CirclesGridFinderParameters::keypointScale
    //

    public int get_keypointScale() {
        return get_keypointScale_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::keypointScale
    //

    public void set_keypointScale(int keypointScale) {
        set_keypointScale_0(nativeObj, keypointScale);
    }


    //
    // C++: float CirclesGridFinderParameters::minGraphConfidence
    //

    public float get_minGraphConfidence() {
        return get_minGraphConfidence_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::minGraphConfidence
    //

    public void set_minGraphConfidence(float minGraphConfidence) {
        set_minGraphConfidence_0(nativeObj, minGraphConfidence);
    }


    //
    // C++: float CirclesGridFinderParameters::vertexGain
    //

    public float get_vertexGain() {
        return get_vertexGain_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::vertexGain
    //

    public void set_vertexGain(float vertexGain) {
        set_vertexGain_0(nativeObj, vertexGain);
    }


    //
    // C++: float CirclesGridFinderParameters::vertexPenalty
    //

    public float get_vertexPenalty() {
        return get_vertexPenalty_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::vertexPenalty
    //

    public void set_vertexPenalty(float vertexPenalty) {
        set_vertexPenalty_0(nativeObj, vertexPenalty);
    }


    //
    // C++: float CirclesGridFinderParameters::existingVertexGain
    //

    public float get_existingVertexGain() {
        return get_existingVertexGain_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::existingVertexGain
    //

    public void set_existingVertexGain(float existingVertexGain) {
        set_existingVertexGain_0(nativeObj, existingVertexGain);
    }


    //
    // C++: float CirclesGridFinderParameters::edgeGain
    //

    public float get_edgeGain() {
        return get_edgeGain_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::edgeGain
    //

    public void set_edgeGain(float edgeGain) {
        set_edgeGain_0(nativeObj, edgeGain);
    }


    //
    // C++: float CirclesGridFinderParameters::edgePenalty
    //

    public float get_edgePenalty() {
        return get_edgePenalty_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::edgePenalty
    //

    public void set_edgePenalty(float edgePenalty) {
        set_edgePenalty_0(nativeObj, edgePenalty);
    }


    //
    // C++: float CirclesGridFinderParameters::convexHullFactor
    //

    public float get_convexHullFactor() {
        return get_convexHullFactor_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::convexHullFactor
    //

    public void set_convexHullFactor(float convexHullFactor) {
        set_convexHullFactor_0(nativeObj, convexHullFactor);
    }


    //
    // C++: float CirclesGridFinderParameters::minRNGEdgeSwitchDist
    //

    public float get_minRNGEdgeSwitchDist() {
        return get_minRNGEdgeSwitchDist_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::minRNGEdgeSwitchDist
    //

    public void set_minRNGEdgeSwitchDist(float minRNGEdgeSwitchDist) {
        set_minRNGEdgeSwitchDist_0(nativeObj, minRNGEdgeSwitchDist);
    }


    //
    // C++: GridType CirclesGridFinderParameters::gridType
    //

    // Return type 'GridType' is not supported, skipping the function


    //
    // C++: void CirclesGridFinderParameters::gridType
    //

    // Unknown type 'GridType' (I), skipping the function


    //
    // C++: float CirclesGridFinderParameters::squareSize
    //

    public float get_squareSize() {
        return get_squareSize_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::squareSize
    //

    public void set_squareSize(float squareSize) {
        set_squareSize_0(nativeObj, squareSize);
    }


    //
    // C++: float CirclesGridFinderParameters::maxRectifiedDistance
    //

    public float get_maxRectifiedDistance() {
        return get_maxRectifiedDistance_0(nativeObj);
    }


    //
    // C++: void CirclesGridFinderParameters::maxRectifiedDistance
    //

    public void set_maxRectifiedDistance(float maxRectifiedDistance) {
        set_maxRectifiedDistance_0(nativeObj, maxRectifiedDistance);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::CirclesGridFinderParameters::CirclesGridFinderParameters()
    private static native long CirclesGridFinderParameters_0();

    // C++: Size2f CirclesGridFinderParameters::densityNeighborhoodSize
    private static native double[] get_densityNeighborhoodSize_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::densityNeighborhoodSize
    private static native void set_densityNeighborhoodSize_0(long nativeObj, double densityNeighborhoodSize_width, double densityNeighborhoodSize_height);

    // C++: float CirclesGridFinderParameters::minDensity
    private static native float get_minDensity_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::minDensity
    private static native void set_minDensity_0(long nativeObj, float minDensity);

    // C++: int CirclesGridFinderParameters::kmeansAttempts
    private static native int get_kmeansAttempts_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::kmeansAttempts
    private static native void set_kmeansAttempts_0(long nativeObj, int kmeansAttempts);

    // C++: int CirclesGridFinderParameters::minDistanceToAddKeypoint
    private static native int get_minDistanceToAddKeypoint_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::minDistanceToAddKeypoint
    private static native void set_minDistanceToAddKeypoint_0(long nativeObj, int minDistanceToAddKeypoint);

    // C++: int CirclesGridFinderParameters::keypointScale
    private static native int get_keypointScale_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::keypointScale
    private static native void set_keypointScale_0(long nativeObj, int keypointScale);

    // C++: float CirclesGridFinderParameters::minGraphConfidence
    private static native float get_minGraphConfidence_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::minGraphConfidence
    private static native void set_minGraphConfidence_0(long nativeObj, float minGraphConfidence);

    // C++: float CirclesGridFinderParameters::vertexGain
    private static native float get_vertexGain_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::vertexGain
    private static native void set_vertexGain_0(long nativeObj, float vertexGain);

    // C++: float CirclesGridFinderParameters::vertexPenalty
    private static native float get_vertexPenalty_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::vertexPenalty
    private static native void set_vertexPenalty_0(long nativeObj, float vertexPenalty);

    // C++: float CirclesGridFinderParameters::existingVertexGain
    private static native float get_existingVertexGain_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::existingVertexGain
    private static native void set_existingVertexGain_0(long nativeObj, float existingVertexGain);

    // C++: float CirclesGridFinderParameters::edgeGain
    private static native float get_edgeGain_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::edgeGain
    private static native void set_edgeGain_0(long nativeObj, float edgeGain);

    // C++: float CirclesGridFinderParameters::edgePenalty
    private static native float get_edgePenalty_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::edgePenalty
    private static native void set_edgePenalty_0(long nativeObj, float edgePenalty);

    // C++: float CirclesGridFinderParameters::convexHullFactor
    private static native float get_convexHullFactor_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::convexHullFactor
    private static native void set_convexHullFactor_0(long nativeObj, float convexHullFactor);

    // C++: float CirclesGridFinderParameters::minRNGEdgeSwitchDist
    private static native float get_minRNGEdgeSwitchDist_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::minRNGEdgeSwitchDist
    private static native void set_minRNGEdgeSwitchDist_0(long nativeObj, float minRNGEdgeSwitchDist);

    // C++: float CirclesGridFinderParameters::squareSize
    private static native float get_squareSize_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::squareSize
    private static native void set_squareSize_0(long nativeObj, float squareSize);

    // C++: float CirclesGridFinderParameters::maxRectifiedDistance
    private static native float get_maxRectifiedDistance_0(long nativeObj);

    // C++: void CirclesGridFinderParameters::maxRectifiedDistance
    private static native void set_maxRectifiedDistance_0(long nativeObj, float maxRectifiedDistance);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
