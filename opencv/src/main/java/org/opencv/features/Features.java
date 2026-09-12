//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Scalar;
import org.opencv.utils.Converters;

// C++: class Features

public class Features {

    // C++: enum DrawMatchesFlags (cv.DrawMatchesFlags)
    public static final int
            DrawMatchesFlags_DEFAULT = 0,
            DrawMatchesFlags_DRAW_OVER_OUTIMG = 1,
            DrawMatchesFlags_NOT_DRAW_SINGLE_POINTS = 2,
            DrawMatchesFlags_DRAW_RICH_KEYPOINTS = 4;


    //
    // C++:  void cv::goodFeaturesToTrack(Mat image, vector_Point& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask = Mat(), int blockSize = 3, bool useHarrisDetector = false, double k = 0.04)
    //

    /**
     * Determines strong corners on an image.
     *
     * The function finds the most prominent corners in the image or in the specified image region, as
     * described in CITE: Shi94
     *
     * <ul>
     *   <li>
     *    Function calculates the corner quality measure at every source image pixel using the
     *     #cornerMinEigenVal or #cornerHarris .
     *   </li>
     *   <li>
     *    Function performs a non-maximum suppression (the local maximums in *3 x 3* neighborhood are
     *     retained).
     *   </li>
     *   <li>
     *    The corners with the minimal eigenvalue less than
     *     \(\texttt{qualityLevel} \cdot \max_{x,y} qualityMeasureMap(x,y)\) are rejected.
     *   </li>
     *   <li>
     *    The remaining corners are sorted by the quality measure in the descending order.
     *   </li>
     *   <li>
     *    Function throws away each corner for which there is a stronger corner at a distance less than
     *     maxDistance.
     *   </li>
     * </ul>
     *
     * The function can be used to initialize a point-based tracker of an object.
     *
     * <b>Note:</b> If the function is called with different values A and B of the parameter qualityLevel , and
     * A &gt; B, the vector of returned corners with qualityLevel=A will be the prefix of the output vector
     * with qualityLevel=B .
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Optional region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * @param useHarrisDetector Parameter indicating whether to use a Harris detector (see #cornerHarris)
     * or #cornerMinEigenVal.
     * @param k Free parameter of the Harris detector.
     *
     * SEE:  cornerMinEigenVal, cornerHarris, calcOpticalFlowPyrLK, estimateRigidTransform,
     */
    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, boolean useHarrisDetector, double k) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_0(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, useHarrisDetector, k);
    }

    /**
     * Determines strong corners on an image.
     *
     * The function finds the most prominent corners in the image or in the specified image region, as
     * described in CITE: Shi94
     *
     * <ul>
     *   <li>
     *    Function calculates the corner quality measure at every source image pixel using the
     *     #cornerMinEigenVal or #cornerHarris .
     *   </li>
     *   <li>
     *    Function performs a non-maximum suppression (the local maximums in *3 x 3* neighborhood are
     *     retained).
     *   </li>
     *   <li>
     *    The corners with the minimal eigenvalue less than
     *     \(\texttt{qualityLevel} \cdot \max_{x,y} qualityMeasureMap(x,y)\) are rejected.
     *   </li>
     *   <li>
     *    The remaining corners are sorted by the quality measure in the descending order.
     *   </li>
     *   <li>
     *    Function throws away each corner for which there is a stronger corner at a distance less than
     *     maxDistance.
     *   </li>
     * </ul>
     *
     * The function can be used to initialize a point-based tracker of an object.
     *
     * <b>Note:</b> If the function is called with different values A and B of the parameter qualityLevel , and
     * A &gt; B, the vector of returned corners with qualityLevel=A will be the prefix of the output vector
     * with qualityLevel=B .
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Optional region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * @param useHarrisDetector Parameter indicating whether to use a Harris detector (see #cornerHarris)
     * or #cornerMinEigenVal.
     *
     * SEE:  cornerMinEigenVal, cornerHarris, calcOpticalFlowPyrLK, estimateRigidTransform,
     */
    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, boolean useHarrisDetector) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_1(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, useHarrisDetector);
    }

    /**
     * Determines strong corners on an image.
     *
     * The function finds the most prominent corners in the image or in the specified image region, as
     * described in CITE: Shi94
     *
     * <ul>
     *   <li>
     *    Function calculates the corner quality measure at every source image pixel using the
     *     #cornerMinEigenVal or #cornerHarris .
     *   </li>
     *   <li>
     *    Function performs a non-maximum suppression (the local maximums in *3 x 3* neighborhood are
     *     retained).
     *   </li>
     *   <li>
     *    The corners with the minimal eigenvalue less than
     *     \(\texttt{qualityLevel} \cdot \max_{x,y} qualityMeasureMap(x,y)\) are rejected.
     *   </li>
     *   <li>
     *    The remaining corners are sorted by the quality measure in the descending order.
     *   </li>
     *   <li>
     *    Function throws away each corner for which there is a stronger corner at a distance less than
     *     maxDistance.
     *   </li>
     * </ul>
     *
     * The function can be used to initialize a point-based tracker of an object.
     *
     * <b>Note:</b> If the function is called with different values A and B of the parameter qualityLevel , and
     * A &gt; B, the vector of returned corners with qualityLevel=A will be the prefix of the output vector
     * with qualityLevel=B .
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Optional region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * or #cornerMinEigenVal.
     *
     * SEE:  cornerMinEigenVal, cornerHarris, calcOpticalFlowPyrLK, estimateRigidTransform,
     */
    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_2(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize);
    }

    /**
     * Determines strong corners on an image.
     *
     * The function finds the most prominent corners in the image or in the specified image region, as
     * described in CITE: Shi94
     *
     * <ul>
     *   <li>
     *    Function calculates the corner quality measure at every source image pixel using the
     *     #cornerMinEigenVal or #cornerHarris .
     *   </li>
     *   <li>
     *    Function performs a non-maximum suppression (the local maximums in *3 x 3* neighborhood are
     *     retained).
     *   </li>
     *   <li>
     *    The corners with the minimal eigenvalue less than
     *     \(\texttt{qualityLevel} \cdot \max_{x,y} qualityMeasureMap(x,y)\) are rejected.
     *   </li>
     *   <li>
     *    The remaining corners are sorted by the quality measure in the descending order.
     *   </li>
     *   <li>
     *    Function throws away each corner for which there is a stronger corner at a distance less than
     *     maxDistance.
     *   </li>
     * </ul>
     *
     * The function can be used to initialize a point-based tracker of an object.
     *
     * <b>Note:</b> If the function is called with different values A and B of the parameter qualityLevel , and
     * A &gt; B, the vector of returned corners with qualityLevel=A will be the prefix of the output vector
     * with qualityLevel=B .
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Optional region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * or #cornerMinEigenVal.
     *
     * SEE:  cornerMinEigenVal, cornerHarris, calcOpticalFlowPyrLK, estimateRigidTransform,
     */
    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_3(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj);
    }

    /**
     * Determines strong corners on an image.
     *
     * The function finds the most prominent corners in the image or in the specified image region, as
     * described in CITE: Shi94
     *
     * <ul>
     *   <li>
     *    Function calculates the corner quality measure at every source image pixel using the
     *     #cornerMinEigenVal or #cornerHarris .
     *   </li>
     *   <li>
     *    Function performs a non-maximum suppression (the local maximums in *3 x 3* neighborhood are
     *     retained).
     *   </li>
     *   <li>
     *    The corners with the minimal eigenvalue less than
     *     \(\texttt{qualityLevel} \cdot \max_{x,y} qualityMeasureMap(x,y)\) are rejected.
     *   </li>
     *   <li>
     *    The remaining corners are sorted by the quality measure in the descending order.
     *   </li>
     *   <li>
     *    Function throws away each corner for which there is a stronger corner at a distance less than
     *     maxDistance.
     *   </li>
     * </ul>
     *
     * The function can be used to initialize a point-based tracker of an object.
     *
     * <b>Note:</b> If the function is called with different values A and B of the parameter qualityLevel , and
     * A &gt; B, the vector of returned corners with qualityLevel=A will be the prefix of the output vector
     * with qualityLevel=B .
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * or #cornerMinEigenVal.
     *
     * SEE:  cornerMinEigenVal, cornerHarris, calcOpticalFlowPyrLK, estimateRigidTransform,
     */
    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_4(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance);
    }


    //
    // C++:  void cv::goodFeaturesToTrack(Mat image, vector_Point& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize, bool useHarrisDetector = false, double k = 0.04)
    //

    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize, boolean useHarrisDetector, double k) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_5(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, gradientSize, useHarrisDetector, k);
    }

    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize, boolean useHarrisDetector) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_6(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, gradientSize, useHarrisDetector);
    }

    public static void goodFeaturesToTrack(Mat image, MatOfPoint corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize) {
        Mat corners_mat = corners;
        goodFeaturesToTrack_7(image.nativeObj, corners_mat.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, blockSize, gradientSize);
    }


    //
    // C++:  void cv::goodFeaturesToTrack(Mat image, Mat& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat& cornersQuality, int blockSize = 3, int gradientSize = 3, bool useHarrisDetector = false, double k = 0.04)
    //

    /**
     * Same as above, but returns also quality measure of the detected corners.
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param cornersQuality Output vector of quality measure of the detected corners.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * @param gradientSize Aperture parameter for the Sobel operator used for derivatives computation.
     * See cornerEigenValsAndVecs .
     * @param useHarrisDetector Parameter indicating whether to use a Harris detector (see #cornerHarris)
     * or #cornerMinEigenVal.
     * @param k Free parameter of the Harris detector.
     */
    public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize, int gradientSize, boolean useHarrisDetector, double k) {
        goodFeaturesToTrackWithQuality_0(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize, gradientSize, useHarrisDetector, k);
    }

    /**
     * Same as above, but returns also quality measure of the detected corners.
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param cornersQuality Output vector of quality measure of the detected corners.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * @param gradientSize Aperture parameter for the Sobel operator used for derivatives computation.
     * See cornerEigenValsAndVecs .
     * @param useHarrisDetector Parameter indicating whether to use a Harris detector (see #cornerHarris)
     * or #cornerMinEigenVal.
     */
    public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize, int gradientSize, boolean useHarrisDetector) {
        goodFeaturesToTrackWithQuality_1(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize, gradientSize, useHarrisDetector);
    }

    /**
     * Same as above, but returns also quality measure of the detected corners.
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param cornersQuality Output vector of quality measure of the detected corners.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * @param gradientSize Aperture parameter for the Sobel operator used for derivatives computation.
     * See cornerEigenValsAndVecs .
     * or #cornerMinEigenVal.
     */
    public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize, int gradientSize) {
        goodFeaturesToTrackWithQuality_2(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize, gradientSize);
    }

    /**
     * Same as above, but returns also quality measure of the detected corners.
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param cornersQuality Output vector of quality measure of the detected corners.
     * @param blockSize Size of an average block for computing a derivative covariation matrix over each
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * See cornerEigenValsAndVecs .
     * or #cornerMinEigenVal.
     */
    public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality, int blockSize) {
        goodFeaturesToTrackWithQuality_3(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj, blockSize);
    }

    /**
     * Same as above, but returns also quality measure of the detected corners.
     *
     * @param image Input 8-bit or floating-point 32-bit, single-channel image.
     * @param corners Output vector of detected corners.
     * @param maxCorners Maximum number of corners to return. If there are more corners than are found,
     * the strongest of them is returned. {@code maxCorners &lt;= 0} implies that no limit on the maximum is set
     * and all detected corners are returned.
     * @param qualityLevel Parameter characterizing the minimal accepted quality of image corners. The
     * parameter value is multiplied by the best corner quality measure, which is the minimal eigenvalue
     * (see #cornerMinEigenVal ) or the Harris function response (see #cornerHarris ). The corners with the
     * quality measure less than the product are rejected. For example, if the best corner has the
     * quality measure = 1500, and the qualityLevel=0.01 , then all the corners with the quality measure
     * less than 15 are rejected.
     * @param minDistance Minimum possible Euclidean distance between the returned corners.
     * @param mask Region of interest. If the image is not empty (it needs to have the type
     * CV_8UC1 and the same size as image ), it specifies the region in which the corners are detected.
     * @param cornersQuality Output vector of quality measure of the detected corners.
     * pixel neighborhood. See cornerEigenValsAndVecs .
     * See cornerEigenValsAndVecs .
     * or #cornerMinEigenVal.
     */
    public static void goodFeaturesToTrackWithQuality(Mat image, Mat corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat cornersQuality) {
        goodFeaturesToTrackWithQuality_4(image.nativeObj, corners.nativeObj, maxCorners, qualityLevel, minDistance, mask.nativeObj, cornersQuality.nativeObj);
    }


    //
    // C++:  void cv::drawKeypoints(Mat image, vector_KeyPoint keypoints, Mat& outImage, Scalar color = Scalar::all(-1), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    //

    /**
     * Draws keypoints.
     *
     * @param image Source image.
     * @param keypoints Keypoints from the source image.
     * @param outImage Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * @param color Color of keypoints.
     * @param flags Flags setting drawing features. Possible flags bit values are defined by
     * DrawMatchesFlags. See details above in drawMatches .
     *
     * <b>Note:</b>
     * For Python API, flags are modified as cv.DRAW_MATCHES_FLAGS_DEFAULT,
     * cv.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS, cv.DRAW_MATCHES_FLAGS_DRAW_OVER_OUTIMG,
     * cv.DRAW_MATCHES_FLAGS_NOT_DRAW_SINGLE_POINTS
     */
    public static void drawKeypoints(Mat image, MatOfKeyPoint keypoints, Mat outImage, Scalar color, int flags) {
        Mat keypoints_mat = keypoints;
        drawKeypoints_0(image.nativeObj, keypoints_mat.nativeObj, outImage.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], flags);
    }

    /**
     * Draws keypoints.
     *
     * @param image Source image.
     * @param keypoints Keypoints from the source image.
     * @param outImage Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * @param color Color of keypoints.
     * DrawMatchesFlags. See details above in drawMatches .
     *
     * <b>Note:</b>
     * For Python API, flags are modified as cv.DRAW_MATCHES_FLAGS_DEFAULT,
     * cv.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS, cv.DRAW_MATCHES_FLAGS_DRAW_OVER_OUTIMG,
     * cv.DRAW_MATCHES_FLAGS_NOT_DRAW_SINGLE_POINTS
     */
    public static void drawKeypoints(Mat image, MatOfKeyPoint keypoints, Mat outImage, Scalar color) {
        Mat keypoints_mat = keypoints;
        drawKeypoints_1(image.nativeObj, keypoints_mat.nativeObj, outImage.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
    }

    /**
     * Draws keypoints.
     *
     * @param image Source image.
     * @param keypoints Keypoints from the source image.
     * @param outImage Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * DrawMatchesFlags. See details above in drawMatches .
     *
     * <b>Note:</b>
     * For Python API, flags are modified as cv.DRAW_MATCHES_FLAGS_DEFAULT,
     * cv.DRAW_MATCHES_FLAGS_DRAW_RICH_KEYPOINTS, cv.DRAW_MATCHES_FLAGS_DRAW_OVER_OUTIMG,
     * cv.DRAW_MATCHES_FLAGS_NOT_DRAW_SINGLE_POINTS
     */
    public static void drawKeypoints(Mat image, MatOfKeyPoint keypoints, Mat outImage) {
        Mat keypoints_mat = keypoints;
        drawKeypoints_2(image.nativeObj, keypoints_mat.nativeObj, outImage.nativeObj);
    }


    //
    // C++:  void cv::drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_DMatch matches1to2, Mat& outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_char matchesMask = std::vector<char>(), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    //

    /**
     * Draws the found matches of keypoints from two images.
     *
     * @param img1 First source image.
     * @param keypoints1 Keypoints from the first source image.
     * @param img2 Second source image.
     * @param keypoints2 Keypoints from the second source image.
     * @param matches1to2 Matches from the first image to the second one, which means that keypoints1[i]
     * has a corresponding point in keypoints2[matches[i]] .
     * @param outImg Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * @param matchColor Color of matches (lines and connected keypoints). If matchColor==Scalar::all(-1)
     * , the color is generated randomly.
     * @param singlePointColor Color of single keypoints (circles), which means that keypoints do not
     * have the matches. If singlePointColor==Scalar::all(-1) , the color is generated randomly.
     * @param matchesMask Mask determining which matches are drawn. If the mask is empty, all matches are
     * drawn.
     * @param flags Flags setting drawing features. Possible flags bit values are defined by
     * DrawMatchesFlags.
     *
     * This function draws matches of keypoints from two images in the output image. Match is a line
     * connecting two keypoints (circles). See cv::DrawMatchesFlags.
     */
    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask, int flags) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesMask_mat = matchesMask;
        drawMatches_0(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj, flags);
    }

    /**
     * Draws the found matches of keypoints from two images.
     *
     * @param img1 First source image.
     * @param keypoints1 Keypoints from the first source image.
     * @param img2 Second source image.
     * @param keypoints2 Keypoints from the second source image.
     * @param matches1to2 Matches from the first image to the second one, which means that keypoints1[i]
     * has a corresponding point in keypoints2[matches[i]] .
     * @param outImg Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * @param matchColor Color of matches (lines and connected keypoints). If matchColor==Scalar::all(-1)
     * , the color is generated randomly.
     * @param singlePointColor Color of single keypoints (circles), which means that keypoints do not
     * have the matches. If singlePointColor==Scalar::all(-1) , the color is generated randomly.
     * @param matchesMask Mask determining which matches are drawn. If the mask is empty, all matches are
     * drawn.
     * DrawMatchesFlags.
     *
     * This function draws matches of keypoints from two images in the output image. Match is a line
     * connecting two keypoints (circles). See cv::DrawMatchesFlags.
     */
    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesMask_mat = matchesMask;
        drawMatches_1(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj);
    }

    /**
     * Draws the found matches of keypoints from two images.
     *
     * @param img1 First source image.
     * @param keypoints1 Keypoints from the first source image.
     * @param img2 Second source image.
     * @param keypoints2 Keypoints from the second source image.
     * @param matches1to2 Matches from the first image to the second one, which means that keypoints1[i]
     * has a corresponding point in keypoints2[matches[i]] .
     * @param outImg Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * @param matchColor Color of matches (lines and connected keypoints). If matchColor==Scalar::all(-1)
     * , the color is generated randomly.
     * @param singlePointColor Color of single keypoints (circles), which means that keypoints do not
     * have the matches. If singlePointColor==Scalar::all(-1) , the color is generated randomly.
     * drawn.
     * DrawMatchesFlags.
     *
     * This function draws matches of keypoints from two images in the output image. Match is a line
     * connecting two keypoints (circles). See cv::DrawMatchesFlags.
     */
    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        drawMatches_2(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);
    }

    /**
     * Draws the found matches of keypoints from two images.
     *
     * @param img1 First source image.
     * @param keypoints1 Keypoints from the first source image.
     * @param img2 Second source image.
     * @param keypoints2 Keypoints from the second source image.
     * @param matches1to2 Matches from the first image to the second one, which means that keypoints1[i]
     * has a corresponding point in keypoints2[matches[i]] .
     * @param outImg Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * @param matchColor Color of matches (lines and connected keypoints). If matchColor==Scalar::all(-1)
     * , the color is generated randomly.
     * have the matches. If singlePointColor==Scalar::all(-1) , the color is generated randomly.
     * drawn.
     * DrawMatchesFlags.
     *
     * This function draws matches of keypoints from two images in the output image. Match is a line
     * connecting two keypoints (circles). See cv::DrawMatchesFlags.
     */
    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, Scalar matchColor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        drawMatches_3(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);
    }

    /**
     * Draws the found matches of keypoints from two images.
     *
     * @param img1 First source image.
     * @param keypoints1 Keypoints from the first source image.
     * @param img2 Second source image.
     * @param keypoints2 Keypoints from the second source image.
     * @param matches1to2 Matches from the first image to the second one, which means that keypoints1[i]
     * has a corresponding point in keypoints2[matches[i]] .
     * @param outImg Output image. Its content depends on the flags value defining what is drawn in the
     * output image. See possible flags bit values below.
     * , the color is generated randomly.
     * have the matches. If singlePointColor==Scalar::all(-1) , the color is generated randomly.
     * drawn.
     * DrawMatchesFlags.
     *
     * This function draws matches of keypoints from two images in the output image. Match is a line
     * connecting two keypoints (circles). See cv::DrawMatchesFlags.
     */
    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        drawMatches_4(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj);
    }


    //
    // C++:  void cv::drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_DMatch matches1to2, Mat& outImg, int matchesThickness, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_char matchesMask = std::vector<char>(), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    //

    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask, int flags) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesMask_mat = matchesMask;
        drawMatches_5(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj, flags);
    }

    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor, Scalar singlePointColor, MatOfByte matchesMask) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        Mat matchesMask_mat = matchesMask;
        drawMatches_6(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj);
    }

    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor, Scalar singlePointColor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        drawMatches_7(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);
    }

    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness, Scalar matchColor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        drawMatches_8(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchesThickness, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);
    }

    public static void drawMatches(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, MatOfDMatch matches1to2, Mat outImg, int matchesThickness) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        Mat matches1to2_mat = matches1to2;
        drawMatches_9(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchesThickness);
    }


    //
    // C++:  void cv::drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_vector_DMatch matches1to2, Mat& outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_vector_char matchesMask = std::vector<std::vector<char> >(), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    //

    public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<MatOfByte> matchesMask, int flags) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        List<Mat> matchesMask_tmplm = new ArrayList<Mat>((matchesMask != null) ? matchesMask.size() : 0);
        Mat matchesMask_mat = Converters.vector_vector_char_to_Mat(matchesMask, matchesMask_tmplm);
        drawMatchesKnn_0(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj, flags);
    }

    public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor, List<MatOfByte> matchesMask) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        List<Mat> matchesMask_tmplm = new ArrayList<Mat>((matchesMask != null) ? matchesMask.size() : 0);
        Mat matchesMask_mat = Converters.vector_vector_char_to_Mat(matchesMask, matchesMask_tmplm);
        drawMatchesKnn_1(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3], matchesMask_mat.nativeObj);
    }

    public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor, Scalar singlePointColor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        drawMatchesKnn_2(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3], singlePointColor.val[0], singlePointColor.val[1], singlePointColor.val[2], singlePointColor.val[3]);
    }

    public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg, Scalar matchColor) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        drawMatchesKnn_3(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj, matchColor.val[0], matchColor.val[1], matchColor.val[2], matchColor.val[3]);
    }

    public static void drawMatchesKnn(Mat img1, MatOfKeyPoint keypoints1, Mat img2, MatOfKeyPoint keypoints2, List<MatOfDMatch> matches1to2, Mat outImg) {
        Mat keypoints1_mat = keypoints1;
        Mat keypoints2_mat = keypoints2;
        List<Mat> matches1to2_tmplm = new ArrayList<Mat>((matches1to2 != null) ? matches1to2.size() : 0);
        Mat matches1to2_mat = Converters.vector_vector_DMatch_to_Mat(matches1to2, matches1to2_tmplm);
        drawMatchesKnn_4(img1.nativeObj, keypoints1_mat.nativeObj, img2.nativeObj, keypoints2_mat.nativeObj, matches1to2_mat.nativeObj, outImg.nativeObj);
    }




    // C++:  void cv::goodFeaturesToTrack(Mat image, vector_Point& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask = Mat(), int blockSize = 3, bool useHarrisDetector = false, double k = 0.04)
    private static native void goodFeaturesToTrack_0(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, boolean useHarrisDetector, double k);
    private static native void goodFeaturesToTrack_1(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, boolean useHarrisDetector);
    private static native void goodFeaturesToTrack_2(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize);
    private static native void goodFeaturesToTrack_3(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj);
    private static native void goodFeaturesToTrack_4(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance);

    // C++:  void cv::goodFeaturesToTrack(Mat image, vector_Point& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, int blockSize, int gradientSize, bool useHarrisDetector = false, double k = 0.04)
    private static native void goodFeaturesToTrack_5(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, int gradientSize, boolean useHarrisDetector, double k);
    private static native void goodFeaturesToTrack_6(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, int gradientSize, boolean useHarrisDetector);
    private static native void goodFeaturesToTrack_7(long image_nativeObj, long corners_mat_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, int blockSize, int gradientSize);

    // C++:  void cv::goodFeaturesToTrack(Mat image, Mat& corners, int maxCorners, double qualityLevel, double minDistance, Mat mask, Mat& cornersQuality, int blockSize = 3, int gradientSize = 3, bool useHarrisDetector = false, double k = 0.04)
    private static native void goodFeaturesToTrackWithQuality_0(long image_nativeObj, long corners_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, long cornersQuality_nativeObj, int blockSize, int gradientSize, boolean useHarrisDetector, double k);
    private static native void goodFeaturesToTrackWithQuality_1(long image_nativeObj, long corners_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, long cornersQuality_nativeObj, int blockSize, int gradientSize, boolean useHarrisDetector);
    private static native void goodFeaturesToTrackWithQuality_2(long image_nativeObj, long corners_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, long cornersQuality_nativeObj, int blockSize, int gradientSize);
    private static native void goodFeaturesToTrackWithQuality_3(long image_nativeObj, long corners_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, long cornersQuality_nativeObj, int blockSize);
    private static native void goodFeaturesToTrackWithQuality_4(long image_nativeObj, long corners_nativeObj, int maxCorners, double qualityLevel, double minDistance, long mask_nativeObj, long cornersQuality_nativeObj);

    // C++:  void cv::drawKeypoints(Mat image, vector_KeyPoint keypoints, Mat& outImage, Scalar color = Scalar::all(-1), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    private static native void drawKeypoints_0(long image_nativeObj, long keypoints_mat_nativeObj, long outImage_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3, int flags);
    private static native void drawKeypoints_1(long image_nativeObj, long keypoints_mat_nativeObj, long outImage_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);
    private static native void drawKeypoints_2(long image_nativeObj, long keypoints_mat_nativeObj, long outImage_nativeObj);

    // C++:  void cv::drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_DMatch matches1to2, Mat& outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_char matchesMask = std::vector<char>(), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    private static native void drawMatches_0(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj, int flags);
    private static native void drawMatches_1(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj);
    private static native void drawMatches_2(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3);
    private static native void drawMatches_3(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3);
    private static native void drawMatches_4(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj);

    // C++:  void cv::drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_DMatch matches1to2, Mat& outImg, int matchesThickness, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_char matchesMask = std::vector<char>(), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    private static native void drawMatches_5(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, int matchesThickness, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj, int flags);
    private static native void drawMatches_6(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, int matchesThickness, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj);
    private static native void drawMatches_7(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, int matchesThickness, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3);
    private static native void drawMatches_8(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, int matchesThickness, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3);
    private static native void drawMatches_9(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, int matchesThickness);

    // C++:  void cv::drawMatches(Mat img1, vector_KeyPoint keypoints1, Mat img2, vector_KeyPoint keypoints2, vector_vector_DMatch matches1to2, Mat& outImg, Scalar matchColor = Scalar::all(-1), Scalar singlePointColor = Scalar::all(-1), vector_vector_char matchesMask = std::vector<std::vector<char> >(), DrawMatchesFlags flags = DrawMatchesFlags::DEFAULT)
    private static native void drawMatchesKnn_0(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj, int flags);
    private static native void drawMatchesKnn_1(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3, long matchesMask_mat_nativeObj);
    private static native void drawMatchesKnn_2(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3, double singlePointColor_val0, double singlePointColor_val1, double singlePointColor_val2, double singlePointColor_val3);
    private static native void drawMatchesKnn_3(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj, double matchColor_val0, double matchColor_val1, double matchColor_val2, double matchColor_val3);
    private static native void drawMatchesKnn_4(long img1_nativeObj, long keypoints1_mat_nativeObj, long img2_nativeObj, long keypoints2_mat_nativeObj, long matches1to2_mat_nativeObj, long outImg_nativeObj);

}
