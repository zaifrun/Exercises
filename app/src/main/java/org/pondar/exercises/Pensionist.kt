package org.pondar.exercises

class Pensionist (name:String,age: Int, var retirementYear:Int) : Person(name,age) {

    override fun toString(): String {
        return "$name is $age years old and retired in $retirementYear"
    }
}