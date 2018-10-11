package com.liuxi.utils

import android.annotation.SuppressLint
import android.app.Application
import org.jetbrains.annotations.NotNull

/**
 * @Author liuxi
 * @Email xiaoxixizhizhi@gmail.com
 */
object AppConstant {

    @NotNull
    @SuppressLint("StaticFieldLeak")
    lateinit var application: Application

    fun register(@NotNull application: Application) {
        this.application = application
    }

}