package cn.haiyueshang.zhengdafutong.zdft.application;

import android.app.Application;

/**
 * Created by wangzeya on 16/7/2.
 */
public class MyApplication extends Application{

    private static MyApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

    public static MyApplication getContext(){
        return context;
    }
}
