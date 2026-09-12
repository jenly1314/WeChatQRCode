//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgcodecs;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfInt;
import org.opencv.core.Range;
import org.opencv.imgcodecs.Animation;
import org.opencv.utils.Converters;

// C++: class Imgcodecs

public class Imgcodecs {

    // C++: enum ImageMetadataType (cv.ImageMetadataType)
    public static final int
            IMAGE_METADATA_UNKNOWN = -1,
            IMAGE_METADATA_EXIF = 0,
            IMAGE_METADATA_XMP = 1,
            IMAGE_METADATA_ICCP = 2,
            IMAGE_METADATA_CICP = 3,
            IMAGE_METADATA_MAX = 3;


    // C++: enum ImreadModes (cv.ImreadModes)
    public static final int
            IMREAD_UNCHANGED = -1,
            IMREAD_GRAYSCALE = 0,
            IMREAD_COLOR_BGR = 1,
            IMREAD_COLOR = 1,
            IMREAD_ANYDEPTH = 2,
            IMREAD_ANYCOLOR = 4,
            IMREAD_LOAD_GDAL = 8,
            IMREAD_REDUCED_GRAYSCALE_2 = 16,
            IMREAD_REDUCED_COLOR_2 = 17,
            IMREAD_REDUCED_GRAYSCALE_4 = 32,
            IMREAD_REDUCED_COLOR_4 = 33,
            IMREAD_REDUCED_GRAYSCALE_8 = 64,
            IMREAD_REDUCED_COLOR_8 = 65,
            IMREAD_IGNORE_ORIENTATION = 128,
            IMREAD_COLOR_RGB = 256;


    // C++: enum ImwriteBMPCompressionFlags (cv.ImwriteBMPCompressionFlags)
    public static final int
            IMWRITE_BMP_COMPRESSION_RGB = 0,
            IMWRITE_BMP_COMPRESSION_BITFIELDS = 3;


    // C++: enum ImwriteEXRCompressionFlags (cv.ImwriteEXRCompressionFlags)
    public static final int
            IMWRITE_EXR_COMPRESSION_NO = 0,
            IMWRITE_EXR_COMPRESSION_RLE = 1,
            IMWRITE_EXR_COMPRESSION_ZIPS = 2,
            IMWRITE_EXR_COMPRESSION_ZIP = 3,
            IMWRITE_EXR_COMPRESSION_PIZ = 4,
            IMWRITE_EXR_COMPRESSION_PXR24 = 5,
            IMWRITE_EXR_COMPRESSION_B44 = 6,
            IMWRITE_EXR_COMPRESSION_B44A = 7,
            IMWRITE_EXR_COMPRESSION_DWAA = 8,
            IMWRITE_EXR_COMPRESSION_DWAB = 9;


    // C++: enum ImwriteEXRTypeFlags (cv.ImwriteEXRTypeFlags)
    public static final int
            IMWRITE_EXR_TYPE_HALF = 1,
            IMWRITE_EXR_TYPE_FLOAT = 2;


    // C++: enum ImwriteFlags (cv.ImwriteFlags)
    public static final int
            IMWRITE_JPEG_QUALITY = 1,
            IMWRITE_JPEG_PROGRESSIVE = 2,
            IMWRITE_JPEG_OPTIMIZE = 3,
            IMWRITE_JPEG_RST_INTERVAL = 4,
            IMWRITE_JPEG_LUMA_QUALITY = 5,
            IMWRITE_JPEG_CHROMA_QUALITY = 6,
            IMWRITE_JPEG_SAMPLING_FACTOR = 7,
            IMWRITE_PNG_COMPRESSION = 16,
            IMWRITE_PNG_STRATEGY = 17,
            IMWRITE_PNG_BILEVEL = 18,
            IMWRITE_PNG_FILTER = 19,
            IMWRITE_PNG_ZLIBBUFFER_SIZE = 20,
            IMWRITE_PXM_BINARY = 32,
            IMWRITE_EXR_TYPE = (3 << 4) + 0,
            IMWRITE_EXR_COMPRESSION = (3 << 4) + 1,
            IMWRITE_EXR_DWA_COMPRESSION_LEVEL = (3 << 4) + 2,
            IMWRITE_WEBP_QUALITY = 64,
            IMWRITE_WEBP_LOSSLESS_MODE = 65,
            IMWRITE_HDR_COMPRESSION = (5 << 4) + 0,
            IMWRITE_PAM_TUPLETYPE = 128,
            IMWRITE_TIFF_RESUNIT = 256,
            IMWRITE_TIFF_XDPI = 257,
            IMWRITE_TIFF_YDPI = 258,
            IMWRITE_TIFF_COMPRESSION = 259,
            IMWRITE_TIFF_ROWSPERSTRIP = 278,
            IMWRITE_TIFF_PREDICTOR = 317,
            IMWRITE_JPEG2000_COMPRESSION_X1000 = 272,
            IMWRITE_AVIF_QUALITY = 512,
            IMWRITE_AVIF_DEPTH = 513,
            IMWRITE_AVIF_SPEED = 514,
            IMWRITE_JPEGXL_QUALITY = 640,
            IMWRITE_JPEGXL_EFFORT = 641,
            IMWRITE_JPEGXL_DISTANCE = 642,
            IMWRITE_JPEGXL_DECODING_SPEED = 643,
            IMWRITE_BMP_COMPRESSION = 768,
            IMWRITE_GIF_LOOP = 1024,
            IMWRITE_GIF_SPEED = 1025,
            IMWRITE_GIF_QUALITY = 1026,
            IMWRITE_GIF_DITHER = 1027,
            IMWRITE_GIF_TRANSPARENCY = 1028,
            IMWRITE_GIF_COLORTABLE = 1029;


    // C++: enum ImwriteGIFCompressionFlags (cv.ImwriteGIFCompressionFlags)
    public static final int
            IMWRITE_GIF_FAST_NO_DITHER = 1,
            IMWRITE_GIF_FAST_FLOYD_DITHER = 2,
            IMWRITE_GIF_COLORTABLE_SIZE_8 = 3,
            IMWRITE_GIF_COLORTABLE_SIZE_16 = 4,
            IMWRITE_GIF_COLORTABLE_SIZE_32 = 5,
            IMWRITE_GIF_COLORTABLE_SIZE_64 = 6,
            IMWRITE_GIF_COLORTABLE_SIZE_128 = 7,
            IMWRITE_GIF_COLORTABLE_SIZE_256 = 8;


    // C++: enum ImwriteHDRCompressionFlags (cv.ImwriteHDRCompressionFlags)
    public static final int
            IMWRITE_HDR_COMPRESSION_NONE = 0,
            IMWRITE_HDR_COMPRESSION_RLE = 1;


    // C++: enum ImwriteJPEGSamplingFactorParams (cv.ImwriteJPEGSamplingFactorParams)
    public static final int
            IMWRITE_JPEG_SAMPLING_FACTOR_411 = 0x411111,
            IMWRITE_JPEG_SAMPLING_FACTOR_420 = 0x221111,
            IMWRITE_JPEG_SAMPLING_FACTOR_422 = 0x211111,
            IMWRITE_JPEG_SAMPLING_FACTOR_440 = 0x121111,
            IMWRITE_JPEG_SAMPLING_FACTOR_444 = 0x111111;


    // C++: enum ImwritePAMFlags (cv.ImwritePAMFlags)
    public static final int
            IMWRITE_PAM_FORMAT_NULL = 0,
            IMWRITE_PAM_FORMAT_BLACKANDWHITE = 1,
            IMWRITE_PAM_FORMAT_GRAYSCALE = 2,
            IMWRITE_PAM_FORMAT_GRAYSCALE_ALPHA = 3,
            IMWRITE_PAM_FORMAT_RGB = 4,
            IMWRITE_PAM_FORMAT_RGB_ALPHA = 5;


    // C++: enum ImwritePNGFilterFlags (cv.ImwritePNGFilterFlags)
    public static final int
            IMWRITE_PNG_FILTER_NONE = 8,
            IMWRITE_PNG_FILTER_SUB = 16,
            IMWRITE_PNG_FILTER_UP = 32,
            IMWRITE_PNG_FILTER_AVG = 64,
            IMWRITE_PNG_FILTER_PAETH = 128,
            IMWRITE_PNG_FAST_FILTERS = (IMWRITE_PNG_FILTER_NONE | IMWRITE_PNG_FILTER_SUB | IMWRITE_PNG_FILTER_UP),
            IMWRITE_PNG_ALL_FILTERS = (IMWRITE_PNG_FAST_FILTERS | IMWRITE_PNG_FILTER_AVG | IMWRITE_PNG_FILTER_PAETH);


    // C++: enum ImwritePNGFlags (cv.ImwritePNGFlags)
    public static final int
            IMWRITE_PNG_STRATEGY_DEFAULT = 0,
            IMWRITE_PNG_STRATEGY_FILTERED = 1,
            IMWRITE_PNG_STRATEGY_HUFFMAN_ONLY = 2,
            IMWRITE_PNG_STRATEGY_RLE = 3,
            IMWRITE_PNG_STRATEGY_FIXED = 4;


    // C++: enum ImwriteTiffCompressionFlags (cv.ImwriteTiffCompressionFlags)
    public static final int
            IMWRITE_TIFF_COMPRESSION_NONE = 1,
            IMWRITE_TIFF_COMPRESSION_CCITTRLE = 2,
            IMWRITE_TIFF_COMPRESSION_CCITTFAX3 = 3,
            IMWRITE_TIFF_COMPRESSION_CCITT_T4 = 3,
            IMWRITE_TIFF_COMPRESSION_CCITTFAX4 = 4,
            IMWRITE_TIFF_COMPRESSION_CCITT_T6 = 4,
            IMWRITE_TIFF_COMPRESSION_LZW = 5,
            IMWRITE_TIFF_COMPRESSION_OJPEG = 6,
            IMWRITE_TIFF_COMPRESSION_JPEG = 7,
            IMWRITE_TIFF_COMPRESSION_T85 = 9,
            IMWRITE_TIFF_COMPRESSION_T43 = 10,
            IMWRITE_TIFF_COMPRESSION_NEXT = 32766,
            IMWRITE_TIFF_COMPRESSION_CCITTRLEW = 32771,
            IMWRITE_TIFF_COMPRESSION_PACKBITS = 32773,
            IMWRITE_TIFF_COMPRESSION_THUNDERSCAN = 32809,
            IMWRITE_TIFF_COMPRESSION_IT8CTPAD = 32895,
            IMWRITE_TIFF_COMPRESSION_IT8LW = 32896,
            IMWRITE_TIFF_COMPRESSION_IT8MP = 32897,
            IMWRITE_TIFF_COMPRESSION_IT8BL = 32898,
            IMWRITE_TIFF_COMPRESSION_PIXARFILM = 32908,
            IMWRITE_TIFF_COMPRESSION_PIXARLOG = 32909,
            IMWRITE_TIFF_COMPRESSION_DEFLATE = 32946,
            IMWRITE_TIFF_COMPRESSION_ADOBE_DEFLATE = 8,
            IMWRITE_TIFF_COMPRESSION_DCS = 32947,
            IMWRITE_TIFF_COMPRESSION_JBIG = 34661,
            IMWRITE_TIFF_COMPRESSION_SGILOG = 34676,
            IMWRITE_TIFF_COMPRESSION_SGILOG24 = 34677,
            IMWRITE_TIFF_COMPRESSION_JP2000 = 34712,
            IMWRITE_TIFF_COMPRESSION_LERC = 34887,
            IMWRITE_TIFF_COMPRESSION_LZMA = 34925,
            IMWRITE_TIFF_COMPRESSION_ZSTD = 50000,
            IMWRITE_TIFF_COMPRESSION_WEBP = 50001,
            IMWRITE_TIFF_COMPRESSION_JXL = 50002;


    // C++: enum ImwriteTiffPredictorFlags (cv.ImwriteTiffPredictorFlags)
    public static final int
            IMWRITE_TIFF_PREDICTOR_NONE = 1,
            IMWRITE_TIFF_PREDICTOR_HORIZONTAL = 2,
            IMWRITE_TIFF_PREDICTOR_FLOATINGPOINT = 3;


    // C++: enum ImwriteTiffResolutionUnitFlags (cv.ImwriteTiffResolutionUnitFlags)
    public static final int
            IMWRITE_TIFF_RESOLUTION_UNIT_NONE = 1,
            IMWRITE_TIFF_RESOLUTION_UNIT_INCH = 2,
            IMWRITE_TIFF_RESOLUTION_UNIT_CENTIMETER = 3;


    // C++: enum ImwriteWEBPLosslessMode (cv.ImwriteWEBPLosslessMode)
    public static final int
            IMWRITE_WEBP_LOSSLESS_OFF = 0,
            IMWRITE_WEBP_LOSSLESS_ON = 1,
            IMWRITE_WEBP_LOSSLESS_PRESERVE_COLOR = 2;


    //
    // C++:  Mat cv::imread(String filename, int flags = IMREAD_COLOR_BGR)
    //

    /**
     * Loads an image from a file.
     *
     *  imread
     *
     * The {@code imread} function loads an image from the specified file and returns OpenCV matrix. If the image cannot be
     * read (because of a missing file, improper permissions, or unsupported/invalid format), the function
     * returns an empty matrix.
     *
     * Currently, the following file formats are supported:
     *
     * <ul>
     *   <li>
     *    Windows bitmaps - \*.bmp, \*.dib (always supported)
     *   </li>
     *   <li>
     *    GIF files - \*.gif (always supported)
     *   </li>
     *   <li>
     *    JPEG files - \*.jpeg, \*.jpg, \*.jpe (see the *Note* section)
     *   </li>
     *   <li>
     *    JPEG 2000 files - \*.jp2 (see the *Note* section)
     *   </li>
     *   <li>
     *    Portable Network Graphics - \*.png (see the *Note* section)
     *   </li>
     *   <li>
     *    WebP - \*.webp (see the *Note* section)
     *   </li>
     *   <li>
     *    AVIF - \*.avif (see the *Note* section)
     *   </li>
     *   <li>
     *    Portable image format - \*.pbm, \*.pgm, \*.ppm, \*.pxm, \*.pnm (always supported)
     *   </li>
     *   <li>
     *    PFM files - \*.pfm (see the *Note* section)
     *   </li>
     *   <li>
     *    Sun rasters - \*.sr, \*.ras (always supported)
     *   </li>
     *   <li>
     *    TIFF files - \*.tiff, \*.tif (see the *Note* section)
     *   </li>
     *   <li>
     *    OpenEXR Image files - \*.exr (see the *Note* section)
     *   </li>
     *   <li>
     *    Radiance HDR - \*.hdr, \*.pic (always supported)
     *   </li>
     *   <li>
     *    Raster and Vector geospatial data supported by GDAL (see the *Note* section)
     *   </li>
     * </ul>
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *    The function determines the type of an image by its content, not by the file extension.
     *   </li>
     *   <li>
     *    In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     *   </li>
     *   <li>
     *    When using IMREAD_GRAYSCALE, the codec's internal grayscale conversion will be used, if available.
     *     Results may differ from the output of cvtColor().
     *   </li>
     *   <li>
     *    On Microsoft Windows\* and Mac OS\*, the codecs shipped with OpenCV (libjpeg, libpng, libtiff,
     *     and libjasper) are used by default. So, OpenCV can always read JPEGs, PNGs, and TIFFs. On Mac OS,
     *     there is also an option to use native Mac OS image readers. However, beware that currently these
     *     native image loaders give images with different pixel values because of the color management embedded
     *     into Mac OS.
     *   </li>
     *   <li>
     *    On Linux\*, BSD flavors, and other Unix-like open-source operating systems, OpenCV looks for
     *     codecs supplied with the OS. Ensure the relevant packages are installed (including development
     *     files, such as "libjpeg-dev" in Debian\* and Ubuntu\*) to get codec support, or turn
     *     on the OPENCV_BUILD_3RDPARTY_LIBS flag in CMake.
     *   </li>
     *   <li>
     *    If the *WITH_GDAL* flag is set to true in CMake and REF: IMREAD_LOAD_GDAL is used to load the image,
     *     the [GDAL](http://www.gdal.org) driver will be used to decode the image, supporting
     *     [Raster](http://www.gdal.org/formats_list.html) and [Vector](http://www.gdal.org/ogr_formats.html) formats.
     *   </li>
     *   <li>
     *    If EXIF information is embedded in the image file, the EXIF orientation will be taken into account,
     *     and thus the image will be rotated accordingly unless the flags REF: IMREAD_IGNORE_ORIENTATION
     *     or REF: IMREAD_UNCHANGED are passed.
     *   </li>
     *   <li>
     *    Use the IMREAD_UNCHANGED flag to preserve the floating-point values from PFM images.
     *   </li>
     *   <li>
     *    By default, the number of pixels must be less than 2^30. This limit can be changed by setting
     *     the environment variable {@code OPENCV_IO_MAX_IMAGE_PIXELS}. See REF: tutorial_env_reference.
     *   </li>
     * </ul>
     *
     * @param filename Name of the file to be loaded.
     * @param flags Flag that can take values of cv::ImreadModes, default with cv::IMREAD_COLOR_BGR.
     * @return automatically generated
     */
    public static Mat imread(String filename, int flags) {
        return new Mat(imread_0(filename, flags));
    }

    /**
     * Loads an image from a file.
     *
     *  imread
     *
     * The {@code imread} function loads an image from the specified file and returns OpenCV matrix. If the image cannot be
     * read (because of a missing file, improper permissions, or unsupported/invalid format), the function
     * returns an empty matrix.
     *
     * Currently, the following file formats are supported:
     *
     * <ul>
     *   <li>
     *    Windows bitmaps - \*.bmp, \*.dib (always supported)
     *   </li>
     *   <li>
     *    GIF files - \*.gif (always supported)
     *   </li>
     *   <li>
     *    JPEG files - \*.jpeg, \*.jpg, \*.jpe (see the *Note* section)
     *   </li>
     *   <li>
     *    JPEG 2000 files - \*.jp2 (see the *Note* section)
     *   </li>
     *   <li>
     *    Portable Network Graphics - \*.png (see the *Note* section)
     *   </li>
     *   <li>
     *    WebP - \*.webp (see the *Note* section)
     *   </li>
     *   <li>
     *    AVIF - \*.avif (see the *Note* section)
     *   </li>
     *   <li>
     *    Portable image format - \*.pbm, \*.pgm, \*.ppm, \*.pxm, \*.pnm (always supported)
     *   </li>
     *   <li>
     *    PFM files - \*.pfm (see the *Note* section)
     *   </li>
     *   <li>
     *    Sun rasters - \*.sr, \*.ras (always supported)
     *   </li>
     *   <li>
     *    TIFF files - \*.tiff, \*.tif (see the *Note* section)
     *   </li>
     *   <li>
     *    OpenEXR Image files - \*.exr (see the *Note* section)
     *   </li>
     *   <li>
     *    Radiance HDR - \*.hdr, \*.pic (always supported)
     *   </li>
     *   <li>
     *    Raster and Vector geospatial data supported by GDAL (see the *Note* section)
     *   </li>
     * </ul>
     *
     * <b>Note:</b>
     * <ul>
     *   <li>
     *    The function determines the type of an image by its content, not by the file extension.
     *   </li>
     *   <li>
     *    In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     *   </li>
     *   <li>
     *    When using IMREAD_GRAYSCALE, the codec's internal grayscale conversion will be used, if available.
     *     Results may differ from the output of cvtColor().
     *   </li>
     *   <li>
     *    On Microsoft Windows\* and Mac OS\*, the codecs shipped with OpenCV (libjpeg, libpng, libtiff,
     *     and libjasper) are used by default. So, OpenCV can always read JPEGs, PNGs, and TIFFs. On Mac OS,
     *     there is also an option to use native Mac OS image readers. However, beware that currently these
     *     native image loaders give images with different pixel values because of the color management embedded
     *     into Mac OS.
     *   </li>
     *   <li>
     *    On Linux\*, BSD flavors, and other Unix-like open-source operating systems, OpenCV looks for
     *     codecs supplied with the OS. Ensure the relevant packages are installed (including development
     *     files, such as "libjpeg-dev" in Debian\* and Ubuntu\*) to get codec support, or turn
     *     on the OPENCV_BUILD_3RDPARTY_LIBS flag in CMake.
     *   </li>
     *   <li>
     *    If the *WITH_GDAL* flag is set to true in CMake and REF: IMREAD_LOAD_GDAL is used to load the image,
     *     the [GDAL](http://www.gdal.org) driver will be used to decode the image, supporting
     *     [Raster](http://www.gdal.org/formats_list.html) and [Vector](http://www.gdal.org/ogr_formats.html) formats.
     *   </li>
     *   <li>
     *    If EXIF information is embedded in the image file, the EXIF orientation will be taken into account,
     *     and thus the image will be rotated accordingly unless the flags REF: IMREAD_IGNORE_ORIENTATION
     *     or REF: IMREAD_UNCHANGED are passed.
     *   </li>
     *   <li>
     *    Use the IMREAD_UNCHANGED flag to preserve the floating-point values from PFM images.
     *   </li>
     *   <li>
     *    By default, the number of pixels must be less than 2^30. This limit can be changed by setting
     *     the environment variable {@code OPENCV_IO_MAX_IMAGE_PIXELS}. See REF: tutorial_env_reference.
     *   </li>
     * </ul>
     *
     * @param filename Name of the file to be loaded.
     * @return automatically generated
     */
    public static Mat imread(String filename) {
        return new Mat(imread_1(filename));
    }


    //
    // C++:  void cv::imread(String filename, Mat& dst, int flags = IMREAD_COLOR_BGR)
    //

    /**
     * Loads an image from a file.
     *
     * This is an overloaded member function, provided for convenience. It differs from the above function only in what argument(s) it accepts and the return value.
     * @param filename Name of file to be loaded.
     * @param dst object in which the image will be loaded.
     * @param flags Flag that can take values of cv::ImreadModes, default with cv::IMREAD_COLOR_BGR.
     * <b>Note:</b>
     * The image passing through the img parameter can be pre-allocated. The memory is reused if the shape and the type match with the load image.
     */
    public static void imread(String filename, Mat dst, int flags) {
        imread_2(filename, dst.nativeObj, flags);
    }

    /**
     * Loads an image from a file.
     *
     * This is an overloaded member function, provided for convenience. It differs from the above function only in what argument(s) it accepts and the return value.
     * @param filename Name of file to be loaded.
     * @param dst object in which the image will be loaded.
     * <b>Note:</b>
     * The image passing through the img parameter can be pre-allocated. The memory is reused if the shape and the type match with the load image.
     */
    public static void imread(String filename, Mat dst) {
        imread_3(filename, dst.nativeObj);
    }


    //
    // C++:  Mat cv::imreadWithMetadata(String filename, vector_int& metadataTypes, vector_Mat& metadata, int flags)
    //

    /**
     * Reads an image from a file along with associated metadata.
     *
     * This function behaves similarly to cv::imread(), loading an image from the specified file.
     * In addition to the image pixel data, it also attempts to extract any available metadata
     * embedded in the file (such as EXIF, XMP, etc.), depending on file format support.
     *
     * <b>Note:</b> In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     * @param filename Name of the file to be loaded.
     * @param metadataTypes Output vector with types of metadata chunks returned in metadata, see ImageMetadataType.
     * @param metadata Output vector of vectors or vector of matrices to store the retrieved metadata.
     * @param flags Flag that can take values of cv::ImreadModes.
     *
     * @return The loaded image as a cv::Mat object. If the image cannot be read, the function returns an empty matrix.
     */
    public static Mat imreadWithMetadata(String filename, MatOfInt metadataTypes, List<Mat> metadata, int flags) {
        Mat metadataTypes_mat = metadataTypes;
        Mat metadata_mat = new Mat();
        Mat retVal = new Mat(imreadWithMetadata_0(filename, metadataTypes_mat.nativeObj, metadata_mat.nativeObj, flags));
        Converters.Mat_to_vector_Mat(metadata_mat, metadata);
        metadata_mat.release();
        return retVal;
    }


    //
    // C++:  bool cv::imreadmulti(String filename, vector_Mat& mats, int flags = IMREAD_COLOR_BGR)
    //

    /**
     * Loads a multi-page image from a file.
     *
     * The function imreadmulti loads a multi-page image from the specified file into a vector of Mat objects.
     * @param filename Name of file to be loaded.
     * @param mats A vector of Mat objects holding each page.
     * @param flags Flag that can take values of cv::ImreadModes, default with cv::IMREAD_COLOR_BGR.
     * <b>Note:</b> The default flags value was changed from cv::IMREAD_ANYCOLOR to cv::IMREAD_COLOR_BGR for unification.
     * SEE: cv::imread
     * @return automatically generated
     */
    public static boolean imreadmulti(String filename, List<Mat> mats, int flags) {
        Mat mats_mat = new Mat();
        boolean retVal = imreadmulti_0(filename, mats_mat.nativeObj, flags);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }

    /**
     * Loads a multi-page image from a file.
     *
     * The function imreadmulti loads a multi-page image from the specified file into a vector of Mat objects.
     * @param filename Name of file to be loaded.
     * @param mats A vector of Mat objects holding each page.
     * <b>Note:</b> The default flags value was changed from cv::IMREAD_ANYCOLOR to cv::IMREAD_COLOR_BGR for unification.
     * SEE: cv::imread
     * @return automatically generated
     */
    public static boolean imreadmulti(String filename, List<Mat> mats) {
        Mat mats_mat = new Mat();
        boolean retVal = imreadmulti_1(filename, mats_mat.nativeObj);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }


    //
    // C++:  bool cv::imreadmulti(String filename, vector_Mat& mats, int start, int count, int flags = IMREAD_ANYCOLOR)
    //

    /**
     * Loads images of a multi-page image from a file.
     *
     * The function imreadmulti loads a specified range from a multi-page image from the specified file into a vector of Mat objects.
     * @param filename Name of file to be loaded.
     * @param mats A vector of Mat objects holding each page.
     * @param start Start index of the image to load
     * @param count Count number of images to load
     * @param flags Flag that can take values of cv::ImreadModes, default with cv::IMREAD_ANYCOLOR.
     * SEE: cv::imread
     * @return automatically generated
     */
    public static boolean imreadmulti(String filename, List<Mat> mats, int start, int count, int flags) {
        Mat mats_mat = new Mat();
        boolean retVal = imreadmulti_2(filename, mats_mat.nativeObj, start, count, flags);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }

    /**
     * Loads images of a multi-page image from a file.
     *
     * The function imreadmulti loads a specified range from a multi-page image from the specified file into a vector of Mat objects.
     * @param filename Name of file to be loaded.
     * @param mats A vector of Mat objects holding each page.
     * @param start Start index of the image to load
     * @param count Count number of images to load
     * SEE: cv::imread
     * @return automatically generated
     */
    public static boolean imreadmulti(String filename, List<Mat> mats, int start, int count) {
        Mat mats_mat = new Mat();
        boolean retVal = imreadmulti_3(filename, mats_mat.nativeObj, start, count);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }


    //
    // C++:  bool cv::imreadanimation(String filename, Animation& animation, int start = 0, int count = INT16_MAX)
    //

    /**
     * Loads frames from an animated image file into an Animation structure.
     *
     * The function imreadanimation loads frames from an animated image file (e.g., GIF, AVIF, APNG, WEBP) into the provided Animation struct.
     *
     * @param filename A string containing the path to the file.
     * @param animation A reference to an Animation structure where the loaded frames will be stored. It should be initialized before the function is called.
     * @param start The index of the first frame to load. This is optional and defaults to 0.
     * @param count The number of frames to load. This is optional and defaults to 32767.
     *
     * @return Returns true if the file was successfully loaded and frames were extracted; returns false otherwise.
     */
    public static boolean imreadanimation(String filename, Animation animation, int start, int count) {
        return imreadanimation_0(filename, animation.getNativeObjAddr(), start, count);
    }

    /**
     * Loads frames from an animated image file into an Animation structure.
     *
     * The function imreadanimation loads frames from an animated image file (e.g., GIF, AVIF, APNG, WEBP) into the provided Animation struct.
     *
     * @param filename A string containing the path to the file.
     * @param animation A reference to an Animation structure where the loaded frames will be stored. It should be initialized before the function is called.
     * @param start The index of the first frame to load. This is optional and defaults to 0.
     *
     * @return Returns true if the file was successfully loaded and frames were extracted; returns false otherwise.
     */
    public static boolean imreadanimation(String filename, Animation animation, int start) {
        return imreadanimation_1(filename, animation.getNativeObjAddr(), start);
    }

    /**
     * Loads frames from an animated image file into an Animation structure.
     *
     * The function imreadanimation loads frames from an animated image file (e.g., GIF, AVIF, APNG, WEBP) into the provided Animation struct.
     *
     * @param filename A string containing the path to the file.
     * @param animation A reference to an Animation structure where the loaded frames will be stored. It should be initialized before the function is called.
     *
     * @return Returns true if the file was successfully loaded and frames were extracted; returns false otherwise.
     */
    public static boolean imreadanimation(String filename, Animation animation) {
        return imreadanimation_2(filename, animation.getNativeObjAddr());
    }


    //
    // C++:  bool cv::imdecodeanimation(Mat buf, Animation& animation, int start = 0, int count = INT16_MAX)
    //

    /**
     * Loads frames from an animated image buffer into an Animation structure.
     *
     * The function imdecodeanimation loads frames from an animated image buffer (e.g., GIF, AVIF, APNG, WEBP) into the provided Animation struct.
     *
     * @param buf A reference to an InputArray containing the image buffer.
     * @param animation A reference to an Animation structure where the loaded frames will be stored. It should be initialized before the function is called.
     * @param start The index of the first frame to load. This is optional and defaults to 0.
     * @param count The number of frames to load. This is optional and defaults to 32767.
     *
     * @return Returns true if the buffer was successfully loaded and frames were extracted; returns false otherwise.
     */
    public static boolean imdecodeanimation(Mat buf, Animation animation, int start, int count) {
        return imdecodeanimation_0(buf.nativeObj, animation.getNativeObjAddr(), start, count);
    }

    /**
     * Loads frames from an animated image buffer into an Animation structure.
     *
     * The function imdecodeanimation loads frames from an animated image buffer (e.g., GIF, AVIF, APNG, WEBP) into the provided Animation struct.
     *
     * @param buf A reference to an InputArray containing the image buffer.
     * @param animation A reference to an Animation structure where the loaded frames will be stored. It should be initialized before the function is called.
     * @param start The index of the first frame to load. This is optional and defaults to 0.
     *
     * @return Returns true if the buffer was successfully loaded and frames were extracted; returns false otherwise.
     */
    public static boolean imdecodeanimation(Mat buf, Animation animation, int start) {
        return imdecodeanimation_1(buf.nativeObj, animation.getNativeObjAddr(), start);
    }

    /**
     * Loads frames from an animated image buffer into an Animation structure.
     *
     * The function imdecodeanimation loads frames from an animated image buffer (e.g., GIF, AVIF, APNG, WEBP) into the provided Animation struct.
     *
     * @param buf A reference to an InputArray containing the image buffer.
     * @param animation A reference to an Animation structure where the loaded frames will be stored. It should be initialized before the function is called.
     *
     * @return Returns true if the buffer was successfully loaded and frames were extracted; returns false otherwise.
     */
    public static boolean imdecodeanimation(Mat buf, Animation animation) {
        return imdecodeanimation_2(buf.nativeObj, animation.getNativeObjAddr());
    }


    //
    // C++:  bool cv::imwriteanimation(String filename, Animation animation, vector_int params = std::vector<int>())
    //

    /**
     * Saves an Animation to a specified file.
     *
     * The function imwriteanimation saves the provided Animation data to the specified file in an animated format.
     * Supported formats depend on the implementation and may include formats like GIF, AVIF, APNG, or WEBP.
     *
     * @param filename The name of the file where the animation will be saved. The file extension determines the format.
     * @param animation A constant reference to an Animation struct containing the frames and metadata to be saved.
     * @param params Optional format-specific parameters encoded as pairs (paramId_1, paramValue_1, paramId_2, paramValue_2, ...).
     * These parameters are used to specify additional options for the encoding process. Refer to {@code cv::ImwriteFlags} for details on possible parameters.
     *
     * @return Returns true if the animation was successfully saved; returns false otherwise.
     */
    public static boolean imwriteanimation(String filename, Animation animation, MatOfInt params) {
        Mat params_mat = params;
        return imwriteanimation_0(filename, animation.getNativeObjAddr(), params_mat.nativeObj);
    }

    /**
     * Saves an Animation to a specified file.
     *
     * The function imwriteanimation saves the provided Animation data to the specified file in an animated format.
     * Supported formats depend on the implementation and may include formats like GIF, AVIF, APNG, or WEBP.
     *
     * @param filename The name of the file where the animation will be saved. The file extension determines the format.
     * @param animation A constant reference to an Animation struct containing the frames and metadata to be saved.
     * These parameters are used to specify additional options for the encoding process. Refer to {@code cv::ImwriteFlags} for details on possible parameters.
     *
     * @return Returns true if the animation was successfully saved; returns false otherwise.
     */
    public static boolean imwriteanimation(String filename, Animation animation) {
        return imwriteanimation_1(filename, animation.getNativeObjAddr());
    }


    //
    // C++:  bool cv::imencodeanimation(String ext, Animation animation, vector_uchar& buf, vector_int params = std::vector<int>())
    //

    /**
     * Encodes an Animation to a memory buffer.
     *
     * The function imencodeanimation encodes the provided Animation data into a memory
     * buffer in an animated format. Supported formats depend on the implementation and
     * may include formats like GIF, AVIF, APNG, or WEBP.
     *
     * @param ext The file extension that determines the format of the encoded data.
     * @param animation A constant reference to an Animation struct containing the
     * frames and metadata to be encoded.
     * @param buf A reference to a vector of unsigned chars where the encoded data will
     * be stored.
     * @param params Optional format-specific parameters encoded as pairs (paramId_1,
     * paramValue_1, paramId_2, paramValue_2, ...). These parameters are used to
     * specify additional options for the encoding process. Refer to {@code cv::ImwriteFlags}
     * for details on possible parameters.
     *
     * @return Returns true if the animation was successfully encoded; returns false otherwise.
     */
    public static boolean imencodeanimation(String ext, Animation animation, MatOfByte buf, MatOfInt params) {
        Mat buf_mat = buf;
        Mat params_mat = params;
        return imencodeanimation_0(ext, animation.getNativeObjAddr(), buf_mat.nativeObj, params_mat.nativeObj);
    }

    /**
     * Encodes an Animation to a memory buffer.
     *
     * The function imencodeanimation encodes the provided Animation data into a memory
     * buffer in an animated format. Supported formats depend on the implementation and
     * may include formats like GIF, AVIF, APNG, or WEBP.
     *
     * @param ext The file extension that determines the format of the encoded data.
     * @param animation A constant reference to an Animation struct containing the
     * frames and metadata to be encoded.
     * @param buf A reference to a vector of unsigned chars where the encoded data will
     * be stored.
     * paramValue_1, paramId_2, paramValue_2, ...). These parameters are used to
     * specify additional options for the encoding process. Refer to {@code cv::ImwriteFlags}
     * for details on possible parameters.
     *
     * @return Returns true if the animation was successfully encoded; returns false otherwise.
     */
    public static boolean imencodeanimation(String ext, Animation animation, MatOfByte buf) {
        Mat buf_mat = buf;
        return imencodeanimation_1(ext, animation.getNativeObjAddr(), buf_mat.nativeObj);
    }


    //
    // C++:  size_t cv::imcount(String filename, int flags = IMREAD_COLOR_BGR)
    //

    /**
     * Returns the number of images inside the given file
     *
     * The function imcount returns the number of pages in a multi-page image (e.g. TIFF), the number of frames in an animation (e.g. AVIF), and 1 otherwise.
     * If the image cannot be decoded, 0 is returned.
     * @param filename Name of file to be loaded.
     * @param flags Flag that can take values of cv::ImreadModes, default with cv::IMREAD_COLOR_BGR.
     * <b>Note:</b> The default flags value was changed from cv::IMREAD_ANYCOLOR to cv::IMREAD_COLOR_BGR for unification.
     * TODO: when cv::IMREAD_LOAD_GDAL flag used the return value will be 0 or 1 because OpenCV's GDAL decoder doesn't support multi-page reading yet.
     * @return automatically generated
     */
    public static long imcount(String filename, int flags) {
        return imcount_0(filename, flags);
    }

    /**
     * Returns the number of images inside the given file
     *
     * The function imcount returns the number of pages in a multi-page image (e.g. TIFF), the number of frames in an animation (e.g. AVIF), and 1 otherwise.
     * If the image cannot be decoded, 0 is returned.
     * @param filename Name of file to be loaded.
     * <b>Note:</b> The default flags value was changed from cv::IMREAD_ANYCOLOR to cv::IMREAD_COLOR_BGR for unification.
     * TODO: when cv::IMREAD_LOAD_GDAL flag used the return value will be 0 or 1 because OpenCV's GDAL decoder doesn't support multi-page reading yet.
     * @return automatically generated
     */
    public static long imcount(String filename) {
        return imcount_1(filename);
    }


    //
    // C++:  bool cv::imwrite(String filename, Mat img, vector_int params = std::vector<int>())
    //

    /**
     * Saves an image to a specified file.
     *
     * The function imwrite saves the image to the specified file. The image format is chosen based on the
     * filename extension (see cv::imread for the list of extensions). In general, only 8-bit unsigned (CV_8U)
     * single-channel or 3-channel (with 'BGR' channel order) images
     * can be saved using this function, with these exceptions:
     *
     * <ul>
     *   <li>
     *  With BMP encoder, 8-bit unsigned (CV_8U) images can be saved.
     *   <ul>
     *     <li>
     *    BMP images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255.
     *     OpenCV v4.13.0 or later use BI_BITFIELDS compression as default. See IMWRITE_BMP_COMPRESSION.
     *     </li>
     *   </ul>
     *   <li>
     *  With OpenEXR encoder, only 32-bit float (CV_32F) images can be saved. More than 4 channels can be saved. (imread can load it then.)
     *   <ul>
     *     <li>
     *    8-bit unsigned (CV_8U) images are not supported.
     *     </li>
     *   </ul>
     *   <li>
     *  With Radiance HDR encoder, non 64-bit float (CV_64F) images can be saved.
     *   <ul>
     *     <li>
     *    All images will be converted to 32-bit float (CV_32F).
     *     </li>
     *   </ul>
     *   <li>
     *  With JPEG 2000 encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   </li>
     *   <li>
     *  With JPEG XL encoder, 8-bit unsigned (CV_8U), 16-bit unsigned (CV_16U) and 32-bit float(CV_32F) images can be saved.
     *   <ul>
     *     <li>
     *    JPEG XL images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) / 16-bit 4-channel (CV_16UC4) / 32-bit float 4-channel (CV_32FC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255/65535/1.0.
     *     </li>
     *   </ul>
     *   <li>
     *  With PAM encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   </li>
     *   <li>
     *  With PNG encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   <ul>
     *     <li>
     *    PNG images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) / 16-bit 4-channel (CV_16UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255/65535(see the code sample below).
     *     </li>
     *   </ul>
     *   <li>
     *  With PGM/PPM encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   </li>
     *   <li>
     *  With TIFF encoder, 8-bit unsigned (CV_8U), 8-bit signed (CV_8S),
     *                      16-bit unsigned (CV_16U), 16-bit signed (CV_16S),
     *                      32-bit unsigned (CV_32U), 32-bit signed (CV_32S),
     *                      64-bit unsigned (CV_64U), 64-bit signed (CV_64S),
     *                      32-bit float (CV_32F) and 64-bit float (CV_64F) images can be saved.
     *   <ul>
     *     <li>
     *    Multiple images (vector of Mat) can be saved in TIFF format (see the code sample below).
     *     </li>
     *     <li>
     *    32-bit float 3-channel (CV_32FC3) TIFF images can be saved
     *     using the LogLuv high dynamic range encoding (4 bytes per pixel) through TIFF_COMPRESSION_SGILOG or
     *     (3 bytes per pixel) through TIFF_COMPRESSION_SGILOG24.
     *     </li>
     *     <li>
     *    Other compression schemes (LZW...) are supported as well for 32F depth, but the efficiency might not
     *     be very good for the floating-point representation bit patterns.
     *     </li>
     *   </ul>
     *   <li>
     *  With GIF encoder, 8-bit unsigned (CV_8U) images can be saved.
     *   <ul>
     *     <li>
     *    GIF images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255.
     *     </li>
     *     <li>
     *    8-bit single-channel images (CV_8UC1) are not supported due to GIF's limitation to indexed color formats.
     *     </li>
     *   </ul>
     *   <li>
     *  With AVIF encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   <ul>
     *     <li>
     *    CV_16U images can be saved as only 10-bit or 12-bit (not 16-bit). See IMWRITE_AVIF_DEPTH.
     *     </li>
     *     <li>
     *    AVIF images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) / 16-bit 4-channel (CV_16UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255 (8-bit) / 1023 (10-bit) / 4095 (12-bit) (see the code sample below).
     *     </li>
     *   </ul>
     *
     * If the image format is not supported, the image will be converted to 8-bit unsigned (CV_8U) and saved that way.
     *   </li>
     * </ul>
     *
     * If the format, depth or channel order is different, use
     * Mat::convertTo and cv::cvtColor to convert it before saving. Or, use the universal FileStorage I/O
     * functions to save the image to XML or YAML format.
     *
     * The sample below shows how to create a BGRA image, how to set custom compression parameters and save it to a PNG file.
     * It also demonstrates how to save multiple images in a TIFF file:
     * INCLUDE: snippets/imgcodecs_imwrite.cpp
     * @param filename Name of the file.
     * @param img (Mat or vector of Mat) Image or Images to be saved.
     * @param params Format-specific parameters encoded as pairs (paramId_1, paramValue_1, paramId_2, paramValue_2, ... .) see cv::ImwriteFlags
     * @return true if the image is successfully written to the specified file; false otherwise.
     */
    public static boolean imwrite(String filename, Mat img, MatOfInt params) {
        Mat params_mat = params;
        return imwrite_0(filename, img.nativeObj, params_mat.nativeObj);
    }

    /**
     * Saves an image to a specified file.
     *
     * The function imwrite saves the image to the specified file. The image format is chosen based on the
     * filename extension (see cv::imread for the list of extensions). In general, only 8-bit unsigned (CV_8U)
     * single-channel or 3-channel (with 'BGR' channel order) images
     * can be saved using this function, with these exceptions:
     *
     * <ul>
     *   <li>
     *  With BMP encoder, 8-bit unsigned (CV_8U) images can be saved.
     *   <ul>
     *     <li>
     *    BMP images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255.
     *     OpenCV v4.13.0 or later use BI_BITFIELDS compression as default. See IMWRITE_BMP_COMPRESSION.
     *     </li>
     *   </ul>
     *   <li>
     *  With OpenEXR encoder, only 32-bit float (CV_32F) images can be saved. More than 4 channels can be saved. (imread can load it then.)
     *   <ul>
     *     <li>
     *    8-bit unsigned (CV_8U) images are not supported.
     *     </li>
     *   </ul>
     *   <li>
     *  With Radiance HDR encoder, non 64-bit float (CV_64F) images can be saved.
     *   <ul>
     *     <li>
     *    All images will be converted to 32-bit float (CV_32F).
     *     </li>
     *   </ul>
     *   <li>
     *  With JPEG 2000 encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   </li>
     *   <li>
     *  With JPEG XL encoder, 8-bit unsigned (CV_8U), 16-bit unsigned (CV_16U) and 32-bit float(CV_32F) images can be saved.
     *   <ul>
     *     <li>
     *    JPEG XL images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) / 16-bit 4-channel (CV_16UC4) / 32-bit float 4-channel (CV_32FC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255/65535/1.0.
     *     </li>
     *   </ul>
     *   <li>
     *  With PAM encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   </li>
     *   <li>
     *  With PNG encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   <ul>
     *     <li>
     *    PNG images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) / 16-bit 4-channel (CV_16UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255/65535(see the code sample below).
     *     </li>
     *   </ul>
     *   <li>
     *  With PGM/PPM encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   </li>
     *   <li>
     *  With TIFF encoder, 8-bit unsigned (CV_8U), 8-bit signed (CV_8S),
     *                      16-bit unsigned (CV_16U), 16-bit signed (CV_16S),
     *                      32-bit unsigned (CV_32U), 32-bit signed (CV_32S),
     *                      64-bit unsigned (CV_64U), 64-bit signed (CV_64S),
     *                      32-bit float (CV_32F) and 64-bit float (CV_64F) images can be saved.
     *   <ul>
     *     <li>
     *    Multiple images (vector of Mat) can be saved in TIFF format (see the code sample below).
     *     </li>
     *     <li>
     *    32-bit float 3-channel (CV_32FC3) TIFF images can be saved
     *     using the LogLuv high dynamic range encoding (4 bytes per pixel) through TIFF_COMPRESSION_SGILOG or
     *     (3 bytes per pixel) through TIFF_COMPRESSION_SGILOG24.
     *     </li>
     *     <li>
     *    Other compression schemes (LZW...) are supported as well for 32F depth, but the efficiency might not
     *     be very good for the floating-point representation bit patterns.
     *     </li>
     *   </ul>
     *   <li>
     *  With GIF encoder, 8-bit unsigned (CV_8U) images can be saved.
     *   <ul>
     *     <li>
     *    GIF images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255.
     *     </li>
     *     <li>
     *    8-bit single-channel images (CV_8UC1) are not supported due to GIF's limitation to indexed color formats.
     *     </li>
     *   </ul>
     *   <li>
     *  With AVIF encoder, 8-bit unsigned (CV_8U) and 16-bit unsigned (CV_16U) images can be saved.
     *   <ul>
     *     <li>
     *    CV_16U images can be saved as only 10-bit or 12-bit (not 16-bit). See IMWRITE_AVIF_DEPTH.
     *     </li>
     *     <li>
     *    AVIF images with an alpha channel can be saved using this function.
     *     To achieve this, create an 8-bit 4-channel (CV_8UC4) / 16-bit 4-channel (CV_16UC4) BGRA image, ensuring the alpha channel is the last component.
     *     Fully transparent pixels should have an alpha value of 0, while fully opaque pixels should have an alpha value of 255 (8-bit) / 1023 (10-bit) / 4095 (12-bit) (see the code sample below).
     *     </li>
     *   </ul>
     *
     * If the image format is not supported, the image will be converted to 8-bit unsigned (CV_8U) and saved that way.
     *   </li>
     * </ul>
     *
     * If the format, depth or channel order is different, use
     * Mat::convertTo and cv::cvtColor to convert it before saving. Or, use the universal FileStorage I/O
     * functions to save the image to XML or YAML format.
     *
     * The sample below shows how to create a BGRA image, how to set custom compression parameters and save it to a PNG file.
     * It also demonstrates how to save multiple images in a TIFF file:
     * INCLUDE: snippets/imgcodecs_imwrite.cpp
     * @param filename Name of the file.
     * @param img (Mat or vector of Mat) Image or Images to be saved.
     * @return true if the image is successfully written to the specified file; false otherwise.
     */
    public static boolean imwrite(String filename, Mat img) {
        return imwrite_1(filename, img.nativeObj);
    }


    //
    // C++:  bool cv::imwriteWithMetadata(String filename, Mat img, vector_int metadataTypes, vector_Mat metadata, vector_int params = std::vector<int>())
    //

    /**
     * Saves an image to a specified file with metadata
     *
     * The function imwriteWithMetadata saves the image to the specified file. It does the same thing as imwrite, but additionally writes metadata if the corresponding format supports it.
     * @param filename Name of the file. As with imwrite, image format is determined by the file extension.
     * @param img (Mat or vector of Mat) Image or Images to be saved.
     * @param metadataTypes Vector with types of metadata chucks stored in metadata to write, see ImageMetadataType.
     * @param metadata Vector of vectors or vector of matrices with chunks of metadata to store into the file
     * @param params Format-specific parameters encoded as pairs (paramId_1, paramValue_1, paramId_2, paramValue_2, ... .) see cv::ImwriteFlags
     * @return automatically generated
     */
    public static boolean imwriteWithMetadata(String filename, Mat img, MatOfInt metadataTypes, List<Mat> metadata, MatOfInt params) {
        Mat metadataTypes_mat = metadataTypes;
        Mat metadata_mat = Converters.vector_Mat_to_Mat(metadata);
        Mat params_mat = params;
        return imwriteWithMetadata_0(filename, img.nativeObj, metadataTypes_mat.nativeObj, metadata_mat.nativeObj, params_mat.nativeObj);
    }

    /**
     * Saves an image to a specified file with metadata
     *
     * The function imwriteWithMetadata saves the image to the specified file. It does the same thing as imwrite, but additionally writes metadata if the corresponding format supports it.
     * @param filename Name of the file. As with imwrite, image format is determined by the file extension.
     * @param img (Mat or vector of Mat) Image or Images to be saved.
     * @param metadataTypes Vector with types of metadata chucks stored in metadata to write, see ImageMetadataType.
     * @param metadata Vector of vectors or vector of matrices with chunks of metadata to store into the file
     * @return automatically generated
     */
    public static boolean imwriteWithMetadata(String filename, Mat img, MatOfInt metadataTypes, List<Mat> metadata) {
        Mat metadataTypes_mat = metadataTypes;
        Mat metadata_mat = Converters.vector_Mat_to_Mat(metadata);
        return imwriteWithMetadata_1(filename, img.nativeObj, metadataTypes_mat.nativeObj, metadata_mat.nativeObj);
    }


    //
    // C++:  bool cv::imwritemulti(String filename, vector_Mat img, vector_int params = std::vector<int>())
    //

    public static boolean imwritemulti(String filename, List<Mat> img, MatOfInt params) {
        Mat img_mat = Converters.vector_Mat_to_Mat(img);
        Mat params_mat = params;
        return imwritemulti_0(filename, img_mat.nativeObj, params_mat.nativeObj);
    }

    public static boolean imwritemulti(String filename, List<Mat> img) {
        Mat img_mat = Converters.vector_Mat_to_Mat(img);
        return imwritemulti_1(filename, img_mat.nativeObj);
    }


    //
    // C++:  Mat cv::imdecode(Mat buf, int flags)
    //

    /**
     * Reads an image from a buffer in memory.
     *
     * The function imdecode reads an image from the specified buffer in the memory. If the buffer is too short or
     * contains invalid data, the function returns an empty matrix ( Mat::data==NULL ).
     *
     * See cv::imread for the list of supported formats and flags description.
     *
     * <b>Note:</b> In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     * @param buf Input array or vector of bytes.
     * @param flags Flag that can take values of cv::ImreadModes.
     * @return automatically generated
     */
    public static Mat imdecode(Mat buf, int flags) {
        return new Mat(imdecode_0(buf.nativeObj, flags));
    }


    //
    // C++:  Mat cv::imdecodeWithMetadata(Mat buf, vector_int& metadataTypes, vector_Mat& metadata, int flags)
    //

    /**
     * Reads an image from a memory buffer and extracts associated metadata.
     *
     * This function decodes an image from the specified memory buffer. If the buffer is too short or
     * contains invalid data, the function returns an empty matrix ( Mat::data==NULL ).
     *
     * See cv::imread for the list of supported formats and flags description.
     *
     * <b>Note:</b> In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     * @param buf Input array or vector of bytes containing the encoded image data.
     * @param metadataTypes Output vector with types of metadata chucks returned in metadata, see cv::ImageMetadataType
     * @param metadata Output vector of vectors or vector of matrices to store the retrieved metadata
     * @param flags Flag that can take values of cv::ImreadModes.
     *
     * @return The decoded image as a cv::Mat object. If decoding fails, the function returns an empty matrix.
     */
    public static Mat imdecodeWithMetadata(Mat buf, MatOfInt metadataTypes, List<Mat> metadata, int flags) {
        Mat metadataTypes_mat = metadataTypes;
        Mat metadata_mat = new Mat();
        Mat retVal = new Mat(imdecodeWithMetadata_0(buf.nativeObj, metadataTypes_mat.nativeObj, metadata_mat.nativeObj, flags));
        Converters.Mat_to_vector_Mat(metadata_mat, metadata);
        metadata_mat.release();
        return retVal;
    }


    //
    // C++:  bool cv::imdecodemulti(Mat buf, int flags, vector_Mat& mats, Range range = Range::all())
    //

    /**
     * Reads a multi-page image from a buffer in memory.
     *
     * The function imdecodemulti reads a multi-page image from the specified buffer in the memory. If the buffer is too short or
     * contains invalid data, the function returns false.
     *
     * See cv::imreadmulti for the list of supported formats and flags description.
     *
     * <b>Note:</b> In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     * @param buf Input array or vector of bytes.
     * @param flags Flag that can take values of cv::ImreadModes.
     * @param mats A vector of Mat objects holding each page, if more than one.
     * @param range A continuous selection of pages.
     * @return automatically generated
     */
    public static boolean imdecodemulti(Mat buf, int flags, List<Mat> mats, Range range) {
        Mat mats_mat = new Mat();
        boolean retVal = imdecodemulti_0(buf.nativeObj, flags, mats_mat.nativeObj, range.start, range.end);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }

    /**
     * Reads a multi-page image from a buffer in memory.
     *
     * The function imdecodemulti reads a multi-page image from the specified buffer in the memory. If the buffer is too short or
     * contains invalid data, the function returns false.
     *
     * See cv::imreadmulti for the list of supported formats and flags description.
     *
     * <b>Note:</b> In the case of color images, the decoded images will have the channels stored in <b>B G R</b> order.
     * @param buf Input array or vector of bytes.
     * @param flags Flag that can take values of cv::ImreadModes.
     * @param mats A vector of Mat objects holding each page, if more than one.
     * @return automatically generated
     */
    public static boolean imdecodemulti(Mat buf, int flags, List<Mat> mats) {
        Mat mats_mat = new Mat();
        boolean retVal = imdecodemulti_1(buf.nativeObj, flags, mats_mat.nativeObj);
        Converters.Mat_to_vector_Mat(mats_mat, mats);
        mats_mat.release();
        return retVal;
    }


    //
    // C++:  bool cv::imencode(String ext, Mat img, vector_uchar& buf, vector_int params = std::vector<int>())
    //

    /**
     * Encodes an image into a memory buffer.
     *
     * The function imencode compresses the image and stores it in the memory buffer that is resized to fit the
     * result. See cv::imwrite for the list of supported formats and flags description.
     *
     * @param ext File extension that defines the output format. Must include a leading period.
     * @param img Image to be compressed.
     * @param buf Output buffer resized to fit the compressed image.
     * @param params Format-specific parameters. See cv::imwrite and cv::ImwriteFlags.
     * @return automatically generated
     */
    public static boolean imencode(String ext, Mat img, MatOfByte buf, MatOfInt params) {
        Mat buf_mat = buf;
        Mat params_mat = params;
        return imencode_0(ext, img.nativeObj, buf_mat.nativeObj, params_mat.nativeObj);
    }

    /**
     * Encodes an image into a memory buffer.
     *
     * The function imencode compresses the image and stores it in the memory buffer that is resized to fit the
     * result. See cv::imwrite for the list of supported formats and flags description.
     *
     * @param ext File extension that defines the output format. Must include a leading period.
     * @param img Image to be compressed.
     * @param buf Output buffer resized to fit the compressed image.
     * @return automatically generated
     */
    public static boolean imencode(String ext, Mat img, MatOfByte buf) {
        Mat buf_mat = buf;
        return imencode_1(ext, img.nativeObj, buf_mat.nativeObj);
    }


    //
    // C++:  bool cv::imencodeWithMetadata(String ext, Mat img, vector_int metadataTypes, vector_Mat metadata, vector_uchar& buf, vector_int params = std::vector<int>())
    //

    /**
     * Encodes an image into a memory buffer.
     *
     * The function imencode compresses the image and stores it in the memory buffer that is resized to fit the
     * result. See cv::imwrite for the list of supported formats and flags description.
     *
     * @param ext File extension that defines the output format. Must include a leading period.
     * @param img Image to be compressed.
     * @param metadataTypes Vector with types of metadata chucks stored in metadata to write, see ImageMetadataType.
     * @param metadata Vector of vectors or vector of matrices with chunks of metadata to store into the file
     * @param buf Output buffer resized to fit the compressed image.
     * @param params Format-specific parameters. See cv::imwrite and cv::ImwriteFlags.
     * @return automatically generated
     */
    public static boolean imencodeWithMetadata(String ext, Mat img, MatOfInt metadataTypes, List<Mat> metadata, MatOfByte buf, MatOfInt params) {
        Mat metadataTypes_mat = metadataTypes;
        Mat metadata_mat = Converters.vector_Mat_to_Mat(metadata);
        Mat buf_mat = buf;
        Mat params_mat = params;
        return imencodeWithMetadata_0(ext, img.nativeObj, metadataTypes_mat.nativeObj, metadata_mat.nativeObj, buf_mat.nativeObj, params_mat.nativeObj);
    }

    /**
     * Encodes an image into a memory buffer.
     *
     * The function imencode compresses the image and stores it in the memory buffer that is resized to fit the
     * result. See cv::imwrite for the list of supported formats and flags description.
     *
     * @param ext File extension that defines the output format. Must include a leading period.
     * @param img Image to be compressed.
     * @param metadataTypes Vector with types of metadata chucks stored in metadata to write, see ImageMetadataType.
     * @param metadata Vector of vectors or vector of matrices with chunks of metadata to store into the file
     * @param buf Output buffer resized to fit the compressed image.
     * @return automatically generated
     */
    public static boolean imencodeWithMetadata(String ext, Mat img, MatOfInt metadataTypes, List<Mat> metadata, MatOfByte buf) {
        Mat metadataTypes_mat = metadataTypes;
        Mat metadata_mat = Converters.vector_Mat_to_Mat(metadata);
        Mat buf_mat = buf;
        return imencodeWithMetadata_1(ext, img.nativeObj, metadataTypes_mat.nativeObj, metadata_mat.nativeObj, buf_mat.nativeObj);
    }


    //
    // C++:  bool cv::imencodemulti(String ext, vector_Mat imgs, vector_uchar& buf, vector_int params = std::vector<int>())
    //

    /**
     * Encodes array of images into a memory buffer.
     *
     * The function is analog to cv::imencode for in-memory multi-page image compression.
     * See cv::imwrite for the list of supported formats and flags description.
     *
     * @param ext File extension that defines the output format. Must include a leading period.
     * @param imgs Vector of images to be written.
     * @param buf Output buffer resized to fit the compressed data.
     * @param params Format-specific parameters. See cv::imwrite and cv::ImwriteFlags.
     * @return automatically generated
     */
    public static boolean imencodemulti(String ext, List<Mat> imgs, MatOfByte buf, MatOfInt params) {
        Mat imgs_mat = Converters.vector_Mat_to_Mat(imgs);
        Mat buf_mat = buf;
        Mat params_mat = params;
        return imencodemulti_0(ext, imgs_mat.nativeObj, buf_mat.nativeObj, params_mat.nativeObj);
    }

    /**
     * Encodes array of images into a memory buffer.
     *
     * The function is analog to cv::imencode for in-memory multi-page image compression.
     * See cv::imwrite for the list of supported formats and flags description.
     *
     * @param ext File extension that defines the output format. Must include a leading period.
     * @param imgs Vector of images to be written.
     * @param buf Output buffer resized to fit the compressed data.
     * @return automatically generated
     */
    public static boolean imencodemulti(String ext, List<Mat> imgs, MatOfByte buf) {
        Mat imgs_mat = Converters.vector_Mat_to_Mat(imgs);
        Mat buf_mat = buf;
        return imencodemulti_1(ext, imgs_mat.nativeObj, buf_mat.nativeObj);
    }


    //
    // C++:  bool cv::haveImageReader(String filename)
    //

    /**
     * Checks if the specified image file can be decoded by OpenCV.
     *
     * The function haveImageReader checks if OpenCV is capable of reading the specified file.
     * This can be useful for verifying support for a given image format before attempting to load an image.
     *
     * @param filename The name of the file to be checked.
     * @return true if an image reader for the specified file is available and the file can be opened, false otherwise.
     *
     * <b>Note:</b> The function checks the availability of image codecs that are either built into OpenCV or dynamically loaded.
     * It does not load the image codec implementation and decode data, but uses signature check.
     * If the file cannot be opened or the format is unsupported, the function will return false.
     *
     * SEE: cv::haveImageWriter, cv::imread, cv::imdecode
     */
    public static boolean haveImageReader(String filename) {
        return haveImageReader_0(filename);
    }


    //
    // C++:  bool cv::haveImageWriter(String filename)
    //

    /**
     * Checks if the specified image file or specified file extension can be encoded by OpenCV.
     *
     * The function haveImageWriter checks if OpenCV is capable of writing images with the specified file extension.
     * This can be useful for verifying support for a given image format before attempting to save an image.
     *
     * @param filename The name of the file or the file extension (e.g., ".jpg", ".png").
     * It is recommended to provide the file extension rather than the full file name.
     * @return true if an image writer for the specified extension is available, false otherwise.
     *
     * <b>Note:</b> The function checks the availability of image codecs that are either built into OpenCV or dynamically loaded.
     * It does not check for the actual existence of the file but rather the ability to write files of the given type.
     *
     * SEE: cv::haveImageReader, cv::imwrite, cv::imencode
     */
    public static boolean haveImageWriter(String filename) {
        return haveImageWriter_0(filename);
    }




    // C++:  Mat cv::imread(String filename, int flags = IMREAD_COLOR_BGR)
    private static native long imread_0(String filename, int flags);
    private static native long imread_1(String filename);

    // C++:  void cv::imread(String filename, Mat& dst, int flags = IMREAD_COLOR_BGR)
    private static native void imread_2(String filename, long dst_nativeObj, int flags);
    private static native void imread_3(String filename, long dst_nativeObj);

    // C++:  Mat cv::imreadWithMetadata(String filename, vector_int& metadataTypes, vector_Mat& metadata, int flags)
    private static native long imreadWithMetadata_0(String filename, long metadataTypes_mat_nativeObj, long metadata_mat_nativeObj, int flags);

    // C++:  bool cv::imreadmulti(String filename, vector_Mat& mats, int flags = IMREAD_COLOR_BGR)
    private static native boolean imreadmulti_0(String filename, long mats_mat_nativeObj, int flags);
    private static native boolean imreadmulti_1(String filename, long mats_mat_nativeObj);

    // C++:  bool cv::imreadmulti(String filename, vector_Mat& mats, int start, int count, int flags = IMREAD_ANYCOLOR)
    private static native boolean imreadmulti_2(String filename, long mats_mat_nativeObj, int start, int count, int flags);
    private static native boolean imreadmulti_3(String filename, long mats_mat_nativeObj, int start, int count);

    // C++:  bool cv::imreadanimation(String filename, Animation& animation, int start = 0, int count = INT16_MAX)
    private static native boolean imreadanimation_0(String filename, long animation_nativeObj, int start, int count);
    private static native boolean imreadanimation_1(String filename, long animation_nativeObj, int start);
    private static native boolean imreadanimation_2(String filename, long animation_nativeObj);

    // C++:  bool cv::imdecodeanimation(Mat buf, Animation& animation, int start = 0, int count = INT16_MAX)
    private static native boolean imdecodeanimation_0(long buf_nativeObj, long animation_nativeObj, int start, int count);
    private static native boolean imdecodeanimation_1(long buf_nativeObj, long animation_nativeObj, int start);
    private static native boolean imdecodeanimation_2(long buf_nativeObj, long animation_nativeObj);

    // C++:  bool cv::imwriteanimation(String filename, Animation animation, vector_int params = std::vector<int>())
    private static native boolean imwriteanimation_0(String filename, long animation_nativeObj, long params_mat_nativeObj);
    private static native boolean imwriteanimation_1(String filename, long animation_nativeObj);

    // C++:  bool cv::imencodeanimation(String ext, Animation animation, vector_uchar& buf, vector_int params = std::vector<int>())
    private static native boolean imencodeanimation_0(String ext, long animation_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencodeanimation_1(String ext, long animation_nativeObj, long buf_mat_nativeObj);

    // C++:  size_t cv::imcount(String filename, int flags = IMREAD_COLOR_BGR)
    private static native long imcount_0(String filename, int flags);
    private static native long imcount_1(String filename);

    // C++:  bool cv::imwrite(String filename, Mat img, vector_int params = std::vector<int>())
    private static native boolean imwrite_0(String filename, long img_nativeObj, long params_mat_nativeObj);
    private static native boolean imwrite_1(String filename, long img_nativeObj);

    // C++:  bool cv::imwriteWithMetadata(String filename, Mat img, vector_int metadataTypes, vector_Mat metadata, vector_int params = std::vector<int>())
    private static native boolean imwriteWithMetadata_0(String filename, long img_nativeObj, long metadataTypes_mat_nativeObj, long metadata_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imwriteWithMetadata_1(String filename, long img_nativeObj, long metadataTypes_mat_nativeObj, long metadata_mat_nativeObj);

    // C++:  bool cv::imwritemulti(String filename, vector_Mat img, vector_int params = std::vector<int>())
    private static native boolean imwritemulti_0(String filename, long img_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imwritemulti_1(String filename, long img_mat_nativeObj);

    // C++:  Mat cv::imdecode(Mat buf, int flags)
    private static native long imdecode_0(long buf_nativeObj, int flags);

    // C++:  Mat cv::imdecodeWithMetadata(Mat buf, vector_int& metadataTypes, vector_Mat& metadata, int flags)
    private static native long imdecodeWithMetadata_0(long buf_nativeObj, long metadataTypes_mat_nativeObj, long metadata_mat_nativeObj, int flags);

    // C++:  bool cv::imdecodemulti(Mat buf, int flags, vector_Mat& mats, Range range = Range::all())
    private static native boolean imdecodemulti_0(long buf_nativeObj, int flags, long mats_mat_nativeObj, int range_start, int range_end);
    private static native boolean imdecodemulti_1(long buf_nativeObj, int flags, long mats_mat_nativeObj);

    // C++:  bool cv::imencode(String ext, Mat img, vector_uchar& buf, vector_int params = std::vector<int>())
    private static native boolean imencode_0(String ext, long img_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencode_1(String ext, long img_nativeObj, long buf_mat_nativeObj);

    // C++:  bool cv::imencodeWithMetadata(String ext, Mat img, vector_int metadataTypes, vector_Mat metadata, vector_uchar& buf, vector_int params = std::vector<int>())
    private static native boolean imencodeWithMetadata_0(String ext, long img_nativeObj, long metadataTypes_mat_nativeObj, long metadata_mat_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencodeWithMetadata_1(String ext, long img_nativeObj, long metadataTypes_mat_nativeObj, long metadata_mat_nativeObj, long buf_mat_nativeObj);

    // C++:  bool cv::imencodemulti(String ext, vector_Mat imgs, vector_uchar& buf, vector_int params = std::vector<int>())
    private static native boolean imencodemulti_0(String ext, long imgs_mat_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencodemulti_1(String ext, long imgs_mat_nativeObj, long buf_mat_nativeObj);

    // C++:  bool cv::haveImageReader(String filename)
    private static native boolean haveImageReader_0(String filename);

    // C++:  bool cv::haveImageWriter(String filename)
    private static native boolean haveImageWriter_0(String filename);

}
