package com.example.oopskotlin

fun main(args: Array<String>) {

    var myCar = Cars()
    myCar.name = "Lada"
    myCar.model = 2022

    var myCar2 = Cars()
    myCar2.name = "Volvo"
    myCar2.model = 2023

    println("I have a ${myCar.name} made in ${myCar.model}.")
    println("I also have a ${myCar2.name} made in ${myCar2.model}.")


}