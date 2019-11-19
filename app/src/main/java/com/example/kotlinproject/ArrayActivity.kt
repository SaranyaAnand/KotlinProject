package com.example.kotlinproject

import java.util.*

fun main(){
    //sample1()
 //   sample2()
  //  arrayCount()
    arrarySorting()
}

fun sample1(){
    var num= arrayOf(1,2,3,4,5)
    println(Arrays.toString(num))

    var num1= IntArray(5,{i -> i*2+3})
    println(Arrays.toString(num1))
}

fun sample2(){
    var num= arrayOf(1,2,3,5,8)
    println(num.get(1))
    num.set(3,10)
    println(Arrays.toString(num))
    val num1 = num.plus(1)
    println(Arrays.toString(num1))
    println(num.last())
    println(num.first())
    println(num.lastIndexOf(3))

}

fun arrayCount(){
    var num = arrayOf(1,2,4,6,7,9)
    println("the count of array is ${num.count()}")
    val Evens = num.count({it % 2 == 0})
    println("there are ${Evens} even numbers")
}

fun arrarySorting(){
    var num = arrayOf(6,3,8,1,4,2)
    val SortedArray = num.sortedArray()
    println(Arrays.toString(SortedArray))
    val decendingOrder = num.sortedArrayDescending()
    println(Arrays.toString(decendingOrder))

}