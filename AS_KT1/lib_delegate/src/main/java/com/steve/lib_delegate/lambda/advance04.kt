package com.steve.lib_delegate.lambda

fun main() {


}

fun<T> T.myRunOK(mm: T.(Float) -> Boolean) =mm(354.6f)