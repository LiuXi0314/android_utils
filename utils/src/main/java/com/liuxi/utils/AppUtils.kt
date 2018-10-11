package com.liuxi.utils

import android.content.pm.PackageInfo

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
object AppUtils {

    fun getVersionName(): String? {
        return getPackageInfo()?.versionName
    }

    @Suppress("DEPRECATION")
    fun getVersionCode(): Int? {
        return getPackageInfo()?.versionCode
    }

    fun getPackageName(): String {
        return AppConstant.application.packageName
    }

    fun getPackageInfo(): PackageInfo? {
        val packageManager = AppConstant.application.packageManager
        var packInfo: PackageInfo? = null
        try {
            packInfo = packageManager.getPackageInfo(getPackageName(), 0)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return packInfo
    }

}