package com.example.oopskotlin

class HockeyPlayers {

    var name:String? = null
    var number:Int? = null
    //^^dude this is awesome

    constructor()

    // alt + insert => "secondary constructor"
    constructor(name: String?, number: Int?) {
        this.name = name
        this.number = number
    }

    /*
    constructor(name:String, number:Int) {
        this.name = name
        this.number = number
    }
    */

}