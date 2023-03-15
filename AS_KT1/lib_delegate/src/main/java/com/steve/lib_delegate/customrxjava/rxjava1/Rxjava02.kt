package com.steve.lib_delegate.customrxjava.rxjava1

fun main() {

    create1 {
        "steve"
    }.map {
        length
    }.map {
        "名字的长度是：$this"
    }.map {
        "[$this]"
    }.consumer {
        println(": $this")
    }
}

fun <R> create1(action: () -> R) : R= action()
fun<T,R> T.map(action: T.() -> R) : R = action(this)
fun<T> T.consumer(action: T.() -> Unit) = action (this)
