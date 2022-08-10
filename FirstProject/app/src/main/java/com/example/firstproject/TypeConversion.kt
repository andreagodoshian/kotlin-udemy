package com.example.firstproject

/*
toByte(), toShort(), toInt(), toLong(),
toFloat(), toDouble()
*/
fun main(args: Array<String>) {
    // var x:Byte = 128 // too large
    var x:Byte = 127
    var y:Int = x.toInt()
    var z:Double = y.toDouble()

    println(x)
    println(y)
    println(z)

    println("-------------------------------")

    var a:Double = 132.32
    var b:Int = a.toInt()
    var c:Byte = b.toByte()

    println(a)
    println(b)
    println(c) // DATA LOSS

}