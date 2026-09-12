//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.objdetect.Dictionary;
import org.opencv.utils.Converters;

// C++: class Objdetect

public class Objdetect {

    // C++: enum <unnamed>
    public static final int
            CALIB_CB_ADAPTIVE_THRESH = 1,
            CALIB_CB_NORMALIZE_IMAGE = 2,
            CALIB_CB_FILTER_QUADS = 4,
            CALIB_CB_FAST_CHECK = 8,
            CALIB_CB_EXHAUSTIVE = 16,
            CALIB_CB_ACCURACY = 32,
            CALIB_CB_LARGER = 64,
            CALIB_CB_MARKER = 128,
            CALIB_CB_PLAIN = 256,
            CALIB_CB_SYMMETRIC_GRID = 1,
            CALIB_CB_ASYMMETRIC_GRID = 2,
            CALIB_CB_CLUSTERING = 4;


    // C++: enum CornerRefineMethod (cv.aruco.CornerRefineMethod)
    public static final int
            CORNER_REFINE_NONE = 0,
            CORNER_REFINE_SUBPIX = 1,
            CORNER_REFINE_CONTOUR = 2,
            CORNER_REFINE_APRILTAG = 3;


    // C++: enum PredefinedDictionaryType (cv.aruco.PredefinedDictionaryType)
    public static final int
            DICT_4X4_50 = 0,
            DICT_4X4_100 = 0+1,
            DICT_4X4_250 = 0+2,
            DICT_4X4_1000 = 0+3,
            DICT_5X5_50 = 0+4,
            DICT_5X5_100 = 0+5,
            DICT_5X5_250 = 0+6,
            DICT_5X5_1000 = 0+7,
            DICT_6X6_50 = 0+8,
            DICT_6X6_100 = 0+9,
            DICT_6X6_250 = 0+10,
            DICT_6X6_1000 = 0+11,
            DICT_7X7_50 = 0+12,
            DICT_7X7_100 = 0+13,
            DICT_7X7_250 = 0+14,
            DICT_7X7_1000 = 0+15,
            DICT_ARUCO_ORIGINAL = 0+16,
            DICT_APRILTAG_16h5 = 0+17,
            DICT_APRILTAG_25h9 = 0+18,
            DICT_APRILTAG_36h10 = 0+19,
            DICT_APRILTAG_36h11 = 0+20,
            DICT_ARUCO_MIP_36h12 = 0+21;


    // C++: enum ColorChart (cv.mcc.ColorChart)
    public static final int
            MCC24 = 0,
            SG140 = 0+1,
            VINYL18 = 0+2;


    //
    // C++:  bool cv::findChessboardCorners(Mat image, Size patternSize, vector_Point2f& corners, int flags = CALIB_CB_ADAPTIVE_THRESH + CALIB_CB_NORMALIZE_IMAGE)
    //

    /**
     * Finds the positions of internal corners of the chessboard.
     *
     * @param image Source chessboard view. It must be an 8-bit grayscale or color image.
     * @param patternSize Number of inner corners per a chessboard row and column
     * ( patternSize = cv::Size(points_per_row,points_per_column) = cv::Size(columns,rows) ).
     * @param corners Output array of detected corners.
     * @param flags Various operation flags that can be zero or a combination of the following values:
     * <ul>
     *   <li>
     *    REF: CALIB_CB_ADAPTIVE_THRESH Use adaptive thresholding to convert the image to black
     * and white, rather than a fixed threshold level (computed from the average image brightness).
     *   </li>
     *   <li>
     *    REF: CALIB_CB_NORMALIZE_IMAGE Normalize the image gamma with equalizeHist before
     * applying fixed or adaptive thresholding.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_FILTER_QUADS Use additional criteria (like contour area, perimeter,
     * square-like shape) to filter out false quads extracted at the contour retrieval stage.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_FAST_CHECK Run a fast check on the image that looks for chessboard corners,
     * and shortcut the call if none is found. This can drastically speed up the call in the
     * degenerate condition when no chessboard is observed.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_PLAIN All other flags are ignored. The input image is taken as is.
     * No image processing is done to improve to find the checkerboard. This has the effect of speeding up the
     * execution of the function but could lead to not recognizing the checkerboard if the image
     * is not previously binarized in the appropriate manner.
     *   </li>
     * </ul>
     *
     * @return True if all of the corners are found and placed in a certain order (row by row,
     * left to right in every row). Otherwise, if the function fails to find all the corners or reorder them,
     * it returns false.
     *
     * The function attempts to determine whether the input image is a view of the chessboard pattern and
     * locate the internal chessboard corners. For example, a regular chessboard has 8 x 8 squares and
     * 7 x 7 internal corners, that is, points where the black squares touch each other. The detected
     * coordinates are approximate, and to determine their positions more accurately, the function
     * calls #cornerSubPix. You also may use the function #cornerSubPix with different parameters if
     * returned coordinates are not accurate enough.
     *
     * Sample usage of detecting and drawing chessboard corners: :
     * <code>
     *     Size patternsize(8,6); //interior number of corners
     *     Mat gray = ....; //source image
     *     vector&lt;Point2f&gt; corners; //this will be filled by the detected corners
     *
     *     //CALIB_CB_FAST_CHECK saves a lot of time on images
     *     //that do not contain any chessboard corners
     *     bool patternfound = findChessboardCorners(gray, patternsize, corners,
     *             CALIB_CB_ADAPTIVE_THRESH + CALIB_CB_NORMALIZE_IMAGE
     *             + CALIB_CB_FAST_CHECK);
     *
     *     if(patternfound)
     *       cornerSubPix(gray, corners, Size(11, 11), Size(-1, -1),
     *         TermCriteria(CV_TERMCRIT_EPS + CV_TERMCRIT_ITER, 30, 0.1));
     *
     *     drawChessboardCorners(img, patternsize, Mat(corners), patternfound);
     * </code>
     * <b>Note:</b> The function requires white space (like a square-thick border, the wider the better) around
     * the board to make the detection more robust in various environments. Otherwise, if there is no
     * border and the background is dark, the outer black squares cannot be segmented properly and so the
     * square grouping and ordering algorithm fails.
     *
     * Use the {@code generate_pattern.py} Python script (REF: tutorial_camera_calibration_pattern)
     * to create the desired checkerboard pattern.
     */
    public static boolean findChessboardCorners(Mat image, Size patternSize, MatOfPoint2f corners, int flags) {
        Mat corners_mat = corners;
        return findChessboardCorners_0(image.nativeObj, patternSize.width, patternSize.height, corners_mat.nativeObj, flags);
    }

    /**
     * Finds the positions of internal corners of the chessboard.
     *
     * @param image Source chessboard view. It must be an 8-bit grayscale or color image.
     * @param patternSize Number of inner corners per a chessboard row and column
     * ( patternSize = cv::Size(points_per_row,points_per_column) = cv::Size(columns,rows) ).
     * @param corners Output array of detected corners.
     * <ul>
     *   <li>
     *    REF: CALIB_CB_ADAPTIVE_THRESH Use adaptive thresholding to convert the image to black
     * and white, rather than a fixed threshold level (computed from the average image brightness).
     *   </li>
     *   <li>
     *    REF: CALIB_CB_NORMALIZE_IMAGE Normalize the image gamma with equalizeHist before
     * applying fixed or adaptive thresholding.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_FILTER_QUADS Use additional criteria (like contour area, perimeter,
     * square-like shape) to filter out false quads extracted at the contour retrieval stage.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_FAST_CHECK Run a fast check on the image that looks for chessboard corners,
     * and shortcut the call if none is found. This can drastically speed up the call in the
     * degenerate condition when no chessboard is observed.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_PLAIN All other flags are ignored. The input image is taken as is.
     * No image processing is done to improve to find the checkerboard. This has the effect of speeding up the
     * execution of the function but could lead to not recognizing the checkerboard if the image
     * is not previously binarized in the appropriate manner.
     *   </li>
     * </ul>
     *
     * @return True if all of the corners are found and placed in a certain order (row by row,
     * left to right in every row). Otherwise, if the function fails to find all the corners or reorder them,
     * it returns false.
     *
     * The function attempts to determine whether the input image is a view of the chessboard pattern and
     * locate the internal chessboard corners. For example, a regular chessboard has 8 x 8 squares and
     * 7 x 7 internal corners, that is, points where the black squares touch each other. The detected
     * coordinates are approximate, and to determine their positions more accurately, the function
     * calls #cornerSubPix. You also may use the function #cornerSubPix with different parameters if
     * returned coordinates are not accurate enough.
     *
     * Sample usage of detecting and drawing chessboard corners: :
     * <code>
     *     Size patternsize(8,6); //interior number of corners
     *     Mat gray = ....; //source image
     *     vector&lt;Point2f&gt; corners; //this will be filled by the detected corners
     *
     *     //CALIB_CB_FAST_CHECK saves a lot of time on images
     *     //that do not contain any chessboard corners
     *     bool patternfound = findChessboardCorners(gray, patternsize, corners,
     *             CALIB_CB_ADAPTIVE_THRESH + CALIB_CB_NORMALIZE_IMAGE
     *             + CALIB_CB_FAST_CHECK);
     *
     *     if(patternfound)
     *       cornerSubPix(gray, corners, Size(11, 11), Size(-1, -1),
     *         TermCriteria(CV_TERMCRIT_EPS + CV_TERMCRIT_ITER, 30, 0.1));
     *
     *     drawChessboardCorners(img, patternsize, Mat(corners), patternfound);
     * </code>
     * <b>Note:</b> The function requires white space (like a square-thick border, the wider the better) around
     * the board to make the detection more robust in various environments. Otherwise, if there is no
     * border and the background is dark, the outer black squares cannot be segmented properly and so the
     * square grouping and ordering algorithm fails.
     *
     * Use the {@code generate_pattern.py} Python script (REF: tutorial_camera_calibration_pattern)
     * to create the desired checkerboard pattern.
     */
    public static boolean findChessboardCorners(Mat image, Size patternSize, MatOfPoint2f corners) {
        Mat corners_mat = corners;
        return findChessboardCorners_1(image.nativeObj, patternSize.width, patternSize.height, corners_mat.nativeObj);
    }


    //
    // C++:  bool cv::checkChessboard(Mat img, Size size)
    //

    /**
     * Checks whether the image contains chessboard of the specific size or not.
     *
     * @param img Source chessboard view.
     * @param size Size of the chessboard.
     *
     * @return Whether a chessboard was found.
     */
    public static boolean checkChessboard(Mat img, Size size) {
        return checkChessboard_0(img.nativeObj, size.width, size.height);
    }


    //
    // C++:  bool cv::findChessboardCornersSB(Mat image, Size patternSize, Mat& corners, int flags, Mat& meta)
    //

    /**
     * Finds the positions of internal corners of the chessboard using a sector based approach.
     *
     * @param image Source chessboard view. It must be an 8-bit grayscale or color image.
     * @param patternSize Number of inner corners per a chessboard row and column
     * ( patternSize = cv::Size(points_per_row,points_per_column) = cv::Size(columns,rows) ).
     * @param corners Output array of detected corners.
     * @param flags Various operation flags that can be zero or a combination of the following values:
     * <ul>
     *   <li>
     *    REF: CALIB_CB_NORMALIZE_IMAGE Normalize the image gamma with equalizeHist before detection.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_EXHAUSTIVE Run an exhaustive search to improve detection rate.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_ACCURACY Up sample input image to improve sub-pixel accuracy due to aliasing effects.
     *   </li>
     *   <li>
     *    REF: CALIB_CB_LARGER The detected pattern is allowed to be larger than patternSize (see description).
     *   </li>
     *   <li>
     *    REF: CALIB_CB_MARKER The detected pattern must have a marker (see description).
     * This should be used if an accurate camera calibration is required.
     *   </li>
     * </ul>
     * @param meta Optional output array of detected corners (CV_8UC1 and size = cv::Size(columns,rows)).
     * Each entry stands for one corner of the pattern and can have one of the following values:
     * <ul>
     *   <li>
     *    0 = no meta data attached
     *   </li>
     *   <li>
     *    1 = left-top corner of a black cell
     *   </li>
     *   <li>
     *    2 = left-top corner of a white cell
     *   </li>
     *   <li>
     *    3 = left-top corner of a black cell with a white marker dot
     *   </li>
     *   <li>
     *    4 = left-top corner of a white cell with a black marker dot (pattern origin in case of markers otherwise first corner)
     *   </li>
     * </ul>
     *
     * The function is analog to #findChessboardCorners but uses a localized radon
     * transformation approximated by box filters being more robust to all sort of
     * noise, faster on larger images and is able to directly return the sub-pixel
     * position of the internal chessboard corners. The Method is based on the paper
     * CITE: duda2018 "Accurate Detection and Localization of Checkerboard Corners for
     * Calibration" demonstrating that the returned sub-pixel positions are more
     * accurate than the one returned by cornerSubPix allowing a precise camera
     * calibration for demanding applications.
     *
     * In the case, the flags REF: CALIB_CB_LARGER or REF: CALIB_CB_MARKER are given,
     * the result can be recovered from the optional meta array. Both flags are
     * helpful to use calibration patterns exceeding the field of view of the camera.
     * These oversized patterns allow more accurate calibrations as corners can be
     * utilized, which are as close as possible to the image borders.  For a
     * consistent coordinate system across all images, the optional marker (see image
     * below) can be used to move the origin of the board to the location where the
     * black circle is located.
     *
     * <b>Note:</b> The function requires a white boarder with roughly the same width as one
     * of the checkerboard fields around the whole board to improve the detection in
     * various environments. In addition, because of the localized radon
     * transformation it is beneficial to use round corners for the field corners
     * which are located on the outside of the board. The following figure illustrates
     * a sample checkerboard optimized for the detection. However, any other checkerboard
     * can be used as well.
     *
     * Use the {@code generate_pattern.py} Python script (REF: tutorial_camera_calibration_pattern)
     * to create the corresponding checkerboard pattern:
     * \image html pics/checkerboard_radon.png width=60%
     * @return automatically generated
     */
    public static boolean findChessboardCornersSBWithMeta(Mat image, Size patternSize, Mat corners, int flags, Mat meta) {
        return findChessboardCornersSBWithMeta_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, flags, meta.nativeObj);
    }


    //
    // C++:  bool cv::findChessboardCornersSB(Mat image, Size patternSize, Mat& corners, int flags = 0)
    //

    public static boolean findChessboardCornersSB(Mat image, Size patternSize, Mat corners, int flags) {
        return findChessboardCornersSB_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, flags);
    }

    public static boolean findChessboardCornersSB(Mat image, Size patternSize, Mat corners) {
        return findChessboardCornersSB_1(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj);
    }


    //
    // C++:  Scalar cv::estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance = 0.8F, bool vertical = false, Mat& sharpness = Mat())
    //

    /**
     * Estimates the sharpness of a detected chessboard.
     *
     * Image sharpness, as well as brightness, are a critical parameter for accuracte
     * camera calibration. For accessing these parameters for filtering out
     * problematic calibraiton images, this method calculates edge profiles by traveling from
     * black to white chessboard cell centers. Based on this, the number of pixels is
     * calculated required to transit from black to white. This width of the
     * transition area is a good indication of how sharp the chessboard is imaged
     * and should be below ~3.0 pixels.
     *
     * @param image Gray image used to find chessboard corners
     * @param patternSize Size of a found chessboard pattern
     * @param corners Corners found by #findChessboardCornersSB
     * @param rise_distance Rise distance 0.8 means 10% ... 90% of the final signal strength
     * @param vertical By default edge responses for horizontal lines are calculated
     * @param sharpness Optional output array with a sharpness value for calculated edge responses (see description)
     *
     * The optional sharpness array is of type CV_32FC1 and has for each calculated
     * profile one row with the following five entries:
     * 0 = x coordinate of the underlying edge in the image
     * 1 = y coordinate of the underlying edge in the image
     * 2 = width of the transition area (sharpness)
     * 3 = signal strength in the black cell (min brightness)
     * 4 = signal strength in the white cell (max brightness)
     *
     * @return Scalar(average sharpness, average min brightness, average max brightness,0)
     */
    public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance, boolean vertical, Mat sharpness) {
        return new Scalar(estimateChessboardSharpness_0(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, rise_distance, vertical, sharpness.nativeObj));
    }

    /**
     * Estimates the sharpness of a detected chessboard.
     *
     * Image sharpness, as well as brightness, are a critical parameter for accuracte
     * camera calibration. For accessing these parameters for filtering out
     * problematic calibraiton images, this method calculates edge profiles by traveling from
     * black to white chessboard cell centers. Based on this, the number of pixels is
     * calculated required to transit from black to white. This width of the
     * transition area is a good indication of how sharp the chessboard is imaged
     * and should be below ~3.0 pixels.
     *
     * @param image Gray image used to find chessboard corners
     * @param patternSize Size of a found chessboard pattern
     * @param corners Corners found by #findChessboardCornersSB
     * @param rise_distance Rise distance 0.8 means 10% ... 90% of the final signal strength
     * @param vertical By default edge responses for horizontal lines are calculated
     *
     * The optional sharpness array is of type CV_32FC1 and has for each calculated
     * profile one row with the following five entries:
     * 0 = x coordinate of the underlying edge in the image
     * 1 = y coordinate of the underlying edge in the image
     * 2 = width of the transition area (sharpness)
     * 3 = signal strength in the black cell (min brightness)
     * 4 = signal strength in the white cell (max brightness)
     *
     * @return Scalar(average sharpness, average min brightness, average max brightness,0)
     */
    public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance, boolean vertical) {
        return new Scalar(estimateChessboardSharpness_1(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, rise_distance, vertical));
    }

    /**
     * Estimates the sharpness of a detected chessboard.
     *
     * Image sharpness, as well as brightness, are a critical parameter for accuracte
     * camera calibration. For accessing these parameters for filtering out
     * problematic calibraiton images, this method calculates edge profiles by traveling from
     * black to white chessboard cell centers. Based on this, the number of pixels is
     * calculated required to transit from black to white. This width of the
     * transition area is a good indication of how sharp the chessboard is imaged
     * and should be below ~3.0 pixels.
     *
     * @param image Gray image used to find chessboard corners
     * @param patternSize Size of a found chessboard pattern
     * @param corners Corners found by #findChessboardCornersSB
     * @param rise_distance Rise distance 0.8 means 10% ... 90% of the final signal strength
     *
     * The optional sharpness array is of type CV_32FC1 and has for each calculated
     * profile one row with the following five entries:
     * 0 = x coordinate of the underlying edge in the image
     * 1 = y coordinate of the underlying edge in the image
     * 2 = width of the transition area (sharpness)
     * 3 = signal strength in the black cell (min brightness)
     * 4 = signal strength in the white cell (max brightness)
     *
     * @return Scalar(average sharpness, average min brightness, average max brightness,0)
     */
    public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance) {
        return new Scalar(estimateChessboardSharpness_2(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj, rise_distance));
    }

    /**
     * Estimates the sharpness of a detected chessboard.
     *
     * Image sharpness, as well as brightness, are a critical parameter for accuracte
     * camera calibration. For accessing these parameters for filtering out
     * problematic calibraiton images, this method calculates edge profiles by traveling from
     * black to white chessboard cell centers. Based on this, the number of pixels is
     * calculated required to transit from black to white. This width of the
     * transition area is a good indication of how sharp the chessboard is imaged
     * and should be below ~3.0 pixels.
     *
     * @param image Gray image used to find chessboard corners
     * @param patternSize Size of a found chessboard pattern
     * @param corners Corners found by #findChessboardCornersSB
     *
     * The optional sharpness array is of type CV_32FC1 and has for each calculated
     * profile one row with the following five entries:
     * 0 = x coordinate of the underlying edge in the image
     * 1 = y coordinate of the underlying edge in the image
     * 2 = width of the transition area (sharpness)
     * 3 = signal strength in the black cell (min brightness)
     * 4 = signal strength in the white cell (max brightness)
     *
     * @return Scalar(average sharpness, average min brightness, average max brightness,0)
     */
    public static Scalar estimateChessboardSharpness(Mat image, Size patternSize, Mat corners) {
        return new Scalar(estimateChessboardSharpness_3(image.nativeObj, patternSize.width, patternSize.height, corners.nativeObj));
    }


    //
    // C++:  bool cv::find4QuadCornerSubpix(Mat img, Mat& corners, Size region_size)
    //

    public static boolean find4QuadCornerSubpix(Mat img, Mat corners, Size region_size) {
        return find4QuadCornerSubpix_0(img.nativeObj, corners.nativeObj, region_size.width, region_size.height);
    }


    //
    // C++:  void cv::drawChessboardCorners(Mat& image, Size patternSize, vector_Point2f corners, bool patternWasFound)
    //

    /**
     * Renders the detected chessboard corners.
     *
     * @param image Destination image. It must be an 8-bit color image.
     * @param patternSize Number of inner corners per a chessboard row and column
     * (patternSize = cv::Size(points_per_row,points_per_column)).
     * @param corners Array of detected corners, the output of #findChessboardCorners.
     * @param patternWasFound Parameter indicating whether the complete board was found or not. The
     * return value of #findChessboardCorners should be passed here.
     *
     * The function draws individual chessboard corners detected either as red circles if the board was not
     * found, or as colored corners connected with lines if the board was found.
     */
    public static void drawChessboardCorners(Mat image, Size patternSize, MatOfPoint2f corners, boolean patternWasFound) {
        Mat corners_mat = corners;
        drawChessboardCorners_0(image.nativeObj, patternSize.width, patternSize.height, corners_mat.nativeObj, patternWasFound);
    }


    //
    // C++:  bool cv::findCirclesGrid(Mat image, Size patternSize, Mat& centers, int flags, Ptr_FeatureDetector blobDetector, CirclesGridFinderParameters parameters)
    //

    // Unknown type 'Ptr_FeatureDetector' (I), skipping the function


    //
    // C++:  bool cv::findCirclesGrid(Mat image, Size patternSize, Mat& centers, int flags = CALIB_CB_SYMMETRIC_GRID, Ptr_FeatureDetector blobDetector = cv::SimpleBlobDetector::create())
    //

    public static boolean findCirclesGrid(Mat image, Size patternSize, Mat centers, int flags) {
        return findCirclesGrid_0(image.nativeObj, patternSize.width, patternSize.height, centers.nativeObj, flags);
    }

    public static boolean findCirclesGrid(Mat image, Size patternSize, Mat centers) {
        return findCirclesGrid_2(image.nativeObj, patternSize.width, patternSize.height, centers.nativeObj);
    }


    //
    // C++:  void cv::aruco::drawDetectedMarkers(Mat& image, vector_Mat corners, Mat ids = Mat(), Scalar borderColor = Scalar(0, 255, 0))
    //

    /**
     * Draw detected markers in image
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not altered.
     * @param corners positions of marker corners on input image.
     * (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the dimensions of
     * this array should be Nx4. The order of the corners should be clockwise.
     * @param ids vector of identifiers for markers in markersCorners .
     * Optional, if not provided, ids are not painted.
     * @param borderColor color of marker borders. Rest of colors (text color and first corner color)
     * are calculated based on this one to improve visualization.
     *
     * Given an array of detected marker corners and its corresponding ids, this functions draws
     * the markers in the image. The marker borders are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedMarkers(Mat image, List<Mat> corners, Mat ids, Scalar borderColor) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        drawDetectedMarkers_0(image.nativeObj, corners_mat.nativeObj, ids.nativeObj, borderColor.val[0], borderColor.val[1], borderColor.val[2], borderColor.val[3]);
    }

    /**
     * Draw detected markers in image
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not altered.
     * @param corners positions of marker corners on input image.
     * (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the dimensions of
     * this array should be Nx4. The order of the corners should be clockwise.
     * @param ids vector of identifiers for markers in markersCorners .
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one to improve visualization.
     *
     * Given an array of detected marker corners and its corresponding ids, this functions draws
     * the markers in the image. The marker borders are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedMarkers(Mat image, List<Mat> corners, Mat ids) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        drawDetectedMarkers_1(image.nativeObj, corners_mat.nativeObj, ids.nativeObj);
    }

    /**
     * Draw detected markers in image
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not altered.
     * @param corners positions of marker corners on input image.
     * (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers, the dimensions of
     * this array should be Nx4. The order of the corners should be clockwise.
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one to improve visualization.
     *
     * Given an array of detected marker corners and its corresponding ids, this functions draws
     * the markers in the image. The marker borders are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedMarkers(Mat image, List<Mat> corners) {
        Mat corners_mat = Converters.vector_Mat_to_Mat(corners);
        drawDetectedMarkers_2(image.nativeObj, corners_mat.nativeObj);
    }


    //
    // C++:  void cv::aruco::generateImageMarker(Dictionary dictionary, int id, int sidePixels, Mat& img, int borderBits = 1)
    //

    /**
     * Generate a canonical marker image
     *
     * @param dictionary dictionary of markers indicating the type of markers
     * @param id identifier of the marker that will be returned. It has to be a valid id in the specified dictionary.
     * @param sidePixels size of the image in pixels
     * @param img output image with the marker
     * @param borderBits width of the marker border.
     *
     * This function returns a marker image in its canonical form (i.e. ready to be printed)
     */
    public static void generateImageMarker(Dictionary dictionary, int id, int sidePixels, Mat img, int borderBits) {
        generateImageMarker_0(dictionary.getNativeObjAddr(), id, sidePixels, img.nativeObj, borderBits);
    }

    /**
     * Generate a canonical marker image
     *
     * @param dictionary dictionary of markers indicating the type of markers
     * @param id identifier of the marker that will be returned. It has to be a valid id in the specified dictionary.
     * @param sidePixels size of the image in pixels
     * @param img output image with the marker
     *
     * This function returns a marker image in its canonical form (i.e. ready to be printed)
     */
    public static void generateImageMarker(Dictionary dictionary, int id, int sidePixels, Mat img) {
        generateImageMarker_1(dictionary.getNativeObjAddr(), id, sidePixels, img.nativeObj);
    }


    //
    // C++:  Dictionary cv::aruco::getPredefinedDictionary(int dict)
    //

    /**
     * Returns one of the predefined dictionaries referenced by DICT_*.
     * @param dict automatically generated
     * @return automatically generated
     */
    public static Dictionary getPredefinedDictionary(int dict) {
        return new Dictionary(getPredefinedDictionary_0(dict));
    }


    //
    // C++:  Dictionary cv::aruco::extendDictionary(int nMarkers, int markerSize, Dictionary baseDictionary = Dictionary(), int randomSeed = 0)
    //

    /**
     * Extend base dictionary by new nMarkers
     *
     * @param nMarkers number of markers in the dictionary
     * @param markerSize number of bits per dimension of each markers
     * @param baseDictionary Include the markers in this dictionary at the beginning (optional)
     * @param randomSeed a user supplied seed for theRNG()
     *
     * This function creates a new dictionary composed by nMarkers markers and each markers composed
     * by markerSize x markerSize bits. If baseDictionary is provided, its markers are directly
     * included and the rest are generated based on them. If the size of baseDictionary is higher
     * than nMarkers, only the first nMarkers in baseDictionary are taken and no new marker is added.
     * @return automatically generated
     */
    public static Dictionary extendDictionary(int nMarkers, int markerSize, Dictionary baseDictionary, int randomSeed) {
        return new Dictionary(extendDictionary_0(nMarkers, markerSize, baseDictionary.getNativeObjAddr(), randomSeed));
    }

    /**
     * Extend base dictionary by new nMarkers
     *
     * @param nMarkers number of markers in the dictionary
     * @param markerSize number of bits per dimension of each markers
     * @param baseDictionary Include the markers in this dictionary at the beginning (optional)
     *
     * This function creates a new dictionary composed by nMarkers markers and each markers composed
     * by markerSize x markerSize bits. If baseDictionary is provided, its markers are directly
     * included and the rest are generated based on them. If the size of baseDictionary is higher
     * than nMarkers, only the first nMarkers in baseDictionary are taken and no new marker is added.
     * @return automatically generated
     */
    public static Dictionary extendDictionary(int nMarkers, int markerSize, Dictionary baseDictionary) {
        return new Dictionary(extendDictionary_1(nMarkers, markerSize, baseDictionary.getNativeObjAddr()));
    }

    /**
     * Extend base dictionary by new nMarkers
     *
     * @param nMarkers number of markers in the dictionary
     * @param markerSize number of bits per dimension of each markers
     *
     * This function creates a new dictionary composed by nMarkers markers and each markers composed
     * by markerSize x markerSize bits. If baseDictionary is provided, its markers are directly
     * included and the rest are generated based on them. If the size of baseDictionary is higher
     * than nMarkers, only the first nMarkers in baseDictionary are taken and no new marker is added.
     * @return automatically generated
     */
    public static Dictionary extendDictionary(int nMarkers, int markerSize) {
        return new Dictionary(extendDictionary_2(nMarkers, markerSize));
    }


    //
    // C++:  void cv::aruco::drawDetectedCornersCharuco(Mat& image, Mat charucoCorners, Mat charucoIds = Mat(), Scalar cornerColor = Scalar(255, 0, 0))
    //

    /**
     * Draws a set of Charuco corners
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     * @param cornerColor color of the square surrounding each corner
     *
     * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
     * draws the id of each corner.
     */
    public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners, Mat charucoIds, Scalar cornerColor) {
        drawDetectedCornersCharuco_0(image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj, cornerColor.val[0], cornerColor.val[1], cornerColor.val[2], cornerColor.val[3]);
    }

    /**
     * Draws a set of Charuco corners
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param charucoCorners vector of detected charuco corners
     * @param charucoIds list of identifiers for each corner in charucoCorners
     *
     * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
     * draws the id of each corner.
     */
    public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners, Mat charucoIds) {
        drawDetectedCornersCharuco_1(image.nativeObj, charucoCorners.nativeObj, charucoIds.nativeObj);
    }

    /**
     * Draws a set of Charuco corners
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param charucoCorners vector of detected charuco corners
     *
     * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
     * draws the id of each corner.
     */
    public static void drawDetectedCornersCharuco(Mat image, Mat charucoCorners) {
        drawDetectedCornersCharuco_2(image.nativeObj, charucoCorners.nativeObj);
    }


    //
    // C++:  void cv::aruco::drawDetectedDiamonds(Mat& image, vector_Mat diamondCorners, Mat diamondIds = Mat(), Scalar borderColor = Scalar(0, 0, 255))
    //

    /**
     * Draw a set of detected ChArUco Diamond markers
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param diamondCorners positions of diamond corners in the same format returned by
     * detectCharucoDiamond(). (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param diamondIds vector of identifiers for diamonds in diamondCorners, in the same format
     * returned by detectCharucoDiamond() (e.g. std::vector&lt;Vec4i&gt;).
     * Optional, if not provided, ids are not painted.
     * @param borderColor color of marker borders. Rest of colors (text color and first corner color)
     * are calculated based on this one.
     *
     * Given an array of detected diamonds, this functions draws them in the image. The marker borders
     * are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds, Scalar borderColor) {
        Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
        drawDetectedDiamonds_0(image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj, borderColor.val[0], borderColor.val[1], borderColor.val[2], borderColor.val[3]);
    }

    /**
     * Draw a set of detected ChArUco Diamond markers
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param diamondCorners positions of diamond corners in the same format returned by
     * detectCharucoDiamond(). (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * @param diamondIds vector of identifiers for diamonds in diamondCorners, in the same format
     * returned by detectCharucoDiamond() (e.g. std::vector&lt;Vec4i&gt;).
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one.
     *
     * Given an array of detected diamonds, this functions draws them in the image. The marker borders
     * are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners, Mat diamondIds) {
        Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
        drawDetectedDiamonds_1(image.nativeObj, diamondCorners_mat.nativeObj, diamondIds.nativeObj);
    }

    /**
     * Draw a set of detected ChArUco Diamond markers
     *
     * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
     * altered.
     * @param diamondCorners positions of diamond corners in the same format returned by
     * detectCharucoDiamond(). (e.g std::vector&lt;std::vector&lt;cv::Point2f&gt; &gt; ). For N detected markers,
     * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
     * returned by detectCharucoDiamond() (e.g. std::vector&lt;Vec4i&gt;).
     * Optional, if not provided, ids are not painted.
     * are calculated based on this one.
     *
     * Given an array of detected diamonds, this functions draws them in the image. The marker borders
     * are painted and the markers identifiers if provided.
     * Useful for debugging purposes.
     */
    public static void drawDetectedDiamonds(Mat image, List<Mat> diamondCorners) {
        Mat diamondCorners_mat = Converters.vector_Mat_to_Mat(diamondCorners);
        drawDetectedDiamonds_2(image.nativeObj, diamondCorners_mat.nativeObj);
    }




    // C++:  bool cv::findChessboardCorners(Mat image, Size patternSize, vector_Point2f& corners, int flags = CALIB_CB_ADAPTIVE_THRESH + CALIB_CB_NORMALIZE_IMAGE)
    private static native boolean findChessboardCorners_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_mat_nativeObj, int flags);
    private static native boolean findChessboardCorners_1(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_mat_nativeObj);

    // C++:  bool cv::checkChessboard(Mat img, Size size)
    private static native boolean checkChessboard_0(long img_nativeObj, double size_width, double size_height);

    // C++:  bool cv::findChessboardCornersSB(Mat image, Size patternSize, Mat& corners, int flags, Mat& meta)
    private static native boolean findChessboardCornersSBWithMeta_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, int flags, long meta_nativeObj);

    // C++:  bool cv::findChessboardCornersSB(Mat image, Size patternSize, Mat& corners, int flags = 0)
    private static native boolean findChessboardCornersSB_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, int flags);
    private static native boolean findChessboardCornersSB_1(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj);

    // C++:  Scalar cv::estimateChessboardSharpness(Mat image, Size patternSize, Mat corners, float rise_distance = 0.8F, bool vertical = false, Mat& sharpness = Mat())
    private static native double[] estimateChessboardSharpness_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, float rise_distance, boolean vertical, long sharpness_nativeObj);
    private static native double[] estimateChessboardSharpness_1(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, float rise_distance, boolean vertical);
    private static native double[] estimateChessboardSharpness_2(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj, float rise_distance);
    private static native double[] estimateChessboardSharpness_3(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_nativeObj);

    // C++:  bool cv::find4QuadCornerSubpix(Mat img, Mat& corners, Size region_size)
    private static native boolean find4QuadCornerSubpix_0(long img_nativeObj, long corners_nativeObj, double region_size_width, double region_size_height);

    // C++:  void cv::drawChessboardCorners(Mat& image, Size patternSize, vector_Point2f corners, bool patternWasFound)
    private static native void drawChessboardCorners_0(long image_nativeObj, double patternSize_width, double patternSize_height, long corners_mat_nativeObj, boolean patternWasFound);

    // C++:  bool cv::findCirclesGrid(Mat image, Size patternSize, Mat& centers, int flags = CALIB_CB_SYMMETRIC_GRID, Ptr_FeatureDetector blobDetector = cv::SimpleBlobDetector::create())
    private static native boolean findCirclesGrid_0(long image_nativeObj, double patternSize_width, double patternSize_height, long centers_nativeObj, int flags);
    private static native boolean findCirclesGrid_2(long image_nativeObj, double patternSize_width, double patternSize_height, long centers_nativeObj);

    // C++:  void cv::aruco::drawDetectedMarkers(Mat& image, vector_Mat corners, Mat ids = Mat(), Scalar borderColor = Scalar(0, 255, 0))
    private static native void drawDetectedMarkers_0(long image_nativeObj, long corners_mat_nativeObj, long ids_nativeObj, double borderColor_val0, double borderColor_val1, double borderColor_val2, double borderColor_val3);
    private static native void drawDetectedMarkers_1(long image_nativeObj, long corners_mat_nativeObj, long ids_nativeObj);
    private static native void drawDetectedMarkers_2(long image_nativeObj, long corners_mat_nativeObj);

    // C++:  void cv::aruco::generateImageMarker(Dictionary dictionary, int id, int sidePixels, Mat& img, int borderBits = 1)
    private static native void generateImageMarker_0(long dictionary_nativeObj, int id, int sidePixels, long img_nativeObj, int borderBits);
    private static native void generateImageMarker_1(long dictionary_nativeObj, int id, int sidePixels, long img_nativeObj);

    // C++:  Dictionary cv::aruco::getPredefinedDictionary(int dict)
    private static native long getPredefinedDictionary_0(int dict);

    // C++:  Dictionary cv::aruco::extendDictionary(int nMarkers, int markerSize, Dictionary baseDictionary = Dictionary(), int randomSeed = 0)
    private static native long extendDictionary_0(int nMarkers, int markerSize, long baseDictionary_nativeObj, int randomSeed);
    private static native long extendDictionary_1(int nMarkers, int markerSize, long baseDictionary_nativeObj);
    private static native long extendDictionary_2(int nMarkers, int markerSize);

    // C++:  void cv::aruco::drawDetectedCornersCharuco(Mat& image, Mat charucoCorners, Mat charucoIds = Mat(), Scalar cornerColor = Scalar(255, 0, 0))
    private static native void drawDetectedCornersCharuco_0(long image_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj, double cornerColor_val0, double cornerColor_val1, double cornerColor_val2, double cornerColor_val3);
    private static native void drawDetectedCornersCharuco_1(long image_nativeObj, long charucoCorners_nativeObj, long charucoIds_nativeObj);
    private static native void drawDetectedCornersCharuco_2(long image_nativeObj, long charucoCorners_nativeObj);

    // C++:  void cv::aruco::drawDetectedDiamonds(Mat& image, vector_Mat diamondCorners, Mat diamondIds = Mat(), Scalar borderColor = Scalar(0, 0, 255))
    private static native void drawDetectedDiamonds_0(long image_nativeObj, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj, double borderColor_val0, double borderColor_val1, double borderColor_val2, double borderColor_val3);
    private static native void drawDetectedDiamonds_1(long image_nativeObj, long diamondCorners_mat_nativeObj, long diamondIds_nativeObj);
    private static native void drawDetectedDiamonds_2(long image_nativeObj, long diamondCorners_mat_nativeObj);

}
