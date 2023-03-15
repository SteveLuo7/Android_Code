package com.steve.lib_delegate.customrxjava.rxjava1

fun main() {

    create {
        "steve"
        158
        6545.54f
        'Z'
        123
    }.map {
        123
    }.map {
        456
    }.consumer {
        println("$it")
    }

}

class Helper<T>(private var item: T)
    {

        fun <R> map(action: (T) -> R): Helper<R> {
            val newItem: R = action(item)
            return Helper<R>(newItem)
        }

        fun consumer(action: (T) -> Unit) = action(item)

    }

fun<R> create(action: () -> R) : Helper<R> {
    val r: R = action()
    return Helper<R>(r)
}
