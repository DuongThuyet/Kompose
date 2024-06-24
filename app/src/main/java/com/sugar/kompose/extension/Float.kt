package com.ahamove.library.extension


fun Float?.valueOrZero():Float = this ?: 0f

fun Float?.valueOrDefault(default :Float):Float = this ?: default
