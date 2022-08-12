package com.example.oopskotlin.interfaces

/*
can't be oopskotlin.interface
because interface is a reserved word
*/

interface CanGo {

    fun go() {
        println("Vehicle can go!")
    }

    // val name:String = "Volvo"
    // ^^can't initialize in an interface
    val name:String

}