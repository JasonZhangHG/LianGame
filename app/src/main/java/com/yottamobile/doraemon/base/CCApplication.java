package com.yottamobile.doraemon.base;

import android.app.Activity;
import android.support.multidex.MultiDexApplication;

import com.blankj.utilcode.util.Utils;
import com.yottamobile.doraemon.utils.DBRankingBeanDaoUtils;
import com.yottamobile.doraemon.utils.DBScoreBeanDaoUtils;
import com.yottamobile.doraemon.utils.ToastHelper;


public class CCApplication extends MultiDexApplication {

    private static final String TAG = CCApplication.class.getSimpleName();

    private static CCApplication INSTANCE;
    private volatile Activity mCurrentActivity;
    private boolean mIsInForeground = false;

    public static CCApplication getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        Utils.init(this);
        DBRankingBeanDaoUtils.Init(this);
        DBScoreBeanDaoUtils.Init(this);
        ToastHelper.init(this);
    }
}