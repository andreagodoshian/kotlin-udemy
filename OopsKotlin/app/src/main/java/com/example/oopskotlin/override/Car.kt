package com.example.oopskotlin.override

class Car : Vehicle() {

    fun superStart() {
        super.start()
    }

    fun superAccel() {
        super.accelerate(100)
    }

    fun superStop() {
        super.stop()
    }

    override fun start() {
        println("Car has started.")
    }

    override fun accelerate(speed:Int) {
        println("Car accelerates - current speed: $speed.")
    }

    override fun stop() {
        println("Car has stopped.")
    }

}