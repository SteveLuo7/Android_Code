package com.example.as_kt1

fun main() {

    val age: Int = 19

    val method = { println("method run")}

    method()

    val method02 = {str: String ->
        true
    }

    println(method02("Steve"))

    val method04 = {str: String ->
        str.length
    }
    println(method04("luoshibin"))

    val method05 = {n1: Int, n2: Int ->
        n1/n2
    }
    println(method05(8, 2))

    val method06 = {
        any: Any -> any
    }
    println(method06(5484))
    println(method06(true))

    val method07 = {
        sex: Char -> Unit
        println(if (sex == 'M') "Hello Mister" else "Hello Miss")
    }

    method07('M')

    val method08 = {
        n1: Int, n2: Int, n3: Int ->
        n1+n2+n3
    }

    println(method08(3, 5, 8))

    val method09 = {
            n1: Int, n2: String, n3: Float ->
            "你的姓名是：$n2， 你的年龄为: $n1, 你的体重是：$n3"
    }

    println(method09(28, "Luoshibin", 80f))

    val method10 = {str: List<String> ->
        for (i in str) {
            println("$i")
        }
    }

    val method11 = { a1:() -> Unit ->
        a1()
    }

    method11() { println("我是a1函数")}


    val method12 = { userName: String, userPwd: String ->
        "userName: $userName, userPwd: $userPwd"
    }
    println(method12("steveluo", "123456"))

    val method13 = {userName: String, userPwd: String, a : (Boolean) -> Unit ->
        if (userName == "Steve" && userPwd == "123456") {
            a(true)
        } else {
            a(false)
        }
    }

    method13("Steve", "123456") {
        if (it) println("Congratulation") else println("Wrong Password or Wrong AccountName")
    }

    val method14 = { a: () -> Unit -> Unit
        a()
    }
    method14 { println("a函数已经实现执行了")}

    val method15 = { str: String ->
            { n1: Int ->
                "n1: $n1 我是String类型字符串"
            }
        }

        println(method15("steve")(888))
    }


