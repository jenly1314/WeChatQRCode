//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.geometry;



// C++: class MSTEdge
/**
 * Represents an edge in a graph for Minimum Spanning Tree (MST) computation.
 *
 * Each edge connects two nodes (source and target) and has an associated weight.
 */
public class MSTEdge {

    protected final long nativeObj;
    protected MSTEdge(long addr) {
      nativeObj = addr;
      
    }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static MSTEdge __fromPtr__(long addr) { return new MSTEdge(addr); }

    //
    // C++: int MSTEdge::source
    //

    public int get_source() {
        return get_source_0(nativeObj);
    }


    //
    // C++: void MSTEdge::source
    //

    public void set_source(int source) {
        set_source_0(nativeObj, source);
    }


    //
    // C++: int MSTEdge::target
    //

    public int get_target() {
        return get_target_0(nativeObj);
    }


    //
    // C++: void MSTEdge::target
    //

    public void set_target(int target) {
        set_target_0(nativeObj, target);
    }


    //
    // C++: double MSTEdge::weight
    //

    public double get_weight() {
        return get_weight_0(nativeObj);
    }


    //
    // C++: void MSTEdge::weight
    //

    public void set_weight(double weight) {
        set_weight_0(nativeObj, weight);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: int MSTEdge::source
    private static native int get_source_0(long nativeObj);

    // C++: void MSTEdge::source
    private static native void set_source_0(long nativeObj, int source);

    // C++: int MSTEdge::target
    private static native int get_target_0(long nativeObj);

    // C++: void MSTEdge::target
    private static native void set_target_0(long nativeObj, int target);

    // C++: double MSTEdge::weight
    private static native double get_weight_0(long nativeObj);

    // C++: void MSTEdge::weight
    private static native void set_weight_0(long nativeObj, double weight);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
