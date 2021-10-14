package main.kotlin.oop

class Person(var fullName: String, var age: Int) {
    constructor () : this("Ivanov Ivan", 100) {
        this.fullName = "Ivanov Ivan"
        this.age = 100
    }

    fun move() {
        println("$fullName возвраст $age")
    }

    fun talk() {
        println("Такой то $fullName говорит")
    }
}

fun main() {
    val Ivan = Person()
    val Petro = Person("Petro Ivanovych", 41)
    Ivan.talk()
    Petro.move()
}