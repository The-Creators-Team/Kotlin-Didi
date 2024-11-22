package com.example.kotlinlearning.kotlinfunctions

import java.math.BigInteger

fun main(args: Array<String>){
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial of $number = $result")

    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))

    val number1 = 5
    println("Factorial of $number1 = ${factorial(number1)}")
}

fun factorial(n:Int): Long {
    return if(n == 1) n.toLong() else n*factorial(n-1)
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if(n == 1) run.toLong() else factorial(n-1,run*n)
}