package com.steve.lib_delegate.simple1

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Owner {


    var text : String by Simple07()

    var aka : String by StringDelegate()
}


class Simple07 {

    private var str: String = "Default"

    operator fun getValue(owner: Owner, property : KProperty<*>) : String {

        println("getValue is on")
        return str
    }

    operator fun setValue(owner: Owner, property : KProperty<*>, value : String) {

        println("setValue is on")
        str = value

    }
}

class StringDelegate() : ReadWriteProperty<Owner, String> {

    private var str = "woshi mo ren de "
    override fun getValue(thisRef: Owner, property: KProperty<*>): String {
        println("getValue is ON")
        return str
    }

    override fun setValue(thisRef: Owner, property: KProperty<*>, value: String) {
        println("setValue is ON")
        str = value
    }

}
fun main() {

    val o = Owner()
    o.text = "steve"
    println(o.text)

    println()

    val k = Owner()
    k.aka = "Luoshibin"
    println(k.aka)
}