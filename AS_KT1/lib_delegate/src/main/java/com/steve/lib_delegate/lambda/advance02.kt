package com.steve.lib_delegate.lambda

fun main() {
    loginEngine("123","1234")
}


private fun loginEngine(userName: String, userPwd: String) {
    loginCheck(userName, userPwd) { name, pwd ->
        if (name == "steve" && pwd == "132") {
            println("CONGRATULATION $name LOGIN SUCCESS")
        } else {
            println("LOGIN FAILED WRONG USERNAME OR PASSWORD")
        }

    }
}

private fun loginCheck(userName: String, userPwd: String, responseResult:(String,String) -> Unit) {

    if (userName.isEmpty() || userPwd.isEmpty()) {
        return
    }

    if (userName == null || userPwd == null) {
        return
    }

    responseResult(userName,userPwd)
}