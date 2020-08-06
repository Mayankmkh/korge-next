package com.soywiz.korui

import com.soywiz.kds.*
import com.soywiz.korev.*
import com.soywiz.korio.lang.*

interface UiComponent : Extra {
    val factory: UiFactory
    fun setBounds(x: Int, y: Int, width: Int, height: Int) = Unit
    var parent: UiContainer?
        get() = null
        set(value) = Unit
    var index: Int
        get() = -1
        set(value) = Unit
    var visible: Boolean
        get() = false
        set(value) = Unit
    fun onMouseEvent(handler: (MouseEvent) -> Unit): Disposable = Disposable { }
}

fun UiComponent.onClick(block: (MouseEvent) -> Unit) {
    onMouseEvent(block)
}