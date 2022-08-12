package com.example.oopskotlin.override


fun main(args: Array<String>) {

    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(50)
    vehicle.stop()

    println("----------------------")

    var car = Car()

    println("Suuuuuuuuper! -Franky")

    car.superStart()
    car.superAccel()
    car.superStop()

    println("----------------------")

    var car2 = Car()

    car2.start()
    car2.accelerate(80)
    car2.stop()
}