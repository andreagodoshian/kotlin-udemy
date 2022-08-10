package com.example.firstproject

fun main(args: Array<String>) {

    var ages = ArrayList<Int>()
    ages.add(10)
    ages.add(1,15)
    ages.add(20)
    ages.add(15)

    print("ages ArrayList contains: ")
    for (x in ages) print(x.toString() +  "; ")

    println("\n---------------------")

    println("The third element of ages: ${ages[2]}")
    ages.remove(15)
    print("ages AFTER remove: ")
    for (x in ages) print(x.toString() +  "; ")

    println("\n---------------------")

    var cars = arrayListOf<String>("Lada", "Volvo")
    cars.add("BMW")

    print("cars ArrayList contains: ")
    for (x in cars) print(x +  "; ")

    println("\n---------------------")

    var myMixArrayList = ArrayList<Any>()
    myMixArrayList.add("Zoya")
    myMixArrayList.add(10/10)
    myMixArrayList.add(true)
    myMixArrayList.add('!')

    print("myMixArrayList contains: ")
    for (x in myMixArrayList) print(x.toString() +  "; ")

}