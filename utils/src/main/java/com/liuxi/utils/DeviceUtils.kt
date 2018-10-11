package com.liuxi.utils

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.telephony.TelephonyManager

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
object DeviceUtils {

    fun getNetworkCountryIso(): String {
        return try {
            val tm = AppConstant.application.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
            tm.networkCountryIso
        } catch (e: Exception) {
            ""
        }

    }

    fun getSimCountryIso(): String {
        return try {
            val tm = AppConstant.application.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
            tm.simCountryIso
        } catch (e: Exception) {
            ""
        }

    }

    fun getNetworkOperator(): String {
        return try {
            val tm = AppConstant.application.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
            tm.networkOperator
        } catch (e: Exception) {
            ""
        }

    }

    fun getSimOperator(): String {
        return try {
            val tm = AppConstant.application.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
            tm.simOperator
        } catch (e: Exception) {
            ""
        }

    }

    fun getDeviceName(): String {
        return Build.DEVICE
    }

    fun getOsName(): String {
        return Build.MODEL + "," + Build.VERSION.SDK_INT + "," + Build.VERSION.RELEASE
    }

    fun getScreenWidth(): Int {
        return AppConstant.application.resources.displayMetrics.widthPixels
    }

    fun getScreenHeight(): Int {
        return AppConstant.application.resources.displayMetrics.heightPixels
    }

    fun getScreenDensity(): Float {
        return AppConstant.application.resources.displayMetrics.density
    }

    fun getScreenDensityDpi(): Float {
        return AppConstant.application.resources.displayMetrics.densityDpi.toFloat()
    }

    fun getScreenScaledDensity(): Float {
        return AppConstant.application.resources.displayMetrics.scaledDensity
    }

    fun getMetaData(key: String?): String? {
        var metaData: Bundle? = null
        var value: String? = null
        if (AppConstant.application == null || key == null) {
            return null
        }
        try {
            val ai = AppConstant.application.packageManager.getApplicationInfo(
                    AppConstant.application.packageName, PackageManager.GET_META_DATA)
            if (null != ai) {
                metaData = ai.metaData
            }
            if (null != metaData) {
                value = metaData.getString(key)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return value
    }
}