package com.example.oopskotlin

class ClassicCars {

    var name:String? = null

    // private var model:Int? = null <--how access "getter?"
    var model:Int? = null
        private set

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }

}