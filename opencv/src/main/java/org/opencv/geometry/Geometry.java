//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.geometry;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDouble;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfInt4;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfPoint3f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.geometry.UsacParams;
import org.opencv.utils.Converters;

// C++: class Geometry

public class Geometry {

    // C++: enum <unnamed>
    public static final int
            LMEDS = 4,
            RANSAC = 8,
            RHO = 16,
            USAC_DEFAULT = 32,
            USAC_PARALLEL = 33,
            USAC_FM_8PTS = 34,
            USAC_FAST = 35,
            USAC_ACCURATE = 36,
            USAC_PROSAC = 37,
            USAC_MAGSAC = 38,
            FM_7POINT = 1,
            FM_8POINT = 2,
            FM_LMEDS = 4,
            FM_RANSAC = 8;


    // C++: enum DistanceTypes (cv.DistanceTypes)
    public static final int
            DIST_USER = -1,
            DIST_L1 = 1,
            DIST_L2 = 2,
            DIST_C = 3,
            DIST_L12 = 4,
            DIST_FAIR = 5,
            DIST_WELSCH = 6,
            DIST_HUBER = 7;


    // C++: enum LocalOptimMethod (cv.LocalOptimMethod)
    public static final int
            LOCAL_OPTIM_NULL = 0,
            LOCAL_OPTIM_INNER_LO = 1,
            LOCAL_OPTIM_INNER_AND_ITER_LO = 2,
            LOCAL_OPTIM_GC = 3,
            LOCAL_OPTIM_SIGMA = 4;


    // C++: enum MSTAlgorithm (cv.MSTAlgorithm)
    public static final int
            MST_PRIM = 0,
            MST_KRUSKAL = 1;


    // C++: enum MatrixType (cv.MatrixType)
    public static final int
            MatrixType_AUTO = 0,
            MatrixType_DENSE = 1,
            MatrixType_SPARSE = 2;


    // C++: enum NeighborSearchMethod (cv.NeighborSearchMethod)
    public static final int
            NEIGH_FLANN_KNN = 0,
            NEIGH_GRID = 1,
            NEIGH_FLANN_RADIUS = 2;


    // C++: enum PolishingMethod (cv.PolishingMethod)
    public static final int
            NONE_POLISHER = 0,
            LSQ_POLISHER = 1,
            MAGSAC = 2,
            COV_POLISHER = 3;


    // C++: enum RectanglesIntersectTypes (cv.RectanglesIntersectTypes)
    public static final int
            INTERSECT_NONE = 0,
            INTERSECT_PARTIAL = 1,
            INTERSECT_FULL = 2;


    // C++: enum SacMethod (cv.SacMethod)
    public static final int
            SAC_METHOD_RANSAC = 0;


    // C++: enum SacModelType (cv.SacModelType)
    public static final int
            SAC_MODEL_PLANE = 0,
            SAC_MODEL_SPHERE = 1;


    // C++: enum SamplingMethod (cv.SamplingMethod)
    public static final int
            SAMPLING_UNIFORM = 0,
            SAMPLING_PROGRESSIVE_NAPSAC = 1,
            SAMPLING_NAPSAC = 2,
            SAMPLING_PROSAC = 3;


    // C++: enum ScoreMethod (cv.ScoreMethod)
    public static final int
            SCORE_METHOD_RANSAC = 0,
            SCORE_METHOD_MSAC = 1,
            SCORE_METHOD_MAGSAC = 2,
            SCORE_METHOD_LMEDS = 3;


    // C++: enum SolvePnPMethod (cv.SolvePnPMethod)
    public static final int
            SOLVEPNP_ITERATIVE = 0,
            SOLVEPNP_EPNP = 1,
            SOLVEPNP_P3P = 2,
            SOLVEPNP_AP3P = 3,
            SOLVEPNP_IPPE = 4,
            SOLVEPNP_IPPE_SQUARE = 5,
            SOLVEPNP_SQPNP = 6,
            SOLVEPNP_MAX_COUNT = 6+1;


    // C++: enum VariableType (cv.VariableType)
    public static final int
            VariableType_LINEAR = 0,
            VariableType_SO3 = 1,
            VariableType_SE3 = 2;


    //
    // C++:  void cv::approxPolyDP(vector_Point2f curve, vector_Point2f& approxCurve, double epsilon, bool closed)
    //

    /**
     * Approximates a polygonal curve(s) with the specified precision.
     *
     *  T he function cv::approxPolyDP approximates a curve or a p*olygon with another curve/polygon with less
     *  vertices so that the distance between them is less or equal to the specified precision. It uses the
     *  Douglas-Peucker algorithm &lt;https://en.wikipedia.org/wiki/Ramer-Douglas-Peucker_algorithm&gt;
     *
     *  @param curve Input vector of a 2D point stored in std::vector or Mat
     *  @param approxCurve Result of the approximation. The type should match the type of the input curve.
     *  @param epsilon Parameter specifying the approximation accuracy. This is the maximum distance
     *  between the original curve and its approximation.
     *  @param closed If true, the approximated curve is closed (its first and last vertices are
     *  connected). Otherwise, it is not closed.
     */
    public static void approxPolyDP(MatOfPoint2f curve, MatOfPoint2f approxCurve, double epsilon, boolean closed) {
        Mat curve_mat = curve;
        Mat approxCurve_mat = approxCurve;
        approxPolyDP_0(curve_mat.nativeObj, approxCurve_mat.nativeObj, epsilon, closed);
    }


    //
    // C++:  void cv::approxPolyN(Mat curve, Mat& approxCurve, int nsides, float epsilon_percentage = -1.0, bool ensure_convex = true)
    //

    /**
     * Approximates a polygon with a convex hull with a specified accuracy and number of sides.
     *
     *  T he cv::approxPolyN function approximates a polygon with *a convex hull
     *  so that the difference between the contour area of the original contour and the new polygon is minimal.
     *  It uses a greedy algorithm for contracting two vertices into one in such a way that the additional area is minimal.
     *  Straight lines formed by each edge of the convex contour are drawn and the areas of the resulting triangles are considered.
     *  Each vertex will lie either on the original contour or outside it.
     *
     *  The algorithm based on the paper CITE: LowIlie2003 .
     *
     *  @param curve Input vector of a 2D points stored in std::vector or Mat, points must be float or integer.
     *  @param approxCurve Result of the approximation. The type is vector of a 2D point (Point2f or Point) in std::vector or Mat.
     *  @param nsides The parameter defines the number of sides of the result polygon.
     *  @param epsilon_percentage defines the percentage of the maximum of additional area.
     *  If it equals -1, it is not used. Otherwise algorithm stops if additional area is greater than contourArea(_curve) * percentage.
     *  If additional area exceeds the limit, algorithm returns as many vertices as there were at the moment the limit was exceeded.
     *  @param ensure_convex If it is true, algorithm creates a convex hull of input contour. Otherwise input vector should be convex.
     */
    public static void approxPolyN(Mat curve, Mat approxCurve, int nsides, float epsilon_percentage, boolean ensure_convex) {
        approxPolyN_0(curve.nativeObj, approxCurve.nativeObj, nsides, epsilon_percentage, ensure_convex);
    }

    /**
     * Approximates a polygon with a convex hull with a specified accuracy and number of sides.
     *
     *  T he cv::approxPolyN function approximates a polygon with *a convex hull
     *  so that the difference between the contour area of the original contour and the new polygon is minimal.
     *  It uses a greedy algorithm for contracting two vertices into one in such a way that the additional area is minimal.
     *  Straight lines formed by each edge of the convex contour are drawn and the areas of the resulting triangles are considered.
     *  Each vertex will lie either on the original contour or outside it.
     *
     *  The algorithm based on the paper CITE: LowIlie2003 .
     *
     *  @param curve Input vector of a 2D points stored in std::vector or Mat, points must be float or integer.
     *  @param approxCurve Result of the approximation. The type is vector of a 2D point (Point2f or Point) in std::vector or Mat.
     *  @param nsides The parameter defines the number of sides of the result polygon.
     *  @param epsilon_percentage defines the percentage of the maximum of additional area.
     *  If it equals -1, it is not used. Otherwise algorithm stops if additional area is greater than contourArea(_curve) * percentage.
     *  If additional area exceeds the limit, algorithm returns as many vertices as there were at the moment the limit was exceeded.
     */
    public static void approxPolyN(Mat curve, Mat approxCurve, int nsides, float epsilon_percentage) {
        approxPolyN_1(curve.nativeObj, approxCurve.nativeObj, nsides, epsilon_percentage);
    }

    /**
     * Approximates a polygon with a convex hull with a specified accuracy and number of sides.
     *
     *  T he cv::approxPolyN function approximates a polygon with *a convex hull
     *  so that the difference between the contour area of the original contour and the new polygon is minimal.
     *  It uses a greedy algorithm for contracting two vertices into one in such a way that the additional area is minimal.
     *  Straight lines formed by each edge of the convex contour are drawn and the areas of the resulting triangles are considered.
     *  Each vertex will lie either on the original contour or outside it.
     *
     *  The algorithm based on the paper CITE: LowIlie2003 .
     *
     *  @param curve Input vector of a 2D points stored in std::vector or Mat, points must be float or integer.
     *  @param approxCurve Result of the approximation. The type is vector of a 2D point (Point2f or Point) in std::vector or Mat.
     *  @param nsides The parameter defines the number of sides of the result polygon.
     *  If it equals -1, it is not used. Otherwise algorithm stops if additional area is greater than contourArea(_curve) * percentage.
     *  If additional area exceeds the limit, algorithm returns as many vertices as there were at the moment the limit was exceeded.
     */
    public static void approxPolyN(Mat curve, Mat approxCurve, int nsides) {
        approxPolyN_2(curve.nativeObj, approxCurve.nativeObj, nsides);
    }


    //
    // C++:  RotatedRect cv::minAreaRect(vector_Point2f points)
    //

    /**
     * Finds a rotated rectangle of the minimum area enclosing the input 2D point set.
     *
     * The function calculates and returns the minimum-area bounding rectangle (possibly rotated) for a
     * specified point set. The angle of rotation represents the angle between the line connecting the starting
     * and ending points (based on the clockwise order with greatest index for the corner with greatest \(y\))
     * and the horizontal axis. This angle always falls between \([-90, 0)\) because, if the object
     * rotates more than a rect angle, the next edge is used to measure the angle. The starting and ending points change
     * as the object rotates.Developer should keep in mind that the returned RotatedRect can contain negative
     * indices when data is close to the containing Mat element boundary.
     *
     * @param points Input vector of 2D points, stored in std::vector&lt;&gt; or Mat
     * @return automatically generated
     */
    public static RotatedRect minAreaRect(MatOfPoint2f points) {
        Mat points_mat = points;
        return new RotatedRect(minAreaRect_0(points_mat.nativeObj));
    }


    //
    // C++:  void cv::boxPoints(RotatedRect box, Mat& points)
    //

    /**
     * Finds the four vertices of a rotated rect. Useful to draw the rotated rectangle.
     *
     * The function finds the four vertices of a rotated rectangle. The four vertices are returned
     * in clockwise order starting from the point with greatest \(y\). If two points have the
     * same \(y\) coordinate the rightmost is the starting point. This function is useful to draw the
     * rectangle. In C++, instead of using this function, you can directly use RotatedRect::points method. Please
     * visit the REF: tutorial_bounding_rotated_ellipses "tutorial on Creating Bounding rotated boxes and ellipses
     * for contours" for more information.
     *
     * @param box The input rotated rectangle. It may be the output of REF: minAreaRect.
     * @param points The output array of four vertices of rectangles.
     */
    public static void boxPoints(RotatedRect box, Mat points) {
        boxPoints_0(box.center.x, box.center.y, box.size.width, box.size.height, box.angle, points.nativeObj);
    }


    //
    // C++:  void cv::minEnclosingCircle(vector_Point2f points, Point2f& center, float& radius)
    //

    /**
     * Finds a circle of the minimum area enclosing a 2D point set.
     *
     * The function finds the minimal enclosing circle of a 2D point set using an iterative algorithm.
     *
     * @param points Input vector of 2D points, stored in std::vector&lt;&gt; or Mat
     * @param center Output center of the circle.
     * @param radius Output radius of the circle.
     */
    public static void minEnclosingCircle(MatOfPoint2f points, Point center, float[] radius) {
        Mat points_mat = points;
        double[] center_out = new double[2];
        double[] radius_out = new double[1];
        minEnclosingCircle_0(points_mat.nativeObj, center_out, radius_out);
        if(center!=null){ center.x = center_out[0]; center.y = center_out[1]; } 
        if(radius!=null) radius[0] = (float)radius_out[0];
    }


    //
    // C++:  double cv::minEnclosingTriangle(Mat points, Mat& triangle)
    //

    /**
     * Finds a triangle of minimum area enclosing a 2D point set and returns its area.
     *
     * The function finds a triangle of minimum area enclosing the given set of 2D points and returns its
     * area. The output for a given 2D point set is shown in the image below. 2D points are depicted in
     * red* and the enclosing triangle in *yellow*.
     *
     * ![Sample output of the minimum enclosing triangle function](pics/minenclosingtriangle.png)
     *
     * The implementation of the algorithm is based on O'Rourke's CITE: ORourke86 and Klee and Laskowski's
     * CITE: KleeLaskowski85 papers. O'Rourke provides a \(\theta(n)\) algorithm for finding the minimal
     * enclosing triangle of a 2D convex polygon with n vertices. Since the #minEnclosingTriangle function
     * takes a 2D point set as input an additional preprocessing step of computing the convex hull of the
     * 2D point set is required. The complexity of the #convexHull function is \(O(n log(n))\) which is higher
     * than \(\theta(n)\). Thus the overall complexity of the function is \(O(n log(n))\).
     *
     * @param points Input vector of 2D points with depth CV_32S or CV_32F, stored in std::vector&lt;&gt; or Mat
     * @param triangle Output vector of three 2D points defining the vertices of the triangle. The depth
     * of the OutputArray must be CV_32F.
     * @return automatically generated
     */
    public static double minEnclosingTriangle(Mat points, Mat triangle) {
        return minEnclosingTriangle_0(points.nativeObj, triangle.nativeObj);
    }


    //
    // C++:  double cv::minEnclosingConvexPolygon(Mat points, Mat& polygon, int k)
    //

    /**
     * Finds a convex polygon of minimum area enclosing a 2D point set and returns its area.
     *
     * This function takes a given set of 2D points and finds the enclosing polygon with k vertices and minimal
     * area. It takes the set of points and the parameter k as input and returns the area of the minimal
     * enclosing polygon.
     *
     * The Implementation is based on a paper by Aggarwal, Chang and Yap CITE: Aggarwal1985. They
     * provide a \(\theta(n²log(n)log(k))\) algorithm for finding the minimal convex polygon with k
     * vertices enclosing a 2D convex polygon with n vertices (k &lt; n). Since the #minEnclosingConvexPolygon
     * function takes a 2D point set as input, an additional preprocessing step of computing the convex hull
     * of the 2D point set is required. The complexity of the #convexHull function is \(O(n log(n))\) which
     * is lower than \(\theta(n²log(n)log(k))\). Thus the overall complexity of the function is
     * \(O(n²log(n)log(k))\).
     *
     * @param points   Input vector of 2D points, stored in std::vector&lt;&gt; or Mat
     * @param polygon  Output vector of 2D points defining the vertices of the enclosing polygon
     * @param k        Number of vertices of the output polygon
     * @return automatically generated
     */
    public static double minEnclosingConvexPolygon(Mat points, Mat polygon, int k) {
        return minEnclosingConvexPolygon_0(points.nativeObj, polygon.nativeObj, k);
    }


    //
    // C++:  Moments cv::moments(Mat array, bool binaryImage = false)
    //

    /**
     * Calculates all of the moments up to the third order of a polygon or rasterized shape.
     *
     * The function computes moments, up to the 3rd order, of a vector shape or a rasterized shape. The
     * results are returned in the structure cv::Moments.
     *
     * @param array Single channel raster image (CV_8U, CV_16U, CV_16S, CV_32F, CV_64F) or an array (
     * \(1 \times N\) or \(N \times 1\) ) of 2D points (Point or Point2f).
     * @param binaryImage If it is true, all non-zero image pixels are treated as 1's. The parameter is
     * used for images only.
     * @return moments.
     *
     * <b>Note:</b> Only applicable to contour moments calculations from Python bindings: Note that the numpy
     * type for the input array should be either np.int32 or np.float32.
     *
     * <b>Note:</b> For contour-based moments, the zeroth-order moment \c m00 represents
     * the contour area.
     *
     * If the input contour is degenerate (for example, a single point or all points
     * are collinear), the area is zero and therefore \c m00 == 0.
     *
     * In this case, the centroid coordinates (\c m10/m00, \c m01/m00) are undefined
     * and must be handled explicitly by the caller.
     *
     * A common workaround is to compute the center using cv::boundingRect() or by
     * averaging the input points.
     *
     * SEE:  contourArea, arcLength
     */
    public static Moments moments(Mat array, boolean binaryImage) {
        return new Moments(moments_0(array.nativeObj, binaryImage));
    }

    /**
     * Calculates all of the moments up to the third order of a polygon or rasterized shape.
     *
     * The function computes moments, up to the 3rd order, of a vector shape or a rasterized shape. The
     * results are returned in the structure cv::Moments.
     *
     * @param array Single channel raster image (CV_8U, CV_16U, CV_16S, CV_32F, CV_64F) or an array (
     * \(1 \times N\) or \(N \times 1\) ) of 2D points (Point or Point2f).
     * used for images only.
     * @return moments.
     *
     * <b>Note:</b> Only applicable to contour moments calculations from Python bindings: Note that the numpy
     * type for the input array should be either np.int32 or np.float32.
     *
     * <b>Note:</b> For contour-based moments, the zeroth-order moment \c m00 represents
     * the contour area.
     *
     * If the input contour is degenerate (for example, a single point or all points
     * are collinear), the area is zero and therefore \c m00 == 0.
     *
     * In this case, the centroid coordinates (\c m10/m00, \c m01/m00) are undefined
     * and must be handled explicitly by the caller.
     *
     * A common workaround is to compute the center using cv::boundingRect() or by
     * averaging the input points.
     *
     * SEE:  contourArea, arcLength
     */
    public static Moments moments(Mat array) {
        return new Moments(moments_1(array.nativeObj));
    }


    //
    // C++:  void cv::HuMoments(Moments m, Mat& hu)
    //

    public static void HuMoments(Moments m, Mat hu) {
        HuMoments_0(m.m00, m.m10, m.m01, m.m20, m.m11, m.m02, m.m30, m.m21, m.m12, m.m03, hu.nativeObj);
    }


    //
    // C++:  double cv::matchShapes(Mat contour1, Mat contour2, int method, double parameter)
    //

    /**
     * Compares two shapes.
     *
     * The function compares two shapes. All three implemented methods use the Hu invariants (see #HuMoments)
     *
     * @param contour1 First contour or grayscale image.
     * @param contour2 Second contour or grayscale image.
     * @param method Comparison method, see #ShapeMatchModes
     * @param parameter Method-specific parameter (not supported now).
     * @return automatically generated
     */
    public static double matchShapes(Mat contour1, Mat contour2, int method, double parameter) {
        return matchShapes_0(contour1.nativeObj, contour2.nativeObj, method, parameter);
    }


    //
    // C++:  void cv::convexHull(vector_Point points, vector_int& hull, bool clockwise = false,  _hidden_  returnPoints = true)
    //

    /**
     * Finds the convex hull of a point set.
     *
     * The function cv::convexHull finds the convex hull of a 2D point set using the Sklansky's algorithm CITE: Sklansky82
     * that has *O(N logN)* complexity in the current implementation.
     *
     * @param points Input 2D point set, stored in std::vector or Mat.
     * @param hull Output convex hull. It is either an integer vector of indices or vector of points. In
     * the first case, the hull elements are 0-based indices of the convex hull points in the original
     * array (since the set of convex hull points is a subset of the original point set). In the second
     * case, hull elements are the convex hull points themselves.
     * @param clockwise Orientation flag. If it is true, the output convex hull is oriented clockwise.
     * Otherwise, it is oriented counter-clockwise. The assumed coordinate system has its X axis pointing
     * to the right, and its Y axis pointing upwards.
     * returns convex hull points. Otherwise, it returns indices of the convex hull points. When the
     * output array is std::vector, the flag is ignored, and the output depends on the type of the
     * vector: std::vector&lt;int&gt; implies returnPoints=false, std::vector&lt;Point&gt; implies
     * returnPoints=true.
     *
     * <b>Note:</b> {@code points} and {@code hull} should be different arrays, inplace processing isn't supported.
     *
     * Check REF: tutorial_hull "the corresponding tutorial" for more details.
     *
     * useful links:
     *
     * https://www.learnopencv.com/convex-hull-using-opencv-in-python-and-c/
     */
    public static void convexHull(MatOfPoint points, MatOfInt hull, boolean clockwise) {
        Mat points_mat = points;
        Mat hull_mat = hull;
        convexHull_0(points_mat.nativeObj, hull_mat.nativeObj, clockwise);
    }

    /**
     * Finds the convex hull of a point set.
     *
     * The function cv::convexHull finds the convex hull of a 2D point set using the Sklansky's algorithm CITE: Sklansky82
     * that has *O(N logN)* complexity in the current implementation.
     *
     * @param points Input 2D point set, stored in std::vector or Mat.
     * @param hull Output convex hull. It is either an integer vector of indices or vector of points. In
     * the first case, the hull elements are 0-based indices of the convex hull points in the original
     * array (since the set of convex hull points is a subset of the original point set). In the second
     * case, hull elements are the convex hull points themselves.
     * Otherwise, it is oriented counter-clockwise. The assumed coordinate system has its X axis pointing
     * to the right, and its Y axis pointing upwards.
     * returns convex hull points. Otherwise, it returns indices of the convex hull points. When the
     * output array is std::vector, the flag is ignored, and the output depends on the type of the
     * vector: std::vector&lt;int&gt; implies returnPoints=false, std::vector&lt;Point&gt; implies
     * returnPoints=true.
     *
     * <b>Note:</b> {@code points} and {@code hull} should be different arrays, inplace processing isn't supported.
     *
     * Check REF: tutorial_hull "the corresponding tutorial" for more details.
     *
     * useful links:
     *
     * https://www.learnopencv.com/convex-hull-using-opencv-in-python-and-c/
     */
    public static void convexHull(MatOfPoint points, MatOfInt hull) {
        Mat points_mat = points;
        Mat hull_mat = hull;
        convexHull_2(points_mat.nativeObj, hull_mat.nativeObj);
    }


    //
    // C++:  void cv::convexityDefects(vector_Point contour, vector_int convexhull, vector_Vec4i& convexityDefects)
    //

    /**
     * Finds the convexity defects of a contour.
     *
     * The figure below displays convexity defects of a hand contour:
     *
     * ![image](pics/defects.png)
     *
     * @param contour Input contour.
     * @param convexhull Convex hull obtained using convexHull that should contain indices of the contour
     * points that make the hull.
     * @param convexityDefects The output vector of convexity defects. In C++ and the new Python/Java
     * interface each convexity defect is represented as 4-element integer vector (a.k.a. #Vec4i):
     * (start_index, end_index, farthest_pt_index, fixpt_depth), where indices are 0-based indices
     * in the original contour of the convexity defect beginning, end and the farthest point, and
     * fixpt_depth is fixed-point approximation (with 8 fractional bits) of the distance between the
     * farthest contour point and the hull. That is, to get the floating-point value of the depth will be
     * fixpt_depth/256.0.
     */
    public static void convexityDefects(MatOfPoint contour, MatOfInt convexhull, MatOfInt4 convexityDefects) {
        Mat contour_mat = contour;
        Mat convexhull_mat = convexhull;
        Mat convexityDefects_mat = convexityDefects;
        convexityDefects_0(contour_mat.nativeObj, convexhull_mat.nativeObj, convexityDefects_mat.nativeObj);
    }


    //
    // C++:  bool cv::isContourConvex(vector_Point contour)
    //

    /**
     * Tests a contour convexity.
     *
     * The function tests whether the input contour is convex or not. The contour must be simple, that is,
     * without self-intersections. Otherwise, the function output is undefined.
     *
     * @param contour Input vector of 2D points, stored in std::vector&lt;&gt; or Mat
     * @return automatically generated
     */
    public static boolean isContourConvex(MatOfPoint contour) {
        Mat contour_mat = contour;
        return isContourConvex_0(contour_mat.nativeObj);
    }


    //
    // C++:  float cv::intersectConvexConvex(Mat p1, Mat p2, Mat& p12, bool handleNested = true)
    //

    /**
     * Finds intersection of two convex polygons
     *
     * @param p1 First polygon
     * @param p2 Second polygon
     * @param p12 Output polygon describing the intersecting area
     * @param handleNested When true, an intersection is found if one of the polygons is fully enclosed in the other.
     * When false, no intersection is found. If the polygons share a side or the vertex of one polygon lies on an edge
     * of the other, they are not considered nested and an intersection will be found regardless of the value of handleNested.
     *
     * @return Area of intersecting polygon. May be negative, if algorithm has not converged, e.g. non-convex input.
     *
     * <b>Note:</b> intersectConvexConvex doesn't confirm that both polygons are convex and will return invalid results if they aren't.
     */
    public static float intersectConvexConvex(Mat p1, Mat p2, Mat p12, boolean handleNested) {
        return intersectConvexConvex_0(p1.nativeObj, p2.nativeObj, p12.nativeObj, handleNested);
    }

    /**
     * Finds intersection of two convex polygons
     *
     * @param p1 First polygon
     * @param p2 Second polygon
     * @param p12 Output polygon describing the intersecting area
     * When false, no intersection is found. If the polygons share a side or the vertex of one polygon lies on an edge
     * of the other, they are not considered nested and an intersection will be found regardless of the value of handleNested.
     *
     * @return Area of intersecting polygon. May be negative, if algorithm has not converged, e.g. non-convex input.
     *
     * <b>Note:</b> intersectConvexConvex doesn't confirm that both polygons are convex and will return invalid results if they aren't.
     */
    public static float intersectConvexConvex(Mat p1, Mat p2, Mat p12) {
        return intersectConvexConvex_1(p1.nativeObj, p2.nativeObj, p12.nativeObj);
    }


    //
    // C++:  RotatedRect cv::fitEllipse(vector_Point2f points)
    //

    /**
     * Fits an ellipse around a set of 2D points.
     *
     * The function calculates the ellipse that fits (in a least-squares sense) a set of 2D points best of
     * all. It returns the rotated rectangle in which the ellipse is inscribed. The first algorithm described by CITE: Fitzgibbon95
     * is used. Developer should keep in mind that it is possible that the returned
     * ellipse/rotatedRect data contains negative indices, due to the data points being close to the
     * border of the containing Mat element.
     *
     * @param points Input 2D point set, stored in std::vector&lt;&gt; or Mat
     *
     * <b>Note:</b> Input point types are REF: Point2i or REF: Point2f and at least 5 points are required.
     * <b>Note:</b> REF: getClosestEllipsePoints function can be used to compute the ellipse fitting error.
     * @return automatically generated
     */
    public static RotatedRect fitEllipse(MatOfPoint2f points) {
        Mat points_mat = points;
        return new RotatedRect(fitEllipse_0(points_mat.nativeObj));
    }


    //
    // C++:  RotatedRect cv::fitEllipseAMS(Mat points)
    //

    /**
     * Fits an ellipse around a set of 2D points.
     *
     * The function calculates the ellipse that fits a set of 2D points.
     * It returns the rotated rectangle in which the ellipse is inscribed.
     * The Approximate Mean Square (AMS) proposed by CITE: Taubin1991 is used.
     *
     * For an ellipse, this basis set is \( \chi= \left(x^2, x y, y^2, x, y, 1\right) \),
     * which is a set of six free coefficients \( A^T=\left\{A_{\text{xx}},A_{\text{xy}},A_{\text{yy}},A_x,A_y,A_0\right\} \).
     * However, to specify an ellipse, all that is needed is five numbers; the major and minor axes lengths \( (a,b) \),
     * the position \( (x_0,y_0) \), and the orientation \( \theta \). This is because the basis set includes lines,
     * quadratics, parabolic and hyperbolic functions as well as elliptical functions as possible fits.
     * If the fit is found to be a parabolic or hyperbolic function then the standard #fitEllipse method is used.
     * The AMS method restricts the fit to parabolic, hyperbolic and elliptical curves
     * by imposing the condition that \( A^T ( D_x^T D_x  +   D_y^T D_y) A = 1 \) where
     * the matrices \( Dx \) and \( Dy \) are the partial derivatives of the design matrix \( D \) with
     * respect to x and y. The matrices are formed row by row applying the following to
     * each of the points in the set:
     * \(align*}{
     * D(i,:)&amp;=\left\{x_i^2, x_i y_i, y_i^2, x_i, y_i, 1\right\} &amp;
     * D_x(i,:)&amp;=\left\{2 x_i,y_i,0,1,0,0\right\} &amp;
     * D_y(i,:)&amp;=\left\{0,x_i,2 y_i,0,1,0\right\}
     * \)
     * The AMS method minimizes the cost function
     * \(equation*}{
     * \epsilon ^2=\frac{ A^T D^T D A }{ A^T (D_x^T D_x +  D_y^T D_y) A^T }
     * \)
     *
     * The minimum cost is found by solving the generalized eigenvalue problem.
     *
     * \(equation*}{
     * D^T D A = \lambda  \left( D_x^T D_x +  D_y^T D_y\right) A
     * \)
     *
     * @param points Input 2D point set, stored in std::vector&lt;&gt; or Mat
     *
     * <b>Note:</b> Input point types are REF: Point2i or REF: Point2f and at least 5 points are required.
     * <b>Note:</b> REF: getClosestEllipsePoints function can be used to compute the ellipse fitting error.
     * @return automatically generated
     */
    public static RotatedRect fitEllipseAMS(Mat points) {
        return new RotatedRect(fitEllipseAMS_0(points.nativeObj));
    }


    //
    // C++:  RotatedRect cv::fitEllipseDirect(Mat points)
    //

    /**
     * Fits an ellipse around a set of 2D points.
     *
     * The function calculates the ellipse that fits a set of 2D points.
     * It returns the rotated rectangle in which the ellipse is inscribed.
     * The Direct least square (Direct) method by CITE: oy1998NumericallySD is used.
     *
     * For an ellipse, this basis set is \( \chi= \left(x^2, x y, y^2, x, y, 1\right) \),
     * which is a set of six free coefficients \( A^T=\left\{A_{\text{xx}},A_{\text{xy}},A_{\text{yy}},A_x,A_y,A_0\right\} \).
     * However, to specify an ellipse, all that is needed is five numbers; the major and minor axes lengths \( (a,b) \),
     * the position \( (x_0,y_0) \), and the orientation \( \theta \). This is because the basis set includes lines,
     * quadratics, parabolic and hyperbolic functions as well as elliptical functions as possible fits.
     * The Direct method confines the fit to ellipses by ensuring that \( 4 A_{xx} A_{yy}- A_{xy}^2 &gt; 0 \).
     * The condition imposed is that \( 4 A_{xx} A_{yy}- A_{xy}^2=1 \) which satisfies the inequality
     * and as the coefficients can be arbitrarily scaled is not overly restrictive.
     *
     * \(equation*}{
     * \epsilon ^2= A^T D^T D A \quad \text{with} \quad A^T C A =1 \quad \text{and} \quad C=\left(\begin{matrix}
     * 0 &amp; 0  &amp; 2  &amp; 0  &amp; 0  &amp;  0  \\
     * 0 &amp; -1  &amp; 0  &amp; 0  &amp; 0  &amp;  0 \\
     * 2 &amp; 0  &amp; 0  &amp; 0  &amp; 0  &amp;  0 \\
     * 0 &amp; 0  &amp; 0  &amp; 0  &amp; 0  &amp;  0 \\
     * 0 &amp; 0  &amp; 0  &amp; 0  &amp; 0  &amp;  0 \\
     * 0 &amp; 0  &amp; 0  &amp; 0  &amp; 0  &amp;  0
     * \end{matrix} \right)
     * \)
     *
     * The minimum cost is found by solving the generalized eigenvalue problem.
     *
     * \(equation*}{
     * D^T D A = \lambda  \left( C\right) A
     * \)
     *
     * The system produces only one positive eigenvalue \( \lambda\) which is chosen as the solution
     * with its eigenvector \(\mathbf{u}\). These are used to find the coefficients
     *
     * \(equation*}{
     * A = \sqrt{\frac{1}{\mathbf{u}^T C \mathbf{u}}}  \mathbf{u}
     * \)
     * The scaling factor guarantees that  \(A^T C A =1\).
     *
     * @param points Input 2D point set, stored in std::vector&lt;&gt; or Mat
     *
     * <b>Note:</b> Input point types are REF: Point2i or REF: Point2f and at least 5 points are required.
     * <b>Note:</b> REF: getClosestEllipsePoints function can be used to compute the ellipse fitting error.
     * @return automatically generated
     */
    public static RotatedRect fitEllipseDirect(Mat points) {
        return new RotatedRect(fitEllipseDirect_0(points.nativeObj));
    }


    //
    // C++:  void cv::getClosestEllipsePoints(RotatedRect ellipse_params, Mat points, Mat& closest_pts)
    //

    /**
     * Compute for each 2d point the nearest 2d point located on a given ellipse.
     *
     * The function computes the nearest 2d location on a given ellipse for a vector of 2d points and is based on CITE: Chatfield2017 code.
     * This function can be used to compute for instance the ellipse fitting error.
     *
     * @param ellipse_params Ellipse parameters
     * @param points Input 2d points
     * @param closest_pts For each 2d point, their corresponding closest 2d point located on a given ellipse
     *
     * <b>Note:</b> Input point types are REF: Point2i or REF: Point2f
     * SEE: fitEllipse, fitEllipseAMS, fitEllipseDirect
     */
    public static void getClosestEllipsePoints(RotatedRect ellipse_params, Mat points, Mat closest_pts) {
        getClosestEllipsePoints_0(ellipse_params.center.x, ellipse_params.center.y, ellipse_params.size.width, ellipse_params.size.height, ellipse_params.angle, points.nativeObj, closest_pts.nativeObj);
    }


    //
    // C++:  void cv::fitLine(Mat points, Mat& line, int distType, double param, double reps, double aeps)
    //

    /**
     * Fits a line to a 2D or 3D point set.
     *
     * The function fitLine fits a line to a 2D or 3D point set by minimizing \(\sum_i \rho(r_i)\) where
     * \(r_i\) is a distance between the \(i^{th}\) point, the line and \(\rho(r)\) is a distance function, one
     * of the following:
     * -  DIST_L2
     * \(\rho (r) = r^2/2  \quad \text{(the simplest and the fastest least-squares method)}\)
     * - DIST_L1
     * \(\rho (r) = r\)
     * - DIST_L12
     * \(\rho (r) = 2  \cdot ( \sqrt{1 + \frac{r^2}{2}} - 1)\)
     * - DIST_FAIR
     * \(\rho \left (r \right ) = C^2  \cdot \left (  \frac{r}{C} -  \log{\left(1 + \frac{r}{C}\right)} \right )  \quad \text{where} \quad C=1.3998\)
     * - DIST_WELSCH
     * \(\rho \left (r \right ) =  \frac{C^2}{2} \cdot \left ( 1 -  \exp{\left(-\left(\frac{r}{C}\right)^2\right)} \right )  \quad \text{where} \quad C=2.9846\)
     * - DIST_HUBER
     * \(\rho (r) =  \fork{r^2/2}{if \(r &lt; C\)}{C \cdot (r-C/2)}{otherwise} \quad \text{where} \quad C=1.345\)
     *
     * The algorithm is based on the M-estimator ( &lt;https://en.wikipedia.org/wiki/M-estimator&gt; ) technique
     * that iteratively fits the line using the weighted least-squares algorithm. After each iteration the
     * weights \(w_i\) are adjusted to be inversely proportional to \(\rho(r_i)\) .
     *
     * @param points Input vector of 2D or 3D points, stored in std::vector&lt;&gt; or Mat.
     * @param line Output line parameters. In case of 2D fitting, it should be a vector of 4 elements
     * (like Vec4f) - (vx, vy, x0, y0), where (vx, vy) is a normalized vector collinear to the line and
     * (x0, y0) is a point on the line. In case of 3D fitting, it should be a vector of 6 elements (like
     * Vec6f) - (vx, vy, vz, x0, y0, z0), where (vx, vy, vz) is a normalized vector collinear to the line
     * and (x0, y0, z0) is a point on the line.
     * @param distType Distance used by the M-estimator, see #DistanceTypes
     * @param param Numerical parameter ( C ) for some types of distances. If it is 0, an optimal value
     * is chosen.
     * @param reps Sufficient accuracy for the radius (distance between the coordinate origin and the line).
     * @param aeps Sufficient accuracy for the angle. 0.01 would be a good default value for reps and aeps.
     */
    public static void fitLine(Mat points, Mat line, int distType, double param, double reps, double aeps) {
        fitLine_0(points.nativeObj, line.nativeObj, distType, param, reps, aeps);
    }


    //
    // C++:  double cv::pointPolygonTest(vector_Point2f contour, Point2f pt, bool measureDist)
    //

    /**
     * Performs a point-in-contour test.
     *
     * The function determines whether the point is inside a contour, outside, or lies on an edge (or
     * coincides with a vertex). It returns positive (inside), negative (outside), or zero (on an edge)
     * value, correspondingly. When measureDist=false , the return value is +1, -1, and 0, respectively.
     * Otherwise, the return value is a signed distance between the point and the nearest contour edge.
     *
     * See below a sample output of the function where each image pixel is tested against the contour:
     *
     * ![sample output](pics/pointpolygon.png)
     *
     * @param contour Input contour.
     * @param pt Point tested against the contour.
     * @param measureDist If true, the function estimates the signed distance from the point to the
     * nearest contour edge. Otherwise, the function only checks if the point is inside a contour or not.
     * @return automatically generated
     */
    public static double pointPolygonTest(MatOfPoint2f contour, Point pt, boolean measureDist) {
        Mat contour_mat = contour;
        return pointPolygonTest_0(contour_mat.nativeObj, pt.x, pt.y, measureDist);
    }


    //
    // C++:  int cv::rotatedRectangleIntersection(RotatedRect rect1, RotatedRect rect2, Mat& intersectingRegion)
    //

    /**
     * Finds out if there is any intersection between two rotated rectangles.
     *
     * If there is then the vertices of the intersecting region are returned as well.
     *
     * Below are some examples of intersection configurations. The hatched pattern indicates the
     * intersecting region and the red vertices are returned by the function.
     *
     * ![intersection examples](pics/intersection.png)
     *
     * @param rect1 First rectangle
     * @param rect2 Second rectangle
     * @param intersectingRegion The output array of the vertices of the intersecting region. It returns
     * at most 8 vertices. Stored as std::vector&lt;cv::Point2f&gt; or cv::Mat as Mx1 of type CV_32FC2.
     * @return One of #RectanglesIntersectTypes
     */
    public static int rotatedRectangleIntersection(RotatedRect rect1, RotatedRect rect2, Mat intersectingRegion) {
        return rotatedRectangleIntersection_0(rect1.center.x, rect1.center.y, rect1.size.width, rect1.size.height, rect1.angle, rect2.center.x, rect2.center.y, rect2.size.width, rect2.size.height, rect2.angle, intersectingRegion.nativeObj);
    }


    //
    // C++:  double cv::arcLength(vector_Point2f curve, bool closed)
    //

    /**
     * Calculates a contour perimeter or a curve length.
     *
     * The function computes a curve length or a closed contour perimeter.
     *
     * @param curve Input vector of 2D points, stored in std::vector or Mat.
     * @param closed Flag indicating whether the curve is closed or not.
     * @return automatically generated
     */
    public static double arcLength(MatOfPoint2f curve, boolean closed) {
        Mat curve_mat = curve;
        return arcLength_0(curve_mat.nativeObj, closed);
    }


    //
    // C++:  double cv::contourArea(Mat contour, bool oriented = false)
    //

    /**
     * Calculates a contour area.
     *
     * The function computes a contour area. Similarly to moments , the area is computed using the Green
     * formula. Thus, the returned area and the number of non-zero pixels, if you draw the contour using
     * #drawContours or #fillPoly , can be different. Also, the function will most certainly give a wrong
     * results for contours with self-intersections.
     *
     * Example:
     * <code>
     * vector&lt;Point&gt; contour;
     * contour.push_back(Point2f(0, 0));
     * contour.push_back(Point2f(10, 0));
     * contour.push_back(Point2f(10, 10));
     * contour.push_back(Point2f(5, 4));
     *
     * double area0 = contourArea(contour);
     * vector&lt;Point&gt; approx;
     * approxPolyDP(contour, approx, 5, true);
     * double area1 = contourArea(approx);
     *
     * cout &lt;&lt; "area0 =" &lt;&lt; area0 &lt;&lt; endl &lt;&lt;
     * "area1 =" &lt;&lt; area1 &lt;&lt; endl &lt;&lt;
     * "approx poly vertices" &lt;&lt; approx.size() &lt;&lt; endl;
     * </code>
     * @param contour Input vector of 2D points (contour vertices), stored in std::vector or Mat.
     * @param oriented Oriented area flag. If it is true, the function returns a signed area value,
     * depending on the contour orientation (clockwise or counter-clockwise). Using this feature you can
     * determine orientation of a contour by taking the sign of an area. By default, the parameter is
     * false, which means that the absolute value is returned.
     * @return automatically generated
     */
    public static double contourArea(Mat contour, boolean oriented) {
        return contourArea_0(contour.nativeObj, oriented);
    }

    /**
     * Calculates a contour area.
     *
     * The function computes a contour area. Similarly to moments , the area is computed using the Green
     * formula. Thus, the returned area and the number of non-zero pixels, if you draw the contour using
     * #drawContours or #fillPoly , can be different. Also, the function will most certainly give a wrong
     * results for contours with self-intersections.
     *
     * Example:
     * <code>
     * vector&lt;Point&gt; contour;
     * contour.push_back(Point2f(0, 0));
     * contour.push_back(Point2f(10, 0));
     * contour.push_back(Point2f(10, 10));
     * contour.push_back(Point2f(5, 4));
     *
     * double area0 = contourArea(contour);
     * vector&lt;Point&gt; approx;
     * approxPolyDP(contour, approx, 5, true);
     * double area1 = contourArea(approx);
     *
     * cout &lt;&lt; "area0 =" &lt;&lt; area0 &lt;&lt; endl &lt;&lt;
     * "area1 =" &lt;&lt; area1 &lt;&lt; endl &lt;&lt;
     * "approx poly vertices" &lt;&lt; approx.size() &lt;&lt; endl;
     * </code>
     * @param contour Input vector of 2D points (contour vertices), stored in std::vector or Mat.
     * depending on the contour orientation (clockwise or counter-clockwise). Using this feature you can
     * determine orientation of a contour by taking the sign of an area. By default, the parameter is
     * false, which means that the absolute value is returned.
     * @return automatically generated
     */
    public static double contourArea(Mat contour) {
        return contourArea_1(contour.nativeObj);
    }


    //
    // C++:  Rect cv::boundingRect(Mat array)
    //

    /**
     * Calculates the up-right bounding rectangle of a point set or non-zero pixels of gray-scale image.
     *
     * The function calculates and returns the minimal up-right bounding rectangle for the specified point set or
     * non-zero pixels of gray-scale image.
     *
     * @param array Input gray-scale image or 2D point set, stored in std::vector or Mat.
     * @return automatically generated
     */
    public static Rect boundingRect(Mat array) {
        return new Rect(boundingRect_0(array.nativeObj));
    }


    //
    // C++:  Mat cv::getRotationMatrix2D(Point2f center, double angle, double scale)
    //

    /**
     * Calculates an affine matrix of 2D rotation.
     *
     * The function calculates the following matrix:
     *
     * \(\begin{bmatrix} \alpha &amp;  \beta &amp; (1- \alpha )  \cdot \texttt{center.x} -  \beta \cdot \texttt{center.y} \\ - \beta &amp;  \alpha &amp;  \beta \cdot \texttt{center.x} + (1- \alpha )  \cdot \texttt{center.y} \end{bmatrix}\)
     *
     * where
     *
     * \(\begin{array}{l} \alpha =  \texttt{scale} \cdot \cos \texttt{angle} , \\ \beta =  \texttt{scale} \cdot \sin \texttt{angle} \end{array}\)
     *
     * The transformation maps the rotation center to itself. If this is not the target, adjust the shift.
     *
     * @param center Center of the rotation in the source image.
     * @param angle Rotation angle in degrees. Positive values mean counter-clockwise rotation (the
     * coordinate origin is assumed to be the top-left corner).
     * @param scale Isotropic scale factor.
     *
     * SEE:  getAffineTransform, warpAffine, transform
     * @return automatically generated
     */
    public static Mat getRotationMatrix2D(Point center, double angle, double scale) {
        return new Mat(getRotationMatrix2D_0(center.x, center.y, angle, scale));
    }


    //
    // C++:  void cv::invertAffineTransform(Mat M, Mat& iM)
    //

    /**
     * Inverts an affine transformation.
     *
     * The function computes an inverse affine transformation represented by \(2 \times 3\) matrix M:
     *
     * \(\begin{bmatrix} a_{11} &amp; a_{12} &amp; b_1  \\ a_{21} &amp; a_{22} &amp; b_2 \end{bmatrix}\)
     *
     * The result is also a \(2 \times 3\) matrix of the same type as M.
     *
     * @param M Original affine transformation.
     * @param iM Output reverse affine transformation.
     */
    public static void invertAffineTransform(Mat M, Mat iM) {
        invertAffineTransform_0(M.nativeObj, iM.nativeObj);
    }


    //
    // C++:  Mat cv::getPerspectiveTransform(Mat src, Mat dst, int solveMethod = DECOMP_LU)
    //

    /**
     * Calculates a perspective transform from four pairs of the corresponding points.
     *
     * The function calculates the \(3 \times 3\) matrix of a perspective transform so that:
     *
     * \(\begin{bmatrix} t_i x'_i \\ t_i y'_i \\ t_i \end{bmatrix} = \texttt{map_matrix} \cdot \begin{bmatrix} x_i \\ y_i \\ 1 \end{bmatrix}\)
     *
     * where
     *
     * \(dst(i)=(x'_i,y'_i), src(i)=(x_i, y_i), i=0,1,2,3\)
     *
     * @param src Coordinates of quadrangle vertices in the source image.
     * @param dst Coordinates of the corresponding quadrangle vertices in the destination image.
     * @param solveMethod method passed to cv::solve (#DecompTypes)
     *
     * SEE:  findHomography, warpPerspective, perspectiveTransform
     * @return automatically generated
     */
    public static Mat getPerspectiveTransform(Mat src, Mat dst, int solveMethod) {
        return new Mat(getPerspectiveTransform_0(src.nativeObj, dst.nativeObj, solveMethod));
    }

    /**
     * Calculates a perspective transform from four pairs of the corresponding points.
     *
     * The function calculates the \(3 \times 3\) matrix of a perspective transform so that:
     *
     * \(\begin{bmatrix} t_i x'_i \\ t_i y'_i \\ t_i \end{bmatrix} = \texttt{map_matrix} \cdot \begin{bmatrix} x_i \\ y_i \\ 1 \end{bmatrix}\)
     *
     * where
     *
     * \(dst(i)=(x'_i,y'_i), src(i)=(x_i, y_i), i=0,1,2,3\)
     *
     * @param src Coordinates of quadrangle vertices in the source image.
     * @param dst Coordinates of the corresponding quadrangle vertices in the destination image.
     *
     * SEE:  findHomography, warpPerspective, perspectiveTransform
     * @return automatically generated
     */
    public static Mat getPerspectiveTransform(Mat src, Mat dst) {
        return new Mat(getPerspectiveTransform_1(src.nativeObj, dst.nativeObj));
    }


    //
    // C++:  Mat cv::getAffineTransform(vector_Point2f src, vector_Point2f dst)
    //

    public static Mat getAffineTransform(MatOfPoint2f src, MatOfPoint2f dst) {
        Mat src_mat = src;
        Mat dst_mat = dst;
        return new Mat(getAffineTransform_0(src_mat.nativeObj, dst_mat.nativeObj));
    }


    //
    // C++:  void cv::Rodrigues(Mat src, Mat& dst, Mat& jacobian = Mat())
    //

    /**
     * Converts a rotation matrix to a rotation vector or vice versa.
     *
     * @param src Input rotation vector (3x1 or 1x3) or rotation matrix (3x3).
     * @param dst Output rotation matrix (3x3) or rotation vector (3x1 or 1x3), respectively.
     * @param jacobian Optional output Jacobian matrix, 3x9 or 9x3, which is a matrix of partial
     * derivatives of the output array components with respect to the input array components.
     *
     * \(\begin{array}{l} \theta \leftarrow norm(r) \\ r  \leftarrow r/ \theta \\ R =  \cos(\theta) I + (1- \cos{\theta} ) r r^T +  \sin(\theta) \vecthreethree{0}{-r_z}{r_y}{r_z}{0}{-r_x}{-r_y}{r_x}{0} \end{array}\)
     *
     * Inverse transformation can be also done easily, since
     *
     * \(\sin ( \theta ) \vecthreethree{0}{-r_z}{r_y}{r_z}{0}{-r_x}{-r_y}{r_x}{0} = \frac{R - R^T}{2}\)
     *
     * A rotation vector is a convenient and most compact representation of a rotation matrix (since any
     * rotation matrix has just 3 degrees of freedom). The representation is used in the global 3D geometry
     * optimization procedures like REF: calibrateCamera, REF: stereoCalibrate, or REF: solvePnP .
     *
     * <b>Note:</b> More information about the computation of the derivative of a 3D rotation matrix with respect to its exponential coordinate
     * can be found in:
     * <ul>
     *   <li>
     *      A Compact Formula for the Derivative of a 3-D Rotation in Exponential Coordinates, Guillermo Gallego, Anthony J. Yezzi CITE: Gallego2014ACF
     *   </li>
     * </ul>
     *
     * <b>Note:</b> Useful information on SE(3) and Lie Groups can be found in:
     * <ul>
     *   <li>
     *      A tutorial on SE(3) transformation parameterizations and on-manifold optimization, Jose-Luis Blanco CITE: blanco2010tutorial
     *   </li>
     *   <li>
     *      Lie Groups for 2D and 3D Transformation, Ethan Eade CITE: Eade17
     *   </li>
     *   <li>
     *      A micro Lie theory for state estimation in robotics, Joan Solà, Jérémie Deray, Dinesh Atchuthan CITE: Sol2018AML
     *   </li>
     * </ul>
     */
    public static void Rodrigues(Mat src, Mat dst, Mat jacobian) {
        Rodrigues_0(src.nativeObj, dst.nativeObj, jacobian.nativeObj);
    }

    /**
     * Converts a rotation matrix to a rotation vector or vice versa.
     *
     * @param src Input rotation vector (3x1 or 1x3) or rotation matrix (3x3).
     * @param dst Output rotation matrix (3x3) or rotation vector (3x1 or 1x3), respectively.
     * derivatives of the output array components with respect to the input array components.
     *
     * \(\begin{array}{l} \theta \leftarrow norm(r) \\ r  \leftarrow r/ \theta \\ R =  \cos(\theta) I + (1- \cos{\theta} ) r r^T +  \sin(\theta) \vecthreethree{0}{-r_z}{r_y}{r_z}{0}{-r_x}{-r_y}{r_x}{0} \end{array}\)
     *
     * Inverse transformation can be also done easily, since
     *
     * \(\sin ( \theta ) \vecthreethree{0}{-r_z}{r_y}{r_z}{0}{-r_x}{-r_y}{r_x}{0} = \frac{R - R^T}{2}\)
     *
     * A rotation vector is a convenient and most compact representation of a rotation matrix (since any
     * rotation matrix has just 3 degrees of freedom). The representation is used in the global 3D geometry
     * optimization procedures like REF: calibrateCamera, REF: stereoCalibrate, or REF: solvePnP .
     *
     * <b>Note:</b> More information about the computation of the derivative of a 3D rotation matrix with respect to its exponential coordinate
     * can be found in:
     * <ul>
     *   <li>
     *      A Compact Formula for the Derivative of a 3-D Rotation in Exponential Coordinates, Guillermo Gallego, Anthony J. Yezzi CITE: Gallego2014ACF
     *   </li>
     * </ul>
     *
     * <b>Note:</b> Useful information on SE(3) and Lie Groups can be found in:
     * <ul>
     *   <li>
     *      A tutorial on SE(3) transformation parameterizations and on-manifold optimization, Jose-Luis Blanco CITE: blanco2010tutorial
     *   </li>
     *   <li>
     *      Lie Groups for 2D and 3D Transformation, Ethan Eade CITE: Eade17
     *   </li>
     *   <li>
     *      A micro Lie theory for state estimation in robotics, Joan Solà, Jérémie Deray, Dinesh Atchuthan CITE: Sol2018AML
     *   </li>
     * </ul>
     */
    public static void Rodrigues(Mat src, Mat dst) {
        Rodrigues_1(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  Mat cv::findHomography(vector_Point2f srcPoints, vector_Point2f dstPoints, int method = 0, double ransacReprojThreshold = 3, Mat& mask = Mat(), int maxIters = 2000, double confidence = 0.995)
    //

    /**
     * Finds a perspective transformation between two planes.
     *
     * @param srcPoints Coordinates of the points in the original plane, a matrix of the type CV_32FC2
     * or vector&lt;Point2f&gt; .
     * @param dstPoints Coordinates of the points in the target plane, a matrix of the type CV_32FC2 or
     * a vector&lt;Point2f&gt; .
     * @param method Method used to compute a homography matrix. The following methods are possible:
     * <ul>
     *   <li>
     *    <b>0</b> - a regular method using all the points, i.e., the least squares method
     *   </li>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     *   </li>
     *   <li>
     *    REF: RHO - PROSAC-based robust method
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum allowed reprojection error to treat a point pair as an inlier
     * (used in the RANSAC and RHO methods only). That is, if
     * \(\| \texttt{dstPoints} _i -  \texttt{convertPointsHomogeneous} ( \texttt{H} \cdot \texttt{srcPoints} _i) \|_2  &gt;  \texttt{ransacReprojThreshold}\)
     * then the point \(i\) is considered as an outlier. If srcPoints and dstPoints are measured in pixels,
     * it usually makes sense to set this parameter somewhere in the range of 1 to 10.
     * @param mask Optional output mask set by a robust method ( RANSAC or LMeDS ). Note that the input
     * mask values are ignored.
     * @param maxIters The maximum number of RANSAC iterations.
     * @param confidence Confidence level, between 0 and 1.
     *
     * The function finds and returns the perspective transformation \(H\) between the source and the
     * destination planes:
     *
     * \(s_i  \vecthree{x'_i}{y'_i}{1} \sim H  \vecthree{x_i}{y_i}{1}\)
     *
     * so that the back-projection error
     *
     * \(\sum _i \left ( x'_i- \frac{h_{11} x_i + h_{12} y_i + h_{13}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2+ \left ( y'_i- \frac{h_{21} x_i + h_{22} y_i + h_{23}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2\)
     *
     * is minimized. If the parameter method is set to the default value 0, the function uses all the point
     * pairs to compute an initial homography estimate with a simple least-squares scheme.
     *
     * However, if not all of the point pairs ( \(srcPoints_i\), \(dstPoints_i\) ) fit the rigid perspective
     * transformation (that is, there are some outliers), this initial estimate will be poor. In this case,
     * you can use one of the three robust methods. The methods RANSAC, LMeDS and RHO try many different
     * random subsets of the corresponding point pairs (of four pairs each, collinear pairs are discarded), estimate the homography matrix
     * using this subset and a simple least-squares algorithm, and then compute the quality/goodness of the
     * computed homography (which is the number of inliers for RANSAC or the least median re-projection error for
     * LMeDS). The best subset is then used to produce the initial estimate of the homography matrix and
     * the mask of inliers/outliers.
     *
     * Regardless of the method, robust or not, the computed homography matrix is refined further (using
     * inliers only in case of a robust method) with the Levenberg-Marquardt method to reduce the
     * re-projection error even more.
     *
     * The methods RANSAC and RHO can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers. Finally, if there are no outliers and the
     * noise is rather small, use the default method (method=0).
     *
     * The function is used to find initial intrinsic and extrinsic matrices. Homography matrix is
     * determined up to a scale. If \(h_{33}\) is non-zero, the matrix is normalized so that \(h_{33}=1\).
     * <b>Note:</b> Whenever an \(H\) matrix cannot be estimated, an empty one will be returned.
     *
     * SEE:
     * getAffineTransform, estimateAffine2D, estimateAffinePartial2D, getPerspectiveTransform, warpPerspective,
     * perspectiveTransform
     * @return automatically generated
     */
    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold, Mat mask, int maxIters, double confidence) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_0(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method, ransacReprojThreshold, mask.nativeObj, maxIters, confidence));
    }

    /**
     * Finds a perspective transformation between two planes.
     *
     * @param srcPoints Coordinates of the points in the original plane, a matrix of the type CV_32FC2
     * or vector&lt;Point2f&gt; .
     * @param dstPoints Coordinates of the points in the target plane, a matrix of the type CV_32FC2 or
     * a vector&lt;Point2f&gt; .
     * @param method Method used to compute a homography matrix. The following methods are possible:
     * <ul>
     *   <li>
     *    <b>0</b> - a regular method using all the points, i.e., the least squares method
     *   </li>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     *   </li>
     *   <li>
     *    REF: RHO - PROSAC-based robust method
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum allowed reprojection error to treat a point pair as an inlier
     * (used in the RANSAC and RHO methods only). That is, if
     * \(\| \texttt{dstPoints} _i -  \texttt{convertPointsHomogeneous} ( \texttt{H} \cdot \texttt{srcPoints} _i) \|_2  &gt;  \texttt{ransacReprojThreshold}\)
     * then the point \(i\) is considered as an outlier. If srcPoints and dstPoints are measured in pixels,
     * it usually makes sense to set this parameter somewhere in the range of 1 to 10.
     * @param mask Optional output mask set by a robust method ( RANSAC or LMeDS ). Note that the input
     * mask values are ignored.
     * @param maxIters The maximum number of RANSAC iterations.
     *
     * The function finds and returns the perspective transformation \(H\) between the source and the
     * destination planes:
     *
     * \(s_i  \vecthree{x'_i}{y'_i}{1} \sim H  \vecthree{x_i}{y_i}{1}\)
     *
     * so that the back-projection error
     *
     * \(\sum _i \left ( x'_i- \frac{h_{11} x_i + h_{12} y_i + h_{13}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2+ \left ( y'_i- \frac{h_{21} x_i + h_{22} y_i + h_{23}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2\)
     *
     * is minimized. If the parameter method is set to the default value 0, the function uses all the point
     * pairs to compute an initial homography estimate with a simple least-squares scheme.
     *
     * However, if not all of the point pairs ( \(srcPoints_i\), \(dstPoints_i\) ) fit the rigid perspective
     * transformation (that is, there are some outliers), this initial estimate will be poor. In this case,
     * you can use one of the three robust methods. The methods RANSAC, LMeDS and RHO try many different
     * random subsets of the corresponding point pairs (of four pairs each, collinear pairs are discarded), estimate the homography matrix
     * using this subset and a simple least-squares algorithm, and then compute the quality/goodness of the
     * computed homography (which is the number of inliers for RANSAC or the least median re-projection error for
     * LMeDS). The best subset is then used to produce the initial estimate of the homography matrix and
     * the mask of inliers/outliers.
     *
     * Regardless of the method, robust or not, the computed homography matrix is refined further (using
     * inliers only in case of a robust method) with the Levenberg-Marquardt method to reduce the
     * re-projection error even more.
     *
     * The methods RANSAC and RHO can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers. Finally, if there are no outliers and the
     * noise is rather small, use the default method (method=0).
     *
     * The function is used to find initial intrinsic and extrinsic matrices. Homography matrix is
     * determined up to a scale. If \(h_{33}\) is non-zero, the matrix is normalized so that \(h_{33}=1\).
     * <b>Note:</b> Whenever an \(H\) matrix cannot be estimated, an empty one will be returned.
     *
     * SEE:
     * getAffineTransform, estimateAffine2D, estimateAffinePartial2D, getPerspectiveTransform, warpPerspective,
     * perspectiveTransform
     * @return automatically generated
     */
    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold, Mat mask, int maxIters) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_1(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method, ransacReprojThreshold, mask.nativeObj, maxIters));
    }

    /**
     * Finds a perspective transformation between two planes.
     *
     * @param srcPoints Coordinates of the points in the original plane, a matrix of the type CV_32FC2
     * or vector&lt;Point2f&gt; .
     * @param dstPoints Coordinates of the points in the target plane, a matrix of the type CV_32FC2 or
     * a vector&lt;Point2f&gt; .
     * @param method Method used to compute a homography matrix. The following methods are possible:
     * <ul>
     *   <li>
     *    <b>0</b> - a regular method using all the points, i.e., the least squares method
     *   </li>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     *   </li>
     *   <li>
     *    REF: RHO - PROSAC-based robust method
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum allowed reprojection error to treat a point pair as an inlier
     * (used in the RANSAC and RHO methods only). That is, if
     * \(\| \texttt{dstPoints} _i -  \texttt{convertPointsHomogeneous} ( \texttt{H} \cdot \texttt{srcPoints} _i) \|_2  &gt;  \texttt{ransacReprojThreshold}\)
     * then the point \(i\) is considered as an outlier. If srcPoints and dstPoints are measured in pixels,
     * it usually makes sense to set this parameter somewhere in the range of 1 to 10.
     * @param mask Optional output mask set by a robust method ( RANSAC or LMeDS ). Note that the input
     * mask values are ignored.
     *
     * The function finds and returns the perspective transformation \(H\) between the source and the
     * destination planes:
     *
     * \(s_i  \vecthree{x'_i}{y'_i}{1} \sim H  \vecthree{x_i}{y_i}{1}\)
     *
     * so that the back-projection error
     *
     * \(\sum _i \left ( x'_i- \frac{h_{11} x_i + h_{12} y_i + h_{13}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2+ \left ( y'_i- \frac{h_{21} x_i + h_{22} y_i + h_{23}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2\)
     *
     * is minimized. If the parameter method is set to the default value 0, the function uses all the point
     * pairs to compute an initial homography estimate with a simple least-squares scheme.
     *
     * However, if not all of the point pairs ( \(srcPoints_i\), \(dstPoints_i\) ) fit the rigid perspective
     * transformation (that is, there are some outliers), this initial estimate will be poor. In this case,
     * you can use one of the three robust methods. The methods RANSAC, LMeDS and RHO try many different
     * random subsets of the corresponding point pairs (of four pairs each, collinear pairs are discarded), estimate the homography matrix
     * using this subset and a simple least-squares algorithm, and then compute the quality/goodness of the
     * computed homography (which is the number of inliers for RANSAC or the least median re-projection error for
     * LMeDS). The best subset is then used to produce the initial estimate of the homography matrix and
     * the mask of inliers/outliers.
     *
     * Regardless of the method, robust or not, the computed homography matrix is refined further (using
     * inliers only in case of a robust method) with the Levenberg-Marquardt method to reduce the
     * re-projection error even more.
     *
     * The methods RANSAC and RHO can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers. Finally, if there are no outliers and the
     * noise is rather small, use the default method (method=0).
     *
     * The function is used to find initial intrinsic and extrinsic matrices. Homography matrix is
     * determined up to a scale. If \(h_{33}\) is non-zero, the matrix is normalized so that \(h_{33}=1\).
     * <b>Note:</b> Whenever an \(H\) matrix cannot be estimated, an empty one will be returned.
     *
     * SEE:
     * getAffineTransform, estimateAffine2D, estimateAffinePartial2D, getPerspectiveTransform, warpPerspective,
     * perspectiveTransform
     * @return automatically generated
     */
    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold, Mat mask) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_2(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method, ransacReprojThreshold, mask.nativeObj));
    }

    /**
     * Finds a perspective transformation between two planes.
     *
     * @param srcPoints Coordinates of the points in the original plane, a matrix of the type CV_32FC2
     * or vector&lt;Point2f&gt; .
     * @param dstPoints Coordinates of the points in the target plane, a matrix of the type CV_32FC2 or
     * a vector&lt;Point2f&gt; .
     * @param method Method used to compute a homography matrix. The following methods are possible:
     * <ul>
     *   <li>
     *    <b>0</b> - a regular method using all the points, i.e., the least squares method
     *   </li>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     *   </li>
     *   <li>
     *    REF: RHO - PROSAC-based robust method
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum allowed reprojection error to treat a point pair as an inlier
     * (used in the RANSAC and RHO methods only). That is, if
     * \(\| \texttt{dstPoints} _i -  \texttt{convertPointsHomogeneous} ( \texttt{H} \cdot \texttt{srcPoints} _i) \|_2  &gt;  \texttt{ransacReprojThreshold}\)
     * then the point \(i\) is considered as an outlier. If srcPoints and dstPoints are measured in pixels,
     * it usually makes sense to set this parameter somewhere in the range of 1 to 10.
     * mask values are ignored.
     *
     * The function finds and returns the perspective transformation \(H\) between the source and the
     * destination planes:
     *
     * \(s_i  \vecthree{x'_i}{y'_i}{1} \sim H  \vecthree{x_i}{y_i}{1}\)
     *
     * so that the back-projection error
     *
     * \(\sum _i \left ( x'_i- \frac{h_{11} x_i + h_{12} y_i + h_{13}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2+ \left ( y'_i- \frac{h_{21} x_i + h_{22} y_i + h_{23}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2\)
     *
     * is minimized. If the parameter method is set to the default value 0, the function uses all the point
     * pairs to compute an initial homography estimate with a simple least-squares scheme.
     *
     * However, if not all of the point pairs ( \(srcPoints_i\), \(dstPoints_i\) ) fit the rigid perspective
     * transformation (that is, there are some outliers), this initial estimate will be poor. In this case,
     * you can use one of the three robust methods. The methods RANSAC, LMeDS and RHO try many different
     * random subsets of the corresponding point pairs (of four pairs each, collinear pairs are discarded), estimate the homography matrix
     * using this subset and a simple least-squares algorithm, and then compute the quality/goodness of the
     * computed homography (which is the number of inliers for RANSAC or the least median re-projection error for
     * LMeDS). The best subset is then used to produce the initial estimate of the homography matrix and
     * the mask of inliers/outliers.
     *
     * Regardless of the method, robust or not, the computed homography matrix is refined further (using
     * inliers only in case of a robust method) with the Levenberg-Marquardt method to reduce the
     * re-projection error even more.
     *
     * The methods RANSAC and RHO can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers. Finally, if there are no outliers and the
     * noise is rather small, use the default method (method=0).
     *
     * The function is used to find initial intrinsic and extrinsic matrices. Homography matrix is
     * determined up to a scale. If \(h_{33}\) is non-zero, the matrix is normalized so that \(h_{33}=1\).
     * <b>Note:</b> Whenever an \(H\) matrix cannot be estimated, an empty one will be returned.
     *
     * SEE:
     * getAffineTransform, estimateAffine2D, estimateAffinePartial2D, getPerspectiveTransform, warpPerspective,
     * perspectiveTransform
     * @return automatically generated
     */
    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method, double ransacReprojThreshold) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_3(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method, ransacReprojThreshold));
    }

    /**
     * Finds a perspective transformation between two planes.
     *
     * @param srcPoints Coordinates of the points in the original plane, a matrix of the type CV_32FC2
     * or vector&lt;Point2f&gt; .
     * @param dstPoints Coordinates of the points in the target plane, a matrix of the type CV_32FC2 or
     * a vector&lt;Point2f&gt; .
     * @param method Method used to compute a homography matrix. The following methods are possible:
     * <ul>
     *   <li>
     *    <b>0</b> - a regular method using all the points, i.e., the least squares method
     *   </li>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     *   </li>
     *   <li>
     *    REF: RHO - PROSAC-based robust method
     *   </li>
     * </ul>
     * (used in the RANSAC and RHO methods only). That is, if
     * \(\| \texttt{dstPoints} _i -  \texttt{convertPointsHomogeneous} ( \texttt{H} \cdot \texttt{srcPoints} _i) \|_2  &gt;  \texttt{ransacReprojThreshold}\)
     * then the point \(i\) is considered as an outlier. If srcPoints and dstPoints are measured in pixels,
     * it usually makes sense to set this parameter somewhere in the range of 1 to 10.
     * mask values are ignored.
     *
     * The function finds and returns the perspective transformation \(H\) between the source and the
     * destination planes:
     *
     * \(s_i  \vecthree{x'_i}{y'_i}{1} \sim H  \vecthree{x_i}{y_i}{1}\)
     *
     * so that the back-projection error
     *
     * \(\sum _i \left ( x'_i- \frac{h_{11} x_i + h_{12} y_i + h_{13}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2+ \left ( y'_i- \frac{h_{21} x_i + h_{22} y_i + h_{23}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2\)
     *
     * is minimized. If the parameter method is set to the default value 0, the function uses all the point
     * pairs to compute an initial homography estimate with a simple least-squares scheme.
     *
     * However, if not all of the point pairs ( \(srcPoints_i\), \(dstPoints_i\) ) fit the rigid perspective
     * transformation (that is, there are some outliers), this initial estimate will be poor. In this case,
     * you can use one of the three robust methods. The methods RANSAC, LMeDS and RHO try many different
     * random subsets of the corresponding point pairs (of four pairs each, collinear pairs are discarded), estimate the homography matrix
     * using this subset and a simple least-squares algorithm, and then compute the quality/goodness of the
     * computed homography (which is the number of inliers for RANSAC or the least median re-projection error for
     * LMeDS). The best subset is then used to produce the initial estimate of the homography matrix and
     * the mask of inliers/outliers.
     *
     * Regardless of the method, robust or not, the computed homography matrix is refined further (using
     * inliers only in case of a robust method) with the Levenberg-Marquardt method to reduce the
     * re-projection error even more.
     *
     * The methods RANSAC and RHO can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers. Finally, if there are no outliers and the
     * noise is rather small, use the default method (method=0).
     *
     * The function is used to find initial intrinsic and extrinsic matrices. Homography matrix is
     * determined up to a scale. If \(h_{33}\) is non-zero, the matrix is normalized so that \(h_{33}=1\).
     * <b>Note:</b> Whenever an \(H\) matrix cannot be estimated, an empty one will be returned.
     *
     * SEE:
     * getAffineTransform, estimateAffine2D, estimateAffinePartial2D, getPerspectiveTransform, warpPerspective,
     * perspectiveTransform
     * @return automatically generated
     */
    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, int method) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_4(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, method));
    }

    /**
     * Finds a perspective transformation between two planes.
     *
     * @param srcPoints Coordinates of the points in the original plane, a matrix of the type CV_32FC2
     * or vector&lt;Point2f&gt; .
     * @param dstPoints Coordinates of the points in the target plane, a matrix of the type CV_32FC2 or
     * a vector&lt;Point2f&gt; .
     * <ul>
     *   <li>
     *    <b>0</b> - a regular method using all the points, i.e., the least squares method
     *   </li>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     *   </li>
     *   <li>
     *    REF: RHO - PROSAC-based robust method
     *   </li>
     * </ul>
     * (used in the RANSAC and RHO methods only). That is, if
     * \(\| \texttt{dstPoints} _i -  \texttt{convertPointsHomogeneous} ( \texttt{H} \cdot \texttt{srcPoints} _i) \|_2  &gt;  \texttt{ransacReprojThreshold}\)
     * then the point \(i\) is considered as an outlier. If srcPoints and dstPoints are measured in pixels,
     * it usually makes sense to set this parameter somewhere in the range of 1 to 10.
     * mask values are ignored.
     *
     * The function finds and returns the perspective transformation \(H\) between the source and the
     * destination planes:
     *
     * \(s_i  \vecthree{x'_i}{y'_i}{1} \sim H  \vecthree{x_i}{y_i}{1}\)
     *
     * so that the back-projection error
     *
     * \(\sum _i \left ( x'_i- \frac{h_{11} x_i + h_{12} y_i + h_{13}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2+ \left ( y'_i- \frac{h_{21} x_i + h_{22} y_i + h_{23}}{h_{31} x_i + h_{32} y_i + h_{33}} \right )^2\)
     *
     * is minimized. If the parameter method is set to the default value 0, the function uses all the point
     * pairs to compute an initial homography estimate with a simple least-squares scheme.
     *
     * However, if not all of the point pairs ( \(srcPoints_i\), \(dstPoints_i\) ) fit the rigid perspective
     * transformation (that is, there are some outliers), this initial estimate will be poor. In this case,
     * you can use one of the three robust methods. The methods RANSAC, LMeDS and RHO try many different
     * random subsets of the corresponding point pairs (of four pairs each, collinear pairs are discarded), estimate the homography matrix
     * using this subset and a simple least-squares algorithm, and then compute the quality/goodness of the
     * computed homography (which is the number of inliers for RANSAC or the least median re-projection error for
     * LMeDS). The best subset is then used to produce the initial estimate of the homography matrix and
     * the mask of inliers/outliers.
     *
     * Regardless of the method, robust or not, the computed homography matrix is refined further (using
     * inliers only in case of a robust method) with the Levenberg-Marquardt method to reduce the
     * re-projection error even more.
     *
     * The methods RANSAC and RHO can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers. Finally, if there are no outliers and the
     * noise is rather small, use the default method (method=0).
     *
     * The function is used to find initial intrinsic and extrinsic matrices. Homography matrix is
     * determined up to a scale. If \(h_{33}\) is non-zero, the matrix is normalized so that \(h_{33}=1\).
     * <b>Note:</b> Whenever an \(H\) matrix cannot be estimated, an empty one will be returned.
     *
     * SEE:
     * getAffineTransform, estimateAffine2D, estimateAffinePartial2D, getPerspectiveTransform, warpPerspective,
     * perspectiveTransform
     * @return automatically generated
     */
    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_5(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj));
    }


    //
    // C++:  Mat cv::findHomography(vector_Point2f srcPoints, vector_Point2f dstPoints, Mat& mask, UsacParams params)
    //

    public static Mat findHomography(MatOfPoint2f srcPoints, MatOfPoint2f dstPoints, Mat mask, UsacParams params) {
        Mat srcPoints_mat = srcPoints;
        Mat dstPoints_mat = dstPoints;
        return new Mat(findHomography_6(srcPoints_mat.nativeObj, dstPoints_mat.nativeObj, mask.nativeObj, params.getNativeObjAddr()));
    }


    //
    // C++:  Vec3d cv::RQDecomp3x3(Mat src, Mat& mtxR, Mat& mtxQ, Mat& Qx = Mat(), Mat& Qy = Mat(), Mat& Qz = Mat())
    //

    /**
     * Computes an RQ decomposition of 3x3 matrices.
     *
     * @param src 3x3 input matrix.
     * @param mtxR Output 3x3 upper-triangular matrix.
     * @param mtxQ Output 3x3 orthogonal matrix.
     * @param Qx Optional output 3x3 rotation matrix around x-axis.
     * @param Qy Optional output 3x3 rotation matrix around y-axis.
     * @param Qz Optional output 3x3 rotation matrix around z-axis.
     *
     * The function computes a RQ decomposition using the given rotations. This function is used in
     * #decomposeProjectionMatrix to decompose the left 3x3 submatrix of a projection matrix into a camera
     * and a rotation matrix.
     *
     * It optionally returns three rotation matrices, one for each axis, and the three Euler angles in
     * degrees (as the return value) that could be used in OpenGL. Note, there is always more than one
     * sequence of rotations about the three principal axes that results in the same orientation of an
     * object, e.g. see CITE: Slabaugh . Returned three rotation matrices and corresponding three Euler angles
     * are only one of the possible solutions.
     * @return automatically generated
     */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx, Mat Qy, Mat Qz) {
        return RQDecomp3x3_0(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj, Qy.nativeObj, Qz.nativeObj);
    }

    /**
     * Computes an RQ decomposition of 3x3 matrices.
     *
     * @param src 3x3 input matrix.
     * @param mtxR Output 3x3 upper-triangular matrix.
     * @param mtxQ Output 3x3 orthogonal matrix.
     * @param Qx Optional output 3x3 rotation matrix around x-axis.
     * @param Qy Optional output 3x3 rotation matrix around y-axis.
     *
     * The function computes a RQ decomposition using the given rotations. This function is used in
     * #decomposeProjectionMatrix to decompose the left 3x3 submatrix of a projection matrix into a camera
     * and a rotation matrix.
     *
     * It optionally returns three rotation matrices, one for each axis, and the three Euler angles in
     * degrees (as the return value) that could be used in OpenGL. Note, there is always more than one
     * sequence of rotations about the three principal axes that results in the same orientation of an
     * object, e.g. see CITE: Slabaugh . Returned three rotation matrices and corresponding three Euler angles
     * are only one of the possible solutions.
     * @return automatically generated
     */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx, Mat Qy) {
        return RQDecomp3x3_1(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj, Qy.nativeObj);
    }

    /**
     * Computes an RQ decomposition of 3x3 matrices.
     *
     * @param src 3x3 input matrix.
     * @param mtxR Output 3x3 upper-triangular matrix.
     * @param mtxQ Output 3x3 orthogonal matrix.
     * @param Qx Optional output 3x3 rotation matrix around x-axis.
     *
     * The function computes a RQ decomposition using the given rotations. This function is used in
     * #decomposeProjectionMatrix to decompose the left 3x3 submatrix of a projection matrix into a camera
     * and a rotation matrix.
     *
     * It optionally returns three rotation matrices, one for each axis, and the three Euler angles in
     * degrees (as the return value) that could be used in OpenGL. Note, there is always more than one
     * sequence of rotations about the three principal axes that results in the same orientation of an
     * object, e.g. see CITE: Slabaugh . Returned three rotation matrices and corresponding three Euler angles
     * are only one of the possible solutions.
     * @return automatically generated
     */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ, Mat Qx) {
        return RQDecomp3x3_2(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj, Qx.nativeObj);
    }

    /**
     * Computes an RQ decomposition of 3x3 matrices.
     *
     * @param src 3x3 input matrix.
     * @param mtxR Output 3x3 upper-triangular matrix.
     * @param mtxQ Output 3x3 orthogonal matrix.
     *
     * The function computes a RQ decomposition using the given rotations. This function is used in
     * #decomposeProjectionMatrix to decompose the left 3x3 submatrix of a projection matrix into a camera
     * and a rotation matrix.
     *
     * It optionally returns three rotation matrices, one for each axis, and the three Euler angles in
     * degrees (as the return value) that could be used in OpenGL. Note, there is always more than one
     * sequence of rotations about the three principal axes that results in the same orientation of an
     * object, e.g. see CITE: Slabaugh . Returned three rotation matrices and corresponding three Euler angles
     * are only one of the possible solutions.
     * @return automatically generated
     */
    public static double[] RQDecomp3x3(Mat src, Mat mtxR, Mat mtxQ) {
        return RQDecomp3x3_3(src.nativeObj, mtxR.nativeObj, mtxQ.nativeObj);
    }


    //
    // C++:  void cv::decomposeProjectionMatrix(Mat projMatrix, Mat& cameraMatrix, Mat& rotMatrix, Mat& transVect, Mat& rotMatrixX = Mat(), Mat& rotMatrixY = Mat(), Mat& rotMatrixZ = Mat(), Mat& eulerAngles = Mat())
    //

    /**
     * Decomposes a projection matrix into a rotation matrix and a camera intrinsic matrix.
     *
     * @param projMatrix 3x4 input projection matrix P.
     * @param cameraMatrix Output 3x3 camera intrinsic matrix \(\cameramatrix{A}\).
     * @param rotMatrix Output 3x3 external rotation matrix R.
     * @param transVect Output 4x1 translation vector T.
     * @param rotMatrixX Optional 3x3 rotation matrix around x-axis.
     * @param rotMatrixY Optional 3x3 rotation matrix around y-axis.
     * @param rotMatrixZ Optional 3x3 rotation matrix around z-axis.
     * @param eulerAngles Optional three-element vector containing three Euler angles of rotation in
     * degrees.
     *
     * The function computes a decomposition of a projection matrix into a calibration and a rotation
     * matrix and the position of a camera.
     *
     * It optionally returns three rotation matrices, one for each axis, and three Euler angles that could
     * be used in OpenGL. Note, there is always more than one sequence of rotations about the three
     * principal axes that results in the same orientation of an object, e.g. see CITE: Slabaugh . Returned
     * three rotation matrices and corresponding three Euler angles are only one of the possible solutions.
     *
     * The function is based on #RQDecomp3x3 .
     */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY, Mat rotMatrixZ, Mat eulerAngles) {
        decomposeProjectionMatrix_0(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj, rotMatrixZ.nativeObj, eulerAngles.nativeObj);
    }

    /**
     * Decomposes a projection matrix into a rotation matrix and a camera intrinsic matrix.
     *
     * @param projMatrix 3x4 input projection matrix P.
     * @param cameraMatrix Output 3x3 camera intrinsic matrix \(\cameramatrix{A}\).
     * @param rotMatrix Output 3x3 external rotation matrix R.
     * @param transVect Output 4x1 translation vector T.
     * @param rotMatrixX Optional 3x3 rotation matrix around x-axis.
     * @param rotMatrixY Optional 3x3 rotation matrix around y-axis.
     * @param rotMatrixZ Optional 3x3 rotation matrix around z-axis.
     * degrees.
     *
     * The function computes a decomposition of a projection matrix into a calibration and a rotation
     * matrix and the position of a camera.
     *
     * It optionally returns three rotation matrices, one for each axis, and three Euler angles that could
     * be used in OpenGL. Note, there is always more than one sequence of rotations about the three
     * principal axes that results in the same orientation of an object, e.g. see CITE: Slabaugh . Returned
     * three rotation matrices and corresponding three Euler angles are only one of the possible solutions.
     *
     * The function is based on #RQDecomp3x3 .
     */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY, Mat rotMatrixZ) {
        decomposeProjectionMatrix_1(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj, rotMatrixZ.nativeObj);
    }

    /**
     * Decomposes a projection matrix into a rotation matrix and a camera intrinsic matrix.
     *
     * @param projMatrix 3x4 input projection matrix P.
     * @param cameraMatrix Output 3x3 camera intrinsic matrix \(\cameramatrix{A}\).
     * @param rotMatrix Output 3x3 external rotation matrix R.
     * @param transVect Output 4x1 translation vector T.
     * @param rotMatrixX Optional 3x3 rotation matrix around x-axis.
     * @param rotMatrixY Optional 3x3 rotation matrix around y-axis.
     * degrees.
     *
     * The function computes a decomposition of a projection matrix into a calibration and a rotation
     * matrix and the position of a camera.
     *
     * It optionally returns three rotation matrices, one for each axis, and three Euler angles that could
     * be used in OpenGL. Note, there is always more than one sequence of rotations about the three
     * principal axes that results in the same orientation of an object, e.g. see CITE: Slabaugh . Returned
     * three rotation matrices and corresponding three Euler angles are only one of the possible solutions.
     *
     * The function is based on #RQDecomp3x3 .
     */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX, Mat rotMatrixY) {
        decomposeProjectionMatrix_2(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj, rotMatrixY.nativeObj);
    }

    /**
     * Decomposes a projection matrix into a rotation matrix and a camera intrinsic matrix.
     *
     * @param projMatrix 3x4 input projection matrix P.
     * @param cameraMatrix Output 3x3 camera intrinsic matrix \(\cameramatrix{A}\).
     * @param rotMatrix Output 3x3 external rotation matrix R.
     * @param transVect Output 4x1 translation vector T.
     * @param rotMatrixX Optional 3x3 rotation matrix around x-axis.
     * degrees.
     *
     * The function computes a decomposition of a projection matrix into a calibration and a rotation
     * matrix and the position of a camera.
     *
     * It optionally returns three rotation matrices, one for each axis, and three Euler angles that could
     * be used in OpenGL. Note, there is always more than one sequence of rotations about the three
     * principal axes that results in the same orientation of an object, e.g. see CITE: Slabaugh . Returned
     * three rotation matrices and corresponding three Euler angles are only one of the possible solutions.
     *
     * The function is based on #RQDecomp3x3 .
     */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect, Mat rotMatrixX) {
        decomposeProjectionMatrix_3(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj, rotMatrixX.nativeObj);
    }

    /**
     * Decomposes a projection matrix into a rotation matrix and a camera intrinsic matrix.
     *
     * @param projMatrix 3x4 input projection matrix P.
     * @param cameraMatrix Output 3x3 camera intrinsic matrix \(\cameramatrix{A}\).
     * @param rotMatrix Output 3x3 external rotation matrix R.
     * @param transVect Output 4x1 translation vector T.
     * degrees.
     *
     * The function computes a decomposition of a projection matrix into a calibration and a rotation
     * matrix and the position of a camera.
     *
     * It optionally returns three rotation matrices, one for each axis, and three Euler angles that could
     * be used in OpenGL. Note, there is always more than one sequence of rotations about the three
     * principal axes that results in the same orientation of an object, e.g. see CITE: Slabaugh . Returned
     * three rotation matrices and corresponding three Euler angles are only one of the possible solutions.
     *
     * The function is based on #RQDecomp3x3 .
     */
    public static void decomposeProjectionMatrix(Mat projMatrix, Mat cameraMatrix, Mat rotMatrix, Mat transVect) {
        decomposeProjectionMatrix_4(projMatrix.nativeObj, cameraMatrix.nativeObj, rotMatrix.nativeObj, transVect.nativeObj);
    }


    //
    // C++:  void cv::matMulDeriv(Mat A, Mat B, Mat& dABdA, Mat& dABdB)
    //

    /**
     * Computes partial derivatives of the matrix product for each multiplied matrix.
     *
     * @param A First multiplied matrix.
     * @param B Second multiplied matrix.
     * @param dABdA First output derivative matrix d(A\*B)/dA of size
     * \(\texttt{A.rows*B.cols} \times {A.rows*A.cols}\) .
     * @param dABdB Second output derivative matrix d(A\*B)/dB of size
     * \(\texttt{A.rows*B.cols} \times {B.rows*B.cols}\) .
     *
     * The function computes partial derivatives of the elements of the matrix product \(A*B\) with regard to
     * the elements of each of the two input matrices. The function is used to compute the Jacobian
     * matrices in #stereoCalibrate but can also be used in any other similar optimization function.
     */
    public static void matMulDeriv(Mat A, Mat B, Mat dABdA, Mat dABdB) {
        matMulDeriv_0(A.nativeObj, B.nativeObj, dABdA.nativeObj, dABdB.nativeObj);
    }


    //
    // C++:  void cv::composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat& rvec3, Mat& tvec3, Mat& dr3dr1 = Mat(), Mat& dr3dt1 = Mat(), Mat& dr3dr2 = Mat(), Mat& dr3dt2 = Mat(), Mat& dt3dr1 = Mat(), Mat& dt3dt1 = Mat(), Mat& dt3dr2 = Mat(), Mat& dt3dt2 = Mat())
    //

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     * @param dr3dr2 Optional output derivative of rvec3 with regard to rvec2
     * @param dr3dt2 Optional output derivative of rvec3 with regard to tvec2
     * @param dt3dr1 Optional output derivative of tvec3 with regard to rvec1
     * @param dt3dt1 Optional output derivative of tvec3 with regard to tvec1
     * @param dt3dr2 Optional output derivative of tvec3 with regard to rvec2
     * @param dt3dt2 Optional output derivative of tvec3 with regard to tvec2
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1, Mat dt3dr2, Mat dt3dt2) {
        composeRT_0(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj, dt3dr2.nativeObj, dt3dt2.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     * @param dr3dr2 Optional output derivative of rvec3 with regard to rvec2
     * @param dr3dt2 Optional output derivative of rvec3 with regard to tvec2
     * @param dt3dr1 Optional output derivative of tvec3 with regard to rvec1
     * @param dt3dt1 Optional output derivative of tvec3 with regard to tvec1
     * @param dt3dr2 Optional output derivative of tvec3 with regard to rvec2
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1, Mat dt3dr2) {
        composeRT_1(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj, dt3dr2.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     * @param dr3dr2 Optional output derivative of rvec3 with regard to rvec2
     * @param dr3dt2 Optional output derivative of rvec3 with regard to tvec2
     * @param dt3dr1 Optional output derivative of tvec3 with regard to rvec1
     * @param dt3dt1 Optional output derivative of tvec3 with regard to tvec1
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1, Mat dt3dt1) {
        composeRT_2(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj, dt3dt1.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     * @param dr3dr2 Optional output derivative of rvec3 with regard to rvec2
     * @param dr3dt2 Optional output derivative of rvec3 with regard to tvec2
     * @param dt3dr1 Optional output derivative of tvec3 with regard to rvec1
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2, Mat dt3dr1) {
        composeRT_3(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj, dt3dr1.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     * @param dr3dr2 Optional output derivative of rvec3 with regard to rvec2
     * @param dr3dt2 Optional output derivative of rvec3 with regard to tvec2
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2, Mat dr3dt2) {
        composeRT_4(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj, dr3dt2.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     * @param dr3dr2 Optional output derivative of rvec3 with regard to rvec2
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1, Mat dr3dr2) {
        composeRT_5(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj, dr3dr2.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     * @param dr3dt1 Optional output derivative of rvec3 with regard to tvec1
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1, Mat dr3dt1) {
        composeRT_6(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj, dr3dt1.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     * @param dr3dr1 Optional output derivative of rvec3 with regard to rvec1
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3, Mat dr3dr1) {
        composeRT_7(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj, dr3dr1.nativeObj);
    }

    /**
     * Combines two rotation-and-shift transformations.
     *
     * @param rvec1 First rotation vector.
     * @param tvec1 First translation vector.
     * @param rvec2 Second rotation vector.
     * @param tvec2 Second translation vector.
     * @param rvec3 Output rotation vector of the superposition.
     * @param tvec3 Output translation vector of the superposition.
     *
     * The functions compute:
     *
     * \(\begin{array}{l} \texttt{rvec3} =  \mathrm{rodrigues} ^{-1} \left ( \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \mathrm{rodrigues} ( \texttt{rvec1} ) \right )  \\ \texttt{tvec3} =  \mathrm{rodrigues} ( \texttt{rvec2} )  \cdot \texttt{tvec1} +  \texttt{tvec2} \end{array} ,\)
     *
     * where \(\mathrm{rodrigues}\) denotes a rotation vector to a rotation matrix transformation, and
     * \(\mathrm{rodrigues}^{-1}\) denotes the inverse transformation. See #Rodrigues for details.
     *
     * Also, the functions can compute the derivatives of the output vectors with regards to the input
     * vectors (see #matMulDeriv ). The functions are used inside #stereoCalibrate but can also be used in
     * your own code where Levenberg-Marquardt or another gradient-based solver is used to optimize a
     * function that contains a matrix multiplication.
     */
    public static void composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat rvec3, Mat tvec3) {
        composeRT_8(rvec1.nativeObj, tvec1.nativeObj, rvec2.nativeObj, tvec2.nativeObj, rvec3.nativeObj, tvec3.nativeObj);
    }


    //
    // C++:  void cv::projectPoints(vector_Point3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, vector_double distCoeffs, vector_Point2f& imagePoints, Mat& jacobian = Mat(), double aspectRatio = 0)
    //

    /**
     * Projects 3D points to an image plane.
     *
     * The function computes the 2D projections of 3D points to the image plane, given intrinsic and
     * extrinsic camera parameters. Optionally, the function computes Jacobians -matrices of partial
     * derivatives of image points coordinates (as functions of all the input parameters) with respect to
     * the particular parameters, intrinsic and/or extrinsic. The Jacobians are used during the global
     * optimization in REF: calibrateCamera, REF: solvePnP, and REF: stereoCalibrate. The function itself
     * can also be used to compute a re-projection error, given the current intrinsic and extrinsic
     * parameters.
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code objectPoints})</b>: 3D points in the <b>world coordinate frame</b>.
     *   </li>
     *   <li>
     *  <b>Output ({@code imagePoints})</b>: 2D projections in <b>pixel coordinates</b> of the image plane, with distortion applied.
     *   The coordinates \((u, v)\) are measured in pixels from the top-left corner of the image.
     *   </li>
     * </ul>
     *
     * The transformation chain is: World coordinates → Camera coordinates (via rvec/tvec) → Normalized camera coordinates
     * → Distortion applied → Pixel coordinates (via cameraMatrix).
     *
     * @param objectPoints Array of object points expressed wrt. the world coordinate frame. A 3xN/Nx3
     * 1-channel or 1xN/Nx1 3-channel (or vector&lt;Point3f&gt; ), where N is the number of points in the view.
     * @param rvec The rotation vector (REF: Rodrigues) that, together with tvec, performs a change of
     * basis from world to camera coordinate system, see REF: calibrateCamera for details.
     * @param tvec The translation vector, see parameter description above.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\) . If the vector is empty, the zero distortion coefficients are assumed.
     * @param imagePoints Output array of image points in <b>pixel coordinates</b>, 1xN/Nx1 2-channel, or
     * vector&lt;Point2f&gt; .
     * @param jacobian Optional output 2Nx(10+&lt;numDistCoeffs&gt;) jacobian matrix of derivatives of image
     * points with respect to components of the rotation vector, translation vector, focal lengths,
     * coordinates of the principal point and the distortion coefficients. In the old interface different
     * components of the jacobian are returned via different output parameters.
     * @param aspectRatio Optional "fixed aspect ratio" parameter. If the parameter is not 0, the
     * function assumes that the aspect ratio (\(f_x / f_y\)) is fixed and correspondingly adjusts the
     * jacobian matrix.
     *
     * <b>Note:</b> By setting rvec = tvec = \([0, 0, 0]\), or by setting cameraMatrix to a 3x3 identity matrix,
     * or by passing zero distortion coefficients, one can get various useful partial cases of the
     * function. This means, one can compute the distorted coordinates for a sparse set of points or apply
     * a perspective transformation (and also compute the derivatives) in the ideal zero-distortion setup.
     */
    public static void projectPoints(MatOfPoint3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, MatOfDouble distCoeffs, MatOfPoint2f imagePoints, Mat jacobian, double aspectRatio) {
        Mat objectPoints_mat = objectPoints;
        Mat distCoeffs_mat = distCoeffs;
        Mat imagePoints_mat = imagePoints;
        projectPoints_0(objectPoints_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, imagePoints_mat.nativeObj, jacobian.nativeObj, aspectRatio);
    }

    /**
     * Projects 3D points to an image plane.
     *
     * The function computes the 2D projections of 3D points to the image plane, given intrinsic and
     * extrinsic camera parameters. Optionally, the function computes Jacobians -matrices of partial
     * derivatives of image points coordinates (as functions of all the input parameters) with respect to
     * the particular parameters, intrinsic and/or extrinsic. The Jacobians are used during the global
     * optimization in REF: calibrateCamera, REF: solvePnP, and REF: stereoCalibrate. The function itself
     * can also be used to compute a re-projection error, given the current intrinsic and extrinsic
     * parameters.
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code objectPoints})</b>: 3D points in the <b>world coordinate frame</b>.
     *   </li>
     *   <li>
     *  <b>Output ({@code imagePoints})</b>: 2D projections in <b>pixel coordinates</b> of the image plane, with distortion applied.
     *   The coordinates \((u, v)\) are measured in pixels from the top-left corner of the image.
     *   </li>
     * </ul>
     *
     * The transformation chain is: World coordinates → Camera coordinates (via rvec/tvec) → Normalized camera coordinates
     * → Distortion applied → Pixel coordinates (via cameraMatrix).
     *
     * @param objectPoints Array of object points expressed wrt. the world coordinate frame. A 3xN/Nx3
     * 1-channel or 1xN/Nx1 3-channel (or vector&lt;Point3f&gt; ), where N is the number of points in the view.
     * @param rvec The rotation vector (REF: Rodrigues) that, together with tvec, performs a change of
     * basis from world to camera coordinate system, see REF: calibrateCamera for details.
     * @param tvec The translation vector, see parameter description above.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\) . If the vector is empty, the zero distortion coefficients are assumed.
     * @param imagePoints Output array of image points in <b>pixel coordinates</b>, 1xN/Nx1 2-channel, or
     * vector&lt;Point2f&gt; .
     * @param jacobian Optional output 2Nx(10+&lt;numDistCoeffs&gt;) jacobian matrix of derivatives of image
     * points with respect to components of the rotation vector, translation vector, focal lengths,
     * coordinates of the principal point and the distortion coefficients. In the old interface different
     * components of the jacobian are returned via different output parameters.
     * function assumes that the aspect ratio (\(f_x / f_y\)) is fixed and correspondingly adjusts the
     * jacobian matrix.
     *
     * <b>Note:</b> By setting rvec = tvec = \([0, 0, 0]\), or by setting cameraMatrix to a 3x3 identity matrix,
     * or by passing zero distortion coefficients, one can get various useful partial cases of the
     * function. This means, one can compute the distorted coordinates for a sparse set of points or apply
     * a perspective transformation (and also compute the derivatives) in the ideal zero-distortion setup.
     */
    public static void projectPoints(MatOfPoint3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, MatOfDouble distCoeffs, MatOfPoint2f imagePoints, Mat jacobian) {
        Mat objectPoints_mat = objectPoints;
        Mat distCoeffs_mat = distCoeffs;
        Mat imagePoints_mat = imagePoints;
        projectPoints_1(objectPoints_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, imagePoints_mat.nativeObj, jacobian.nativeObj);
    }

    /**
     * Projects 3D points to an image plane.
     *
     * The function computes the 2D projections of 3D points to the image plane, given intrinsic and
     * extrinsic camera parameters. Optionally, the function computes Jacobians -matrices of partial
     * derivatives of image points coordinates (as functions of all the input parameters) with respect to
     * the particular parameters, intrinsic and/or extrinsic. The Jacobians are used during the global
     * optimization in REF: calibrateCamera, REF: solvePnP, and REF: stereoCalibrate. The function itself
     * can also be used to compute a re-projection error, given the current intrinsic and extrinsic
     * parameters.
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code objectPoints})</b>: 3D points in the <b>world coordinate frame</b>.
     *   </li>
     *   <li>
     *  <b>Output ({@code imagePoints})</b>: 2D projections in <b>pixel coordinates</b> of the image plane, with distortion applied.
     *   The coordinates \((u, v)\) are measured in pixels from the top-left corner of the image.
     *   </li>
     * </ul>
     *
     * The transformation chain is: World coordinates → Camera coordinates (via rvec/tvec) → Normalized camera coordinates
     * → Distortion applied → Pixel coordinates (via cameraMatrix).
     *
     * @param objectPoints Array of object points expressed wrt. the world coordinate frame. A 3xN/Nx3
     * 1-channel or 1xN/Nx1 3-channel (or vector&lt;Point3f&gt; ), where N is the number of points in the view.
     * @param rvec The rotation vector (REF: Rodrigues) that, together with tvec, performs a change of
     * basis from world to camera coordinate system, see REF: calibrateCamera for details.
     * @param tvec The translation vector, see parameter description above.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\) . If the vector is empty, the zero distortion coefficients are assumed.
     * @param imagePoints Output array of image points in <b>pixel coordinates</b>, 1xN/Nx1 2-channel, or
     * vector&lt;Point2f&gt; .
     * points with respect to components of the rotation vector, translation vector, focal lengths,
     * coordinates of the principal point and the distortion coefficients. In the old interface different
     * components of the jacobian are returned via different output parameters.
     * function assumes that the aspect ratio (\(f_x / f_y\)) is fixed and correspondingly adjusts the
     * jacobian matrix.
     *
     * <b>Note:</b> By setting rvec = tvec = \([0, 0, 0]\), or by setting cameraMatrix to a 3x3 identity matrix,
     * or by passing zero distortion coefficients, one can get various useful partial cases of the
     * function. This means, one can compute the distorted coordinates for a sparse set of points or apply
     * a perspective transformation (and also compute the derivatives) in the ideal zero-distortion setup.
     */
    public static void projectPoints(MatOfPoint3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, MatOfDouble distCoeffs, MatOfPoint2f imagePoints) {
        Mat objectPoints_mat = objectPoints;
        Mat distCoeffs_mat = distCoeffs;
        Mat imagePoints_mat = imagePoints;
        projectPoints_2(objectPoints_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, imagePoints_mat.nativeObj);
    }


    //
    // C++:  void cv::projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat& imagePoints, Mat& dpdr, Mat& dpdt, Mat& dpdf = Mat(), Mat& dpdc = Mat(), Mat& dpdk = Mat(), Mat& dpdo = Mat(), double aspectRatio = 0.)
    //

    public static void projectPointsSepJ(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat dpdr, Mat dpdt, Mat dpdf, Mat dpdc, Mat dpdk, Mat dpdo, double aspectRatio) {
        projectPointsSepJ_0(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, dpdr.nativeObj, dpdt.nativeObj, dpdf.nativeObj, dpdc.nativeObj, dpdk.nativeObj, dpdo.nativeObj, aspectRatio);
    }

    public static void projectPointsSepJ(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat dpdr, Mat dpdt, Mat dpdf, Mat dpdc, Mat dpdk, Mat dpdo) {
        projectPointsSepJ_1(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, dpdr.nativeObj, dpdt.nativeObj, dpdf.nativeObj, dpdc.nativeObj, dpdk.nativeObj, dpdo.nativeObj);
    }

    public static void projectPointsSepJ(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat dpdr, Mat dpdt, Mat dpdf, Mat dpdc, Mat dpdk) {
        projectPointsSepJ_2(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, dpdr.nativeObj, dpdt.nativeObj, dpdf.nativeObj, dpdc.nativeObj, dpdk.nativeObj);
    }

    public static void projectPointsSepJ(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat dpdr, Mat dpdt, Mat dpdf, Mat dpdc) {
        projectPointsSepJ_3(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, dpdr.nativeObj, dpdt.nativeObj, dpdf.nativeObj, dpdc.nativeObj);
    }

    public static void projectPointsSepJ(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat dpdr, Mat dpdt, Mat dpdf) {
        projectPointsSepJ_4(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, dpdr.nativeObj, dpdt.nativeObj, dpdf.nativeObj);
    }

    public static void projectPointsSepJ(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat imagePoints, Mat dpdr, Mat dpdt) {
        projectPointsSepJ_5(objectPoints.nativeObj, rvec.nativeObj, tvec.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, imagePoints.nativeObj, dpdr.nativeObj, dpdt.nativeObj);
    }


    //
    // C++:  bool cv::solvePnP(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, vector_double distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int flags = SOLVEPNP_ITERATIVE)
    //

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences:
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     *
     * More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge. The function returns true if some solution is found. User code is responsible for
     *        solution quality assessment.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <ul>
     *     <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *     </li>
     *   </ul>
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnP(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int flags) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnP_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, flags);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences:
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     *
     * More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge. The function returns true if some solution is found. User code is responsible for
     *        solution quality assessment.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <ul>
     *     <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *     </li>
     *   </ul>
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnP(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnP_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences:
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     *
     * More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge. The function returns true if some solution is found. User code is responsible for
     *        solution quality assessment.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <ul>
     *     <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *     </li>
     *   </ul>
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnP(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnP_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  bool cv::solvePnPRansac(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, vector_double distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int iterationsCount = 100, float reprojectionError = 8.0, double confidence = 0.99, Mat& inliers = Mat(), int flags = SOLVEPNP_ITERATIVE)
    //

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for REF: SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     * @param inliers Output vector that contains indices of inliers in objectPoints and imagePoints .
     * @param flags Method for solving a PnP problem (see REF: solvePnP ).
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers, int flags) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_0(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj, flags);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for REF: SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     * @param inliers Output vector that contains indices of inliers in objectPoints and imagePoints .
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_1(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for REF: SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_2(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for REF: SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_3(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for REF: SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_4(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for REF: SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_5(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences using the RANSAC scheme to deal with bad matches.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     *
     * The function estimates an object pose given a set of object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients. This function finds such
     * a pose that minimizes reprojection error, that is, the sum of squared distances between the observed
     * projections imagePoints and the projected (using REF: projectPoints ) objectPoints. The use of RANSAC
     * makes the function resistant to outliers.
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnPRansac for object detection can be found at
     *         REF: tutorial_real_time_pose
     *   </li>
     *   <li>
     *       The default method used to estimate the camera pose for the Minimal Sample Sets step
     *        is #SOLVEPNP_EPNP. Exceptions are:
     *   <ul>
     *     <li>
     *           if you choose #SOLVEPNP_P3P or #SOLVEPNP_AP3P, these methods will be used.
     *     </li>
     *     <li>
     *           if the number of input points is equal to 4, #SOLVEPNP_P3P is used.
     *     </li>
     *   </ul>
     *   <li>
     *       The method used to estimate the camera pose using all the inliers is defined by the
     *        flags parameters unless it is equal to #SOLVEPNP_P3P or #SOLVEPNP_AP3P. In this case,
     *        the method #SOLVEPNP_EPNP will be used instead.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_6(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  bool cv::solvePnPRansac(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat& cameraMatrix, vector_double distCoeffs, Mat& rvec, Mat& tvec, Mat& inliers, UsacParams params = UsacParams())
    //

    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, Mat inliers, UsacParams params) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_7(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, inliers.nativeObj, params.getNativeObjAddr());
    }

    public static boolean solvePnPRansac(MatOfPoint3f objectPoints, MatOfPoint2f imagePoints, Mat cameraMatrix, MatOfDouble distCoeffs, Mat rvec, Mat tvec, Mat inliers) {
        Mat objectPoints_mat = objectPoints;
        Mat imagePoints_mat = imagePoints;
        Mat distCoeffs_mat = distCoeffs;
        return solvePnPRansac_8(objectPoints_mat.nativeObj, imagePoints_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs_mat.nativeObj, rvec.nativeObj, tvec.nativeObj, inliers.nativeObj);
    }


    //
    // C++:  int cv::solveP3P(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, int flags)
    //

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from <b>3</b> 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, 3x3 1-channel or
     * 1x3/3x1 3-channel. vector&lt;Point3f&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, 3x2 1-channel or 1x3/3x1 2-channel.
     *  vector&lt;Point2f&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system. A P3P problem has up to 4 solutions.
     * @param tvecs Output translation vectors.
     * @param flags Method for solving a P3P problem:
     * <ul>
     *   <li>
     *    REF: SOLVEPNP_P3P Method is based on the paper of Ding, Y., Yang, J., Larsson, V., Olsson, C., &amp; Åstrom, K.
     * "Revisiting the P3P Problem" (CITE: ding2023revisiting).
     *   </li>
     *   <li>
     *    REF: SOLVEPNP_AP3P Method is based on the paper of T. Ke and S. Roumeliotis.
     * "An Efficient Algebraic Solution to the Perspective-Three-Point Problem" (CITE: Ke17).
     *   </li>
     * </ul>
     *
     * The function estimates the object pose given 3 object points, their corresponding image
     * projections, as well as the camera intrinsic matrix and the distortion coefficients.
     *
     * <b>Note:</b>
     * The solutions are sorted by reprojection errors (lowest to highest).
     * @return automatically generated
     */
    public static int solveP3P(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, int flags) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solveP3P_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }


    //
    // C++:  void cv::solvePnPRefineLM(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, TermCriteria criteria = TermCriteria(TermCriteria::EPS + TermCriteria::COUNT, 20, FLT_EPSILON))
    //

    /**
     * Refine a pose (the translation and the rotation that transform a 3D point expressed in the object coordinate frame
     * to the camera coordinate frame) from a 3D-2D point correspondences and starting from an initial solution.
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or 1xN/Nx1 3-channel,
     * where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Input/Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system. Input values are used as an initial solution.
     * @param tvec Input/Output translation vector. Input values are used as an initial solution.
     * @param criteria Criteria when to stop the Levenberg-Marquard iterative algorithm.
     *
     * The function refines the object pose given at least 3 object points, their corresponding image
     * projections, an initial solution for the rotation and translation vector,
     * as well as the camera intrinsic matrix and the distortion coefficients.
     * The function minimizes the projection error with respect to the rotation and the translation vectors, according
     * to a Levenberg-Marquardt iterative minimization CITE: Madsen04 CITE: Eade13 process.
     */
    public static void solvePnPRefineLM(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, TermCriteria criteria) {
        solvePnPRefineLM_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
    }

    /**
     * Refine a pose (the translation and the rotation that transform a 3D point expressed in the object coordinate frame
     * to the camera coordinate frame) from a 3D-2D point correspondences and starting from an initial solution.
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or 1xN/Nx1 3-channel,
     * where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Input/Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system. Input values are used as an initial solution.
     * @param tvec Input/Output translation vector. Input values are used as an initial solution.
     *
     * The function refines the object pose given at least 3 object points, their corresponding image
     * projections, an initial solution for the rotation and translation vector,
     * as well as the camera intrinsic matrix and the distortion coefficients.
     * The function minimizes the projection error with respect to the rotation and the translation vectors, according
     * to a Levenberg-Marquardt iterative minimization CITE: Madsen04 CITE: Eade13 process.
     */
    public static void solvePnPRefineLM(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        solvePnPRefineLM_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  void cv::solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, TermCriteria criteria = TermCriteria(TermCriteria::EPS + TermCriteria::COUNT, 20, FLT_EPSILON), double VVSlambda = 1)
    //

    /**
     * Refine a pose (the translation and the rotation that transform a 3D point expressed in the object coordinate frame
     * to the camera coordinate frame) from a 3D-2D point correspondences and starting from an initial solution.
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or 1xN/Nx1 3-channel,
     * where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Input/Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system. Input values are used as an initial solution.
     * @param tvec Input/Output translation vector. Input values are used as an initial solution.
     * @param criteria Criteria when to stop the Levenberg-Marquard iterative algorithm.
     * @param VVSlambda Gain for the virtual visual servoing control law, equivalent to the \(\alpha\)
     * gain in the Damped Gauss-Newton formulation.
     *
     * The function refines the object pose given at least 3 object points, their corresponding image
     * projections, an initial solution for the rotation and translation vector,
     * as well as the camera intrinsic matrix and the distortion coefficients.
     * The function minimizes the projection error with respect to the rotation and the translation vectors, using a
     * virtual visual servoing (VVS) CITE: Chaumette06 CITE: Marchand16 scheme.
     */
    public static void solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, TermCriteria criteria, double VVSlambda) {
        solvePnPRefineVVS_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, VVSlambda);
    }

    /**
     * Refine a pose (the translation and the rotation that transform a 3D point expressed in the object coordinate frame
     * to the camera coordinate frame) from a 3D-2D point correspondences and starting from an initial solution.
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or 1xN/Nx1 3-channel,
     * where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Input/Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system. Input values are used as an initial solution.
     * @param tvec Input/Output translation vector. Input values are used as an initial solution.
     * @param criteria Criteria when to stop the Levenberg-Marquard iterative algorithm.
     * gain in the Damped Gauss-Newton formulation.
     *
     * The function refines the object pose given at least 3 object points, their corresponding image
     * projections, an initial solution for the rotation and translation vector,
     * as well as the camera intrinsic matrix and the distortion coefficients.
     * The function minimizes the projection error with respect to the rotation and the translation vectors, using a
     * virtual visual servoing (VVS) CITE: Chaumette06 CITE: Marchand16 scheme.
     */
    public static void solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, TermCriteria criteria) {
        solvePnPRefineVVS_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
    }

    /**
     * Refine a pose (the translation and the rotation that transform a 3D point expressed in the object coordinate frame
     * to the camera coordinate frame) from a 3D-2D point correspondences and starting from an initial solution.
     *
     * SEE: REF: calib3d_solvePnP
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or 1xN/Nx1 3-channel,
     * where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvec Input/Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system. Input values are used as an initial solution.
     * @param tvec Input/Output translation vector. Input values are used as an initial solution.
     * gain in the Damped Gauss-Newton formulation.
     *
     * The function refines the object pose given at least 3 object points, their corresponding image
     * projections, an initial solution for the rotation and translation vector,
     * as well as the camera intrinsic matrix and the distortion coefficients.
     * The function minimizes the projection error with respect to the rotation and the translation vectors, using a
     * virtual visual servoing (VVS) CITE: Chaumette06 CITE: Marchand16 scheme.
     */
    public static void solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        solvePnPRefineVVS_2(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  int cv::solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, bool useExtrinsicGuess = false, int flags = SOLVEPNP_ITERATIVE, Mat rvec = Mat(), Mat tvec = Mat(), Mat& reprojectionError = Mat())
    //

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns a list of all the possible solutions (a solution is a &lt;rotation vector, translation vector&gt;
     * couple), depending on the number of input points and the chosen method:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): 3 or 4 input points. Number of returned solutions can be between 0 and 4 with 3 input points.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar. Returns 2 solutions.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4 and 2 solutions are returned. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     * Only 1 solution is returned.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Vector of output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvecs Vector of output translation vectors.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * @param rvec Rotation vector used to initialize an iterative PnP refinement algorithm, when flag is REF: SOLVEPNP_ITERATIVE
     * and useExtrinsicGuess is set to true.
     * @param tvec Translation vector used to initialize an iterative PnP refinement algorithm, when flag is REF: SOLVEPNP_ITERATIVE
     * and useExtrinsicGuess is set to true.
     * @param reprojectionError Optional vector of reprojection error, that is the RMS error
     * (\( \text{RMSE} = \sqrt{\frac{\sum_{i}^{N} \left ( \hat{y_i} - y_i \right )^2}{N}} \)) between the input image points
     * and the 3D object points projected with the estimated pose.
     *
     * More information is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags, Mat rvec, Mat tvec, Mat reprojectionError) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solvePnPGeneric_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags, rvec.nativeObj, tvec.nativeObj, reprojectionError.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns a list of all the possible solutions (a solution is a &lt;rotation vector, translation vector&gt;
     * couple), depending on the number of input points and the chosen method:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): 3 or 4 input points. Number of returned solutions can be between 0 and 4 with 3 input points.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar. Returns 2 solutions.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4 and 2 solutions are returned. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     * Only 1 solution is returned.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Vector of output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvecs Vector of output translation vectors.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * @param rvec Rotation vector used to initialize an iterative PnP refinement algorithm, when flag is REF: SOLVEPNP_ITERATIVE
     * and useExtrinsicGuess is set to true.
     * @param tvec Translation vector used to initialize an iterative PnP refinement algorithm, when flag is REF: SOLVEPNP_ITERATIVE
     * and useExtrinsicGuess is set to true.
     * (\( \text{RMSE} = \sqrt{\frac{\sum_{i}^{N} \left ( \hat{y_i} - y_i \right )^2}{N}} \)) between the input image points
     * and the 3D object points projected with the estimated pose.
     *
     * More information is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags, Mat rvec, Mat tvec) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solvePnPGeneric_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags, rvec.nativeObj, tvec.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns a list of all the possible solutions (a solution is a &lt;rotation vector, translation vector&gt;
     * couple), depending on the number of input points and the chosen method:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): 3 or 4 input points. Number of returned solutions can be between 0 and 4 with 3 input points.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar. Returns 2 solutions.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4 and 2 solutions are returned. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     * Only 1 solution is returned.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Vector of output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvecs Vector of output translation vectors.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * @param rvec Rotation vector used to initialize an iterative PnP refinement algorithm, when flag is REF: SOLVEPNP_ITERATIVE
     * and useExtrinsicGuess is set to true.
     * and useExtrinsicGuess is set to true.
     * (\( \text{RMSE} = \sqrt{\frac{\sum_{i}^{N} \left ( \hat{y_i} - y_i \right )^2}{N}} \)) between the input image points
     * and the 3D object points projected with the estimated pose.
     *
     * More information is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags, Mat rvec) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solvePnPGeneric_2(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags, rvec.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns a list of all the possible solutions (a solution is a &lt;rotation vector, translation vector&gt;
     * couple), depending on the number of input points and the chosen method:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): 3 or 4 input points. Number of returned solutions can be between 0 and 4 with 3 input points.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar. Returns 2 solutions.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4 and 2 solutions are returned. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     * Only 1 solution is returned.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Vector of output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvecs Vector of output translation vectors.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * and useExtrinsicGuess is set to true.
     * and useExtrinsicGuess is set to true.
     * (\( \text{RMSE} = \sqrt{\frac{\sum_{i}^{N} \left ( \hat{y_i} - y_i \right )^2}{N}} \)) between the input image points
     * and the 3D object points projected with the estimated pose.
     *
     * More information is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess, int flags) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solvePnPGeneric_3(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess, flags);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns a list of all the possible solutions (a solution is a &lt;rotation vector, translation vector&gt;
     * couple), depending on the number of input points and the chosen method:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): 3 or 4 input points. Number of returned solutions can be between 0 and 4 with 3 input points.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar. Returns 2 solutions.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4 and 2 solutions are returned. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     * Only 1 solution is returned.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Vector of output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvecs Vector of output translation vectors.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * and useExtrinsicGuess is set to true.
     * and useExtrinsicGuess is set to true.
     * (\( \text{RMSE} = \sqrt{\frac{\sum_{i}^{N} \left ( \hat{y_i} - y_i \right )^2}{N}} \)) between the input image points
     * and the 3D object points projected with the estimated pose.
     *
     * More information is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs, boolean useExtrinsicGuess) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solvePnPGeneric_4(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj, useExtrinsicGuess);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }

    /**
     * Finds an object pose \( {}^{c}\mathbf{T}_o \) from 3D-2D point correspondences.
     *
     * ![Perspective projection, from object to camera frame](pics/pinhole_homogeneous_transformation.jpg){ width=50% }
     *
     * SEE: REF: calib3d_solvePnP
     *
     * This function returns a list of all the possible solutions (a solution is a &lt;rotation vector, translation vector&gt;
     * couple), depending on the number of input points and the chosen method:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): 3 or 4 input points. Number of returned solutions can be between 0 and 4 with 3 input points.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar. Returns 2 solutions.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4 and 2 solutions are returned. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *    point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *    point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     * Only 1 solution is returned.
     *   </li>
     * </ul>
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param rvecs Vector of output rotation vectors (see REF: Rodrigues ) that, together with tvecs, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvecs Vector of output translation vectors.
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * and useExtrinsicGuess is set to true.
     * and useExtrinsicGuess is set to true.
     * (\( \text{RMSE} = \sqrt{\frac{\sum_{i}^{N} \left ( \hat{y_i} - y_i \right )^2}{N}} \)) between the input image points
     * and the 3D object points projected with the estimated pose.
     *
     * More information is described in REF: calib3d_solvePnP
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *       An example of how to use solvePnP for planar augmented reality can be found at
     *         opencv_source_code/samples/python/plane_ar.py
     *   </li>
     *   <li>
     *       If you are using Python:
     *   <ul>
     *     <li>
     *          Numpy array slices won't work as input because solvePnP requires contiguous
     *         arrays (enforced by the assertion using cv::Mat::checkVector() around line 55 of
     *         modules/3d/src/solvepnp.cpp version 2.4.9)
     *     </li>
     *     <li>
     *          The P3P algorithm requires image points to be in an array of shape (N,1,2) due
     *         to its calling of #undistortPoints (around line 75 of modules/3d/src/solvepnp.cpp version 2.4.9)
     *         which requires 2-channel information.
     *     </li>
     *     <li>
     *          Thus, given some data D = np.array(...) where D.shape = (N,M), in order to use a subset of
     *         it as, e.g., imagePoints, one must effectively copy it into a new array: imagePoints =
     *         np.ascontiguousarray(D[:,:2]).reshape((N,1,2))
     *     </li>
     *   </ul>
     *   <li>
     *       The minimum number of points is 4 in the general case. In the case of REF: SOLVEPNP_P3P and REF: SOLVEPNP_AP3P
     *        methods, it is required to use exactly 4 points (the first 3 points are used to estimate all the solutions
     *        of the P3P problem, the last one is used to retain the best solution that minimizes the reprojection error).
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_ITERATIVE method and {@code useExtrinsicGuess=true}, the minimum number of points is 3 (3 points
     *        are sufficient to compute a pose but there are up to 4 solutions). The initial solution should be close to the
     *        global solution to converge.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *       With REF: SOLVEPNP_IPPE_SQUARE this is a special case suitable for marker pose estimation.
     *        Number of input points must be 4. Object points must be defined in the following order:
     *   <ul>
     *     <li>
     *           point 0: [-squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 1: [ squareLength / 2,  squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 2: [ squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *     <li>
     *           point 3: [-squareLength / 2, -squareLength / 2, 0]
     *     </li>
     *   </ul>
     *   <li>
     *       With REF: SOLVEPNP_SQPNP input points must be &gt;= 3
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static int solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, List<Mat> rvecs, List<Mat> tvecs) {
        Mat rvecs_mat = new Mat();
        Mat tvecs_mat = new Mat();
        int retVal = solvePnPGeneric_5(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvecs_mat.nativeObj, tvecs_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rvecs_mat, rvecs);
        rvecs_mat.release();
        Converters.Mat_to_vector_Mat(tvecs_mat, tvecs);
        tvecs_mat.release();
        return retVal;
    }


    //
    // C++:  void cv::convertPointsToHomogeneous(Mat src, Mat& dst, int dtype = -1)
    //

    /**
     * Converts points from Euclidean to homogeneous space.
     *
     * @param src Input vector of N-dimensional points.
     * @param dst Output vector of N+1-dimensional points.
     * @param dtype The desired output array depth (either CV_32F or CV_64F are currently supported).
     *     If it's -1, then it's set automatically to CV_32F or CV_64F, depending on the input depth.
     *
     * The function converts points from Euclidean to homogeneous space by appending 1's to the tuple of
     * point coordinates. That is, each point (x1, x2, ..., xn) is converted to (x1, x2, ..., xn, 1).
     */
    public static void convertPointsToHomogeneous(Mat src, Mat dst, int dtype) {
        convertPointsToHomogeneous_0(src.nativeObj, dst.nativeObj, dtype);
    }

    /**
     * Converts points from Euclidean to homogeneous space.
     *
     * @param src Input vector of N-dimensional points.
     * @param dst Output vector of N+1-dimensional points.
     *     If it's -1, then it's set automatically to CV_32F or CV_64F, depending on the input depth.
     *
     * The function converts points from Euclidean to homogeneous space by appending 1's to the tuple of
     * point coordinates. That is, each point (x1, x2, ..., xn) is converted to (x1, x2, ..., xn, 1).
     */
    public static void convertPointsToHomogeneous(Mat src, Mat dst) {
        convertPointsToHomogeneous_1(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::convertPointsFromHomogeneous(Mat src, Mat& dst, int dtype = -1)
    //

    /**
     * Converts points from homogeneous to Euclidean space.
     *
     * @param src Input vector of N-dimensional points.
     * @param dst Output vector of N-1-dimensional points.
     * @param dtype The desired output array depth (either CV_32F or CV_64F are currently supported).
     *     If it's -1, then it's set automatically to CV_32F or CV_64F, depending on the input depth.
     *
     * The function converts points homogeneous to Euclidean space using perspective projection. That is,
     * each point (x1, x2, ... x(n-1), xn) is converted to (x1/xn, x2/xn, ..., x(n-1)/xn). When xn=0, the
     * output point coordinates will be (0,0,0,...).
     */
    public static void convertPointsFromHomogeneous(Mat src, Mat dst, int dtype) {
        convertPointsFromHomogeneous_0(src.nativeObj, dst.nativeObj, dtype);
    }

    /**
     * Converts points from homogeneous to Euclidean space.
     *
     * @param src Input vector of N-dimensional points.
     * @param dst Output vector of N-1-dimensional points.
     *     If it's -1, then it's set automatically to CV_32F or CV_64F, depending on the input depth.
     *
     * The function converts points homogeneous to Euclidean space using perspective projection. That is,
     * each point (x1, x2, ... x(n-1), xn) is converted to (x1/xn, x2/xn, ..., x(n-1)/xn). When xn=0, the
     * output point coordinates will be (0,0,0,...).
     */
    public static void convertPointsFromHomogeneous(Mat src, Mat dst) {
        convertPointsFromHomogeneous_1(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  Mat cv::findFundamentalMat(vector_Point2f points1, vector_Point2f points2, int method, double ransacReprojThreshold, double confidence, int maxIters, Mat& mask = Mat())
    //

    /**
     * Calculates a fundamental matrix from the corresponding points in two images.
     *
     * @param points1 Array of N points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: FM_7POINT for a 7-point algorithm. \(N = 7\)
     *   </li>
     *   <li>
     *    REF: FM_8POINT for an 8-point algorithm. \(N \ge 8\)
     *   </li>
     *   <li>
     *    REF: FM_RANSAC for the RANSAC algorithm. \(N \ge 8\)
     *   </li>
     *   <li>
     *    REF: FM_LMEDS for the LMedS algorithm. \(N \ge 8\)
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Parameter used only for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param confidence Parameter used for the RANSAC and LMedS methods only. It specifies a desirable level
     * of confidence (probability) that the estimated matrix is correct.
     * @param mask optional output mask
     * @param maxIters The maximum number of robust method iterations.
     *
     * The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T F [p_1; 1] = 0\)
     *
     * where \(F\) is a fundamental matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively.
     *
     * The function calculates the fundamental matrix using one of four methods listed above and returns
     * the found fundamental matrix. Normally just one matrix is found. But in case of the 7-point
     * algorithm, the function may return up to 3 solutions ( \(9 \times 3\) matrix that stores all 3
     * matrices sequentially).
     *
     * The calculated fundamental matrix may be passed further to #computeCorrespondEpilines that finds the
     * epipolar lines corresponding to the specified points. It can also be passed to
     * #stereoRectifyUncalibrated to compute the rectification transformation. :
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     Mat fundamental_matrix =
     *      findFundamentalMat(points1, points2, FM_RANSAC, 3, 0.99);
     * </code>
     * @return automatically generated
     */
    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence, int maxIters, Mat mask) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_0(points1_mat.nativeObj, points2_mat.nativeObj, method, ransacReprojThreshold, confidence, maxIters, mask.nativeObj));
    }

    /**
     * Calculates a fundamental matrix from the corresponding points in two images.
     *
     * @param points1 Array of N points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: FM_7POINT for a 7-point algorithm. \(N = 7\)
     *   </li>
     *   <li>
     *    REF: FM_8POINT for an 8-point algorithm. \(N \ge 8\)
     *   </li>
     *   <li>
     *    REF: FM_RANSAC for the RANSAC algorithm. \(N \ge 8\)
     *   </li>
     *   <li>
     *    REF: FM_LMEDS for the LMedS algorithm. \(N \ge 8\)
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Parameter used only for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param confidence Parameter used for the RANSAC and LMedS methods only. It specifies a desirable level
     * of confidence (probability) that the estimated matrix is correct.
     * @param maxIters The maximum number of robust method iterations.
     *
     * The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T F [p_1; 1] = 0\)
     *
     * where \(F\) is a fundamental matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively.
     *
     * The function calculates the fundamental matrix using one of four methods listed above and returns
     * the found fundamental matrix. Normally just one matrix is found. But in case of the 7-point
     * algorithm, the function may return up to 3 solutions ( \(9 \times 3\) matrix that stores all 3
     * matrices sequentially).
     *
     * The calculated fundamental matrix may be passed further to #computeCorrespondEpilines that finds the
     * epipolar lines corresponding to the specified points. It can also be passed to
     * #stereoRectifyUncalibrated to compute the rectification transformation. :
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     Mat fundamental_matrix =
     *      findFundamentalMat(points1, points2, FM_RANSAC, 3, 0.99);
     * </code>
     * @return automatically generated
     */
    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence, int maxIters) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_1(points1_mat.nativeObj, points2_mat.nativeObj, method, ransacReprojThreshold, confidence, maxIters));
    }


    //
    // C++:  Mat cv::findFundamentalMat(vector_Point2f points1, vector_Point2f points2, int method = FM_RANSAC, double ransacReprojThreshold = 3., double confidence = 0.99, Mat& mask = Mat())
    //

    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence, Mat mask) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_2(points1_mat.nativeObj, points2_mat.nativeObj, method, ransacReprojThreshold, confidence, mask.nativeObj));
    }

    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold, double confidence) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_3(points1_mat.nativeObj, points2_mat.nativeObj, method, ransacReprojThreshold, confidence));
    }

    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method, double ransacReprojThreshold) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_4(points1_mat.nativeObj, points2_mat.nativeObj, method, ransacReprojThreshold));
    }

    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, int method) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_5(points1_mat.nativeObj, points2_mat.nativeObj, method));
    }

    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_6(points1_mat.nativeObj, points2_mat.nativeObj));
    }


    //
    // C++:  Mat cv::findFundamentalMat(vector_Point2f points1, vector_Point2f points2, Mat& mask, UsacParams params)
    //

    public static Mat findFundamentalMat(MatOfPoint2f points1, MatOfPoint2f points2, Mat mask, UsacParams params) {
        Mat points1_mat = points1;
        Mat points2_mat = points2;
        return new Mat(findFundamentalMat_7(points1_mat.nativeObj, points2_mat.nativeObj, mask.nativeObj, params.getNativeObjAddr()));
    }


    //
    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method = RANSAC, double prob = 0.999, double threshold = 1.0, int maxIters = 1000, Mat& mask = Mat())
    //

    /**
     * Calculates an essential matrix from the corresponding points in two images.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix. If this assumption does not hold for your use case, use another
     * function overload or #undistortPoints with {@code P = cv::NoArray()} for both cameras to transform image
     * points to normalized image coordinates, which are valid for the identity camera intrinsic matrix.
     * When passing these coordinates, pass the identity matrix for this parameter.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param mask Output array of N elements, every element of which is set to 0 for outliers and to 1
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     * @param maxIters The maximum number of robust method iterations.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob, double threshold, int maxIters, Mat mask) {
        return new Mat(findEssentialMat_0(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob, threshold, maxIters, mask.nativeObj));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix. If this assumption does not hold for your use case, use another
     * function overload or #undistortPoints with {@code P = cv::NoArray()} for both cameras to transform image
     * points to normalized image coordinates, which are valid for the identity camera intrinsic matrix.
     * When passing these coordinates, pass the identity matrix for this parameter.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     * @param maxIters The maximum number of robust method iterations.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob, double threshold, int maxIters) {
        return new Mat(findEssentialMat_1(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob, threshold, maxIters));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix. If this assumption does not hold for your use case, use another
     * function overload or #undistortPoints with {@code P = cv::NoArray()} for both cameras to transform image
     * points to normalized image coordinates, which are valid for the identity camera intrinsic matrix.
     * When passing these coordinates, pass the identity matrix for this parameter.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob, double threshold) {
        return new Mat(findEssentialMat_2(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob, threshold));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix. If this assumption does not hold for your use case, use another
     * function overload or #undistortPoints with {@code P = cv::NoArray()} for both cameras to transform image
     * points to normalized image coordinates, which are valid for the identity camera intrinsic matrix.
     * When passing these coordinates, pass the identity matrix for this parameter.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method, double prob) {
        return new Mat(findEssentialMat_3(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method, prob));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix. If this assumption does not hold for your use case, use another
     * function overload or #undistortPoints with {@code P = cv::NoArray()} for both cameras to transform image
     * points to normalized image coordinates, which are valid for the identity camera intrinsic matrix.
     * When passing these coordinates, pass the identity matrix for this parameter.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method) {
        return new Mat(findEssentialMat_4(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, method));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix. If this assumption does not hold for your use case, use another
     * function overload or #undistortPoints with {@code P = cv::NoArray()} for both cameras to transform image
     * points to normalized image coordinates, which are valid for the identity camera intrinsic matrix.
     * When passing these coordinates, pass the identity matrix for this parameter.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix) {
        return new Mat(findEssentialMat_5(points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj));
    }


    //
    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, double focal = 1.0, Point2d pp = Point2d(0, 0), int method = RANSAC, double prob = 0.999, double threshold = 1.0, int maxIters = 1000, Mat& mask = Mat())
    //

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param mask Output array of N elements, every element of which is set to 0 for outliers and to 1
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     * @param maxIters The maximum number of robust method iterations.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob, double threshold, int maxIters, Mat mask) {
        return new Mat(findEssentialMat_6(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob, threshold, maxIters, mask.nativeObj));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     * @param maxIters The maximum number of robust method iterations.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob, double threshold, int maxIters) {
        return new Mat(findEssentialMat_7(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob, threshold, maxIters));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob, double threshold) {
        return new Mat(findEssentialMat_8(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob, threshold));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method, double prob) {
        return new Mat(findEssentialMat_9(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method, prob));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * @param method Method for computing a fundamental matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp, int method) {
        return new Mat(findEssentialMat_10(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y, method));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal, Point pp) {
        return new Mat(findEssentialMat_11(points1.nativeObj, points2.nativeObj, focal, pp.x, pp.y));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param focal focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, double focal) {
        return new Mat(findEssentialMat_12(points1.nativeObj, points2.nativeObj, focal));
    }

    /**
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * are feature points from cameras with same focal length and principal point.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * confidence (probability) that the estimated matrix is correct.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2) {
        return new Mat(findEssentialMat_13(points1.nativeObj, points2.nativeObj));
    }


    //
    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method = RANSAC, double prob = 0.999, double threshold = 1.0, Mat& mask = Mat())
    //

    /**
     * Calculates an essential matrix from the corresponding points in two images from potentially two different cameras.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix1 Camera matrix for the first camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param cameraMatrix2 Camera matrix for the second camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs1 Input vector of distortion coefficients for the first camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param distCoeffs2 Input vector of distortion coefficients for the second camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param mask Output array of N elements, every element of which is set to 0 for outliers and to 1
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or  #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method, double prob, double threshold, Mat mask) {
        return new Mat(findEssentialMat_14(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method, prob, threshold, mask.nativeObj));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images from potentially two different cameras.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix1 Camera matrix for the first camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param cameraMatrix2 Camera matrix for the second camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs1 Input vector of distortion coefficients for the first camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param distCoeffs2 Input vector of distortion coefficients for the second camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or  #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method, double prob, double threshold) {
        return new Mat(findEssentialMat_15(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method, prob, threshold));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images from potentially two different cameras.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix1 Camera matrix for the first camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param cameraMatrix2 Camera matrix for the second camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs1 Input vector of distortion coefficients for the first camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param distCoeffs2 Input vector of distortion coefficients for the second camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or  #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method, double prob) {
        return new Mat(findEssentialMat_16(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method, prob));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images from potentially two different cameras.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix1 Camera matrix for the first camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param cameraMatrix2 Camera matrix for the second camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs1 Input vector of distortion coefficients for the first camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param distCoeffs2 Input vector of distortion coefficients for the second camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or  #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method) {
        return new Mat(findEssentialMat_17(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, method));
    }

    /**
     * Calculates an essential matrix from the corresponding points in two images from potentially two different cameras.
     *
     * @param points1 Array of N (N &gt;= 5) 2D points from the first image. The point coordinates should
     * be floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix1 Camera matrix for the first camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param cameraMatrix2 Camera matrix for the second camera \(K = \vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs1 Input vector of distortion coefficients for the first camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param distCoeffs2 Input vector of distortion coefficients for the second camera
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * for the other points. The array is computed only in the RANSAC and LMedS methods.
     *
     * This function estimates essential matrix based on the five-point algorithm solver in CITE: Nister03 .
     * CITE: SteweniusCFS is also a related. The epipolar geometry is described by the following equation:
     *
     * \([p_2; 1]^T K^{-T} E K^{-1} [p_1; 1] = 0\)
     *
     * where \(E\) is an essential matrix, \(p_1\) and \(p_2\) are corresponding points in the first and the
     * second images, respectively. The result of this function may be passed further to
     * #decomposeEssentialMat or  #recoverPose to recover the relative pose between cameras.
     * @return automatically generated
     */
    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2) {
        return new Mat(findEssentialMat_18(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj));
    }


    //
    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat cameraMatrix2, Mat dist_coeff1, Mat dist_coeff2, Mat& mask, UsacParams params)
    //

    public static Mat findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat cameraMatrix2, Mat dist_coeff1, Mat dist_coeff2, Mat mask, UsacParams params) {
        return new Mat(findEssentialMat_19(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, cameraMatrix2.nativeObj, dist_coeff1.nativeObj, dist_coeff2.nativeObj, mask.nativeObj, params.getNativeObjAddr()));
    }


    //
    // C++:  void cv::decomposeEssentialMat(Mat E, Mat& R1, Mat& R2, Mat& t)
    //

    /**
     * Decompose an essential matrix to possible rotations and translation.
     *
     * @param E The input essential matrix.
     * @param R1 One possible rotation matrix.
     * @param R2 Another possible rotation matrix.
     * @param t One possible translation.
     *
     * This function decomposes the essential matrix E using svd decomposition CITE: HartleyZ00. In
     * general, four possible poses exist for the decomposition of E. They are \([R_1, t]\),
     * \([R_1, -t]\), \([R_2, t]\), \([R_2, -t]\).
     *
     * If E gives the epipolar constraint \([p_2; 1]^T A^{-T} E A^{-1} [p_1; 1] = 0\) between the image
     * points \(p_1\) in the first image and \(p_2\) in second image, then any of the tuples
     * \([R_1, t]\), \([R_1, -t]\), \([R_2, t]\), \([R_2, -t]\) is a change of basis from the first
     * camera's coordinate system to the second camera's coordinate system. However, by decomposing E, one
     * can only get the direction of the translation. For this reason, the translation t is returned with
     * unit length.
     */
    public static void decomposeEssentialMat(Mat E, Mat R1, Mat R2, Mat t) {
        decomposeEssentialMat_0(E.nativeObj, R1.nativeObj, R2.nativeObj, t.nativeObj);
    }


    //
    // C++:  int cv::recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat& E, Mat& R, Mat& t, int method = cv::RANSAC, double prob = 0.999, double threshold = 1.0, Mat& mask = Mat())
    //

    /**
     * Recovers the relative camera rotation and the translation from corresponding points in two images from two different cameras, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix1 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs1 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param cameraMatrix2 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs2 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param E The output essential matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * @param mask Input/output mask for inliers in points1 and points2. If it is not empty, then it marks
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for findEssentialMat.:
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // Input: camera calibration of both cameras, for example using intrinsic chessboard calibration.
     *     Mat cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2;
     *
     *     // Output: Essential matrix, relative rotation and relative translation.
     *     Mat E, R, t, mask;
     *
     *     recoverPose(points1, points2, cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2, E, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method, double prob, double threshold, Mat mask) {
        return recoverPose_0(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method, prob, threshold, mask.nativeObj);
    }

    /**
     * Recovers the relative camera rotation and the translation from corresponding points in two images from two different cameras, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix1 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs1 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param cameraMatrix2 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs2 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param E The output essential matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * @param threshold Parameter used for RANSAC. It is the maximum distance from a point to an epipolar
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for findEssentialMat.:
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // Input: camera calibration of both cameras, for example using intrinsic chessboard calibration.
     *     Mat cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2;
     *
     *     // Output: Essential matrix, relative rotation and relative translation.
     *     Mat E, R, t, mask;
     *
     *     recoverPose(points1, points2, cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2, E, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method, double prob, double threshold) {
        return recoverPose_1(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method, prob, threshold);
    }

    /**
     * Recovers the relative camera rotation and the translation from corresponding points in two images from two different cameras, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix1 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs1 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param cameraMatrix2 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs2 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param E The output essential matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * @param prob Parameter used for the RANSAC or LMedS methods only. It specifies a desirable level of
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for findEssentialMat.:
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // Input: camera calibration of both cameras, for example using intrinsic chessboard calibration.
     *     Mat cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2;
     *
     *     // Output: Essential matrix, relative rotation and relative translation.
     *     Mat E, R, t, mask;
     *
     *     recoverPose(points1, points2, cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2, E, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method, double prob) {
        return recoverPose_2(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method, prob);
    }

    /**
     * Recovers the relative camera rotation and the translation from corresponding points in two images from two different cameras, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix1 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs1 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param cameraMatrix2 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs2 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param E The output essential matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param method Method for computing an essential matrix.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for findEssentialMat.:
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // Input: camera calibration of both cameras, for example using intrinsic chessboard calibration.
     *     Mat cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2;
     *
     *     // Output: Essential matrix, relative rotation and relative translation.
     *     Mat E, R, t, mask;
     *
     *     recoverPose(points1, points2, cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2, E, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t, int method) {
        return recoverPose_3(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj, method);
    }

    /**
     * Recovers the relative camera rotation and the translation from corresponding points in two images from two different cameras, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix1 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs1 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param cameraMatrix2 Input/output camera matrix for the first camera, the same as in
     * REF: calibrateCamera. Furthermore, for the stereo case, additional flags may be used, see below.
     * @param distCoeffs2 Input/output vector of distortion coefficients, the same as in
     * REF: calibrateCamera.
     * @param E The output essential matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * <ul>
     *   <li>
     *    REF: RANSAC for the RANSAC algorithm.
     *   </li>
     *   <li>
     *    REF: LMEDS for the LMedS algorithm.
     *   </li>
     * </ul>
     * confidence (probability) that the estimated matrix is correct.
     * line in pixels, beyond which the point is considered an outlier and is not used for computing the
     * final fundamental matrix. It can be set to something like 1-3, depending on the accuracy of the
     * point localization, image resolution, and the image noise.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for findEssentialMat.:
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // Input: camera calibration of both cameras, for example using intrinsic chessboard calibration.
     *     Mat cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2;
     *
     *     // Output: Essential matrix, relative rotation and relative translation.
     *     Mat E, R, t, mask;
     *
     *     recoverPose(points1, points2, cameraMatrix1, distCoeffs1, cameraMatrix2, distCoeffs2, E, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat E, Mat R, Mat t) {
        return recoverPose_4(points1.nativeObj, points2.nativeObj, cameraMatrix1.nativeObj, distCoeffs1.nativeObj, cameraMatrix2.nativeObj, distCoeffs2.nativeObj, E.nativeObj, R.nativeObj, t.nativeObj);
    }


    //
    // C++:  int cv::recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat& R, Mat& t, Mat& mask = Mat())
    //

    /**
     * Recovers the relative camera rotation and the translation from an estimated essential
     * matrix and the corresponding points in two images, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param mask Input/output mask for inliers in points1 and points2. If it is not empty, then it marks
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for #findEssentialMat :
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // cametra matrix with both focal lengths = 1, and principal point = (0, 0)
     *     Mat cameraMatrix = Mat::eye(3, 3, CV_64F);
     *
     *     Mat E, R, t, mask;
     *
     *     E = findEssentialMat(points1, points2, cameraMatrix, RANSAC, 0.999, 1.0, mask);
     *     recoverPose(E, points1, points2, cameraMatrix, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, Mat mask) {
        return recoverPose_5(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, mask.nativeObj);
    }

    /**
     * Recovers the relative camera rotation and the translation from an estimated essential
     * matrix and the corresponding points in two images, using chirality check. Returns the number of
     * inliers that pass the check.
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * described below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function decomposes an essential matrix using REF: decomposeEssentialMat and then verifies
     * possible pose hypotheses by doing chirality check. The chirality check means that the
     * triangulated 3D points should have positive depth. Some details can be found in CITE: Nister03.
     *
     * This function can be used to process the output E and mask from REF: findEssentialMat. In this
     * scenario, points1 and points2 are the same input for #findEssentialMat :
     * <code>
     *     // Example. Estimation of fundamental matrix using the RANSAC algorithm
     *     int point_count = 100;
     *     vector&lt;Point2f&gt; points1(point_count);
     *     vector&lt;Point2f&gt; points2(point_count);
     *
     *     // initialize the points here ...
     *     for( int i = 0; i &lt; point_count; i++ )
     *     {
     *         points1[i] = ...;
     *         points2[i] = ...;
     *     }
     *
     *     // cametra matrix with both focal lengths = 1, and principal point = (0, 0)
     *     Mat cameraMatrix = Mat::eye(3, 3, CV_64F);
     *
     *     Mat E, R, t, mask;
     *
     *     E = findEssentialMat(points1, points2, cameraMatrix, RANSAC, 0.999, 1.0, mask);
     *     recoverPose(E, points1, points2, cameraMatrix, R, t, mask);
     * </code>
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t) {
        return recoverPose_6(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj);
    }


    //
    // C++:  int cv::recoverPose(Mat E, Mat points1, Mat points2, Mat& R, Mat& t, double focal = 1.0, Point2d pp = Point2d(0, 0), Mat& mask = Mat())
    //

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param focal Focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * @param mask Input/output mask for inliers in points1 and points2. If it is not empty, then it marks
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t, double focal, Point pp, Mat mask) {
        return recoverPose_7(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj, focal, pp.x, pp.y, mask.nativeObj);
    }

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param focal Focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * @param pp principal point of the camera.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t, double focal, Point pp) {
        return recoverPose_8(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj, focal, pp.x, pp.y);
    }

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param focal Focal length of the camera. Note that this function assumes that points1 and points2
     * are feature points from cameras with same focal length and principal point.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t, double focal) {
        return recoverPose_9(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj, focal);
    }

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1 .
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * are feature points from cameras with same focal length and principal point.
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function differs from the one above that it computes camera intrinsic matrix from focal length and
     * principal point:
     *
     * \(A =
     * \begin{bmatrix}
     * f &amp; 0 &amp; x_{pp}  \\
     * 0 &amp; f &amp; y_{pp}  \\
     * 0 &amp; 0 &amp; 1
     * \end{bmatrix}\)
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat R, Mat t) {
        return recoverPose_10(E.nativeObj, points1.nativeObj, points2.nativeObj, R.nativeObj, t.nativeObj);
    }


    //
    // C++:  int cv::recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat& R, Mat& t, double distanceThresh, Mat& mask = Mat(), Mat& triangulatedPoints = Mat())
    //

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param distanceThresh threshold distance which is used to filter out far away points (i.e. infinite
     * points).
     * @param mask Input/output mask for inliers in points1 and points2. If it is not empty, then it marks
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     * @param triangulatedPoints 3D points which were reconstructed by triangulation.
     *
     * This function differs from the one above that it outputs the triangulated 3D point that are used for
     * the chirality check.
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, double distanceThresh, Mat mask, Mat triangulatedPoints) {
        return recoverPose_11(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, distanceThresh, mask.nativeObj, triangulatedPoints.nativeObj);
    }

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param distanceThresh threshold distance which is used to filter out far away points (i.e. infinite
     * points).
     * @param mask Input/output mask for inliers in points1 and points2. If it is not empty, then it marks
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function differs from the one above that it outputs the triangulated 3D point that are used for
     * the chirality check.
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, double distanceThresh, Mat mask) {
        return recoverPose_12(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, distanceThresh, mask.nativeObj);
    }

    /**
     *
     * @param E The input essential matrix.
     * @param points1 Array of N 2D points from the first image. The point coordinates should be
     * floating-point (single or double precision).
     * @param points2 Array of the second image points of the same size and format as points1.
     * @param cameraMatrix Camera intrinsic matrix \(\cameramatrix{A}\) .
     * Note that this function assumes that points1 and points2 are feature points from cameras with the
     * same camera intrinsic matrix.
     * @param R Output rotation matrix. Together with the translation vector, this matrix makes up a tuple
     * that performs a change of basis from the first camera's coordinate system to the second camera's
     * coordinate system. Note that, in general, t can not be used for this tuple, see the parameter
     * description below.
     * @param t Output translation vector. This vector is obtained by REF: decomposeEssentialMat and
     * therefore is only known up to scale, i.e. t is the direction of the translation vector and has unit
     * length.
     * @param distanceThresh threshold distance which is used to filter out far away points (i.e. infinite
     * points).
     * inliers in points1 and points2 for the given essential matrix E. Only these inliers will be used to
     * recover pose. In the output mask only inliers which pass the chirality check.
     *
     * This function differs from the one above that it outputs the triangulated 3D point that are used for
     * the chirality check.
     * @return automatically generated
     */
    public static int recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat R, Mat t, double distanceThresh) {
        return recoverPose_13(E.nativeObj, points1.nativeObj, points2.nativeObj, cameraMatrix.nativeObj, R.nativeObj, t.nativeObj, distanceThresh);
    }


    //
    // C++:  void cv::computeCorrespondEpilines(Mat points, int whichImage, Mat F, Mat& lines)
    //

    /**
     * For points in an image of a stereo pair, computes the corresponding epilines in the other image.
     *
     * @param points Input points. \(N \times 1\) or \(1 \times N\) matrix of type CV_32FC2 or
     * vector&lt;Point2f&gt; .
     * @param whichImage Index of the image (1 or 2) that contains the points .
     * @param F Fundamental matrix that can be estimated using #findFundamentalMat or #stereoRectify .
     * @param lines Output vector of the epipolar lines corresponding to the points in the other image.
     * Each line \(ax + by + c=0\) is encoded by 3 numbers \((a, b, c)\) .
     *
     * For every point in one of the two images of a stereo pair, the function finds the equation of the
     * corresponding epipolar line in the other image.
     *
     * From the fundamental matrix definition (see #findFundamentalMat ), line \(l^{(2)}_i\) in the second
     * image for the point \(p^{(1)}_i\) in the first image (when whichImage=1 ) is computed as:
     *
     * \(l^{(2)}_i = F p^{(1)}_i\)
     *
     * And vice versa, when whichImage=2, \(l^{(1)}_i\) is computed from \(p^{(2)}_i\) as:
     *
     * \(l^{(1)}_i = F^T p^{(2)}_i\)
     *
     * Line coefficients are defined up to a scale. They are normalized so that \(a_i^2+b_i^2=1\) .
     */
    public static void computeCorrespondEpilines(Mat points, int whichImage, Mat F, Mat lines) {
        computeCorrespondEpilines_0(points.nativeObj, whichImage, F.nativeObj, lines.nativeObj);
    }


    //
    // C++:  void cv::triangulatePoints(Mat projMatr1, Mat projMatr2, Mat projPoints1, Mat projPoints2, Mat& points4D)
    //

    /**
     * This function reconstructs 3-dimensional points (in homogeneous coordinates) by using
     * their observations with a stereo camera.
     *
     * @param projMatr1 3x4 projection matrix of the first camera, i.e. this matrix projects 3D points
     * given in the world's coordinate system into the first image.
     * @param projMatr2 3x4 projection matrix of the second camera, i.e. this matrix projects 3D points
     * given in the world's coordinate system into the second image.
     * @param projPoints1 2xN array of feature points in the first image. In the case of the c++ version,
     * it can be also a vector of feature points or two-channel matrix of size 1xN or Nx1.
     * @param projPoints2 2xN array of corresponding points in the second image. In the case of the c++
     * version, it can be also a vector of feature points or two-channel matrix of size 1xN or Nx1.
     * @param points4D 4xN array of reconstructed points in homogeneous coordinates. These points are
     * returned in the world's coordinate system.
     *
     * <b>Note:</b>
     *    Keep in mind that all input data should be of float type in order for this function to work.
     *
     * <b>Note:</b>
     *    If the projection matrices from REF: stereoRectify are used, then the returned points are
     *    represented in the first camera's rectified coordinate system.
     *
     * SEE:
     *    reprojectImageTo3D
     */
    public static void triangulatePoints(Mat projMatr1, Mat projMatr2, Mat projPoints1, Mat projPoints2, Mat points4D) {
        triangulatePoints_0(projMatr1.nativeObj, projMatr2.nativeObj, projPoints1.nativeObj, projPoints2.nativeObj, points4D.nativeObj);
    }


    //
    // C++:  void cv::correctMatches(Mat F, Mat points1, Mat points2, Mat& newPoints1, Mat& newPoints2)
    //

    /**
     * Refines coordinates of corresponding points.
     *
     * @param F 3x3 fundamental matrix.
     * @param points1 1xN array containing the first set of points.
     * @param points2 1xN array containing the second set of points.
     * @param newPoints1 The optimized points1.
     * @param newPoints2 The optimized points2.
     *
     * The function implements the Optimal Triangulation Method (see Multiple View Geometry CITE: HartleyZ00 for details).
     * For each given point correspondence points1[i] &lt;-&gt; points2[i], and a fundamental matrix F, it
     * computes the corrected correspondences newPoints1[i] &lt;-&gt; newPoints2[i] that minimize the geometric
     * error \(d(points1[i], newPoints1[i])^2 + d(points2[i],newPoints2[i])^2\) (where \(d(a,b)\) is the
     * geometric distance between points \(a\) and \(b\) ) subject to the epipolar constraint
     * \(newPoints2^T \cdot F \cdot newPoints1 = 0\) .
     */
    public static void correctMatches(Mat F, Mat points1, Mat points2, Mat newPoints1, Mat newPoints2) {
        correctMatches_0(F.nativeObj, points1.nativeObj, points2.nativeObj, newPoints1.nativeObj, newPoints2.nativeObj);
    }


    //
    // C++:  double cv::sampsonDistance(Mat pt1, Mat pt2, Mat F)
    //

    /**
     * Calculates the Sampson Distance between two points.
     *
     * The function cv::sampsonDistance calculates and returns the first order approximation of the geometric error as:
     * \(
     * sd( \texttt{pt1} , \texttt{pt2} )=
     * \frac{(\texttt{pt2}^t \cdot \texttt{F} \cdot \texttt{pt1})^2}
     * {((\texttt{F} \cdot \texttt{pt1})(0))^2 +
     * ((\texttt{F} \cdot \texttt{pt1})(1))^2 +
     * ((\texttt{F}^t \cdot \texttt{pt2})(0))^2 +
     * ((\texttt{F}^t \cdot \texttt{pt2})(1))^2}
     * \)
     * The fundamental matrix may be calculated using the #findFundamentalMat function. See CITE: HartleyZ00 11.4.3 for details.
     * @param pt1 first homogeneous 2d point
     * @param pt2 second homogeneous 2d point
     * @param F fundamental matrix
     * @return The computed Sampson distance.
     */
    public static double sampsonDistance(Mat pt1, Mat pt2, Mat F) {
        return sampsonDistance_0(pt1.nativeObj, pt2.nativeObj, F.nativeObj);
    }


    //
    // C++:  bool cv::estimateAffine3D(Mat src, Mat dst, Mat& out, Mat& inliers, double ransacThreshold = 3, double confidence = 0.99)
    //

    /**
     * Computes an optimal affine transformation between two 3D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * z\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; a_{13}\\
     * a_{21} &amp; a_{22} &amp; a_{23}\\
     * a_{31} &amp; a_{32} &amp; a_{33}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * Z\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * b_3\\
     * \end{bmatrix}
     * \)
     *
     * @param src First input 3D point set containing \((X,Y,Z)\).
     * @param dst Second input 3D point set containing \((x,y,z)\).
     * @param out Output 3D affine transformation matrix \(3 \times 4\) of the form
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; a_{13} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; a_{23} &amp; b_2\\
     * a_{31} &amp; a_{32} &amp; a_{33} &amp; b_3\\
     * \end{bmatrix}
     * \)
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param ransacThreshold Maximum reprojection error in the RANSAC algorithm to consider a point as
     * an inlier.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     *
     * @return Whether a solution was found.
     *
     * The function estimates an optimal 3D affine transformation between two 3D point sets using the
     * RANSAC algorithm.
     */
    public static boolean estimateAffine3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold, double confidence) {
        return estimateAffine3D_0(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold, confidence);
    }

    /**
     * Computes an optimal affine transformation between two 3D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * z\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; a_{13}\\
     * a_{21} &amp; a_{22} &amp; a_{23}\\
     * a_{31} &amp; a_{32} &amp; a_{33}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * Z\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * b_3\\
     * \end{bmatrix}
     * \)
     *
     * @param src First input 3D point set containing \((X,Y,Z)\).
     * @param dst Second input 3D point set containing \((x,y,z)\).
     * @param out Output 3D affine transformation matrix \(3 \times 4\) of the form
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; a_{13} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; a_{23} &amp; b_2\\
     * a_{31} &amp; a_{32} &amp; a_{33} &amp; b_3\\
     * \end{bmatrix}
     * \)
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param ransacThreshold Maximum reprojection error in the RANSAC algorithm to consider a point as
     * an inlier.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     *
     * @return Whether a solution was found.
     *
     * The function estimates an optimal 3D affine transformation between two 3D point sets using the
     * RANSAC algorithm.
     */
    public static boolean estimateAffine3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold) {
        return estimateAffine3D_1(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold);
    }

    /**
     * Computes an optimal affine transformation between two 3D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * z\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; a_{13}\\
     * a_{21} &amp; a_{22} &amp; a_{23}\\
     * a_{31} &amp; a_{32} &amp; a_{33}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * Z\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * b_3\\
     * \end{bmatrix}
     * \)
     *
     * @param src First input 3D point set containing \((X,Y,Z)\).
     * @param dst Second input 3D point set containing \((x,y,z)\).
     * @param out Output 3D affine transformation matrix \(3 \times 4\) of the form
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; a_{13} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; a_{23} &amp; b_2\\
     * a_{31} &amp; a_{32} &amp; a_{33} &amp; b_3\\
     * \end{bmatrix}
     * \)
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * an inlier.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     *
     * @return Whether a solution was found.
     *
     * The function estimates an optimal 3D affine transformation between two 3D point sets using the
     * RANSAC algorithm.
     */
    public static boolean estimateAffine3D(Mat src, Mat dst, Mat out, Mat inliers) {
        return estimateAffine3D_2(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj);
    }


    //
    // C++:  Mat cv::estimateAffine3D(Mat src, Mat dst, double* scale = nullptr, bool force_rotation = true)
    //

    /**
     * Computes an optimal affine transformation between two 3D point sets.
     *
     * It computes \(R,s,t\) minimizing \(\sum{i} dst_i - c \cdot R \cdot src_i \)
     * where \(R\) is a 3x3 rotation matrix, \(t\) is a 3x1 translation vector and \(s\) is a
     * scalar size value. This is an implementation of the algorithm by Umeyama \cite umeyama1991least .
     * The estimated affine transform has a homogeneous scale which is a subclass of affine
     * transformations with 7 degrees of freedom. The paired point sets need to comprise at least 3
     * points each.
     *
     * @param src First input 3D point set.
     * @param dst Second input 3D point set.
     * @param scale If null is passed, the scale parameter c will be assumed to be 1.0.
     * Else the pointed-to variable will be set to the optimal scale.
     * @param force_rotation If true, the returned rotation will never be a reflection.
     * This might be unwanted, e.g. when optimizing a transform between a right- and a
     * left-handed coordinate system.
     * @return 3D affine transformation matrix \(3 \times 4\) of the form
     * \(T =
     * \begin{bmatrix}
     * R &amp; t\\
     * \end{bmatrix}
     * \)
     */
    public static Mat estimateAffine3D(Mat src, Mat dst, double[] scale, boolean force_rotation) {
        double[] scale_out = new double[1];
        Mat retVal = new Mat(estimateAffine3D_3(src.nativeObj, dst.nativeObj, scale_out, force_rotation));
        if(scale!=null) scale[0] = (double)scale_out[0];
        return retVal;
    }

    /**
     * Computes an optimal affine transformation between two 3D point sets.
     *
     * It computes \(R,s,t\) minimizing \(\sum{i} dst_i - c \cdot R \cdot src_i \)
     * where \(R\) is a 3x3 rotation matrix, \(t\) is a 3x1 translation vector and \(s\) is a
     * scalar size value. This is an implementation of the algorithm by Umeyama \cite umeyama1991least .
     * The estimated affine transform has a homogeneous scale which is a subclass of affine
     * transformations with 7 degrees of freedom. The paired point sets need to comprise at least 3
     * points each.
     *
     * @param src First input 3D point set.
     * @param dst Second input 3D point set.
     * @param scale If null is passed, the scale parameter c will be assumed to be 1.0.
     * Else the pointed-to variable will be set to the optimal scale.
     * This might be unwanted, e.g. when optimizing a transform between a right- and a
     * left-handed coordinate system.
     * @return 3D affine transformation matrix \(3 \times 4\) of the form
     * \(T =
     * \begin{bmatrix}
     * R &amp; t\\
     * \end{bmatrix}
     * \)
     */
    public static Mat estimateAffine3D(Mat src, Mat dst, double[] scale) {
        double[] scale_out = new double[1];
        Mat retVal = new Mat(estimateAffine3D_4(src.nativeObj, dst.nativeObj, scale_out));
        if(scale!=null) scale[0] = (double)scale_out[0];
        return retVal;
    }

    /**
     * Computes an optimal affine transformation between two 3D point sets.
     *
     * It computes \(R,s,t\) minimizing \(\sum{i} dst_i - c \cdot R \cdot src_i \)
     * where \(R\) is a 3x3 rotation matrix, \(t\) is a 3x1 translation vector and \(s\) is a
     * scalar size value. This is an implementation of the algorithm by Umeyama \cite umeyama1991least .
     * The estimated affine transform has a homogeneous scale which is a subclass of affine
     * transformations with 7 degrees of freedom. The paired point sets need to comprise at least 3
     * points each.
     *
     * @param src First input 3D point set.
     * @param dst Second input 3D point set.
     * Else the pointed-to variable will be set to the optimal scale.
     * This might be unwanted, e.g. when optimizing a transform between a right- and a
     * left-handed coordinate system.
     * @return 3D affine transformation matrix \(3 \times 4\) of the form
     * \(T =
     * \begin{bmatrix}
     * R &amp; t\\
     * \end{bmatrix}
     * \)
     */
    public static Mat estimateAffine3D(Mat src, Mat dst) {
        return new Mat(estimateAffine3D_5(src.nativeObj, dst.nativeObj));
    }


    //
    // C++:  bool cv::estimateTranslation3D(Mat src, Mat dst, Mat& out, Mat& inliers, double ransacThreshold = 3, double confidence = 0.99)
    //

    /**
     * Computes an optimal translation between two 3D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * z\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * X\\
     * Y\\
     * Z\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * b_3\\
     * \end{bmatrix}
     * \)
     *
     * @param src First input 3D point set containing \((X,Y,Z)\).
     * @param dst Second input 3D point set containing \((x,y,z)\).
     * @param out Output 3D translation vector \(3 \times 1\) of the form
     * \(
     * \begin{bmatrix}
     * b_1 \\
     * b_2 \\
     * b_3 \\
     * \end{bmatrix}
     * \)
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param ransacThreshold Maximum reprojection error in the RANSAC algorithm to consider a point as
     * an inlier.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     *
     * @return Whether a translation was found.
     *
     * The function estimates an optimal 3D translation between two 3D point sets using the
     * RANSAC algorithm.
     *
     */
    public static boolean estimateTranslation3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold, double confidence) {
        return estimateTranslation3D_0(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold, confidence);
    }

    /**
     * Computes an optimal translation between two 3D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * z\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * X\\
     * Y\\
     * Z\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * b_3\\
     * \end{bmatrix}
     * \)
     *
     * @param src First input 3D point set containing \((X,Y,Z)\).
     * @param dst Second input 3D point set containing \((x,y,z)\).
     * @param out Output 3D translation vector \(3 \times 1\) of the form
     * \(
     * \begin{bmatrix}
     * b_1 \\
     * b_2 \\
     * b_3 \\
     * \end{bmatrix}
     * \)
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param ransacThreshold Maximum reprojection error in the RANSAC algorithm to consider a point as
     * an inlier.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     *
     * @return Whether a translation was found.
     *
     * The function estimates an optimal 3D translation between two 3D point sets using the
     * RANSAC algorithm.
     *
     */
    public static boolean estimateTranslation3D(Mat src, Mat dst, Mat out, Mat inliers, double ransacThreshold) {
        return estimateTranslation3D_1(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj, ransacThreshold);
    }

    /**
     * Computes an optimal translation between two 3D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * z\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * X\\
     * Y\\
     * Z\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * b_3\\
     * \end{bmatrix}
     * \)
     *
     * @param src First input 3D point set containing \((X,Y,Z)\).
     * @param dst Second input 3D point set containing \((x,y,z)\).
     * @param out Output 3D translation vector \(3 \times 1\) of the form
     * \(
     * \begin{bmatrix}
     * b_1 \\
     * b_2 \\
     * b_3 \\
     * \end{bmatrix}
     * \)
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * an inlier.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     *
     * @return Whether a translation was found.
     *
     * The function estimates an optimal 3D translation between two 3D point sets using the
     * RANSAC algorithm.
     *
     */
    public static boolean estimateTranslation3D(Mat src, Mat dst, Mat out, Mat inliers) {
        return estimateTranslation3D_2(src.nativeObj, dst.nativeObj, out.nativeObj, inliers.nativeObj);
    }


    //
    // C++:  Mat cv::estimateAffine2D(Mat from, Mat to, Mat& inliers = Mat(), int method = RANSAC, double ransacReprojThreshold = 3, size_t maxIters = 2000, double confidence = 0.99, size_t refineIters = 10)
    //

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * @param refineIters Maximum number of iterations of refining algorithm (Levenberg-Marquardt).
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters) {
        return new Mat(estimateAffine2D_0(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence, refineIters));
    }

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence) {
        return new Mat(estimateAffine2D_1(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence));
    }

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters) {
        return new Mat(estimateAffine2D_2(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters));
    }

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold) {
        return new Mat(estimateAffine2D_3(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold));
    }

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers, int method) {
        return new Mat(estimateAffine2D_4(from.nativeObj, to.nativeObj, inliers.nativeObj, method));
    }

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to, Mat inliers) {
        return new Mat(estimateAffine2D_5(from.nativeObj, to.nativeObj, inliers.nativeObj));
    }

    /**
     * Computes an optimal affine transformation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y\\
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * a_{11} &amp; a_{12}\\
     * a_{21} &amp; a_{22}\\
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y\\
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * b_1\\
     * b_2\\
     * \end{bmatrix}
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation matrix \(2 \times 3\) or empty matrix if transformation
     * could not be estimated. The returned matrix has the following form:
     * \(
     * \begin{bmatrix}
     * a_{11} &amp; a_{12} &amp; b_1\\
     * a_{21} &amp; a_{22} &amp; b_2\\
     * \end{bmatrix}
     * \)
     *
     * The function estimates an optimal 2D affine transformation between two 2D point sets using the
     * selected robust algorithm.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffinePartial2D, getAffineTransform
     */
    public static Mat estimateAffine2D(Mat from, Mat to) {
        return new Mat(estimateAffine2D_6(from.nativeObj, to.nativeObj));
    }


    //
    // C++:  Mat cv::estimateAffine2D(Mat pts1, Mat pts2, Mat& inliers, UsacParams params)
    //

    public static Mat estimateAffine2D(Mat pts1, Mat pts2, Mat inliers, UsacParams params) {
        return new Mat(estimateAffine2D_7(pts1.nativeObj, pts2.nativeObj, inliers.nativeObj, params.getNativeObjAddr()));
    }


    //
    // C++:  Mat cv::estimateAffinePartial2D(Mat from, Mat to, Mat& inliers = Mat(), int method = RANSAC, double ransacReprojThreshold = 3, size_t maxIters = 2000, double confidence = 0.99, size_t refineIters = 10)
    //

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * @param inliers Output vector indicating which points are inliers.
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * @param refineIters Maximum number of iterations of refining algorithm (Levenberg-Marquardt).
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters) {
        return new Mat(estimateAffinePartial2D_0(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence, refineIters));
    }

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * @param inliers Output vector indicating which points are inliers.
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence) {
        return new Mat(estimateAffinePartial2D_1(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence));
    }

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * @param inliers Output vector indicating which points are inliers.
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters) {
        return new Mat(estimateAffinePartial2D_2(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters));
    }

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * @param inliers Output vector indicating which points are inliers.
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold) {
        return new Mat(estimateAffinePartial2D_3(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold));
    }

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * @param inliers Output vector indicating which points are inliers.
     * @param method Robust method used to compute transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers, int method) {
        return new Mat(estimateAffinePartial2D_4(from.nativeObj, to.nativeObj, inliers.nativeObj, method));
    }

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * @param inliers Output vector indicating which points are inliers.
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to, Mat inliers) {
        return new Mat(estimateAffinePartial2D_5(from.nativeObj, to.nativeObj, inliers.nativeObj));
    }

    /**
     * Computes an optimal limited affine transformation with 4 degrees of freedom between
     * two 2D point sets.
     *
     * @param from First input 2D point set.
     * @param to Second input 2D point set.
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8-0.9 can result in an incorrectly estimated transformation.
     * Passing 0 will disable refining, so the output matrix will be output of robust method.
     *
     * @return Output 2D affine transformation (4 degrees of freedom) matrix \(2 \times 3\) or
     * empty matrix if transformation could not be estimated.
     *
     * The function estimates an optimal 2D affine transformation with 4 degrees of freedom limited to
     * combinations of translation, rotation, and uniform scaling. Uses the selected algorithm for robust
     * estimation.
     *
     * The computed transformation is then refined further (using only inliers) with the
     * Levenberg-Marquardt method to reduce the re-projection error even more.
     *
     * Estimated transformation matrix is:
     * \( \begin{bmatrix} \cos(\theta) \cdot s &amp; -\sin(\theta) \cdot s &amp; t_x \\
     *                 \sin(\theta) \cdot s &amp; \cos(\theta) \cdot s &amp; t_y
     * \end{bmatrix} \)
     * Where \( \theta \) is the rotation angle, \( s \) the scaling factor and \( t_x, t_y \) are
     * translations in \( x, y \) axes respectively.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but need a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but it works
     * correctly only when there are more than 50% of inliers.
     *
     * SEE: estimateAffine2D, getAffineTransform
     */
    public static Mat estimateAffinePartial2D(Mat from, Mat to) {
        return new Mat(estimateAffinePartial2D_6(from.nativeObj, to.nativeObj));
    }


    //
    // C++:  Vec2d cv::estimateTranslation2D(Mat from, Mat to, Mat& inliers = Mat(), int method = RANSAC, double ransacReprojThreshold = 3, size_t maxIters = 2000, double confidence = 0.99, size_t refineIters = 0)
    //

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute the transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * @param refineIters Maximum number of iterations of the refining algorithm. For pure translation
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters) {
        return estimateTranslation2D_0(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence, refineIters);
    }

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute the transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * @param confidence Confidence level, between 0 and 1, for the estimated transformation. Anything
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters, double confidence) {
        return estimateTranslation2D_1(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters, confidence);
    }

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute the transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * @param maxIters The maximum number of robust method iterations.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold, long maxIters) {
        return estimateTranslation2D_2(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold, maxIters);
    }

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute the transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * @param ransacReprojThreshold Maximum reprojection error in the RANSAC algorithm to consider
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to, Mat inliers, int method, double ransacReprojThreshold) {
        return estimateTranslation2D_3(from.nativeObj, to.nativeObj, inliers.nativeObj, method, ransacReprojThreshold);
    }

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * @param method Robust method used to compute the transformation. The following methods are possible:
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to, Mat inliers, int method) {
        return estimateTranslation2D_4(from.nativeObj, to.nativeObj, inliers.nativeObj, method);
    }

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * @param inliers Output vector indicating which points are inliers (1-inlier, 0-outlier).
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to, Mat inliers) {
        return estimateTranslation2D_5(from.nativeObj, to.nativeObj, inliers.nativeObj);
    }

    /**
     * Computes a pure 2D translation between two 2D point sets.
     *
     * It computes
     * \(
     * \begin{bmatrix}
     * x\\
     * y
     * \end{bmatrix}
     * =
     * \begin{bmatrix}
     * 1 &amp; 0\\
     * 0 &amp; 1
     * \end{bmatrix}
     * \begin{bmatrix}
     * X\\
     * Y
     * \end{bmatrix}
     * +
     * \begin{bmatrix}
     * t_x\\
     * t_y
     * \end{bmatrix}.
     * \)
     *
     * @param from First input 2D point set containing \((X,Y)\).
     * @param to Second input 2D point set containing \((x,y)\).
     * <ul>
     *   <li>
     *    REF: RANSAC - RANSAC-based robust method
     *   </li>
     *   <li>
     *    REF: LMEDS - Least-Median robust method
     * RANSAC is the default method.
     *   </li>
     * </ul>
     * a point as an inlier. Applies only to RANSAC.
     * between 0.95 and 0.99 is usually good enough. Values too close to 1 can slow down the estimation
     * significantly. Values lower than 0.8–0.9 can result in an incorrectly estimated transformation.
     * the least-squares solution on inliers is closed-form, so passing 0 is recommended (no additional refine).
     *
     * @return A 2D translation vector \([t_x, t_y]^T\) as {@code cv::Vec2d}. If the translation could not be
     * estimated, both components are set to NaN and, if {@code inliers} is provided, the mask is filled with zeros.
     *
     * \par Converting to a 2x3 transformation matrix:
     * \(
     * \begin{bmatrix}
     * 1 &amp; 0 &amp; t_x\\
     * 0 &amp; 1 &amp; t_y
     * \end{bmatrix}
     * \)
     *
     * <code>
     * cv::Vec2d t = cv::estimateTranslation2D(from, to, inliers);
     * cv::Mat T = (cv::Mat_&lt;double&gt;(2,3) &lt;&lt; 1,0,t[0], 0,1,t[1]);
     * </code>
     *
     * The function estimates a pure 2D translation between two 2D point sets using the selected robust
     * algorithm. Inliers are determined by the reprojection error threshold.
     *
     * <b>Note:</b>
     * The RANSAC method can handle practically any ratio of outliers but needs a threshold to
     * distinguish inliers from outliers. The method LMeDS does not need any threshold but works
     * correctly only when there are more than 50% inliers.
     *
     * SEE: estimateAffine2D, estimateAffinePartial2D, getAffineTransform
     */
    public static double[] estimateTranslation2D(Mat from, Mat to) {
        return estimateTranslation2D_6(from.nativeObj, to.nativeObj);
    }


    //
    // C++:  int cv::decomposeHomographyMat(Mat H, Mat K, vector_Mat& rotations, vector_Mat& translations, vector_Mat& normals)
    //

    /**
     * Decompose a homography matrix to rotation(s), translation(s) and plane normal(s).
     *
     * @param H The input homography matrix between two images.
     * @param K The input camera intrinsic matrix.
     * @param rotations Array of rotation matrices.
     * @param translations Array of translation matrices.
     * @param normals Array of plane normal matrices.
     *
     * This function extracts relative camera motion between two views of a planar object and returns up to
     * four mathematical solution tuples of rotation, translation, and plane normal. The decomposition of
     * the homography matrix H is described in detail in CITE: Malis2007.
     *
     * If the homography H, induced by the plane, gives the constraint
     * \(s_i \vecthree{x'_i}{y'_i}{1} \sim H \vecthree{x_i}{y_i}{1}\) on the source image points
     * \(p_i\) and the destination image points \(p'_i\), then the tuple of rotations[k] and
     * translations[k] is a change of basis from the source camera's coordinate system to the destination
     * camera's coordinate system. However, by decomposing H, one can only get the translation normalized
     * by the (typically unknown) depth of the scene, i.e. its direction but with normalized length.
     *
     * If point correspondences are available, at least two solutions may further be invalidated, by
     * applying positive depth constraint, i.e. all points must be in front of the camera.
     * @return automatically generated
     */
    public static int decomposeHomographyMat(Mat H, Mat K, List<Mat> rotations, List<Mat> translations, List<Mat> normals) {
        Mat rotations_mat = new Mat();
        Mat translations_mat = new Mat();
        Mat normals_mat = new Mat();
        int retVal = decomposeHomographyMat_0(H.nativeObj, K.nativeObj, rotations_mat.nativeObj, translations_mat.nativeObj, normals_mat.nativeObj);
        Converters.Mat_to_vector_Mat(rotations_mat, rotations);
        rotations_mat.release();
        Converters.Mat_to_vector_Mat(translations_mat, translations);
        translations_mat.release();
        Converters.Mat_to_vector_Mat(normals_mat, normals);
        normals_mat.release();
        return retVal;
    }


    //
    // C++:  void cv::filterHomographyDecompByVisibleRefpoints(vector_Mat rotations, vector_Mat normals, Mat beforePoints, Mat afterPoints, Mat& possibleSolutions, Mat pointsMask = Mat())
    //

    /**
     * Filters homography decompositions based on additional information.
     *
     * @param rotations Vector of rotation matrices.
     * @param normals Vector of plane normal matrices.
     * @param beforePoints Vector of (rectified) visible reference points before the homography is applied
     * @param afterPoints Vector of (rectified) visible reference points after the homography is applied
     * @param possibleSolutions Vector of int indices representing the viable solution set after filtering
     * @param pointsMask optional Mat/Vector of CV_8U, CV_8S or CV_Bool type representing the mask for the inliers
     * as given by the #findHomography function
     *
     * This function is intended to filter the output of the #decomposeHomographyMat based on additional
     * information as described in CITE: Malis2007 . The summary of the method: the #decomposeHomographyMat function
     * returns 2 unique solutions and their "opposites" for a total of 4 solutions. If we have access to the
     * sets of points visible in the camera frame before and after the homography transformation is applied,
     * we can determine which are the true potential solutions and which are the opposites by verifying which
     * homographies are consistent with all visible reference points being in front of the camera. The inputs
     * are left unchanged; the filtered solution set is returned as indices into the existing one.
     */
    public static void filterHomographyDecompByVisibleRefpoints(List<Mat> rotations, List<Mat> normals, Mat beforePoints, Mat afterPoints, Mat possibleSolutions, Mat pointsMask) {
        Mat rotations_mat = Converters.vector_Mat_to_Mat(rotations);
        Mat normals_mat = Converters.vector_Mat_to_Mat(normals);
        filterHomographyDecompByVisibleRefpoints_0(rotations_mat.nativeObj, normals_mat.nativeObj, beforePoints.nativeObj, afterPoints.nativeObj, possibleSolutions.nativeObj, pointsMask.nativeObj);
    }

    /**
     * Filters homography decompositions based on additional information.
     *
     * @param rotations Vector of rotation matrices.
     * @param normals Vector of plane normal matrices.
     * @param beforePoints Vector of (rectified) visible reference points before the homography is applied
     * @param afterPoints Vector of (rectified) visible reference points after the homography is applied
     * @param possibleSolutions Vector of int indices representing the viable solution set after filtering
     * as given by the #findHomography function
     *
     * This function is intended to filter the output of the #decomposeHomographyMat based on additional
     * information as described in CITE: Malis2007 . The summary of the method: the #decomposeHomographyMat function
     * returns 2 unique solutions and their "opposites" for a total of 4 solutions. If we have access to the
     * sets of points visible in the camera frame before and after the homography transformation is applied,
     * we can determine which are the true potential solutions and which are the opposites by verifying which
     * homographies are consistent with all visible reference points being in front of the camera. The inputs
     * are left unchanged; the filtered solution set is returned as indices into the existing one.
     */
    public static void filterHomographyDecompByVisibleRefpoints(List<Mat> rotations, List<Mat> normals, Mat beforePoints, Mat afterPoints, Mat possibleSolutions) {
        Mat rotations_mat = Converters.vector_Mat_to_Mat(rotations);
        Mat normals_mat = Converters.vector_Mat_to_Mat(normals);
        filterHomographyDecompByVisibleRefpoints_1(rotations_mat.nativeObj, normals_mat.nativeObj, beforePoints.nativeObj, afterPoints.nativeObj, possibleSolutions.nativeObj);
    }


    //
    // C++:  void cv::calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double& fovx, double& fovy, double& focalLength, Point2d& principalPoint, double& aspectRatio)
    //

    /**
     * Computes useful camera characteristics from the camera intrinsic matrix.
     *
     * @param cameraMatrix Input camera intrinsic matrix that can be estimated by #calibrateCamera or
     * #stereoCalibrate .
     * @param imageSize Input image size in pixels.
     * @param apertureWidth Physical width in mm of the sensor.
     * @param apertureHeight Physical height in mm of the sensor.
     * @param fovx Output field of view in degrees along the horizontal sensor axis.
     * @param fovy Output field of view in degrees along the vertical sensor axis.
     * @param focalLength Focal length of the lens in mm.
     * @param principalPoint Principal point in mm.
     * @param aspectRatio \(f_y/f_x\)
     *
     * The function computes various useful camera characteristics from the previously estimated camera
     * matrix.
     *
     * <b>Note:</b>
     * Do keep in mind that the unity measure 'mm' stands for whatever unit of measure one chooses for
     * the chessboard pitch (it can thus be any value).
     */
    public static void calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double[] fovx, double[] fovy, double[] focalLength, Point principalPoint, double[] aspectRatio) {
        double[] fovx_out = new double[1];
        double[] fovy_out = new double[1];
        double[] focalLength_out = new double[1];
        double[] principalPoint_out = new double[2];
        double[] aspectRatio_out = new double[1];
        calibrationMatrixValues_0(cameraMatrix.nativeObj, imageSize.width, imageSize.height, apertureWidth, apertureHeight, fovx_out, fovy_out, focalLength_out, principalPoint_out, aspectRatio_out);
        if(fovx!=null) fovx[0] = (double)fovx_out[0];
        if(fovy!=null) fovy[0] = (double)fovy_out[0];
        if(focalLength!=null) focalLength[0] = (double)focalLength_out[0];
        if(principalPoint!=null){ principalPoint.x = principalPoint_out[0]; principalPoint.y = principalPoint_out[1]; } 
        if(aspectRatio!=null) aspectRatio[0] = (double)aspectRatio_out[0];
    }


    //
    // C++:  Mat cv::getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize = Size(), bool centerPrincipalPoint = false)
    //

    /**
     * Returns the default new camera matrix.
     *
     * The function returns the camera matrix that is either an exact copy of the input cameraMatrix (when
     * centerPrinicipalPoint=false ), or the modified one (when centerPrincipalPoint=true).
     *
     * In the latter case, the new camera matrix will be:
     *
     * \(\begin{bmatrix} f_x &amp;&amp; 0 &amp;&amp; ( \texttt{imgSize.width} -1)*0.5  \\ 0 &amp;&amp; f_y &amp;&amp; ( \texttt{imgSize.height} -1)*0.5  \\ 0 &amp;&amp; 0 &amp;&amp; 1 \end{bmatrix} ,\)
     *
     * where \(f_x\) and \(f_y\) are \((0,0)\) and \((1,1)\) elements of cameraMatrix, respectively.
     *
     * By default, the undistortion functions in OpenCV (see #initUndistortRectifyMap, #undistort) do not
     * move the principal point. However, when you work with stereo, it is important to move the principal
     * points in both views to the same y-coordinate (which is required by most of stereo correspondence
     * algorithms), and may be to the same x-coordinate too. So, you can form the new camera matrix for
     * each view where the principal points are located at the center.
     *
     * @param cameraMatrix Input camera matrix.
     * @param imgsize Camera view image size in pixels.
     * @param centerPrincipalPoint Location of the principal point in the new camera matrix. The
     * parameter indicates whether this location should be at the image center or not.
     * @return automatically generated
     */
    public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize, boolean centerPrincipalPoint) {
        return new Mat(getDefaultNewCameraMatrix_0(cameraMatrix.nativeObj, imgsize.width, imgsize.height, centerPrincipalPoint));
    }

    /**
     * Returns the default new camera matrix.
     *
     * The function returns the camera matrix that is either an exact copy of the input cameraMatrix (when
     * centerPrinicipalPoint=false ), or the modified one (when centerPrincipalPoint=true).
     *
     * In the latter case, the new camera matrix will be:
     *
     * \(\begin{bmatrix} f_x &amp;&amp; 0 &amp;&amp; ( \texttt{imgSize.width} -1)*0.5  \\ 0 &amp;&amp; f_y &amp;&amp; ( \texttt{imgSize.height} -1)*0.5  \\ 0 &amp;&amp; 0 &amp;&amp; 1 \end{bmatrix} ,\)
     *
     * where \(f_x\) and \(f_y\) are \((0,0)\) and \((1,1)\) elements of cameraMatrix, respectively.
     *
     * By default, the undistortion functions in OpenCV (see #initUndistortRectifyMap, #undistort) do not
     * move the principal point. However, when you work with stereo, it is important to move the principal
     * points in both views to the same y-coordinate (which is required by most of stereo correspondence
     * algorithms), and may be to the same x-coordinate too. So, you can form the new camera matrix for
     * each view where the principal points are located at the center.
     *
     * @param cameraMatrix Input camera matrix.
     * @param imgsize Camera view image size in pixels.
     * parameter indicates whether this location should be at the image center or not.
     * @return automatically generated
     */
    public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize) {
        return new Mat(getDefaultNewCameraMatrix_1(cameraMatrix.nativeObj, imgsize.width, imgsize.height));
    }

    /**
     * Returns the default new camera matrix.
     *
     * The function returns the camera matrix that is either an exact copy of the input cameraMatrix (when
     * centerPrinicipalPoint=false ), or the modified one (when centerPrincipalPoint=true).
     *
     * In the latter case, the new camera matrix will be:
     *
     * \(\begin{bmatrix} f_x &amp;&amp; 0 &amp;&amp; ( \texttt{imgSize.width} -1)*0.5  \\ 0 &amp;&amp; f_y &amp;&amp; ( \texttt{imgSize.height} -1)*0.5  \\ 0 &amp;&amp; 0 &amp;&amp; 1 \end{bmatrix} ,\)
     *
     * where \(f_x\) and \(f_y\) are \((0,0)\) and \((1,1)\) elements of cameraMatrix, respectively.
     *
     * By default, the undistortion functions in OpenCV (see #initUndistortRectifyMap, #undistort) do not
     * move the principal point. However, when you work with stereo, it is important to move the principal
     * points in both views to the same y-coordinate (which is required by most of stereo correspondence
     * algorithms), and may be to the same x-coordinate too. So, you can form the new camera matrix for
     * each view where the principal points are located at the center.
     *
     * @param cameraMatrix Input camera matrix.
     * parameter indicates whether this location should be at the image center or not.
     * @return automatically generated
     */
    public static Mat getDefaultNewCameraMatrix(Mat cameraMatrix) {
        return new Mat(getDefaultNewCameraMatrix_2(cameraMatrix.nativeObj));
    }


    //
    // C++:  Mat cv::getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize = Size(), Rect* validPixROI = 0, bool centerPrincipalPoint = false)
    //

    /**
     * Returns the new camera intrinsic matrix based on the free scaling parameter.
     *
     * @param cameraMatrix Input camera intrinsic matrix.
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param imageSize Original image size.
     * @param alpha Free scaling parameter between 0 (when all the pixels in the undistorted image are
     * valid) and 1 (when all the source image pixels are retained in the undistorted image). See
     * #stereoRectify for details.
     * @param newImgSize Image size after rectification. By default, it is set to imageSize .
     * @param validPixROI Optional output rectangle that outlines all-good-pixels region in the
     * undistorted image. See roi1, roi2 description in #stereoRectify .
     * @param centerPrincipalPoint Optional flag that indicates whether in the new camera intrinsic matrix the
     * principal point should be at the image center or not. By default, the principal point is chosen to
     * best fit a subset of the source image (determined by alpha) to the corrected image.
     * @return new_camera_matrix Output new camera intrinsic matrix.
     *
     * The function computes and returns the optimal new camera intrinsic matrix based on the free scaling parameter.
     * By varying this parameter, you may retrieve only sensible pixels alpha=0 , keep all the original
     * image pixels if there is valuable information in the corners alpha=1 , or get something in between.
     * When alpha&gt;0 , the undistorted result is likely to have some black pixels corresponding to
     * "virtual" pixels outside of the captured distorted image. The original camera intrinsic matrix, distortion
     * coefficients, the computed new camera intrinsic matrix, and newImageSize should be passed to
     * #initUndistortRectifyMap to produce the maps for #remap .
     */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize, Rect validPixROI, boolean centerPrincipalPoint) {
        double[] validPixROI_out = new double[4];
        Mat retVal = new Mat(getOptimalNewCameraMatrix_0(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height, validPixROI_out, centerPrincipalPoint));
        if(validPixROI!=null){ validPixROI.x = (int)validPixROI_out[0]; validPixROI.y = (int)validPixROI_out[1]; validPixROI.width = (int)validPixROI_out[2]; validPixROI.height = (int)validPixROI_out[3]; } 
        return retVal;
    }

    /**
     * Returns the new camera intrinsic matrix based on the free scaling parameter.
     *
     * @param cameraMatrix Input camera intrinsic matrix.
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param imageSize Original image size.
     * @param alpha Free scaling parameter between 0 (when all the pixels in the undistorted image are
     * valid) and 1 (when all the source image pixels are retained in the undistorted image). See
     * #stereoRectify for details.
     * @param newImgSize Image size after rectification. By default, it is set to imageSize .
     * @param validPixROI Optional output rectangle that outlines all-good-pixels region in the
     * undistorted image. See roi1, roi2 description in #stereoRectify .
     * principal point should be at the image center or not. By default, the principal point is chosen to
     * best fit a subset of the source image (determined by alpha) to the corrected image.
     * @return new_camera_matrix Output new camera intrinsic matrix.
     *
     * The function computes and returns the optimal new camera intrinsic matrix based on the free scaling parameter.
     * By varying this parameter, you may retrieve only sensible pixels alpha=0 , keep all the original
     * image pixels if there is valuable information in the corners alpha=1 , or get something in between.
     * When alpha&gt;0 , the undistorted result is likely to have some black pixels corresponding to
     * "virtual" pixels outside of the captured distorted image. The original camera intrinsic matrix, distortion
     * coefficients, the computed new camera intrinsic matrix, and newImageSize should be passed to
     * #initUndistortRectifyMap to produce the maps for #remap .
     */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize, Rect validPixROI) {
        double[] validPixROI_out = new double[4];
        Mat retVal = new Mat(getOptimalNewCameraMatrix_1(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height, validPixROI_out));
        if(validPixROI!=null){ validPixROI.x = (int)validPixROI_out[0]; validPixROI.y = (int)validPixROI_out[1]; validPixROI.width = (int)validPixROI_out[2]; validPixROI.height = (int)validPixROI_out[3]; } 
        return retVal;
    }

    /**
     * Returns the new camera intrinsic matrix based on the free scaling parameter.
     *
     * @param cameraMatrix Input camera intrinsic matrix.
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param imageSize Original image size.
     * @param alpha Free scaling parameter between 0 (when all the pixels in the undistorted image are
     * valid) and 1 (when all the source image pixels are retained in the undistorted image). See
     * #stereoRectify for details.
     * @param newImgSize Image size after rectification. By default, it is set to imageSize .
     * undistorted image. See roi1, roi2 description in #stereoRectify .
     * principal point should be at the image center or not. By default, the principal point is chosen to
     * best fit a subset of the source image (determined by alpha) to the corrected image.
     * @return new_camera_matrix Output new camera intrinsic matrix.
     *
     * The function computes and returns the optimal new camera intrinsic matrix based on the free scaling parameter.
     * By varying this parameter, you may retrieve only sensible pixels alpha=0 , keep all the original
     * image pixels if there is valuable information in the corners alpha=1 , or get something in between.
     * When alpha&gt;0 , the undistorted result is likely to have some black pixels corresponding to
     * "virtual" pixels outside of the captured distorted image. The original camera intrinsic matrix, distortion
     * coefficients, the computed new camera intrinsic matrix, and newImageSize should be passed to
     * #initUndistortRectifyMap to produce the maps for #remap .
     */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize) {
        return new Mat(getOptimalNewCameraMatrix_2(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha, newImgSize.width, newImgSize.height));
    }

    /**
     * Returns the new camera intrinsic matrix based on the free scaling parameter.
     *
     * @param cameraMatrix Input camera intrinsic matrix.
     * @param distCoeffs Input vector of distortion coefficients
     * \(\distcoeffs\). If the vector is NULL/empty, the zero distortion coefficients are
     * assumed.
     * @param imageSize Original image size.
     * @param alpha Free scaling parameter between 0 (when all the pixels in the undistorted image are
     * valid) and 1 (when all the source image pixels are retained in the undistorted image). See
     * #stereoRectify for details.
     * undistorted image. See roi1, roi2 description in #stereoRectify .
     * principal point should be at the image center or not. By default, the principal point is chosen to
     * best fit a subset of the source image (determined by alpha) to the corrected image.
     * @return new_camera_matrix Output new camera intrinsic matrix.
     *
     * The function computes and returns the optimal new camera intrinsic matrix based on the free scaling parameter.
     * By varying this parameter, you may retrieve only sensible pixels alpha=0 , keep all the original
     * image pixels if there is valuable information in the corners alpha=1 , or get something in between.
     * When alpha&gt;0 , the undistorted result is likely to have some black pixels corresponding to
     * "virtual" pixels outside of the captured distorted image. The original camera intrinsic matrix, distortion
     * coefficients, the computed new camera intrinsic matrix, and newImageSize should be passed to
     * #initUndistortRectifyMap to produce the maps for #remap .
     */
    public static Mat getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha) {
        return new Mat(getOptimalNewCameraMatrix_3(cameraMatrix.nativeObj, distCoeffs.nativeObj, imageSize.width, imageSize.height, alpha));
    }


    //
    // C++:  void cv::undistortPoints(vector_Point2f src, vector_Point2f& dst, Mat cameraMatrix, Mat distCoeffs, Mat R = Mat(), Mat P = Mat(), TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER, 5, 0.01))
    //

    /**
     * Computes the ideal point coordinates from the observed point coordinates.
     *
     * The function is similar to #undistort and #initUndistortRectifyMap but it operates on a
     * sparse set of points instead of a raster image. Also the function performs a reverse transformation
     * to  #projectPoints. In case of a 3D object, it does not reconstruct its 3D coordinates, but for a
     * planar object, it does, up to a translation vector, if the proper R is specified.
     *
     * For each observed point coordinate \((u, v)\) the function computes:
     * \(
     * \begin{array}{l}
     * x^{"}  \leftarrow (u - c_x)/f_x  \\
     * y^{"}  \leftarrow (v - c_y)/f_y  \\
     * (x',y') = undistort(x^{"},y^{"}, \texttt{distCoeffs}) \\
     * {[X\,Y\,W]} ^T  \leftarrow R*[x' \, y' \, 1]^T  \\
     * x  \leftarrow X/W  \\
     * y  \leftarrow Y/W  \\
     * \text{only performed if P is specified:} \\
     * u'  \leftarrow x {f'}_x + {c'}_x  \\
     * v'  \leftarrow y {f'}_y + {c'}_y
     * \end{array}
     * \)
     *
     * where *undistort* is an approximate iterative algorithm that estimates the normalized original
     * point coordinates out of the normalized distorted point coordinates ("normalized" means that the
     * coordinates do not depend on the camera matrix).
     *
     * The function can be used for both a stereo camera head or a monocular camera (when R is empty).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code src})</b>: Points are expected in <b>pixel coordinates</b> of the distorted image, i.e.,
     *   coordinates \((u, v)\) measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code dst})</b>: The coordinate system of output points depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *    If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *    If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (also called "normalized image coordinates"),
     *     which are dimensionless coordinates \((x, y)\) in the camera's focal plane, related to pixel coordinates by:
     *     \(x = (u - c_x) / f_x\) and \(y = (v - c_y) / f_y\). These normalized coordinates are independent of the camera's intrinsic parameters and are useful for 3D reconstruction or epipolar geometry.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * @param src Observed point coordinates in <b>pixel coordinates</b> of the distorted image, 2xN/Nx2 1-channel or 1xN/Nx1 2-channel (CV_32FC2 or CV_64FC2) (or
     * vector&lt;Point2f&gt; ).
     * @param dst Output ideal point coordinates (1xN/Nx1 2-channel or vector&lt;Point2f&gt; ) after undistortion and reverse perspective
     * transformation. If matrix P is identity or omitted, dst will contain normalized point coordinates.
     * @param cameraMatrix Camera matrix \(\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param R Rectification transformation in the object space (3x3 matrix). R1 or R2 computed by
     * #stereoRectify can be passed here. If the matrix is empty, the identity transformation is used.
     * @param P New camera matrix (3x3) or new projection matrix (3x4) \(\begin{bmatrix} {f'}_x &amp; 0 &amp; {c'}_x &amp; t_x \\ 0 &amp; {f'}_y &amp; {c'}_y &amp; t_y \\ 0 &amp; 0 &amp; 1 &amp; t_z \end{bmatrix}\). P1 or P2 computed by
     * #stereoRectify can be passed here. If the matrix is empty, the identity new camera matrix is used and output will be in normalized coordinates.
     * @param criteria termination criteria for the iterative point undistortion algorithm
     */
    public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs, Mat R, Mat P, TermCriteria criteria) {
        Mat src_mat = src;
        Mat dst_mat = dst;
        undistortPoints_0(src_mat.nativeObj, dst_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, P.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
    }

    /**
     * Computes the ideal point coordinates from the observed point coordinates.
     *
     * The function is similar to #undistort and #initUndistortRectifyMap but it operates on a
     * sparse set of points instead of a raster image. Also the function performs a reverse transformation
     * to  #projectPoints. In case of a 3D object, it does not reconstruct its 3D coordinates, but for a
     * planar object, it does, up to a translation vector, if the proper R is specified.
     *
     * For each observed point coordinate \((u, v)\) the function computes:
     * \(
     * \begin{array}{l}
     * x^{"}  \leftarrow (u - c_x)/f_x  \\
     * y^{"}  \leftarrow (v - c_y)/f_y  \\
     * (x',y') = undistort(x^{"},y^{"}, \texttt{distCoeffs}) \\
     * {[X\,Y\,W]} ^T  \leftarrow R*[x' \, y' \, 1]^T  \\
     * x  \leftarrow X/W  \\
     * y  \leftarrow Y/W  \\
     * \text{only performed if P is specified:} \\
     * u'  \leftarrow x {f'}_x + {c'}_x  \\
     * v'  \leftarrow y {f'}_y + {c'}_y
     * \end{array}
     * \)
     *
     * where *undistort* is an approximate iterative algorithm that estimates the normalized original
     * point coordinates out of the normalized distorted point coordinates ("normalized" means that the
     * coordinates do not depend on the camera matrix).
     *
     * The function can be used for both a stereo camera head or a monocular camera (when R is empty).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code src})</b>: Points are expected in <b>pixel coordinates</b> of the distorted image, i.e.,
     *   coordinates \((u, v)\) measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code dst})</b>: The coordinate system of output points depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *    If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *    If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (also called "normalized image coordinates"),
     *     which are dimensionless coordinates \((x, y)\) in the camera's focal plane, related to pixel coordinates by:
     *     \(x = (u - c_x) / f_x\) and \(y = (v - c_y) / f_y\). These normalized coordinates are independent of the camera's intrinsic parameters and are useful for 3D reconstruction or epipolar geometry.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * @param src Observed point coordinates in <b>pixel coordinates</b> of the distorted image, 2xN/Nx2 1-channel or 1xN/Nx1 2-channel (CV_32FC2 or CV_64FC2) (or
     * vector&lt;Point2f&gt; ).
     * @param dst Output ideal point coordinates (1xN/Nx1 2-channel or vector&lt;Point2f&gt; ) after undistortion and reverse perspective
     * transformation. If matrix P is identity or omitted, dst will contain normalized point coordinates.
     * @param cameraMatrix Camera matrix \(\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param R Rectification transformation in the object space (3x3 matrix). R1 or R2 computed by
     * #stereoRectify can be passed here. If the matrix is empty, the identity transformation is used.
     * @param P New camera matrix (3x3) or new projection matrix (3x4) \(\begin{bmatrix} {f'}_x &amp; 0 &amp; {c'}_x &amp; t_x \\ 0 &amp; {f'}_y &amp; {c'}_y &amp; t_y \\ 0 &amp; 0 &amp; 1 &amp; t_z \end{bmatrix}\). P1 or P2 computed by
     * #stereoRectify can be passed here. If the matrix is empty, the identity new camera matrix is used and output will be in normalized coordinates.
     */
    public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs, Mat R, Mat P) {
        Mat src_mat = src;
        Mat dst_mat = dst;
        undistortPoints_1(src_mat.nativeObj, dst_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj, P.nativeObj);
    }

    /**
     * Computes the ideal point coordinates from the observed point coordinates.
     *
     * The function is similar to #undistort and #initUndistortRectifyMap but it operates on a
     * sparse set of points instead of a raster image. Also the function performs a reverse transformation
     * to  #projectPoints. In case of a 3D object, it does not reconstruct its 3D coordinates, but for a
     * planar object, it does, up to a translation vector, if the proper R is specified.
     *
     * For each observed point coordinate \((u, v)\) the function computes:
     * \(
     * \begin{array}{l}
     * x^{"}  \leftarrow (u - c_x)/f_x  \\
     * y^{"}  \leftarrow (v - c_y)/f_y  \\
     * (x',y') = undistort(x^{"},y^{"}, \texttt{distCoeffs}) \\
     * {[X\,Y\,W]} ^T  \leftarrow R*[x' \, y' \, 1]^T  \\
     * x  \leftarrow X/W  \\
     * y  \leftarrow Y/W  \\
     * \text{only performed if P is specified:} \\
     * u'  \leftarrow x {f'}_x + {c'}_x  \\
     * v'  \leftarrow y {f'}_y + {c'}_y
     * \end{array}
     * \)
     *
     * where *undistort* is an approximate iterative algorithm that estimates the normalized original
     * point coordinates out of the normalized distorted point coordinates ("normalized" means that the
     * coordinates do not depend on the camera matrix).
     *
     * The function can be used for both a stereo camera head or a monocular camera (when R is empty).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code src})</b>: Points are expected in <b>pixel coordinates</b> of the distorted image, i.e.,
     *   coordinates \((u, v)\) measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code dst})</b>: The coordinate system of output points depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *    If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *    If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (also called "normalized image coordinates"),
     *     which are dimensionless coordinates \((x, y)\) in the camera's focal plane, related to pixel coordinates by:
     *     \(x = (u - c_x) / f_x\) and \(y = (v - c_y) / f_y\). These normalized coordinates are independent of the camera's intrinsic parameters and are useful for 3D reconstruction or epipolar geometry.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * @param src Observed point coordinates in <b>pixel coordinates</b> of the distorted image, 2xN/Nx2 1-channel or 1xN/Nx1 2-channel (CV_32FC2 or CV_64FC2) (or
     * vector&lt;Point2f&gt; ).
     * @param dst Output ideal point coordinates (1xN/Nx1 2-channel or vector&lt;Point2f&gt; ) after undistortion and reverse perspective
     * transformation. If matrix P is identity or omitted, dst will contain normalized point coordinates.
     * @param cameraMatrix Camera matrix \(\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * @param R Rectification transformation in the object space (3x3 matrix). R1 or R2 computed by
     * #stereoRectify can be passed here. If the matrix is empty, the identity transformation is used.
     * #stereoRectify can be passed here. If the matrix is empty, the identity new camera matrix is used and output will be in normalized coordinates.
     */
    public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs, Mat R) {
        Mat src_mat = src;
        Mat dst_mat = dst;
        undistortPoints_2(src_mat.nativeObj, dst_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, R.nativeObj);
    }

    /**
     * Computes the ideal point coordinates from the observed point coordinates.
     *
     * The function is similar to #undistort and #initUndistortRectifyMap but it operates on a
     * sparse set of points instead of a raster image. Also the function performs a reverse transformation
     * to  #projectPoints. In case of a 3D object, it does not reconstruct its 3D coordinates, but for a
     * planar object, it does, up to a translation vector, if the proper R is specified.
     *
     * For each observed point coordinate \((u, v)\) the function computes:
     * \(
     * \begin{array}{l}
     * x^{"}  \leftarrow (u - c_x)/f_x  \\
     * y^{"}  \leftarrow (v - c_y)/f_y  \\
     * (x',y') = undistort(x^{"},y^{"}, \texttt{distCoeffs}) \\
     * {[X\,Y\,W]} ^T  \leftarrow R*[x' \, y' \, 1]^T  \\
     * x  \leftarrow X/W  \\
     * y  \leftarrow Y/W  \\
     * \text{only performed if P is specified:} \\
     * u'  \leftarrow x {f'}_x + {c'}_x  \\
     * v'  \leftarrow y {f'}_y + {c'}_y
     * \end{array}
     * \)
     *
     * where *undistort* is an approximate iterative algorithm that estimates the normalized original
     * point coordinates out of the normalized distorted point coordinates ("normalized" means that the
     * coordinates do not depend on the camera matrix).
     *
     * The function can be used for both a stereo camera head or a monocular camera (when R is empty).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code src})</b>: Points are expected in <b>pixel coordinates</b> of the distorted image, i.e.,
     *   coordinates \((u, v)\) measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code dst})</b>: The coordinate system of output points depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *    If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *    If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (also called "normalized image coordinates"),
     *     which are dimensionless coordinates \((x, y)\) in the camera's focal plane, related to pixel coordinates by:
     *     \(x = (u - c_x) / f_x\) and \(y = (v - c_y) / f_y\). These normalized coordinates are independent of the camera's intrinsic parameters and are useful for 3D reconstruction or epipolar geometry.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * @param src Observed point coordinates in <b>pixel coordinates</b> of the distorted image, 2xN/Nx2 1-channel or 1xN/Nx1 2-channel (CV_32FC2 or CV_64FC2) (or
     * vector&lt;Point2f&gt; ).
     * @param dst Output ideal point coordinates (1xN/Nx1 2-channel or vector&lt;Point2f&gt; ) after undistortion and reverse perspective
     * transformation. If matrix P is identity or omitted, dst will contain normalized point coordinates.
     * @param cameraMatrix Camera matrix \(\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs Input vector of distortion coefficients
     * \((k_1, k_2, p_1, p_2[, k_3[, k_4, k_5, k_6[, s_1, s_2, s_3, s_4[, \tau_x, \tau_y]]]])\)
     * of 4, 5, 8, 12 or 14 elements. If the vector is NULL/empty, the zero distortion coefficients are assumed.
     * #stereoRectify can be passed here. If the matrix is empty, the identity transformation is used.
     * #stereoRectify can be passed here. If the matrix is empty, the identity new camera matrix is used and output will be in normalized coordinates.
     */
    public static void undistortPoints(MatOfPoint2f src, MatOfPoint2f dst, Mat cameraMatrix, Mat distCoeffs) {
        Mat src_mat = src;
        Mat dst_mat = dst;
        undistortPoints_3(src_mat.nativeObj, dst_mat.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }


    //
    // C++:  void cv::undistortImagePoints(Mat src, Mat& dst, Mat cameraMatrix, Mat distCoeffs, TermCriteria arg1 = TermCriteria(TermCriteria::MAX_ITER, 5, 0.01))
    //

    /**
     * Compute undistorted image points position
     *
     * @param src Observed points position, 2xN/Nx2 1-channel or 1xN/Nx1 2-channel (CV_32FC2 or CV_64FC2) (or vector&lt;Point2f&gt; ).
     * @param dst Output undistorted points position (1xN/Nx1 2-channel or vector&lt;Point2f&gt; ).
     * @param cameraMatrix Camera matrix \(\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs Distortion coefficients
     * @param arg1 automatically generated
     */
    public static void undistortImagePoints(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs, TermCriteria arg1) {
        undistortImagePoints_0(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, arg1.type, arg1.maxCount, arg1.epsilon);
    }

    /**
     * Compute undistorted image points position
     *
     * @param src Observed points position, 2xN/Nx2 1-channel or 1xN/Nx1 2-channel (CV_32FC2 or CV_64FC2) (or vector&lt;Point2f&gt; ).
     * @param dst Output undistorted points position (1xN/Nx1 2-channel or vector&lt;Point2f&gt; ).
     * @param cameraMatrix Camera matrix \(\vecthreethree{f_x}{0}{c_x}{0}{f_y}{c_y}{0}{0}{1}\) .
     * @param distCoeffs Distortion coefficients
     */
    public static void undistortImagePoints(Mat src, Mat dst, Mat cameraMatrix, Mat distCoeffs) {
        undistortImagePoints_1(src.nativeObj, dst.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj);
    }


    //
    // C++:  void cv::fisheye::projectPoints(Mat objectPoints, Mat& imagePoints, Mat rvec, Mat tvec, Mat K, Mat D, double alpha = 0, Mat& jacobian = Mat())
    //

    public static void fisheye_projectPoints(Mat objectPoints, Mat imagePoints, Mat rvec, Mat tvec, Mat K, Mat D, double alpha, Mat jacobian) {
        fisheye_projectPoints_0(objectPoints.nativeObj, imagePoints.nativeObj, rvec.nativeObj, tvec.nativeObj, K.nativeObj, D.nativeObj, alpha, jacobian.nativeObj);
    }

    public static void fisheye_projectPoints(Mat objectPoints, Mat imagePoints, Mat rvec, Mat tvec, Mat K, Mat D, double alpha) {
        fisheye_projectPoints_1(objectPoints.nativeObj, imagePoints.nativeObj, rvec.nativeObj, tvec.nativeObj, K.nativeObj, D.nativeObj, alpha);
    }

    public static void fisheye_projectPoints(Mat objectPoints, Mat imagePoints, Mat rvec, Mat tvec, Mat K, Mat D) {
        fisheye_projectPoints_2(objectPoints.nativeObj, imagePoints.nativeObj, rvec.nativeObj, tvec.nativeObj, K.nativeObj, D.nativeObj);
    }


    //
    // C++:  void cv::fisheye::distortPoints(Mat undistorted, Mat& distorted, Mat K, Mat D, double alpha = 0)
    //

    /**
     * Distorts 2D points using fisheye model.
     *
     * @param undistorted Array of object points, 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is
     * the number of points in the view.
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param alpha The skew coefficient.
     * @param distorted Output array of image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     *
     * Note that the function assumes the camera intrinsic matrix of the undistorted points to be identity.
     * This means if you want to distort image points you have to multiply them with \(K^{-1}\) or
     * use another function overload.
     */
    public static void fisheye_distortPoints(Mat undistorted, Mat distorted, Mat K, Mat D, double alpha) {
        fisheye_distortPoints_0(undistorted.nativeObj, distorted.nativeObj, K.nativeObj, D.nativeObj, alpha);
    }

    /**
     * Distorts 2D points using fisheye model.
     *
     * @param undistorted Array of object points, 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is
     * the number of points in the view.
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param distorted Output array of image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     *
     * Note that the function assumes the camera intrinsic matrix of the undistorted points to be identity.
     * This means if you want to distort image points you have to multiply them with \(K^{-1}\) or
     * use another function overload.
     */
    public static void fisheye_distortPoints(Mat undistorted, Mat distorted, Mat K, Mat D) {
        fisheye_distortPoints_1(undistorted.nativeObj, distorted.nativeObj, K.nativeObj, D.nativeObj);
    }


    //
    // C++:  void cv::fisheye::distortPoints(Mat undistorted, Mat& distorted, Mat Kundistorted, Mat K, Mat D, double alpha = 0)
    //

    /**
     *
     * Overload of distortPoints function to handle cases when undistorted points are got with non-identity
     * camera matrix, e.g. output of #estimateNewCameraMatrixForUndistortRectify.
     * @param undistorted Array of object points, 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is
     * the number of points in the view.
     * @param Kundistorted Camera intrinsic matrix used as new camera matrix for undistortion.
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param alpha The skew coefficient.
     * @param distorted Output array of image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     * SEE: estimateNewCameraMatrixForUndistortRectify
     */
    public static void fisheye_distortPoints(Mat undistorted, Mat distorted, Mat Kundistorted, Mat K, Mat D, double alpha) {
        fisheye_distortPoints_2(undistorted.nativeObj, distorted.nativeObj, Kundistorted.nativeObj, K.nativeObj, D.nativeObj, alpha);
    }

    /**
     *
     * Overload of distortPoints function to handle cases when undistorted points are got with non-identity
     * camera matrix, e.g. output of #estimateNewCameraMatrixForUndistortRectify.
     * @param undistorted Array of object points, 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is
     * the number of points in the view.
     * @param Kundistorted Camera intrinsic matrix used as new camera matrix for undistortion.
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param distorted Output array of image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     * SEE: estimateNewCameraMatrixForUndistortRectify
     */
    public static void fisheye_distortPoints(Mat undistorted, Mat distorted, Mat Kundistorted, Mat K, Mat D) {
        fisheye_distortPoints_3(undistorted.nativeObj, distorted.nativeObj, Kundistorted.nativeObj, K.nativeObj, D.nativeObj);
    }


    //
    // C++:  void cv::fisheye::undistortPoints(Mat distorted, Mat& undistorted, Mat K, Mat D, Mat R = Mat(), Mat P = Mat(), TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 10, 1e-8))
    //

    /**
     * Undistorts 2D points using fisheye camera model
     *
     * This function performs undistortion for fisheye camera models, which use a different distortion model
     * compared to the standard pinhole camera model used by #undistortPoints. The fisheye model is suitable
     * for wide-angle cameras.
     *
     * The function transforms points from the distorted fisheye image to undistorted coordinates, optionally
     * applying a rectification transformation (R) and projecting to a new image plane (P).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code distorted})</b>: Points are expected in <b>pixel coordinates</b> of the distorted fisheye image,
     *     i.e., coordinates measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code undistorted})</b>: The coordinate system depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *      If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted
     *     image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *      If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (normalized image coordinates),
     *     which are dimensionless coordinates in the camera's focal plane, independent of intrinsic parameters.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * <b>Note:</b> <b>Fisheye vs. Standard Model:</b>
     * Use this function (#cv::fisheye::undistortPoints) for fisheye cameras (wide-angle lenses).
     * For standard pinhole cameras, use #undistortPoints instead. The fisheye model uses a different distortion
     * parameterization (4 coefficients) compared to the standard model (4-14 coefficients).
     *
     * @param distorted Array of distorted point coordinates in <b>pixel coordinates</b> of the fisheye image,
     * 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is the number of points in the view.
     * @param K Camera intrinsic matrix \(\cameramatrix{K}\) of the fisheye camera.
     * @param D Input vector of fisheye distortion coefficients \(\distcoeffsfisheye\) (must contain exactly 4 coefficients).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel. If empty, the identity transformation is used.
     * @param P New camera intrinsic matrix (3x3) or new projection matrix (3x4). If empty or identity,
     * output will be in normalized camera coordinates.
     * @param criteria Termination criteria for the iterative undistortion algorithm.
     * @param undistorted Output array of undistorted image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     * The coordinate system depends on parameter P (see above).
     */
    public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D, Mat R, Mat P, TermCriteria criteria) {
        fisheye_undistortPoints_0(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, R.nativeObj, P.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon);
    }

    /**
     * Undistorts 2D points using fisheye camera model
     *
     * This function performs undistortion for fisheye camera models, which use a different distortion model
     * compared to the standard pinhole camera model used by #undistortPoints. The fisheye model is suitable
     * for wide-angle cameras.
     *
     * The function transforms points from the distorted fisheye image to undistorted coordinates, optionally
     * applying a rectification transformation (R) and projecting to a new image plane (P).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code distorted})</b>: Points are expected in <b>pixel coordinates</b> of the distorted fisheye image,
     *     i.e., coordinates measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code undistorted})</b>: The coordinate system depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *      If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted
     *     image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *      If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (normalized image coordinates),
     *     which are dimensionless coordinates in the camera's focal plane, independent of intrinsic parameters.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * <b>Note:</b> <b>Fisheye vs. Standard Model:</b>
     * Use this function (#cv::fisheye::undistortPoints) for fisheye cameras (wide-angle lenses).
     * For standard pinhole cameras, use #undistortPoints instead. The fisheye model uses a different distortion
     * parameterization (4 coefficients) compared to the standard model (4-14 coefficients).
     *
     * @param distorted Array of distorted point coordinates in <b>pixel coordinates</b> of the fisheye image,
     * 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is the number of points in the view.
     * @param K Camera intrinsic matrix \(\cameramatrix{K}\) of the fisheye camera.
     * @param D Input vector of fisheye distortion coefficients \(\distcoeffsfisheye\) (must contain exactly 4 coefficients).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel. If empty, the identity transformation is used.
     * @param P New camera intrinsic matrix (3x3) or new projection matrix (3x4). If empty or identity,
     * output will be in normalized camera coordinates.
     * @param undistorted Output array of undistorted image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     * The coordinate system depends on parameter P (see above).
     */
    public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D, Mat R, Mat P) {
        fisheye_undistortPoints_1(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, R.nativeObj, P.nativeObj);
    }

    /**
     * Undistorts 2D points using fisheye camera model
     *
     * This function performs undistortion for fisheye camera models, which use a different distortion model
     * compared to the standard pinhole camera model used by #undistortPoints. The fisheye model is suitable
     * for wide-angle cameras.
     *
     * The function transforms points from the distorted fisheye image to undistorted coordinates, optionally
     * applying a rectification transformation (R) and projecting to a new image plane (P).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code distorted})</b>: Points are expected in <b>pixel coordinates</b> of the distorted fisheye image,
     *     i.e., coordinates measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code undistorted})</b>: The coordinate system depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *      If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted
     *     image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *      If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (normalized image coordinates),
     *     which are dimensionless coordinates in the camera's focal plane, independent of intrinsic parameters.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * <b>Note:</b> <b>Fisheye vs. Standard Model:</b>
     * Use this function (#cv::fisheye::undistortPoints) for fisheye cameras (wide-angle lenses).
     * For standard pinhole cameras, use #undistortPoints instead. The fisheye model uses a different distortion
     * parameterization (4 coefficients) compared to the standard model (4-14 coefficients).
     *
     * @param distorted Array of distorted point coordinates in <b>pixel coordinates</b> of the fisheye image,
     * 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is the number of points in the view.
     * @param K Camera intrinsic matrix \(\cameramatrix{K}\) of the fisheye camera.
     * @param D Input vector of fisheye distortion coefficients \(\distcoeffsfisheye\) (must contain exactly 4 coefficients).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel. If empty, the identity transformation is used.
     * output will be in normalized camera coordinates.
     * @param undistorted Output array of undistorted image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     * The coordinate system depends on parameter P (see above).
     */
    public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D, Mat R) {
        fisheye_undistortPoints_2(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj, R.nativeObj);
    }

    /**
     * Undistorts 2D points using fisheye camera model
     *
     * This function performs undistortion for fisheye camera models, which use a different distortion model
     * compared to the standard pinhole camera model used by #undistortPoints. The fisheye model is suitable
     * for wide-angle cameras.
     *
     * The function transforms points from the distorted fisheye image to undistorted coordinates, optionally
     * applying a rectification transformation (R) and projecting to a new image plane (P).
     *
     * <b>Note:</b> <b>Coordinate Systems:</b>
     * <ul>
     *   <li>
     *  <b>Input ({@code distorted})</b>: Points are expected in <b>pixel coordinates</b> of the distorted fisheye image,
     *     i.e., coordinates measured in pixels from the top-left corner of the image.
     *   </li>
     *   <li>
     *  <b>Output ({@code undistorted})</b>: The coordinate system depends on parameter {@code P}:
     *   <ul>
     *     <li>
     *      If {@code P} is provided (not empty): Output points are in <b>pixel coordinates</b> of the rectified/undistorted
     *     image plane, using the camera matrix {@code P}.
     *     </li>
     *     <li>
     *      If {@code P} is empty or identity: Output points are in <b>normalized camera coordinates</b> (normalized image coordinates),
     *     which are dimensionless coordinates in the camera's focal plane, independent of intrinsic parameters.
     *     </li>
     *   </ul>
     *
     *   </li>
     * </ul>
     * <b>Note:</b> <b>Fisheye vs. Standard Model:</b>
     * Use this function (#cv::fisheye::undistortPoints) for fisheye cameras (wide-angle lenses).
     * For standard pinhole cameras, use #undistortPoints instead. The fisheye model uses a different distortion
     * parameterization (4 coefficients) compared to the standard model (4-14 coefficients).
     *
     * @param distorted Array of distorted point coordinates in <b>pixel coordinates</b> of the fisheye image,
     * 1xN/Nx1 2-channel (or vector&lt;Point2f&gt; ), where N is the number of points in the view.
     * @param K Camera intrinsic matrix \(\cameramatrix{K}\) of the fisheye camera.
     * @param D Input vector of fisheye distortion coefficients \(\distcoeffsfisheye\) (must contain exactly 4 coefficients).
     * 1-channel or 1x1 3-channel. If empty, the identity transformation is used.
     * output will be in normalized camera coordinates.
     * @param undistorted Output array of undistorted image points, 1xN/Nx1 2-channel, or vector&lt;Point2f&gt; .
     * The coordinate system depends on parameter P (see above).
     */
    public static void fisheye_undistortPoints(Mat distorted, Mat undistorted, Mat K, Mat D) {
        fisheye_undistortPoints_3(distorted.nativeObj, undistorted.nativeObj, K.nativeObj, D.nativeObj);
    }


    //
    // C++:  void cv::fisheye::estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat& P, double balance = 0.0, Size new_size = Size(), double fov_scale = 1.0)
    //

    /**
     * Estimates new camera intrinsic matrix for undistortion or rectification.
     *
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param image_size Size of the image
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel
     * @param P New camera intrinsic matrix (3x3) or new projection matrix (3x4)
     * @param balance Sets the new focal length in range between the min focal length and the max focal
     * length. Balance is in range of [0, 1].
     * @param new_size the new size
     * @param fov_scale Divisor for new focal length.
     */
    public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P, double balance, Size new_size, double fov_scale) {
        fisheye_estimateNewCameraMatrixForUndistortRectify_0(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj, balance, new_size.width, new_size.height, fov_scale);
    }

    /**
     * Estimates new camera intrinsic matrix for undistortion or rectification.
     *
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param image_size Size of the image
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel
     * @param P New camera intrinsic matrix (3x3) or new projection matrix (3x4)
     * @param balance Sets the new focal length in range between the min focal length and the max focal
     * length. Balance is in range of [0, 1].
     * @param new_size the new size
     */
    public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P, double balance, Size new_size) {
        fisheye_estimateNewCameraMatrixForUndistortRectify_1(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj, balance, new_size.width, new_size.height);
    }

    /**
     * Estimates new camera intrinsic matrix for undistortion or rectification.
     *
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param image_size Size of the image
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel
     * @param P New camera intrinsic matrix (3x3) or new projection matrix (3x4)
     * @param balance Sets the new focal length in range between the min focal length and the max focal
     * length. Balance is in range of [0, 1].
     */
    public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P, double balance) {
        fisheye_estimateNewCameraMatrixForUndistortRectify_2(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj, balance);
    }

    /**
     * Estimates new camera intrinsic matrix for undistortion or rectification.
     *
     * @param K Camera intrinsic matrix \(cameramatrix{K}\).
     * @param image_size Size of the image
     * @param D Input vector of distortion coefficients \(\distcoeffsfisheye\).
     * @param R Rectification transformation in the object space: 3x3 1-channel, or vector: 3x1/1x3
     * 1-channel or 1x1 3-channel
     * @param P New camera intrinsic matrix (3x3) or new projection matrix (3x4)
     * length. Balance is in range of [0, 1].
     */
    public static void fisheye_estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat P) {
        fisheye_estimateNewCameraMatrixForUndistortRectify_3(K.nativeObj, D.nativeObj, image_size.width, image_size.height, R.nativeObj, P.nativeObj);
    }


    //
    // C++:  bool cv::fisheye::solvePnP(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int flags = SOLVEPNP_ITERATIVE, TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 10, 1e-8))
    //

    /**
     * Finds an object pose from 3D-2D point correspondences for fisheye camera model.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   </li>
     *   <li>
     *  point 0: [-squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 1: [ squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 2: [ squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 3: [-squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     * @param criteria Termination criteria for internal undistortPoints call.
     * The function internally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. Check there and Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnP(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int flags, TermCriteria criteria) {
        return fisheye_solvePnP_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, flags, criteria.type, criteria.maxCount, criteria.epsilon);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences for fisheye camera model.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   </li>
     *   <li>
     *  point 0: [-squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 1: [ squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 2: [ squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 3: [-squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     * The function internally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. Check there and Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnP(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int flags) {
        return fisheye_solvePnP_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, flags);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences for fisheye camera model.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   </li>
     *   <li>
     *  point 0: [-squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 1: [ squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 2: [ squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 3: [-squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     * The function internally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. Check there and Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnP(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        return fisheye_solvePnP_2(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences for fisheye camera model.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can also be passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can also be passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * This function returns the rotation and the translation vectors that transform a 3D point expressed in the object
     * coordinate frame to the camera coordinate frame, using different methods:
     * <ul>
     *   <li>
     *  P3P methods (REF: SOLVEPNP_P3P, REF: SOLVEPNP_AP3P): need 4 input points to return a unique solution.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE Input points must be &gt;= 4 and object points must be coplanar.
     *   </li>
     *   <li>
     *  REF: SOLVEPNP_IPPE_SQUARE Special case suitable for marker pose estimation.
     * Number of input points must be 4. Object points must be defined in the following order:
     *   </li>
     *   <li>
     *  point 0: [-squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 1: [ squareLength / 2,  squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 2: [ squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  point 3: [-squareLength / 2, -squareLength / 2, 0]
     *   </li>
     *   <li>
     *  for all the other flags, number of input points must be &gt;= 4 and object points can be in any configuration.
     *   </li>
     * </ul>
     * The function internally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. Check there and Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnP(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        return fisheye_solvePnP_3(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  bool cv::fisheye::solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int iterationsCount = 100, float reprojectionError = 8.0, double confidence = 0.99, Mat& inliers = Mat(), int flags = SOLVEPNP_ITERATIVE, TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 10, 1e-8))
    //

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     * @param inliers Output vector that contains indices of inliers in objectPoints and imagePoints .
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * @param criteria Termination criteria for internal undistortPoints call.
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers, int flags, TermCriteria criteria) {
        return fisheye_solvePnPRansac_0(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj, flags, criteria.type, criteria.maxCount, criteria.epsilon);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     * @param inliers Output vector that contains indices of inliers in objectPoints and imagePoints .
     * @param flags Method for solving a PnP problem: see REF: calib3d_solvePnP_flags
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers, int flags) {
        return fisheye_solvePnPRansac_1(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj, flags);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     * @param inliers Output vector that contains indices of inliers in objectPoints and imagePoints .
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, Mat inliers) {
        return fisheye_solvePnPRansac_2(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence, inliers.nativeObj);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * @param confidence The probability that the algorithm produces a useful result.
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence) {
        return fisheye_solvePnPRansac_3(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError, confidence);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * @param reprojectionError Inlier threshold value used by the RANSAC procedure. The parameter value
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError) {
        return fisheye_solvePnPRansac_4(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount, reprojectionError);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * @param iterationsCount Number of iterations.
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess, int iterationsCount) {
        return fisheye_solvePnPRansac_5(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess, iterationsCount);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * @param useExtrinsicGuess Parameter used for #SOLVEPNP_ITERATIVE. If true (1), the function uses
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec, boolean useExtrinsicGuess) {
        return fisheye_solvePnPRansac_6(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj, useExtrinsicGuess);
    }

    /**
     * Finds an object pose from 3D-2D point correspondences using the RANSAC scheme for fisheye camera moodel.
     *
     * @param objectPoints Array of object points in the object coordinate space, Nx3 1-channel or
     * 1xN/Nx1 3-channel, where N is the number of points. vector&lt;Point3d&gt; can be also passed here.
     * @param imagePoints Array of corresponding image points, Nx2 1-channel or 1xN/Nx1 2-channel,
     * where N is the number of points. vector&lt;Point2d&gt; can be also passed here.
     * @param cameraMatrix Input camera intrinsic matrix \(\cameramatrix{A}\) .
     * @param distCoeffs Input vector of distortion coefficients (4x1/1x4).
     * @param rvec Output rotation vector (see REF: Rodrigues ) that, together with tvec, brings points from
     * the model coordinate system to the camera coordinate system.
     * @param tvec Output translation vector.
     * the provided rvec and tvec values as initial approximations of the rotation and translation
     * vectors, respectively, and further optimizes them.
     * is the maximum allowed distance between the observed and computed point projections to consider it
     * an inlier.
     * The function interally undistorts points with REF: undistortPoints and call REF: cv::solvePnP,
     * thus the input are very similar. More information about Perspective-n-Points is described in REF: calib3d_solvePnP
     * for more information.
     * @return automatically generated
     */
    public static boolean fisheye_solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat rvec, Mat tvec) {
        return fisheye_solvePnPRansac_7(objectPoints.nativeObj, imagePoints.nativeObj, cameraMatrix.nativeObj, distCoeffs.nativeObj, rvec.nativeObj, tvec.nativeObj);
    }


    //
    // C++:  bool cv::buildMST(int numNodes, vector_MSTEdge inputEdges, vector_MSTEdge& resultingEdges, MSTAlgorithm algorithm, int root = 0)
    //

    // Unknown type 'vector_MSTEdge' (I), skipping the function




    // C++:  void cv::approxPolyDP(vector_Point2f curve, vector_Point2f& approxCurve, double epsilon, bool closed)
    private static native void approxPolyDP_0(long curve_mat_nativeObj, long approxCurve_mat_nativeObj, double epsilon, boolean closed);

    // C++:  void cv::approxPolyN(Mat curve, Mat& approxCurve, int nsides, float epsilon_percentage = -1.0, bool ensure_convex = true)
    private static native void approxPolyN_0(long curve_nativeObj, long approxCurve_nativeObj, int nsides, float epsilon_percentage, boolean ensure_convex);
    private static native void approxPolyN_1(long curve_nativeObj, long approxCurve_nativeObj, int nsides, float epsilon_percentage);
    private static native void approxPolyN_2(long curve_nativeObj, long approxCurve_nativeObj, int nsides);

    // C++:  RotatedRect cv::minAreaRect(vector_Point2f points)
    private static native double[] minAreaRect_0(long points_mat_nativeObj);

    // C++:  void cv::boxPoints(RotatedRect box, Mat& points)
    private static native void boxPoints_0(double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, long points_nativeObj);

    // C++:  void cv::minEnclosingCircle(vector_Point2f points, Point2f& center, float& radius)
    private static native void minEnclosingCircle_0(long points_mat_nativeObj, double[] center_out, double[] radius_out);

    // C++:  double cv::minEnclosingTriangle(Mat points, Mat& triangle)
    private static native double minEnclosingTriangle_0(long points_nativeObj, long triangle_nativeObj);

    // C++:  double cv::minEnclosingConvexPolygon(Mat points, Mat& polygon, int k)
    private static native double minEnclosingConvexPolygon_0(long points_nativeObj, long polygon_nativeObj, int k);

    // C++:  Moments cv::moments(Mat array, bool binaryImage = false)
    private static native double[] moments_0(long array_nativeObj, boolean binaryImage);
    private static native double[] moments_1(long array_nativeObj);

    // C++:  void cv::HuMoments(Moments m, Mat& hu)
    private static native void HuMoments_0(double m_m00, double m_m10, double m_m01, double m_m20, double m_m11, double m_m02, double m_m30, double m_m21, double m_m12, double m_m03, long hu_nativeObj);

    // C++:  double cv::matchShapes(Mat contour1, Mat contour2, int method, double parameter)
    private static native double matchShapes_0(long contour1_nativeObj, long contour2_nativeObj, int method, double parameter);

    // C++:  void cv::convexHull(vector_Point points, vector_int& hull, bool clockwise = false,  _hidden_  returnPoints = true)
    private static native void convexHull_0(long points_mat_nativeObj, long hull_mat_nativeObj, boolean clockwise);
    private static native void convexHull_2(long points_mat_nativeObj, long hull_mat_nativeObj);

    // C++:  void cv::convexityDefects(vector_Point contour, vector_int convexhull, vector_Vec4i& convexityDefects)
    private static native void convexityDefects_0(long contour_mat_nativeObj, long convexhull_mat_nativeObj, long convexityDefects_mat_nativeObj);

    // C++:  bool cv::isContourConvex(vector_Point contour)
    private static native boolean isContourConvex_0(long contour_mat_nativeObj);

    // C++:  float cv::intersectConvexConvex(Mat p1, Mat p2, Mat& p12, bool handleNested = true)
    private static native float intersectConvexConvex_0(long p1_nativeObj, long p2_nativeObj, long p12_nativeObj, boolean handleNested);
    private static native float intersectConvexConvex_1(long p1_nativeObj, long p2_nativeObj, long p12_nativeObj);

    // C++:  RotatedRect cv::fitEllipse(vector_Point2f points)
    private static native double[] fitEllipse_0(long points_mat_nativeObj);

    // C++:  RotatedRect cv::fitEllipseAMS(Mat points)
    private static native double[] fitEllipseAMS_0(long points_nativeObj);

    // C++:  RotatedRect cv::fitEllipseDirect(Mat points)
    private static native double[] fitEllipseDirect_0(long points_nativeObj);

    // C++:  void cv::getClosestEllipsePoints(RotatedRect ellipse_params, Mat points, Mat& closest_pts)
    private static native void getClosestEllipsePoints_0(double ellipse_params_center_x, double ellipse_params_center_y, double ellipse_params_size_width, double ellipse_params_size_height, double ellipse_params_angle, long points_nativeObj, long closest_pts_nativeObj);

    // C++:  void cv::fitLine(Mat points, Mat& line, int distType, double param, double reps, double aeps)
    private static native void fitLine_0(long points_nativeObj, long line_nativeObj, int distType, double param, double reps, double aeps);

    // C++:  double cv::pointPolygonTest(vector_Point2f contour, Point2f pt, bool measureDist)
    private static native double pointPolygonTest_0(long contour_mat_nativeObj, double pt_x, double pt_y, boolean measureDist);

    // C++:  int cv::rotatedRectangleIntersection(RotatedRect rect1, RotatedRect rect2, Mat& intersectingRegion)
    private static native int rotatedRectangleIntersection_0(double rect1_center_x, double rect1_center_y, double rect1_size_width, double rect1_size_height, double rect1_angle, double rect2_center_x, double rect2_center_y, double rect2_size_width, double rect2_size_height, double rect2_angle, long intersectingRegion_nativeObj);

    // C++:  double cv::arcLength(vector_Point2f curve, bool closed)
    private static native double arcLength_0(long curve_mat_nativeObj, boolean closed);

    // C++:  double cv::contourArea(Mat contour, bool oriented = false)
    private static native double contourArea_0(long contour_nativeObj, boolean oriented);
    private static native double contourArea_1(long contour_nativeObj);

    // C++:  Rect cv::boundingRect(Mat array)
    private static native double[] boundingRect_0(long array_nativeObj);

    // C++:  Mat cv::getRotationMatrix2D(Point2f center, double angle, double scale)
    private static native long getRotationMatrix2D_0(double center_x, double center_y, double angle, double scale);

    // C++:  void cv::invertAffineTransform(Mat M, Mat& iM)
    private static native void invertAffineTransform_0(long M_nativeObj, long iM_nativeObj);

    // C++:  Mat cv::getPerspectiveTransform(Mat src, Mat dst, int solveMethod = DECOMP_LU)
    private static native long getPerspectiveTransform_0(long src_nativeObj, long dst_nativeObj, int solveMethod);
    private static native long getPerspectiveTransform_1(long src_nativeObj, long dst_nativeObj);

    // C++:  Mat cv::getAffineTransform(vector_Point2f src, vector_Point2f dst)
    private static native long getAffineTransform_0(long src_mat_nativeObj, long dst_mat_nativeObj);

    // C++:  void cv::Rodrigues(Mat src, Mat& dst, Mat& jacobian = Mat())
    private static native void Rodrigues_0(long src_nativeObj, long dst_nativeObj, long jacobian_nativeObj);
    private static native void Rodrigues_1(long src_nativeObj, long dst_nativeObj);

    // C++:  Mat cv::findHomography(vector_Point2f srcPoints, vector_Point2f dstPoints, int method = 0, double ransacReprojThreshold = 3, Mat& mask = Mat(), int maxIters = 2000, double confidence = 0.995)
    private static native long findHomography_0(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method, double ransacReprojThreshold, long mask_nativeObj, int maxIters, double confidence);
    private static native long findHomography_1(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method, double ransacReprojThreshold, long mask_nativeObj, int maxIters);
    private static native long findHomography_2(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method, double ransacReprojThreshold, long mask_nativeObj);
    private static native long findHomography_3(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method, double ransacReprojThreshold);
    private static native long findHomography_4(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, int method);
    private static native long findHomography_5(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj);

    // C++:  Mat cv::findHomography(vector_Point2f srcPoints, vector_Point2f dstPoints, Mat& mask, UsacParams params)
    private static native long findHomography_6(long srcPoints_mat_nativeObj, long dstPoints_mat_nativeObj, long mask_nativeObj, long params_nativeObj);

    // C++:  Vec3d cv::RQDecomp3x3(Mat src, Mat& mtxR, Mat& mtxQ, Mat& Qx = Mat(), Mat& Qy = Mat(), Mat& Qz = Mat())
    private static native double[] RQDecomp3x3_0(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj, long Qx_nativeObj, long Qy_nativeObj, long Qz_nativeObj);
    private static native double[] RQDecomp3x3_1(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj, long Qx_nativeObj, long Qy_nativeObj);
    private static native double[] RQDecomp3x3_2(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj, long Qx_nativeObj);
    private static native double[] RQDecomp3x3_3(long src_nativeObj, long mtxR_nativeObj, long mtxQ_nativeObj);

    // C++:  void cv::decomposeProjectionMatrix(Mat projMatrix, Mat& cameraMatrix, Mat& rotMatrix, Mat& transVect, Mat& rotMatrixX = Mat(), Mat& rotMatrixY = Mat(), Mat& rotMatrixZ = Mat(), Mat& eulerAngles = Mat())
    private static native void decomposeProjectionMatrix_0(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj, long rotMatrixY_nativeObj, long rotMatrixZ_nativeObj, long eulerAngles_nativeObj);
    private static native void decomposeProjectionMatrix_1(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj, long rotMatrixY_nativeObj, long rotMatrixZ_nativeObj);
    private static native void decomposeProjectionMatrix_2(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj, long rotMatrixY_nativeObj);
    private static native void decomposeProjectionMatrix_3(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj, long rotMatrixX_nativeObj);
    private static native void decomposeProjectionMatrix_4(long projMatrix_nativeObj, long cameraMatrix_nativeObj, long rotMatrix_nativeObj, long transVect_nativeObj);

    // C++:  void cv::matMulDeriv(Mat A, Mat B, Mat& dABdA, Mat& dABdB)
    private static native void matMulDeriv_0(long A_nativeObj, long B_nativeObj, long dABdA_nativeObj, long dABdB_nativeObj);

    // C++:  void cv::composeRT(Mat rvec1, Mat tvec1, Mat rvec2, Mat tvec2, Mat& rvec3, Mat& tvec3, Mat& dr3dr1 = Mat(), Mat& dr3dt1 = Mat(), Mat& dr3dr2 = Mat(), Mat& dr3dt2 = Mat(), Mat& dt3dr1 = Mat(), Mat& dt3dt1 = Mat(), Mat& dt3dr2 = Mat(), Mat& dt3dt2 = Mat())
    private static native void composeRT_0(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj, long dt3dt1_nativeObj, long dt3dr2_nativeObj, long dt3dt2_nativeObj);
    private static native void composeRT_1(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj, long dt3dt1_nativeObj, long dt3dr2_nativeObj);
    private static native void composeRT_2(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj, long dt3dt1_nativeObj);
    private static native void composeRT_3(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj, long dt3dr1_nativeObj);
    private static native void composeRT_4(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj, long dr3dt2_nativeObj);
    private static native void composeRT_5(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj, long dr3dr2_nativeObj);
    private static native void composeRT_6(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj, long dr3dt1_nativeObj);
    private static native void composeRT_7(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj, long dr3dr1_nativeObj);
    private static native void composeRT_8(long rvec1_nativeObj, long tvec1_nativeObj, long rvec2_nativeObj, long tvec2_nativeObj, long rvec3_nativeObj, long tvec3_nativeObj);

    // C++:  void cv::projectPoints(vector_Point3f objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, vector_double distCoeffs, vector_Point2f& imagePoints, Mat& jacobian = Mat(), double aspectRatio = 0)
    private static native void projectPoints_0(long objectPoints_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long imagePoints_mat_nativeObj, long jacobian_nativeObj, double aspectRatio);
    private static native void projectPoints_1(long objectPoints_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long imagePoints_mat_nativeObj, long jacobian_nativeObj);
    private static native void projectPoints_2(long objectPoints_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long imagePoints_mat_nativeObj);

    // C++:  void cv::projectPoints(Mat objectPoints, Mat rvec, Mat tvec, Mat cameraMatrix, Mat distCoeffs, Mat& imagePoints, Mat& dpdr, Mat& dpdt, Mat& dpdf = Mat(), Mat& dpdc = Mat(), Mat& dpdk = Mat(), Mat& dpdo = Mat(), double aspectRatio = 0.)
    private static native void projectPointsSepJ_0(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long dpdr_nativeObj, long dpdt_nativeObj, long dpdf_nativeObj, long dpdc_nativeObj, long dpdk_nativeObj, long dpdo_nativeObj, double aspectRatio);
    private static native void projectPointsSepJ_1(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long dpdr_nativeObj, long dpdt_nativeObj, long dpdf_nativeObj, long dpdc_nativeObj, long dpdk_nativeObj, long dpdo_nativeObj);
    private static native void projectPointsSepJ_2(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long dpdr_nativeObj, long dpdt_nativeObj, long dpdf_nativeObj, long dpdc_nativeObj, long dpdk_nativeObj);
    private static native void projectPointsSepJ_3(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long dpdr_nativeObj, long dpdt_nativeObj, long dpdf_nativeObj, long dpdc_nativeObj);
    private static native void projectPointsSepJ_4(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long dpdr_nativeObj, long dpdt_nativeObj, long dpdf_nativeObj);
    private static native void projectPointsSepJ_5(long objectPoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long imagePoints_nativeObj, long dpdr_nativeObj, long dpdt_nativeObj);

    // C++:  bool cv::solvePnP(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, vector_double distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int flags = SOLVEPNP_ITERATIVE)
    private static native boolean solvePnP_0(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int flags);
    private static native boolean solvePnP_1(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native boolean solvePnP_2(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  bool cv::solvePnPRansac(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat cameraMatrix, vector_double distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int iterationsCount = 100, float reprojectionError = 8.0, double confidence = 0.99, Mat& inliers = Mat(), int flags = SOLVEPNP_ITERATIVE)
    private static native boolean solvePnPRansac_0(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, long inliers_nativeObj, int flags);
    private static native boolean solvePnPRansac_1(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, long inliers_nativeObj);
    private static native boolean solvePnPRansac_2(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence);
    private static native boolean solvePnPRansac_3(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError);
    private static native boolean solvePnPRansac_4(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount);
    private static native boolean solvePnPRansac_5(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native boolean solvePnPRansac_6(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  bool cv::solvePnPRansac(vector_Point3f objectPoints, vector_Point2f imagePoints, Mat& cameraMatrix, vector_double distCoeffs, Mat& rvec, Mat& tvec, Mat& inliers, UsacParams params = UsacParams())
    private static native boolean solvePnPRansac_7(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long inliers_nativeObj, long params_nativeObj);
    private static native boolean solvePnPRansac_8(long objectPoints_mat_nativeObj, long imagePoints_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_mat_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long inliers_nativeObj);

    // C++:  int cv::solveP3P(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, int flags)
    private static native int solveP3P_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, int flags);

    // C++:  void cv::solvePnPRefineLM(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, TermCriteria criteria = TermCriteria(TermCriteria::EPS + TermCriteria::COUNT, 20, FLT_EPSILON))
    private static native void solvePnPRefineLM_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native void solvePnPRefineLM_1(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  void cv::solvePnPRefineVVS(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, TermCriteria criteria = TermCriteria(TermCriteria::EPS + TermCriteria::COUNT, 20, FLT_EPSILON), double VVSlambda = 1)
    private static native void solvePnPRefineVVS_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon, double VVSlambda);
    private static native void solvePnPRefineVVS_1(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native void solvePnPRefineVVS_2(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  int cv::solvePnPGeneric(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, vector_Mat& rvecs, vector_Mat& tvecs, bool useExtrinsicGuess = false, int flags = SOLVEPNP_ITERATIVE, Mat rvec = Mat(), Mat tvec = Mat(), Mat& reprojectionError = Mat())
    private static native int solvePnPGeneric_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, boolean useExtrinsicGuess, int flags, long rvec_nativeObj, long tvec_nativeObj, long reprojectionError_nativeObj);
    private static native int solvePnPGeneric_1(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, boolean useExtrinsicGuess, int flags, long rvec_nativeObj, long tvec_nativeObj);
    private static native int solvePnPGeneric_2(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, boolean useExtrinsicGuess, int flags, long rvec_nativeObj);
    private static native int solvePnPGeneric_3(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, boolean useExtrinsicGuess, int flags);
    private static native int solvePnPGeneric_4(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj, boolean useExtrinsicGuess);
    private static native int solvePnPGeneric_5(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvecs_mat_nativeObj, long tvecs_mat_nativeObj);

    // C++:  void cv::convertPointsToHomogeneous(Mat src, Mat& dst, int dtype = -1)
    private static native void convertPointsToHomogeneous_0(long src_nativeObj, long dst_nativeObj, int dtype);
    private static native void convertPointsToHomogeneous_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::convertPointsFromHomogeneous(Mat src, Mat& dst, int dtype = -1)
    private static native void convertPointsFromHomogeneous_0(long src_nativeObj, long dst_nativeObj, int dtype);
    private static native void convertPointsFromHomogeneous_1(long src_nativeObj, long dst_nativeObj);

    // C++:  Mat cv::findFundamentalMat(vector_Point2f points1, vector_Point2f points2, int method, double ransacReprojThreshold, double confidence, int maxIters, Mat& mask = Mat())
    private static native long findFundamentalMat_0(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double ransacReprojThreshold, double confidence, int maxIters, long mask_nativeObj);
    private static native long findFundamentalMat_1(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double ransacReprojThreshold, double confidence, int maxIters);

    // C++:  Mat cv::findFundamentalMat(vector_Point2f points1, vector_Point2f points2, int method = FM_RANSAC, double ransacReprojThreshold = 3., double confidence = 0.99, Mat& mask = Mat())
    private static native long findFundamentalMat_2(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double ransacReprojThreshold, double confidence, long mask_nativeObj);
    private static native long findFundamentalMat_3(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double ransacReprojThreshold, double confidence);
    private static native long findFundamentalMat_4(long points1_mat_nativeObj, long points2_mat_nativeObj, int method, double ransacReprojThreshold);
    private static native long findFundamentalMat_5(long points1_mat_nativeObj, long points2_mat_nativeObj, int method);
    private static native long findFundamentalMat_6(long points1_mat_nativeObj, long points2_mat_nativeObj);

    // C++:  Mat cv::findFundamentalMat(vector_Point2f points1, vector_Point2f points2, Mat& mask, UsacParams params)
    private static native long findFundamentalMat_7(long points1_mat_nativeObj, long points2_mat_nativeObj, long mask_nativeObj, long params_nativeObj);

    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix, int method = RANSAC, double prob = 0.999, double threshold = 1.0, int maxIters = 1000, Mat& mask = Mat())
    private static native long findEssentialMat_0(long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, int method, double prob, double threshold, int maxIters, long mask_nativeObj);
    private static native long findEssentialMat_1(long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, int method, double prob, double threshold, int maxIters);
    private static native long findEssentialMat_2(long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, int method, double prob, double threshold);
    private static native long findEssentialMat_3(long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, int method, double prob);
    private static native long findEssentialMat_4(long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, int method);
    private static native long findEssentialMat_5(long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj);

    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, double focal = 1.0, Point2d pp = Point2d(0, 0), int method = RANSAC, double prob = 0.999, double threshold = 1.0, int maxIters = 1000, Mat& mask = Mat())
    private static native long findEssentialMat_6(long points1_nativeObj, long points2_nativeObj, double focal, double pp_x, double pp_y, int method, double prob, double threshold, int maxIters, long mask_nativeObj);
    private static native long findEssentialMat_7(long points1_nativeObj, long points2_nativeObj, double focal, double pp_x, double pp_y, int method, double prob, double threshold, int maxIters);
    private static native long findEssentialMat_8(long points1_nativeObj, long points2_nativeObj, double focal, double pp_x, double pp_y, int method, double prob, double threshold);
    private static native long findEssentialMat_9(long points1_nativeObj, long points2_nativeObj, double focal, double pp_x, double pp_y, int method, double prob);
    private static native long findEssentialMat_10(long points1_nativeObj, long points2_nativeObj, double focal, double pp_x, double pp_y, int method);
    private static native long findEssentialMat_11(long points1_nativeObj, long points2_nativeObj, double focal, double pp_x, double pp_y);
    private static native long findEssentialMat_12(long points1_nativeObj, long points2_nativeObj, double focal);
    private static native long findEssentialMat_13(long points1_nativeObj, long points2_nativeObj);

    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, int method = RANSAC, double prob = 0.999, double threshold = 1.0, Mat& mask = Mat())
    private static native long findEssentialMat_14(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, int method, double prob, double threshold, long mask_nativeObj);
    private static native long findEssentialMat_15(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, int method, double prob, double threshold);
    private static native long findEssentialMat_16(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, int method, double prob);
    private static native long findEssentialMat_17(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, int method);
    private static native long findEssentialMat_18(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj);

    // C++:  Mat cv::findEssentialMat(Mat points1, Mat points2, Mat cameraMatrix1, Mat cameraMatrix2, Mat dist_coeff1, Mat dist_coeff2, Mat& mask, UsacParams params)
    private static native long findEssentialMat_19(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long cameraMatrix2_nativeObj, long dist_coeff1_nativeObj, long dist_coeff2_nativeObj, long mask_nativeObj, long params_nativeObj);

    // C++:  void cv::decomposeEssentialMat(Mat E, Mat& R1, Mat& R2, Mat& t)
    private static native void decomposeEssentialMat_0(long E_nativeObj, long R1_nativeObj, long R2_nativeObj, long t_nativeObj);

    // C++:  int cv::recoverPose(Mat points1, Mat points2, Mat cameraMatrix1, Mat distCoeffs1, Mat cameraMatrix2, Mat distCoeffs2, Mat& E, Mat& R, Mat& t, int method = cv::RANSAC, double prob = 0.999, double threshold = 1.0, Mat& mask = Mat())
    private static native int recoverPose_0(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, long E_nativeObj, long R_nativeObj, long t_nativeObj, int method, double prob, double threshold, long mask_nativeObj);
    private static native int recoverPose_1(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, long E_nativeObj, long R_nativeObj, long t_nativeObj, int method, double prob, double threshold);
    private static native int recoverPose_2(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, long E_nativeObj, long R_nativeObj, long t_nativeObj, int method, double prob);
    private static native int recoverPose_3(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, long E_nativeObj, long R_nativeObj, long t_nativeObj, int method);
    private static native int recoverPose_4(long points1_nativeObj, long points2_nativeObj, long cameraMatrix1_nativeObj, long distCoeffs1_nativeObj, long cameraMatrix2_nativeObj, long distCoeffs2_nativeObj, long E_nativeObj, long R_nativeObj, long t_nativeObj);

    // C++:  int cv::recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat& R, Mat& t, Mat& mask = Mat())
    private static native int recoverPose_5(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, long R_nativeObj, long t_nativeObj, long mask_nativeObj);
    private static native int recoverPose_6(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, long R_nativeObj, long t_nativeObj);

    // C++:  int cv::recoverPose(Mat E, Mat points1, Mat points2, Mat& R, Mat& t, double focal = 1.0, Point2d pp = Point2d(0, 0), Mat& mask = Mat())
    private static native int recoverPose_7(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long R_nativeObj, long t_nativeObj, double focal, double pp_x, double pp_y, long mask_nativeObj);
    private static native int recoverPose_8(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long R_nativeObj, long t_nativeObj, double focal, double pp_x, double pp_y);
    private static native int recoverPose_9(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long R_nativeObj, long t_nativeObj, double focal);
    private static native int recoverPose_10(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long R_nativeObj, long t_nativeObj);

    // C++:  int cv::recoverPose(Mat E, Mat points1, Mat points2, Mat cameraMatrix, Mat& R, Mat& t, double distanceThresh, Mat& mask = Mat(), Mat& triangulatedPoints = Mat())
    private static native int recoverPose_11(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, long R_nativeObj, long t_nativeObj, double distanceThresh, long mask_nativeObj, long triangulatedPoints_nativeObj);
    private static native int recoverPose_12(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, long R_nativeObj, long t_nativeObj, double distanceThresh, long mask_nativeObj);
    private static native int recoverPose_13(long E_nativeObj, long points1_nativeObj, long points2_nativeObj, long cameraMatrix_nativeObj, long R_nativeObj, long t_nativeObj, double distanceThresh);

    // C++:  void cv::computeCorrespondEpilines(Mat points, int whichImage, Mat F, Mat& lines)
    private static native void computeCorrespondEpilines_0(long points_nativeObj, int whichImage, long F_nativeObj, long lines_nativeObj);

    // C++:  void cv::triangulatePoints(Mat projMatr1, Mat projMatr2, Mat projPoints1, Mat projPoints2, Mat& points4D)
    private static native void triangulatePoints_0(long projMatr1_nativeObj, long projMatr2_nativeObj, long projPoints1_nativeObj, long projPoints2_nativeObj, long points4D_nativeObj);

    // C++:  void cv::correctMatches(Mat F, Mat points1, Mat points2, Mat& newPoints1, Mat& newPoints2)
    private static native void correctMatches_0(long F_nativeObj, long points1_nativeObj, long points2_nativeObj, long newPoints1_nativeObj, long newPoints2_nativeObj);

    // C++:  double cv::sampsonDistance(Mat pt1, Mat pt2, Mat F)
    private static native double sampsonDistance_0(long pt1_nativeObj, long pt2_nativeObj, long F_nativeObj);

    // C++:  bool cv::estimateAffine3D(Mat src, Mat dst, Mat& out, Mat& inliers, double ransacThreshold = 3, double confidence = 0.99)
    private static native boolean estimateAffine3D_0(long src_nativeObj, long dst_nativeObj, long out_nativeObj, long inliers_nativeObj, double ransacThreshold, double confidence);
    private static native boolean estimateAffine3D_1(long src_nativeObj, long dst_nativeObj, long out_nativeObj, long inliers_nativeObj, double ransacThreshold);
    private static native boolean estimateAffine3D_2(long src_nativeObj, long dst_nativeObj, long out_nativeObj, long inliers_nativeObj);

    // C++:  Mat cv::estimateAffine3D(Mat src, Mat dst, double* scale = nullptr, bool force_rotation = true)
    private static native long estimateAffine3D_3(long src_nativeObj, long dst_nativeObj, double[] scale_out, boolean force_rotation);
    private static native long estimateAffine3D_4(long src_nativeObj, long dst_nativeObj, double[] scale_out);
    private static native long estimateAffine3D_5(long src_nativeObj, long dst_nativeObj);

    // C++:  bool cv::estimateTranslation3D(Mat src, Mat dst, Mat& out, Mat& inliers, double ransacThreshold = 3, double confidence = 0.99)
    private static native boolean estimateTranslation3D_0(long src_nativeObj, long dst_nativeObj, long out_nativeObj, long inliers_nativeObj, double ransacThreshold, double confidence);
    private static native boolean estimateTranslation3D_1(long src_nativeObj, long dst_nativeObj, long out_nativeObj, long inliers_nativeObj, double ransacThreshold);
    private static native boolean estimateTranslation3D_2(long src_nativeObj, long dst_nativeObj, long out_nativeObj, long inliers_nativeObj);

    // C++:  Mat cv::estimateAffine2D(Mat from, Mat to, Mat& inliers = Mat(), int method = RANSAC, double ransacReprojThreshold = 3, size_t maxIters = 2000, double confidence = 0.99, size_t refineIters = 10)
    private static native long estimateAffine2D_0(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters);
    private static native long estimateAffine2D_1(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters, double confidence);
    private static native long estimateAffine2D_2(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters);
    private static native long estimateAffine2D_3(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold);
    private static native long estimateAffine2D_4(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method);
    private static native long estimateAffine2D_5(long from_nativeObj, long to_nativeObj, long inliers_nativeObj);
    private static native long estimateAffine2D_6(long from_nativeObj, long to_nativeObj);

    // C++:  Mat cv::estimateAffine2D(Mat pts1, Mat pts2, Mat& inliers, UsacParams params)
    private static native long estimateAffine2D_7(long pts1_nativeObj, long pts2_nativeObj, long inliers_nativeObj, long params_nativeObj);

    // C++:  Mat cv::estimateAffinePartial2D(Mat from, Mat to, Mat& inliers = Mat(), int method = RANSAC, double ransacReprojThreshold = 3, size_t maxIters = 2000, double confidence = 0.99, size_t refineIters = 10)
    private static native long estimateAffinePartial2D_0(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters);
    private static native long estimateAffinePartial2D_1(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters, double confidence);
    private static native long estimateAffinePartial2D_2(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters);
    private static native long estimateAffinePartial2D_3(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold);
    private static native long estimateAffinePartial2D_4(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method);
    private static native long estimateAffinePartial2D_5(long from_nativeObj, long to_nativeObj, long inliers_nativeObj);
    private static native long estimateAffinePartial2D_6(long from_nativeObj, long to_nativeObj);

    // C++:  Vec2d cv::estimateTranslation2D(Mat from, Mat to, Mat& inliers = Mat(), int method = RANSAC, double ransacReprojThreshold = 3, size_t maxIters = 2000, double confidence = 0.99, size_t refineIters = 0)
    private static native double[] estimateTranslation2D_0(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters, double confidence, long refineIters);
    private static native double[] estimateTranslation2D_1(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters, double confidence);
    private static native double[] estimateTranslation2D_2(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold, long maxIters);
    private static native double[] estimateTranslation2D_3(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method, double ransacReprojThreshold);
    private static native double[] estimateTranslation2D_4(long from_nativeObj, long to_nativeObj, long inliers_nativeObj, int method);
    private static native double[] estimateTranslation2D_5(long from_nativeObj, long to_nativeObj, long inliers_nativeObj);
    private static native double[] estimateTranslation2D_6(long from_nativeObj, long to_nativeObj);

    // C++:  int cv::decomposeHomographyMat(Mat H, Mat K, vector_Mat& rotations, vector_Mat& translations, vector_Mat& normals)
    private static native int decomposeHomographyMat_0(long H_nativeObj, long K_nativeObj, long rotations_mat_nativeObj, long translations_mat_nativeObj, long normals_mat_nativeObj);

    // C++:  void cv::filterHomographyDecompByVisibleRefpoints(vector_Mat rotations, vector_Mat normals, Mat beforePoints, Mat afterPoints, Mat& possibleSolutions, Mat pointsMask = Mat())
    private static native void filterHomographyDecompByVisibleRefpoints_0(long rotations_mat_nativeObj, long normals_mat_nativeObj, long beforePoints_nativeObj, long afterPoints_nativeObj, long possibleSolutions_nativeObj, long pointsMask_nativeObj);
    private static native void filterHomographyDecompByVisibleRefpoints_1(long rotations_mat_nativeObj, long normals_mat_nativeObj, long beforePoints_nativeObj, long afterPoints_nativeObj, long possibleSolutions_nativeObj);

    // C++:  void cv::calibrationMatrixValues(Mat cameraMatrix, Size imageSize, double apertureWidth, double apertureHeight, double& fovx, double& fovy, double& focalLength, Point2d& principalPoint, double& aspectRatio)
    private static native void calibrationMatrixValues_0(long cameraMatrix_nativeObj, double imageSize_width, double imageSize_height, double apertureWidth, double apertureHeight, double[] fovx_out, double[] fovy_out, double[] focalLength_out, double[] principalPoint_out, double[] aspectRatio_out);

    // C++:  Mat cv::getDefaultNewCameraMatrix(Mat cameraMatrix, Size imgsize = Size(), bool centerPrincipalPoint = false)
    private static native long getDefaultNewCameraMatrix_0(long cameraMatrix_nativeObj, double imgsize_width, double imgsize_height, boolean centerPrincipalPoint);
    private static native long getDefaultNewCameraMatrix_1(long cameraMatrix_nativeObj, double imgsize_width, double imgsize_height);
    private static native long getDefaultNewCameraMatrix_2(long cameraMatrix_nativeObj);

    // C++:  Mat cv::getOptimalNewCameraMatrix(Mat cameraMatrix, Mat distCoeffs, Size imageSize, double alpha, Size newImgSize = Size(), Rect* validPixROI = 0, bool centerPrincipalPoint = false)
    private static native long getOptimalNewCameraMatrix_0(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha, double newImgSize_width, double newImgSize_height, double[] validPixROI_out, boolean centerPrincipalPoint);
    private static native long getOptimalNewCameraMatrix_1(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha, double newImgSize_width, double newImgSize_height, double[] validPixROI_out);
    private static native long getOptimalNewCameraMatrix_2(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha, double newImgSize_width, double newImgSize_height);
    private static native long getOptimalNewCameraMatrix_3(long cameraMatrix_nativeObj, long distCoeffs_nativeObj, double imageSize_width, double imageSize_height, double alpha);

    // C++:  void cv::undistortPoints(vector_Point2f src, vector_Point2f& dst, Mat cameraMatrix, Mat distCoeffs, Mat R = Mat(), Mat P = Mat(), TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER, 5, 0.01))
    private static native void undistortPoints_0(long src_mat_nativeObj, long dst_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long R_nativeObj, long P_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native void undistortPoints_1(long src_mat_nativeObj, long dst_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long R_nativeObj, long P_nativeObj);
    private static native void undistortPoints_2(long src_mat_nativeObj, long dst_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long R_nativeObj);
    private static native void undistortPoints_3(long src_mat_nativeObj, long dst_mat_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  void cv::undistortImagePoints(Mat src, Mat& dst, Mat cameraMatrix, Mat distCoeffs, TermCriteria arg1 = TermCriteria(TermCriteria::MAX_ITER, 5, 0.01))
    private static native void undistortImagePoints_0(long src_nativeObj, long dst_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, int arg1_type, int arg1_maxCount, double arg1_epsilon);
    private static native void undistortImagePoints_1(long src_nativeObj, long dst_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj);

    // C++:  void cv::fisheye::projectPoints(Mat objectPoints, Mat& imagePoints, Mat rvec, Mat tvec, Mat K, Mat D, double alpha = 0, Mat& jacobian = Mat())
    private static native void fisheye_projectPoints_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long K_nativeObj, long D_nativeObj, double alpha, long jacobian_nativeObj);
    private static native void fisheye_projectPoints_1(long objectPoints_nativeObj, long imagePoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long K_nativeObj, long D_nativeObj, double alpha);
    private static native void fisheye_projectPoints_2(long objectPoints_nativeObj, long imagePoints_nativeObj, long rvec_nativeObj, long tvec_nativeObj, long K_nativeObj, long D_nativeObj);

    // C++:  void cv::fisheye::distortPoints(Mat undistorted, Mat& distorted, Mat K, Mat D, double alpha = 0)
    private static native void fisheye_distortPoints_0(long undistorted_nativeObj, long distorted_nativeObj, long K_nativeObj, long D_nativeObj, double alpha);
    private static native void fisheye_distortPoints_1(long undistorted_nativeObj, long distorted_nativeObj, long K_nativeObj, long D_nativeObj);

    // C++:  void cv::fisheye::distortPoints(Mat undistorted, Mat& distorted, Mat Kundistorted, Mat K, Mat D, double alpha = 0)
    private static native void fisheye_distortPoints_2(long undistorted_nativeObj, long distorted_nativeObj, long Kundistorted_nativeObj, long K_nativeObj, long D_nativeObj, double alpha);
    private static native void fisheye_distortPoints_3(long undistorted_nativeObj, long distorted_nativeObj, long Kundistorted_nativeObj, long K_nativeObj, long D_nativeObj);

    // C++:  void cv::fisheye::undistortPoints(Mat distorted, Mat& undistorted, Mat K, Mat D, Mat R = Mat(), Mat P = Mat(), TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 10, 1e-8))
    private static native void fisheye_undistortPoints_0(long distorted_nativeObj, long undistorted_nativeObj, long K_nativeObj, long D_nativeObj, long R_nativeObj, long P_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native void fisheye_undistortPoints_1(long distorted_nativeObj, long undistorted_nativeObj, long K_nativeObj, long D_nativeObj, long R_nativeObj, long P_nativeObj);
    private static native void fisheye_undistortPoints_2(long distorted_nativeObj, long undistorted_nativeObj, long K_nativeObj, long D_nativeObj, long R_nativeObj);
    private static native void fisheye_undistortPoints_3(long distorted_nativeObj, long undistorted_nativeObj, long K_nativeObj, long D_nativeObj);

    // C++:  void cv::fisheye::estimateNewCameraMatrixForUndistortRectify(Mat K, Mat D, Size image_size, Mat R, Mat& P, double balance = 0.0, Size new_size = Size(), double fov_scale = 1.0)
    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_0(long K_nativeObj, long D_nativeObj, double image_size_width, double image_size_height, long R_nativeObj, long P_nativeObj, double balance, double new_size_width, double new_size_height, double fov_scale);
    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_1(long K_nativeObj, long D_nativeObj, double image_size_width, double image_size_height, long R_nativeObj, long P_nativeObj, double balance, double new_size_width, double new_size_height);
    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_2(long K_nativeObj, long D_nativeObj, double image_size_width, double image_size_height, long R_nativeObj, long P_nativeObj, double balance);
    private static native void fisheye_estimateNewCameraMatrixForUndistortRectify_3(long K_nativeObj, long D_nativeObj, double image_size_width, double image_size_height, long R_nativeObj, long P_nativeObj);

    // C++:  bool cv::fisheye::solvePnP(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int flags = SOLVEPNP_ITERATIVE, TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 10, 1e-8))
    private static native boolean fisheye_solvePnP_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native boolean fisheye_solvePnP_1(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int flags);
    private static native boolean fisheye_solvePnP_2(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native boolean fisheye_solvePnP_3(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

    // C++:  bool cv::fisheye::solvePnPRansac(Mat objectPoints, Mat imagePoints, Mat cameraMatrix, Mat distCoeffs, Mat& rvec, Mat& tvec, bool useExtrinsicGuess = false, int iterationsCount = 100, float reprojectionError = 8.0, double confidence = 0.99, Mat& inliers = Mat(), int flags = SOLVEPNP_ITERATIVE, TermCriteria criteria = TermCriteria(TermCriteria::MAX_ITER + TermCriteria::EPS, 10, 1e-8))
    private static native boolean fisheye_solvePnPRansac_0(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, long inliers_nativeObj, int flags, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native boolean fisheye_solvePnPRansac_1(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, long inliers_nativeObj, int flags);
    private static native boolean fisheye_solvePnPRansac_2(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence, long inliers_nativeObj);
    private static native boolean fisheye_solvePnPRansac_3(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError, double confidence);
    private static native boolean fisheye_solvePnPRansac_4(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount, float reprojectionError);
    private static native boolean fisheye_solvePnPRansac_5(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess, int iterationsCount);
    private static native boolean fisheye_solvePnPRansac_6(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj, boolean useExtrinsicGuess);
    private static native boolean fisheye_solvePnPRansac_7(long objectPoints_nativeObj, long imagePoints_nativeObj, long cameraMatrix_nativeObj, long distCoeffs_nativeObj, long rvec_nativeObj, long tvec_nativeObj);

}
