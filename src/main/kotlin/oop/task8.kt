package main.kotlin.oop

abstract class Animal(var food:String,val location:String) {
    abstract fun makeNoise()
    abstract fun eat()
    fun sleep()
    {
        println("Животное спит")
    }
}
class Dog(food:String, location:String):Animal(food, location){
    override fun eat() {
        println("Собака ест $food")
    }

    override fun makeNoise() {
        println("Гав гав")
    }
}
class Cat(food:String, location:String):Animal(food, location){
    override fun eat() {
        println("Кот ест $food")
    }

    override fun makeNoise() {
        println("Мяу")
    }
}
class Horse(food:String, location:String):Animal(food, location){
    override fun eat() {
        println("Лошадь ест $food")
    }

    override fun makeNoise() {
        println("Пррр")
    }
}
class Vet(){
    fun treatAnimal(animal: Animal)
    {
        println("Еда ${animal.food}, место ${animal.location}")
    }
}
fun main(){
    val animals= listOf<Animal>(Dog("мясо","частный дом"),Cat("рыба","квартира"),
        Horse("сено","степь"))
    val vet=Vet()
    for (i in animals) {
        i.eat()
        i.makeNoise()
        vet.treatAnimal(i)
    }
}