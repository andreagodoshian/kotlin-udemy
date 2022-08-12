package com.example.oopskotlin.override

/*
As you can see, most things need to be open
(for inheritance in Kotlin)
*/

open class Vehicle {

    open fun start() {
        println("Vehicle has started.")
    }

    open fun accelerate(speed:Int) {
        println("Vehicle accelerates - current speed: $speed.")
    }

    open fun stop() {
        println("Vehicle has stopped.")
    }
}