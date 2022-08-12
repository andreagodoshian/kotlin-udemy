package com.example.oopskotlin.abstract

abstract class Vehicle {

    /*
    If not defining body, needs to be declared abstract
    */

    abstract fun vehicleName(name:String) : String

    fun vehicleType(type:String) :String {
        return type
    }

    ///////////////////////////////////////

    /*
    If not initializing, needs to be declared abstract
    */

    abstract var model:Int

    var speed:Int? = null

}