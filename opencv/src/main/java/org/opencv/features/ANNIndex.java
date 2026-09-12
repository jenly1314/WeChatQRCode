//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features;

import org.opencv.core.Mat;
import org.opencv.features.ANNIndex;

// C++: class ANNIndex
/**
 * *************************************************************************************\
 * Approximate Nearest Neighbors                              *
 * \***************************************************************************************
 */
public class ANNIndex {

    protected final long nativeObj;
    protected ANNIndex(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static ANNIndex __fromPtr__(long addr) { return new ANNIndex(addr); }

    // C++: enum Distance (cv.ANNIndex.Distance)
    public static final int
            DIST_EUCLIDEAN = 0,
            DIST_MANHATTAN = 1,
            DIST_ANGULAR = 2,
            DIST_HAMMING = 3,
            DIST_DOTPRODUCT = 4;


    //
    // C++:  void cv::ANNIndex::addItems(Mat features)
    //

    /**
     * Add feature vectors to index.
     *
     * @param features Matrix containing the feature vectors to index. The size of the matrix is
     *         num_features x feature_dimension.
     */
    public void addItems(Mat features) {
        addItems_0(nativeObj, features.nativeObj);
    }


    //
    // C++:  void cv::ANNIndex::build(int trees = -1)
    //

    /**
     * Build the index.
     *
     * @param trees Number of trees in the index. If not provided, the number is determined automatically
     * in a way that at most 2x as much memory as the features vectors take is used.
     */
    public void build(int trees) {
        build_0(nativeObj, trees);
    }

    /**
     * Build the index.
     *
     * in a way that at most 2x as much memory as the features vectors take is used.
     */
    public void build() {
        build_1(nativeObj);
    }


    //
    // C++:  void cv::ANNIndex::knnSearch(Mat query, Mat& indices, Mat& dists, int knn, int search_k = -1)
    //

    /**
     * Performs a K-nearest neighbor search for given query vector(s) using the index.
     *
     * @param query The query vector(s).
     * @param indices Matrix that will contain the indices of the K-nearest neighbors found, optional.
     * @param dists Matrix that will contain the distances to the K-nearest neighbors found, optional.
     * @param knn Number of nearest neighbors to search for.
     * @param search_k The maximum number of nodes to inspect, which defaults to trees x knn if not provided.
     */
    public void knnSearch(Mat query, Mat indices, Mat dists, int knn, int search_k) {
        knnSearch_0(nativeObj, query.nativeObj, indices.nativeObj, dists.nativeObj, knn, search_k);
    }

    /**
     * Performs a K-nearest neighbor search for given query vector(s) using the index.
     *
     * @param query The query vector(s).
     * @param indices Matrix that will contain the indices of the K-nearest neighbors found, optional.
     * @param dists Matrix that will contain the distances to the K-nearest neighbors found, optional.
     * @param knn Number of nearest neighbors to search for.
     */
    public void knnSearch(Mat query, Mat indices, Mat dists, int knn) {
        knnSearch_1(nativeObj, query.nativeObj, indices.nativeObj, dists.nativeObj, knn);
    }


    //
    // C++:  void cv::ANNIndex::save(String filename, bool prefault = false)
    //

    /**
     * Save the index to disk and loads it. After saving, no more vectors can be added.
     *
     * @param filename Filename of the index to be saved.
     * @param prefault If prefault is set to true, it will pre-read the entire file into memory (using mmap
     * with MAP_POPULATE). Default is false.
     */
    public void save(String filename, boolean prefault) {
        save_0(nativeObj, filename, prefault);
    }

    /**
     * Save the index to disk and loads it. After saving, no more vectors can be added.
     *
     * @param filename Filename of the index to be saved.
     * with MAP_POPULATE). Default is false.
     */
    public void save(String filename) {
        save_1(nativeObj, filename);
    }


    //
    // C++:  void cv::ANNIndex::load(String filename, bool prefault = false)
    //

    /**
     * Loads (mmaps) an index from disk.
     *
     * @param filename Filename of the index to be loaded.
     * @param prefault If prefault is set to true, it will pre-read the entire file into memory (using mmap
     * with MAP_POPULATE). Default is false.
     */
    public void load(String filename, boolean prefault) {
        load_0(nativeObj, filename, prefault);
    }

    /**
     * Loads (mmaps) an index from disk.
     *
     * @param filename Filename of the index to be loaded.
     * with MAP_POPULATE). Default is false.
     */
    public void load(String filename) {
        load_1(nativeObj, filename);
    }


    //
    // C++:  int cv::ANNIndex::getTreeNumber()
    //

    /**
     * Return the number of trees in the index.
     * @return automatically generated
     */
    public int getTreeNumber() {
        return getTreeNumber_0(nativeObj);
    }


    //
    // C++:  int cv::ANNIndex::getItemNumber()
    //

    /**
     * Return the number of feature vectors in the index.
     * @return automatically generated
     */
    public int getItemNumber() {
        return getItemNumber_0(nativeObj);
    }


    //
    // C++:  bool cv::ANNIndex::setOnDiskBuild(String filename)
    //

    /**
     *  Prepare to build the index in the specified file instead of RAM (execute before adding
     * items, no need to save after build)
     *
     * @param filename Filename of the index to be built.
     * @return automatically generated
     */
    public boolean setOnDiskBuild(String filename) {
        return setOnDiskBuild_0(nativeObj, filename);
    }


    //
    // C++:  void cv::ANNIndex::setSeed(int seed)
    //

    /**
     * Initialize the random number generator with the given seed. Only necessary to pass this
     * before adding the items. Will have no effect after calling build() or load().
     *
     * @param seed The given seed of the random number generator. Its value should be within the range of uint32_t.
     */
    public void setSeed(int seed) {
        setSeed_0(nativeObj, seed);
    }


    //
    // C++: static Ptr_ANNIndex cv::ANNIndex::create(int dim, ANNIndex_Distance distType = ANNIndex::DIST_EUCLIDEAN)
    //

    /**
     * Creates an instance of annoy index class with given parameters
     *
     * @param dim The dimension of the feature vector.
     * @param distType Metric to calculate the distance between two feature vectors, can be DIST_EUCLIDEAN,
     *         DIST_MANHATTAN, DIST_ANGULAR, DIST_HAMMING, or DIST_DOTPRODUCT.
     * @return automatically generated
     */
    public static ANNIndex create(int dim, int distType) {
        return ANNIndex.__fromPtr__(create_0(dim, distType));
    }

    /**
     * Creates an instance of annoy index class with given parameters
     *
     * @param dim The dimension of the feature vector.
     *         DIST_MANHATTAN, DIST_ANGULAR, DIST_HAMMING, or DIST_DOTPRODUCT.
     * @return automatically generated
     */
    public static ANNIndex create(int dim) {
        return ANNIndex.__fromPtr__(create_1(dim));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ANNIndex::addItems(Mat features)
    private static native void addItems_0(long nativeObj, long features_nativeObj);

    // C++:  void cv::ANNIndex::build(int trees = -1)
    private static native void build_0(long nativeObj, int trees);
    private static native void build_1(long nativeObj);

    // C++:  void cv::ANNIndex::knnSearch(Mat query, Mat& indices, Mat& dists, int knn, int search_k = -1)
    private static native void knnSearch_0(long nativeObj, long query_nativeObj, long indices_nativeObj, long dists_nativeObj, int knn, int search_k);
    private static native void knnSearch_1(long nativeObj, long query_nativeObj, long indices_nativeObj, long dists_nativeObj, int knn);

    // C++:  void cv::ANNIndex::save(String filename, bool prefault = false)
    private static native void save_0(long nativeObj, String filename, boolean prefault);
    private static native void save_1(long nativeObj, String filename);

    // C++:  void cv::ANNIndex::load(String filename, bool prefault = false)
    private static native void load_0(long nativeObj, String filename, boolean prefault);
    private static native void load_1(long nativeObj, String filename);

    // C++:  int cv::ANNIndex::getTreeNumber()
    private static native int getTreeNumber_0(long nativeObj);

    // C++:  int cv::ANNIndex::getItemNumber()
    private static native int getItemNumber_0(long nativeObj);

    // C++:  bool cv::ANNIndex::setOnDiskBuild(String filename)
    private static native boolean setOnDiskBuild_0(long nativeObj, String filename);

    // C++:  void cv::ANNIndex::setSeed(int seed)
    private static native void setSeed_0(long nativeObj, int seed);

    // C++: static Ptr_ANNIndex cv::ANNIndex::create(int dim, ANNIndex_Distance distType = ANNIndex::DIST_EUCLIDEAN)
    private static native long create_0(int dim, int distType);
    private static native long create_1(int dim);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
