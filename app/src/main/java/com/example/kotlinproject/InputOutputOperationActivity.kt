package com.example.kotlinproject

fun main(){
    inputOperation()
}

// Input Operation
fun inputOperation(){
    println("Enter your name")
    var name = readLine()
    println("Enter your age")
    val age: Int = Integer.valueOf(readLine())
    println("the name is ${name} and age is ${age}")
}