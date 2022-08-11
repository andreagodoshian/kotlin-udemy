package com.example.firstproject

import java.lang.Exception
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var dayNumeric:Int
    var dayString:String

    print("Please enter a day in numeric format (1-7): ")
    try {
        dayNumeric = readLine()!!.toInt()
    } catch (e:Exception) {
        print("Wow dude... not cool.")
        exitProcess(-1)
    }

    when(dayNumeric) {
        1 -> dayString = "Monday"
        2 -> dayString = "Tuesday"
        3 -> dayString = "Wednesday"
        4 -> dayString = "Thursday"
        5 -> dayString = "Friday"
        6 -> dayString = "Saturday"
        7 -> dayString = "Sunday"
        else -> dayString = "Invalid"
    }

    println("Day is: $dayString")

    println("------------------------------")
    println("By the way, THANKS FOR NOT CRASHING MY PROGRAM :)")
}