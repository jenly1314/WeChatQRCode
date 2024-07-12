package org.opencv;

import android.content.Context;

import org.opencv.android.OpenCVLoader;

/**
 * OpenCV
 *
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * <p>
 * <a href="https://github.com/jenly1314">Follow me</a>
 */
public final class OpenCV {

    private OpenCV() {
        throw new AssertionError();
    }

    /**
     * 初始化OpenCV
     *
     * @return 如果返回：true，则表示OpenCV初始化成功
     */
    public static boolean initOpenCV() {
        return OpenCVLoader.initLocal();
    }

    /**
     * 初始化 OpenCV
     *
     * @param context {@link Context}
     * @deprecated 使用 {@link OpenCV#initOpenCV()}
     */
    @Deprecated
    public static void initAsync(Context context) {
        initOpenCV();
    }

}
