package com.tdoni_10119907.a10119907latihan2.module

import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View

// 4/30/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class SpanLinkBuilder {
    private var colorId: Int = 0
    private var endLinkIndex: Int = 0
    private var startLinkIndex: Int = 0
    private var text: String = String()
    private var linkCallback: () -> Unit = {}

    fun setText(text: String) = apply { this.text = text }
    fun setColorId(colorId: Int) = apply { this.colorId = colorId }
    fun setEndLinkIndex(lastLinkIndex: Int) = apply { this.endLinkIndex = lastLinkIndex }
    fun setStartLinkIndex(startLinkIndex: Int) = apply { this.startLinkIndex = startLinkIndex }
    fun setLinkCallback(linkCallback: () -> Unit) = apply { this.linkCallback = linkCallback }
    fun build(): SpannableString {
        val spannable = SpannableString(text)

        spannable.setSpan(
            ForegroundColorSpan(colorId),
            startLinkIndex,
            endLinkIndex,
            Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        spannable.setSpan(
            object : ClickableSpan() {
                override fun onClick(view: View) {
                    linkCallback()
                }

                override fun updateDrawState(ds: TextPaint) {
                    super.updateDrawState(ds)
                    ds.isUnderlineText = false
                }
            }, startLinkIndex, endLinkIndex, Spanned.SPAN_EXCLUSIVE_INCLUSIVE
        )

        return spannable
    }
}