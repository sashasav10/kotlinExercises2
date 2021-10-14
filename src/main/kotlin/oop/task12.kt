package main.kotlin.oop

class Item(val name: String, val price: Int, val rates: Int) {
}

class Category(val name: String, itemList: MutableList<Item>) {
}

class Busket(itemList: MutableList<Item>) {
}

class User(val login: String, password: String, busket: Busket) {
}

fun main() {
    val sandals = Item("Sandals", 245, 10)
    val boots = Item("Boots", 500, 9)
    val mocasines = Item("Mocasines", 100, 7)
    val shoes = Category("Shoes", mutableListOf(sandals, boots, mocasines))

    val nike = Item("Nike", 25, 10)
    val adidas = Item("Adidas", 50, 8)
    val mes = Item("Mes", 70, 9)
    val tShirt = Category("T-Shirt", mutableListOf(nike, adidas, mes))

    val whiteBeach = Item("White beach", 59, 10)
    val summerTime = Item("SummerTime", 50, 10)
    val newObs = Item("NewObs", 110, 7)
    val shirt = Category("Shirt", mutableListOf(whiteBeach, summerTime, newObs))

    val user1 = User("sasha.sav.10@gmail.com", "12345678", Busket(mutableListOf(sandals, nike, summerTime)))
}