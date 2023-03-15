package com.steve.lib_delegate.HTML

class Mystudy<T>(type: T) {
    var item: T = type
}

fun main() {
    val mystudy : Mystudy<String> = Mystudy<String> ("steve is OK")
    println(mystudy.item)


}