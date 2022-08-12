package com.example.oopskotlin.abstract

class Car(override var model: Int) : Vehicle() {

    /*
    Notice: we aren't forced to implement non-abstract stuff
    */

    override fun vehicleName(name: String): String {
        return name
    }
}