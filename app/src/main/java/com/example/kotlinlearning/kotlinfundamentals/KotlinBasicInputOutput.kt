package com.example.kotlinlearning.kotlinfundamentals

import java.util.Scanner

fun main(args: Array<String>){
    println("Kotlin is interesting.")

    println("1. println ");
    println("2. println ");

    print("1. print ");
    print("2. print");

    val score = 12.3

    println("score")
    println("$score")
    println("score = $score")
    println("${score + score}")
    println(12.3)

    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")

    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    var integer: Int = reader.nextInt()

    println("You entered: $integer")


}