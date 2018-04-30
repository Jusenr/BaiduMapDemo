package com.jusenr.baidumap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Description:
 * Author     : Jusenr
 * Email      : jusenr@163.com
 * Date       : 2018/04/30  13:39.
 */
public class TotalApplication extends Application {

    public static Application sApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        sApplication = this;

        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());

    }


    public static Application getApplication() {
        return sApplication;
    }

}
