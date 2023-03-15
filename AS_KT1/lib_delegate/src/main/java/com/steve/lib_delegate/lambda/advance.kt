package com.steve.lib_delegate.lambda

fun main() {
    show("luoshibin", {println("$it")})
    show("steve") { println(it)}

    show {
        println("$it")
    }


    show2({
        println("$it")
    },
        {println("$it")})
}

fun show(name: String = "zhangsan", lambda:(String) -> Unit) = lambda(name)

fun show2(lambda1 : (Int) -> Unit, lambda2: (Int) -> (Unit)) {
    lambda1(100)
    lambda2(200)
}

fun show3(name: String, age: Int, sex: Char) {

}