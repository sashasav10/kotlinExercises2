package main.kotlin.oop

abstract class Shape(val color: String) {
    abstract fun draw()
}

class Circle(color: String, val x: Double, val y: Double) : Shape(color) {
    override fun draw() {
        println("Нарисован круг, цвет $color, координаты($x, $y)")
    }

    open fun equals(x2: Double, y2: Double) {
        if (x == x2 && y == y2) println("Координаты равны")
        else println("Координаты разные")
    }
}

class Rectangle(color: String, val x: Double, val y: Double) : Shape(color) {
    override fun draw() {
        println("Нарисован прямоугольник, цвет $color, координаты($x, $y)")
    }

    open fun equals(x2: Double, y2: Double) {
        if (x == x2 && y == y2) println("Координаты равны")
        else println("Координаты разные")
    }
}

fun main() {
    val shapes = listOf<Shape>(
        Circle("розовый", 22.0, 1.0),
        Circle("красный", 2.0, 10.0),
        Rectangle("черный", 0.0, -12.0)
    )
    for (i in shapes) {
        i.draw()
    }
}