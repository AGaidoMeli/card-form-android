package com.mercadolibre.android.cardform.presentation.helpers

import android.support.v4.app.Fragment
import com.mercadolibre.android.cardform.presentation.extensions.addKeyBoardListener
import com.mercadolibre.android.cardform.presentation.extensions.hideKeyboard
import com.mercadolibre.android.cardform.presentation.extensions.showKeyboard

object KeyboardHelper {

    private var keyboardShowing = false

    fun addKeyBoardListener(rootFragment: Fragment) {
        rootFragment.addKeyBoardListener(
            onKeyBoardOpen = { keyboardShowing = true },
            onKeyBoardClose = { keyboardShowing = false }
        )
    }

    fun hideKeyboard(fragment: Fragment?) {
        if (keyboardShowing) {
            fragment?.hideKeyboard()
        }
    }

    fun showKeyboard(fragment: Fragment?) {
        if (!keyboardShowing) {
            fragment?.showKeyboard()
        }
    }
}