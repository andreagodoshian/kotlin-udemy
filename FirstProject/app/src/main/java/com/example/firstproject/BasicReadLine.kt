package com.example.firstproject

import java.lang.Exception

fun main(args:Array<String>) {

    print("Please enter your name: ")
    var name:String? = readLine()

    print("Please enter your age: ")
    var age:Int = 0;
    try {
        age = readLine()!!.toInt()
    } catch (e:Exception) {
    }

    println("--------------------------")

    println("Thank you, $name aged $age!")

}