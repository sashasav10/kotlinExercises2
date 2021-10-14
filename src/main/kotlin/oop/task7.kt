package main.kotlin.oop

open class Engine(val power: String, val company: String)
open class Person2(val fullName: String)
open class Driver(val experience: Byte, fullName: String) : Person2(fullName)
open class Car(val carClass: String, val engine: Engine, val driver: Driver, val marka: String) {
    fun start() {
        println("Поехали")
    }

    fun stop() {
        println("Останавливаемся")
    }

    fun turnRight() {
        println("Поворот направо")
    }

    fun turnLeft() {
        println("Поворот налево")
    }

    override fun toString(): String {
        return "Машина клас $carClass, марка $marka, мотор мощность ${engine.power} производитель ${engine.company}, водитель ${driver.fullName}, стаж ${driver.experience}"
    }
}

class Lorry(carClass: String, engine: Engine, driver: Driver, marka: String, val carrying: Int) :
    Car(carClass, engine, driver, marka) {
    override fun toString(): String {
        return "Машина клас $carClass, марка $marka, грузоподъемность $carrying,мотор мощность ${engine.power} производитель ${engine.company}, водитель ${driver.fullName}, стаж ${driver.experience}"
    }
}

class SportCar(carClass: String, engine: Engine, driver: Driver, marka: String, val speed: Int) :
    Car(carClass, engine, driver, marka) {
    override fun toString(): String {
        return "Машина клас $carClass, марка $marka, макс скорость $speed,мотор мощность ${engine.power} производитель ${engine.company}, водитель ${driver.fullName}, стаж ${driver.experience}"
    }
}

fun main() {
    val engine1 = Engine("342", "New Haryston")
    val person1 = Person2("Иванов И.И")
    val driver1 = Driver(8, person1.fullName)
    val car1 = Car("Premium", engine1, driver1, "Mercedes")
    val car2 = Lorry("Classic", engine1, driver1, "Gazel", 1500)
    val car3 = SportCar("Exlusive", engine1, driver1, "Porshe", 300)
    println(car1.toString())
    car1.start()
    car1.turnLeft()
    car1.turnRight()
    car1.stop()
    println(car2.toString())
    println(car3.toString())
}