package com.example.kotlinlearning.kotlinfundamentals

fun main(args: Array<String>){
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")

    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val result1 = start + middle + end
    println(result1)

    var number = 12
    number *= 5
    println("number  = $number")

    val a = 1
    val b = true
    var c = 1

    var result2: Int
    var booleanResult: Boolean

    result2 = -a
    println("-a = $result2")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")

    val d = -12
    val e = 12

    val max = if(d>e){
        println("d is larger than e.")
        d
    } else {
        println("e is larger than d.")
        e
    }

    println("max = $max")

    val f = 10
    val g = 9
    val h = -1
    val result3: Boolean

    result3 = (f>g) && (f>h)
    println(result3)

    val numbers = intArrayOf(1,4,42,-3)

    if(4 in numbers){
        println("numbers array contains 4.")
    }

    val i = intArrayOf(1, 2, 3, 4, - 1)
    println(i[1])
    i[1] = 12
    println(i[1])

}