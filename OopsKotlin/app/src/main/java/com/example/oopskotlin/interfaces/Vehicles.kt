package com.example.oopskotlin.interfaces

/*
can't be oopskotlin.interface
because interface is a reserved word
*/

class Vehicles : CanGo, CanStop {

    override val name: String
        get() = "Volvo"

    override fun stop() {
        println("Vehicle can stop.")
    }


}