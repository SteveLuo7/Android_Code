package com.steve.lib_delegate.customrxjava.rxjava1

fun study01() = {name: String, age: Int ->
    true
    name
    age
    "YOUR NAME: $name, YOU AGE: $age"
}

fun study02() = {lambdaAction: (Int, Int) -> String, studyInfo: String ->
    false
    val lambdaAction = lambdaAction(10,20)
    println("$lambdaAction + $studyInfo")
}

fun main() {

    println(study01()("luoshibin", 28))

    study02()({n1,n2 ->
        "TOTAL: ${n1 + n2} "
    }, "steve")
}