package com.example.kotlinlearning.kotlinflowcontrol

fun main(args: Array<String>){
    var i = 1

    while(i <= 5) {
        println("Line $i")
        ++i
    }

    var sum = 0
    var j = 100

    while(j != 0) {
        sum += j
        --j
    }
    println("sum = $sum")

    var sum1: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum1 += input.toInt()
    } while (input != "0")

    println("sum = $sum1")
}