package com.soywiz.korui.edit

import com.soywiz.korui.*
import com.soywiz.korui.layout.*

class TwoItemUiEditableValue(app: UiApplication, left: UiEditableValue, right: UiEditableValue) : UiEditableValue(app) {
    init {
        layout = HorizontalUiLayout
        left.preferredWidth = 50.percent
        right.preferredWidth = 50.percent
        addChild(left)
        addChild(right)
    }
}
