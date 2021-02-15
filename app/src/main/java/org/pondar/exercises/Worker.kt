package org.pondar.exercises

class Worker(name:String, age: Int, var salary:Int) : Person(name,age) {

    override fun toString(): String {
        return "$name is $age years old and salary is $salary"
    }
}