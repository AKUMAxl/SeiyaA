package com.xl.module_library.Base;

/**
 * Created by ADMIN on 2017/11/6.
 */
public interface ApplicationDelegate {

    void onCreate();

    void onTerminate();

    void onLowMemory();

    void onTrimMemory(int level);

}
