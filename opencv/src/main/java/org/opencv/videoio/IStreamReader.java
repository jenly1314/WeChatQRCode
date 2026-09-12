//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.videoio;



// C++: class IStreamReader
/**
 * Read data stream interface
 */
public class IStreamReader {

    protected final long nativeObj;
    protected IStreamReader(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static IStreamReader __fromPtr__(long addr) { return new IStreamReader(addr); }

    //
    // C++:  long long cv::IStreamReader::read(byte[] buffer, long long size)
    //

    /**
     * Read bytes from stream
     *
     * @param buffer already allocated buffer of at least {@code size} bytes
     * @param size maximum number of bytes to read
     *
     * @return actual number of read bytes
     */
    public long read(byte[] buffer, long size) {
        return read_0(nativeObj, buffer, size);
    }


    //
    // C++:  long long cv::IStreamReader::seek(long long offset, int origin)
    //

    /**
     * Sets the stream position
     *
     * @param offset Seek offset
     * @param origin SEEK_SET / SEEK_END / SEEK_CUR
     *
     * SEE: fseek
     * @return automatically generated
     */
    public long seek(long offset, int origin) {
        return seek_0(nativeObj, offset, origin);
    }



/**
 * Constructor of streaming callback object with abstract 'read' and 'seek' methods that should be implemented in Java code.<br>
 * <b>NOTE</b>: Implemented callbacks should be called from the creation thread to avoid JNI performance degradation
*/
protected IStreamReader() { nativeObj = 0; }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  long long cv::IStreamReader::read(byte[] buffer, long long size)
    private static native long read_0(long nativeObj, byte[] buffer, long size);

    // C++:  long long cv::IStreamReader::seek(long long offset, int origin)
    private static native long seek_0(long nativeObj, long offset, int origin);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
