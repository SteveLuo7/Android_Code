package com.steve.lib_delegate.simple1

class Simple09  {

    var data: String = ""
        private set

    private fun showData() {
        data = "is OK"
    }

}

fun main() {
    val simple = Simple09()
    println(simple.data)
}

class Model {
    var data : MutableList<String> = mutableListOf()
    private fun load() {
        println(data.add("Hello World"))
    }
}

fun main2() {
    val model = Model()
    println(model.data.add("Luoshibin"))

}