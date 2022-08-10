package com.example.firstproject

fun main(args: Array<String>) {

    // NOTE: mapOf is IMMUTABLE in Kotlin 💀💀💀
    var ages = mapOf<String, Int>("Cheems" to 20, "Doge" to 25)

    println("Age of Cheems: " + ages["Cheems"])
    println("Age of Doge: " + ages.get("Doge"))

    println("-------------------------------")

    // HOWEVER... mutableMapOf exists, so it's cool
    var mutableAges = mutableMapOf<String, Int>("Daria" to 30, "Jane" to 31)
    mutableAges.put("Trent", 35)

    println("Age of Daria: " + mutableAges["Daria"])
    println("Age of Jane: " + mutableAges["Jane"])
    println("Age of Trent: " + mutableAges.get("Trent"))

    println("-------------------------------")

    println("TONIGHT ON SICK SAD WORLD!!!!!!!!!")

}