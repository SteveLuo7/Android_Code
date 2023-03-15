package com.steve.lib_delegate.lambda

fun main() {
    showAction {
        "$it"
    }

    showAction(:: lambdaImpl)
}

fun lambdaImpl (value: Int) : String = "$value"

fun showAction(action: (Int) -> String) {
    println(action(88))
}
