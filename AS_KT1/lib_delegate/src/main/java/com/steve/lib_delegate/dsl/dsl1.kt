package com.steve.lib_delegate.dsl

class Worker(info: String) {
    init {
        println("$info")
    }

    fun inputWorker(wokerInfo: String) {
        println("WORKERINFO: ${wokerInfo}")
    }

    fun inputSalary(salary: Int) {
        println("SALARY: $salary")
    }
}


class Teacher(info: String) {
    init {
        println("$info")
    }

    fun myCourse(course: String) {
        println("COURSE: ${course}")
    }
}


class Student(info: String) {
    init {
        println("[${info}]")
    }

    fun study (studyInfo: String) {
        println("[${studyInfo}]")
    }

    fun fraction (fraction: Double) {
        println("TOTAL : $fraction")
    }
}


class Person {

    init {
        "READY TO INPUT PERSON SYSTEM"
    }

    fun student(lambda: Student.() -> Unit): Student {
        val student = Student("Input students data begin")
        student.lambda()
        return student
    }

    fun teacher(lambda: Teacher.() -> Unit): Teacher {
        val teacher = Teacher("Input teachers data begin")
        teacher.lambda()
        return teacher
    }

    fun worker(lambda: Worker.() -> Unit): Worker {
        val teacher = Worker("Input workers data begin")
        teacher.lambda()
        return teacher
    }

}



fun person (lambda: Person.() -> Unit): Person {

    val person = Person()
    person.lambda()
    return person
}

fun main() {

    person {

        student {
            study("Math")
            fraction(98.3)
        }

        teacher {
            myCourse("Chinese")
        }

        worker {
            inputWorker("Auto Engineer")
            inputSalary(20000)
        }
    }

}