package com.steve.lib_delegate.customrxjava.rxjava1

fun main() {
    val names = listOf("zhangsan", "lisi", "wangwu")

    val ages = listOf(20,21,22)
    names.zip(ages).toMap().map { println("NAME: ${names}, OLD: ${ages}") }
}