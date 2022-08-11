package com.example.firstproject

fun main(args: Array<String>) {

    for (number in 50..60) {
        print(number.toString() + " ")
    }

    println("\n-----------------------")

    var sum:Int = 0
    for (x in 0..5) {
        print(x.toString() + " ")
        sum += x
    }
    print("\nSum of the above numbers: " + sum.toString())

    println("\n-----------------------")

    var myNumberArray = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (y in myNumberArray) {
        print(y.toString() + " ")
    }

    println("\n-----------------------")

    var anotherNumberArray = arrayListOf<Int>(1, 2, 3)
    for (y in 0..(anotherNumberArray.size)-1) {
        println("anotherNumberArray[$y]: ${anotherNumberArray[y]}")
    }

    println("-----------------------")

    for (y in anotherNumberArray.indices) {
        println("anotherNumberArray[$y]: ${anotherNumberArray[y]}")
    }

    println("-----------------------")

    // for each...
    println("For each:")
    myNumberArray.forEach{(print(it.toString() + " "))}
}