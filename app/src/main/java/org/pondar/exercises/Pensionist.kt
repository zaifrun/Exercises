package org.pondar.exercises

//Notice the very important use of "var"
class Pensionist (name:String,age: Int, var retirementYear:Int) : Person(name,age) {

    override fun toString(): String {
        return "$name is $age years old and retired in $retirementYear"
    }
}