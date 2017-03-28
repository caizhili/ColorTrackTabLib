package com.example.colortrackviewlib.view;

import android.app.Application;
import android.content.Context;

import com.example.colortrackviewlib.view.util.ScreenUtil;

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
