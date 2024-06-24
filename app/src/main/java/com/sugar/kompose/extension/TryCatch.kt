package com.ahamove.supplier2.extentions

fun <T> (() -> T).tryCatch() =
    try {
        this()
    } catch (e: Exception) {
        e.printStackTrace()
    }