package com.example.caizhili.mycolortrackview;

import android.app.Application;
import android.content.Context;

import com.example.caizhili.mycolortrackview.util.ScreenUtil;


/**
 * Created by caizhili on 2017/3/28.
 */

public class MyApplication extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        ScreenUtil.init(this);
    }

    public static Context getContext(){
        return mContext;
    }
}
