package com.example.firstproject

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    println("Please enter two numbers: ")

    try {
        var firstNum = readln().toInt()
        var secondNum = readln().toInt()

        show(firstNum, secondNum)
        println(add(firstNum, secondNum))
        println("The smaller number is: ${findMin(firstNum, secondNum)}")

    } catch (e:Exception) {
        println("Dude... not cool.")
        exitProcess(-1)
    }

    println("--------------------------")
    println("By the way... THANKS FOR NOT CRASHING MY PROGRAM :)")

}

fun show(num1:Int, num2:Int) : Unit {
    println("You entered $num1 and $num2")
}

fun add(num1:Int, num2:Int) : String {
    return "$num1 + $num2 = ${num1 + num2}"
}

fun findMin (num1:Int, num2:Int) : Int {
    var minimum:Int

    if (num1 < num2) minimum = num1
    else minimum = num2

    return minimum
}