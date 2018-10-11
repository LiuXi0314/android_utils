package com.liuxi.android_utils

import android.app.Application
import com.liuxi.utils.AppConstant

/**
 * @Author liuxi
 * @Email xiaoxixizhizhi@gmail.com
 */
class TemplateApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        AppConstant.register(this)
    }
}
