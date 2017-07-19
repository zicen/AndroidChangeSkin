package com.zhenquan.myskindemo;

import android.app.Application;

import com.zhy.changeskin.SkinManager;

/**
 * Created by zhenquan on 2017/7/6.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.getInstance().init(this);
    }
}
