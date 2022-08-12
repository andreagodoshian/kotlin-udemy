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

    println("---------------------------------")

    var myCat = Cats("Russian Blue", 4)
    var myCat2 = Cats("American Bobtail", 1)

    println("My first cat is a ${myCat.breed} and it is ${myCat.age}.")
    println("My second cat is a ${myCat2.breed} and it is ${myCat2.age}.")

    println("---------------------------------")

    var hockeyPlayer = HockeyPlayers()
    hockeyPlayer.name = "Patrick Roy"
    hockeyPlayer.number = 33
    var hockeyPlayer2 = HockeyPlayers("Staffan Kronwall", 27)

    println("${hockeyPlayer.name} is awesome. His number is ${hockeyPlayer.number}.")
    println("${hockeyPlayer2.name} is more awesome 😉 his number is ${hockeyPlayer2.number}.")

    println("---------------------------------")

    myCar2.name = "Lada"
    myCar2.model = 1990

    println("I sold my Volvo. Now I have a ${myCar2.name} from ${myCar2.model}.")
}