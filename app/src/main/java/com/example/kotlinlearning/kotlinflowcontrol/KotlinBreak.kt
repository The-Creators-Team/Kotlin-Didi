package com.example.kotlinlearning.kotlinflowcontrol

fun main (args: Array<String>){
    for(i in 1..10){
        if(i == 5){
            break
        }
        println(i)
    }

    var sum = 0
    var number: Int

    while(true){
        print("Enter a number: ")
        number = readLine()!!.toInt()

        if(number == 0)
            break

        sum += number
    }

    print("sum = $sum")

    first@ for (j in 1..4){

        second@ for (k in 1..2){
            println("j = $j; k = $k")

            if (j == 2)
                break@first
        }
    }
}