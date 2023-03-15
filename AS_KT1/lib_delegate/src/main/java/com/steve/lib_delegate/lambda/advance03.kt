package com.steve.lib_delegate.lambda

fun main() {
    loginCheck1("Steve","1324") {
        if (it) println("CONGRATULATION LOGIN SUCCESS")
        else println("OOPS LOGIN FAILED WRONG USERNAME OR PASSWORD")
    }

}


private fun loginCheck1(userName: String, userPwd: String, responseResult:(Boolean) -> Unit) {


    if (userName == "Steve" && userPwd == "1324") {
        responseResult(true)
    } else {
        responseResult(false)
    }


}

