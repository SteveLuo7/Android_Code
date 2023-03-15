package com.steve.lib_delegate.lambda


fun main() {

    val fun1 = fun(n1: Int, n2: Int) //函数本身
            : (Int, Int) -> String //函数声明
            = {n1, n2 -> "TOTAL: ${n1 +n2}"} //函数的实现

    println(fun1(100, 56)(1888, 1888))

    val k01 : (String) -> (String) -> (Boolean) -> (Int) -> (String) -> Int =
        { it: String ->
            { it: String ->
                { it: Boolean ->
                    { it: Int ->
                        { it: String ->
                            45
                        }
                    }
                }
            }
        }
    println(k01("ABC")("ZXC")(true)(5)("Luoshibin"))
}