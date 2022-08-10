package com.example.firstproject

fun main(args: Array<String>) {

    var ages = arrayOf(10, 20, 30)
    println("First age: " + ages[0])
    println("Second age: " + ages[1])
    println("Third age: " + ages.get(2))

    println("--------------------------")

    var cars = arrayOf("Lada", "Volvo", "BMW")
    println("First car: " + cars[0])
    println("Second car: " + cars[1])
    println("Third car: " + cars.get(2))

    cars.set(2, "Audi")
    println("Third car (new): " + cars.get(2))

    println("--------------------------")

    println("Size of ages array: " + ages.size)
    println("Size of cars array: " + cars.size)

    println("--------------------------")

    var monthNamesAndNums = arrayOf("October", 10, "November", 11, "December", 12)
    for (x in monthNamesAndNums) print("$x ")

}