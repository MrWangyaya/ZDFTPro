package cn.haiyueshang.zhengdafutong.zdft.myUtils;

import android.util.Log;
import android.widget.Toast;

import cn.haiyueshang.zhengdafutong.zdft.application.MyApplication;

/**
 * Created by wangzeya on 16/8/1.
 */
public class MyUtils {

    /**
     * 快捷toast
     * @param content
     */
    public static void myToast(String content){
        Toast.makeText(MyApplication.getContext(),content,Toast.LENGTH_SHORT).show();
    }

    /**
     * 我的日志
     * @param tag
     * @param msg
     */
    public static void myLog(String tag,String msg){
        Log.i(tag,msg);
    }



}
