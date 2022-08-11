package com.example.firstproject

fun main(args:Array<String>) {

    var myCharRange = 'a'.rangeTo('k')
    var myChar:Boolean = 'k' in myCharRange

    println("myChar ('k') in myCharRange ('a' to 'k'): " + myChar)
}