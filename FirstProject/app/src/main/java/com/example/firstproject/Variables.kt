package com.example.firstproject

fun main(args: Array<String>) {

    var a = 10;
    var b = 20;
    var c = a + b;

    print(c)
    print(c)
    println(c)
    println(c)

    println("-----------------------------")

    var age = 10 // valid
    var _age = 20 // valid
    // var 3age = 30 // invalid

    age = 20;
    age = 10;
    println(age);

    println("-----------------------------")

    val year = 2020;
    // year = 2019; // invalid

    val pi = 3.14
    println(pi)
}