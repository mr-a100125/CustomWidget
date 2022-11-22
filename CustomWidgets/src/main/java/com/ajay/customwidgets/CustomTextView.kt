package com.ajay.customwidgets

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.annotation.ColorRes
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat

class CustomTextView : AppCompatTextView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attr: AttributeSet) : super(context, attr)

    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int) : super(context, attr, defStyleAttr)

    fun setCustomTextColor(@ColorRes color : Int) {
        super.setTextColor(ContextCompat.getColor(context, color))
    }
}

