package com.example.firstproject

import java.lang.Exception
import kotlin.random.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var i:Int = 5
    while (i>0) {
        print("$i ") // why haven't I been writing like this?
        i--
    }

    println("\n------------------------")

    var x:Int = 1
    var fact:Int = 1
    while (x < 6) {
        fact *= x
        print("$x! = $fact ... ")
        x++
    }

    println("\n------------------------")

    var userGuess:Int = -1
    val answer:Int = Random.nextInt(0, 10)

    while (2 > 1) {
        println("Please enter a number between 0 and 10: ")

        try {
            userGuess = readLine()!!.toInt()
        } catch (e:Exception) {
            println("Not cool, dude.")
            exitProcess(-1)
        }

        if (userGuess == answer) {
            println("Congrats!")
            break
        }
        else if (userGuess < answer) println("Increase!")
        else println("Decrease!")
    }

}