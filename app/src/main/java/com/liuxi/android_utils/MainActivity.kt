package com.liuxi.android_utils

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.liuxi.utils.AppUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        p(AppUtils.getVersionName())
        p(AppUtils.getVersionCode())
        p(AppUtils.getPackageName())
        p(AppUtils.getPackageInfo())
    }
}
