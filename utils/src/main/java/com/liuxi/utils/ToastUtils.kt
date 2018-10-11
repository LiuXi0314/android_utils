package com.liuxi.utils

import android.widget.Toast

/**
 *
 * @Author liuxi
 *
 * @Email xiaoxixizhizhi@gmail.com
 *
 */
object ToastUtils {

    private var mToast: Toast? = null

    fun show(message: CharSequence?) {
        show(message, false)
    }

    fun show(resId: Int) {
        show(AppConstant.application.getString(resId), false)
    }

    fun showLong(message: CharSequence?) {
        show(message, true)
    }

    fun showLong(resId: Int) {
        show(AppConstant.application.getString(resId), true)
    }

    private fun show(message: CharSequence?, isLong: Boolean) {
        if (message.isNullOrBlank())return
        var duration: Int = when (isLong) {
            true -> Toast.LENGTH_LONG
            false -> Toast.LENGTH_SHORT
        }
        when (mToast == null) {
            true -> {
                mToast = Toast.makeText(AppConstant.application, message, duration)
            }
            false -> {
                mToast?.setText(message)
                mToast?.duration = duration
            }
        }
        mToast?.show()
    }

}