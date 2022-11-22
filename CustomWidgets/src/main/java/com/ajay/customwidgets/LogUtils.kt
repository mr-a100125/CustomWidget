package com.ajay.customwidgets

import android.util.Log

class LogUtils(val message : String) {

    private val TAG = "TAG"

    init {
        Log.e(TAG, message)
    }
}