package com.example.oopskotlin.abstract

fun main(args: Array<String>) {

    // var vehicle = Vehicle()
    // ^^can't because declared Abstract

    var car = Car(2022)

    car.speed = 222

    println("Name: ${car.vehicleName("Lada")}" +
            "\nType: ${car.vehicleType("Car")}" +
            "\nModel: ${car.model}" +
            "\nSpeed: ${car.speed}" +
            "\n--------------------------")

}