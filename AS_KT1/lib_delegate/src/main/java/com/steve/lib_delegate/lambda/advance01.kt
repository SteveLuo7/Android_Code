package com.steve.lib_delegate.lambda

fun main() {

    var r  = show01(188){"ABC"}
    println(r)

    show02(1,3,5) {
        n1,n2,n3 ->
        println(n1 + n2 + n3)
        println(n1 * n2 * n3)
    }
}

fun show01(number: Int, lambda : (Int) -> String) : String = lambda.invoke(number)


fun show02(number1: Int, number2: Int, number3: Int, lambda: (Int, Int, Int) -> Unit) =
    lambda(number1,number2,number3) //调用lambda

