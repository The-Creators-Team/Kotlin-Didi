package com.example.kotlinlearning.kotlinnewbietopro

import kotlin.random.Random

abstract class Shape(var name: String) {
    init {
        println("I am the super class!")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }
}

class Rectangle(val a: Double, val b: Double): Shape("Rectangle"){

    constructor(a: Double): this(a,a)

    constructor(a: Int, b: Int): this(a.toDouble(), b.toDouble())

    companion object{
        fun randomRectangle(): Rectangle {
            val sideA = Random.nextDouble(1.0,10.0)
            val sideB = Random.nextDouble(1.0,10.0)
            return Rectangle(sideA, sideB)
        }
    }

    init{
        println("$name created with a = $a and b = $b")
    }

    override fun area(): Double = a * b

    override fun perimeter(): Double = 2 * a + 2 * b

    fun isSquare() = a == b

}

fun main(){
    val rectangle = Rectangle.randomRectangle()
    println("Rectangle area is ${rectangle.area()}")
}