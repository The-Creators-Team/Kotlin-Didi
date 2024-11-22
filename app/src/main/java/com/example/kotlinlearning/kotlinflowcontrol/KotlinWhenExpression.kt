package com.example.kotlinlearning.kotlinflowcontrol

fun main(args: Array<String>) {
    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when(operator){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator"
    }

    println("result = $result")

    val c = 12
    val d = 5

    println("Enter operator either +, -, * or /")
    val operator1 = readLine()

    when(operator1) {
        "+" -> println("$c + $d = ${c + d}")
        "-" -> println("$c - $d = ${c - d}")
        "*" -> println("$c * $d = ${c * d}")
        "/" -> println("$c / $d = ${c / d}")
        else -> println("$operator1 is invalid")
    }

    val n = -1

    when (n) {
        1,2,3 -> println("n is a positive integer less than 4.")
        0 -> println("n is zero")
        -1,-2 -> println("n is a negative integer greater than -3.")
    }

    val e = 100

    when(e){
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }

//    when(x) {
//        is Int -> print(x+1)
//        is String -> print(x.length + 1)
//        is IntArray -> print(x.sum())
//    }

    val f = 11
    val g = "11"

    when(g){
        "cat" -> println("Cat? Really?")
        12.toString() -> println("Close but not close enough.")
        f.toString() -> println("Bingo! It's eleven.")
    }
}