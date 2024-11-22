package com.example.kotlinlearning.kotlinintro2

fun main(){
    val str = "Hello"

    str.run {
        println("The string's length: $length")
        //println("The string's length: ${this.length}") does the same
    }

    str.let {
        println("The string's length is ${it.length}")
    }

    val numberList = mutableListOf<Double>()
    numberList.also{println("Populating the list")}
        .apply{
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also{println("Sorting the list")}
        .sort()

    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run{
        add("four")
        add("five")
        count{it.endsWith("e")}
    }
    println("There are $countEndsWithE elements that end with e.")

    with(numbers){
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }
}