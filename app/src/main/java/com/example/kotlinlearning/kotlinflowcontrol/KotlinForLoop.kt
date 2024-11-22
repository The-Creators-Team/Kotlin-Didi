package com.example.kotlinlearning.kotlinflowcontrol

fun main(args: Array<String>){
    print("for (i in 1..5) print(i) = ")
    for(i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for(i in 5..1) print(i)

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for(i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for(i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for(i in 5 downTo 1 step 2) print(i)

    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for(item in language)
        println(item)

    for(item in language.indices) {
        if(item%2 == 0)
            println(language[item])
    }

    var text = "Kotlin"

    for(letter in text){
        println(letter)
    }

    for(item in text.indices){
        println(text[item])
    }
}
