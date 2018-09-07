package ex_property_in_constructor

class Car(var name:String, val speed:Int = 0)

fun main(args:Array<String>) {
    var car = Car ("My Car")
    println(car.name)
    println(car.speed)
}