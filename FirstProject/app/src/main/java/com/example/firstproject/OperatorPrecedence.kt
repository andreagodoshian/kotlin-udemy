package com.example.firstproject

/*
Catch: parenthesis
--like PEMDAS, but more confusing--

1.) Unary: ++, --, +, -, !
2.) Multiplicative: *, /, %
3.) Additive: +, -
4.) Relational: <, <=, >, >=
5.) Equality: ==, !=
6.) Conditional &&
7.) Conditional ||
8.) Assignment: =, +=, -=, *=, /=, %=
 */

fun main(args: Array<String>) {

    var result:Int = 5 + 2 * 4
    // guess: 13
    println("Result: " + result)

    println("--------------------")

    result = (5 + 2) * 4
    // guess: 28
    println("Result: " + result)

    println("--------------------")

    var x:Int = 8
    var y:Int = 4
    var z:Int = 2

    result = x + --y + --z
    // guess: 12
    println("Result: " + result)

}