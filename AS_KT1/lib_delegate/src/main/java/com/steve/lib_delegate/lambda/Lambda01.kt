package com.steve.lib_delegate.lambda

fun main() {

    // lambda

    //Kotlin Unit == Java void

    val method01 : () -> Unit

    val method02 : (Int, Int) -> Unit

    val method03 : (String, Double) -> Any

    var method04 : (Int, Double, Long, String) -> Boolean

    var method05 : (Int, Int) -> Int

    val method1 = { println("woshi hanshu ")}
    method1()
    method1.invoke()

    val method2 = { println("我是method2函数")}
    method2()

    val method6 : (Int) -> String
    method6 = fun(value: Int) : String = value.toString()
    println(method6(168))

    val method7 : (Int) -> String
    method7 = fun(value) = value.toString()
    println(method7(888))

    val method09 : (String, String) -> Unit = {aStr, bStr -> println("aStr: $aStr, bStr: $bStr")}
    method09.invoke("aaa","bbb")
    method09("aaa","ccc")

    val method10 : (String) -> Unit ={
        println(it)
    }

    method10("woshi it")

    val method11 : (Int) -> String= {
        when(it) {
            1-> "This is 1"
            in 20..60 -> "this is 20 - 60"
            else -> "Wrong math"

        }
    }
    println(method11(28))

    val method13 : (Int, Int) -> Unit = {
        _,n2 ->
        println("第二个数字为n2: $n2")
    }

    method13(4,8)

    val method14 = {str: Any -> str}
    //Any -> Any
    println(method14(true))
    println(method14('a'))
    println(method14(458f))

    val method15 =
        {sex: Char -> if (sex == 'M') println("YOU ARE MAN")
                      else if (sex == 'W') println("YOU ARE WOMAN")
                      else println("YOU ARE NOT HUMAN")}

    method15('A')
    method15.invoke('M')

    var method16 = {number: Int -> println("Int: $number")}
    method16 = { println("覆盖的Int: $it")}
    //覆盖后上面的方法便失效 但是类型却被保留下来 it
    method16(188)

    val method16ss : (String, String) -> Unit = {str, str2 ->
        println("str: $str str2: $str2")

    }

    method16ss("Cristiano","Benzema")

    val method17 = {str: Any -> println("str : $str") }
    method17(123465)
    method17(123465f)
    method17(123465)

    val method19 : String.() -> Unit = {
        println("打印String本身 This: $this")
    }

    method19("Cristiano is GOAT")

    val method20 : Int.(Int) -> String = {"两个数字只和为：${this + it}"}
    println(method20(78, 56))

    val method21 : Double.(Double, Double) -> Unit = {
        d1, d2 ->
        println("TOTAL : ${d1 + d2 + this}")
        println("d1: $d1")
        println("d2: $d2")
        println("this: $this")

    }

    method21(1.0,2.0,3.0)
    method21.invoke(1.0,2.0,3.0)
    24.5.method21(46.2,57.8)

    val method22 : Char.(String) -> Unit =
        { println(if (this == 'M') println("Hello Mister")
                else if (this == 'W') println("Hello Miss")
                else it)}

    method22.invoke('A',"666")

    fun k01() = {n1: Int -> println("你输入的类型为Int？ ${if (n1 is Int) "你输入的是Int: $n1"
                                                        else "你输入的不是数字！！！"}") }

    k01()(100)

    fun k02() = {n1: Int, n2: Int -> println("TOTAL: ${n1 + n2}") }
    k02()(45,45)

    val methodx1 = fun(str : String) {
        println("输入的字数有：${str.length}")
    }
    methodx1("SteveLuo")

    val methodx2 = {str: String -> str.length}
    val methodx3 : Function1<String, Int> = {str: String -> str.length}

    fun aa() {
        println("This is aa function")
    }

    val aa2 = ::aa
    println(aa2)

}



