package com.example.kotlinlearning.kotlinfundamentals

fun main(args: Array<String>) {

    val a = 12
    val b = 13
    val max: Int

    max = if(a > b) a else b
    println("$max")

    val flag = true

    if(flag == true) {
        print("Hey ")
        print("jude!")
    }


}