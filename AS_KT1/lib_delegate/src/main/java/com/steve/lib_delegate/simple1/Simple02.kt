package com.steve.lib_delegate.simple1

interface USB {
    fun insert()
    fun disconnect()
}

class Mouse() : USB {
    override fun insert() = println("鼠标已连接USB")

    override fun disconnect() = println("鼠标已断开USB")
}

class Keyboard() : USB {
    override fun insert() = println("键盘已连接USB")

    override fun disconnect() = println("键盘已断开USB")
}

class CreateUSB(iusb : USB) : USB by iusb
//委托必须是接口，不能是抽象类

fun main() {

    CreateUSB(Mouse()).insert()
    CreateUSB(Keyboard()).insert()
    CreateUSB(Mouse()).disconnect()
    CreateUSB(Keyboard()).insert()
}