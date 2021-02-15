package org.pondar.exercises

open class Person(var name:String, var age:Int) : AgeCategory {

    override fun isTeenager(): Boolean {
        if (age in 13..19)
            return true
        else
            return false
    }

    fun isOld(): Boolean {
        if (age>50)
            return true
        else
            return false
    }
    override fun toString(): String {
        if (isOld())
            //return name+", "+age+" is old"
            return "$name, $age is old"
        else
            return "$name, $age is young, , is teenager? ${isTeenager()}"
    }
}