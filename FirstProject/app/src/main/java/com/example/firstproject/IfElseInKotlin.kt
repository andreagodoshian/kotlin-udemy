package com.example.firstproject

import java.lang.Exception
import kotlin.system.exitProcess

fun main(args:Array<String>) {

    var number:Int = 0

    print("Please enter a number: ")
    try {
        number = readLine()!!.toInt()
    } catch (e:Exception) {
        print("Wow dude... not cool.")
        exitProcess(-1)
    }

    if (number % 2 == 0) println("$number is an even number")
    else println("$number is NOT an even number")

    println("THANKS FOR NOT CRASHING MY PROGRAM :)")

}