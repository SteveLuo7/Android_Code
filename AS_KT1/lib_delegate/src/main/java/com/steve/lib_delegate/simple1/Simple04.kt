package com.steve.lib_delegate.simple1

class Simple04 {

    var floatValue : Float = 564655645.564f



    var number : Float by :: floatValue
}


fun main() {

    val simple04 = Simple04()
    simple04.number = 9.45f
    println(simple04.number)
}