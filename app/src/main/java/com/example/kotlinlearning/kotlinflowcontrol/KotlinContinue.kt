package com.example.kotlinlearning.kotlinflowcontrol

fun main(args: Array<String>) {
    for (i in 1..5) {
        println("$i Always printed.")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i Not always printed.")
    }

    var number: Int
    var sum = 0

    for(i in 1..6){
        print("Enter an integer: ")
        number = readLine()!!.toInt()

        if(number <= 0)
            continue

        sum += number
    }
    println("sum = $sum")

    here@ for(j in 1..5){
        for(k in 1..4){
            if(j == 3 || k == 2)
                continue@here
            println("j = $j; k = $k")
        }
    }
}