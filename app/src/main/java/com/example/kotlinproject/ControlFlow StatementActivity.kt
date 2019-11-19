package com.example.kotlinproject


fun main(){
   // mIf()
   // mFor()
   // mWhile()
   // mWhen()
    mContinue()
}

// if condition
fun mIf(){
    val num1 = 10;
    val num2 = 20
    val result = if(num1>num2){
       "$num1 is greater than $num2"
    }else{
        "$num1 is smaller than $num2"
    }
    println(result)

}

// for loop c
fun mFor(){
    val value= arrayOf(10, 30, 40, 60, 70)
    for (i in value){
        println(i)
    }

    println()

    for(item in 1..10){
        println(item)
    }
}

// while loop
fun mWhile(){
    var i : Int = 0
    while (i<4){
        println("the value is $i")
        i++
    }
}

// When
fun mWhen(){
    var num = 4
    var numProvided = when(num){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"

        else -> "invalid number"
    }
    println("You provided $numProvided number")

    var num2 = 7
    when(num2){
        in 0..5 -> println("num is present in the range 0..1")
        in 5..10 -> println("num is present in the range 5..10")
        in 10..15 -> println("num is present in the range 10..15")
        else -> println("num is not present")
    }
}

// Continue
   fun mContinue(){
   // var j: Int = 0
    for(i in 1..5){
        println("i == $i")
        if(i == 3){
            continue
        }
        println("this is below if")
    }
}