package com.example.firstproject

fun main(args: Array<String>) {
    var a:String = "Hej, Kotlin"
    var b:String = "Language"
    println(a + " " + b)

    println("--------------------")

    var age:Int = 31
    println("Your age is: " + age)

    println("--------------------")

    var x:String = "Kotlin Island"
    var i:Int = x.length
    println("Length of Kotlin Island: " + i)

    println("--------------------")

    var boolee:Boolean = x.equals("Java")
    println("Does " + x + " equal Java? " + boolee)

    println("--------------------")

    var isItEmpty = x.isEmpty()
    println("Is " + x + " empty? " + boolee)

    println("--------------------")

    println(x.plus(": is it Sweden or Russia? RIP."))

    println("--------------------")

    println(x.lowercase())
    println(x.uppercase())

    println("--------------------")

    var t:String = "   Android   "
    println(x + " " + t)
    println(x + " " + t.trim())


}