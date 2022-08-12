package com.example.oopskotlin

fun main(args: Array<String>) {

    var classicCar = ClassicCars("Porche 911", 1967)
    var classicCar2 = ClassicCars("Lamborghini Miura", 1966)

    println("This classic car is a ${classicCar.name} from ${classicCar.model}.")
    println("The ${classicCar2.name} from ${classicCar2.model} is also considered a classic car.")

    // classicCar2.model = 1973 <--this doesn't work, but we can read/get now

    println("---------------------------------")

    var myCar = VehicleCar()
    myCar.type = "Car"
    myCar.model = "Lada"
    myCar.maxSpeed = 222

    myCar.show()

    var mototsikle = VehicleMotorcycle()
    mototsikle.type = "Motorcycle"
    mototsikle.model = "Yam aha"
    mototsikle.maxSpeed = 160

    mototsikle.show()

}