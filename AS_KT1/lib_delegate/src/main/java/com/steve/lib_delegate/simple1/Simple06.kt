package com.steve.lib_delegate.simple1


fun requsetDownload() : String {

    Thread.sleep(5000L)
    return "Congratulation Download Success"

}

val responseData : String by lazy { requsetDownload() }

fun main() {

    println("Ready for Download......")
    Thread.sleep(5000L)

    println("Start Download......")
    println(responseData)
}

