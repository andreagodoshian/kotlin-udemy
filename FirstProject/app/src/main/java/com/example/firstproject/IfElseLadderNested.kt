package com.example.firstproject

import java.lang.Exception
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var yourAge:Int = 0

    print("Please enter your age: ")
    try {
        yourAge = readLine()!!.toInt()
    } catch (e:Exception) {
        print("Wow dude... not cool.")
        exitProcess(-1)
    }

    if (yourAge < 13) println("You are a child.")
    else if (yourAge < 20) println("You are a teenager.")
    else {
        if (yourAge < 65) println("You are an adult... sucks to suck!!")
        else println("You are a senior.")
    }

    println("------------------------------")

    var number1:Int = 0
    var number2:Int = 0
    var number3:Int = 0

    print("Lastly, please enter 3 numbers: ")
    try {
        number1 = readLine()!!.toInt()
        number2 = readLine()!!.toInt()
        number3 = readLine()!!.toInt()
    } catch (e:Exception) {
        print("Wow dude... not cool.")
        exitProcess(-1)
    }

    var largestNumber:Int

    if (number1 >= number2) {
        if (number1 >= number3) largestNumber = number1
        else largestNumber = number3
    }
    else { // implies that number2 > number1
        if (number2 >= number3) largestNumber = number2
        else largestNumber = number3
    }

    println("The largest number: $largestNumber")

    println("------------------------------")
    println("By the way, THANKS FOR NOT CRASHING MY PROGRAM :)")
}