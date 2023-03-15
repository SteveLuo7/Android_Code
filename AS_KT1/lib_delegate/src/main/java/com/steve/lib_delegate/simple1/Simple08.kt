package com.steve.lib_delegate.simple1

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringDelegateUpdate(var str: String = "default") : ReadWriteProperty<Owner2, String> {

    override fun getValue(thisRef: Owner2, property: KProperty<*>): String {
        println("ReadWriteProperty getValue is ON")
        return str
    }

    override fun setValue(thisRef: Owner2, property: KProperty<*>, value: String) {
        println("ReadWriteProperty setValue is On")
        str = value
    }

}

class SmartDelegator {

    operator fun provideDelegate(
        thisRef: Owner2,
        property: KProperty<*>
    ) : ReadWriteProperty<Owner2, String> {

        return if (property.name.contains("log")) {
            StringDelegateUpdate("log")
        } else {
            StringDelegateUpdate("normal")
        }
    }
}

class Owner2 {
    var normalText : String by SmartDelegator()
    var logText: String by SmartDelegator()
}

fun main() {
    val owner = Owner2()
    println(owner.logText)
    println(owner.normalText)
}