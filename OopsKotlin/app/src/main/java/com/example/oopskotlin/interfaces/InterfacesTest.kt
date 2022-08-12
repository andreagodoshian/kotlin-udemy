package com.example.oopskotlin.interfaces

fun main(args: Array<String>) {

    var myVeh = Vehicles()

    println("Name: ${myVeh.name}")
    myVeh.go()
    myVeh.stop()

}