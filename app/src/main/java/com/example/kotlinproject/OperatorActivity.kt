package com.example.kotlinproject

import java.util.*

// in Operator
fun main(){
  //  inOperator()
   // isOperator()
  //  lambdaOperator()
  //  rangeOperator()
  //  notNullAssertionOperator()
  //  elvisOperator()
    nullSafetyOperator()
}

fun inOperator() {
        val count = 5

        //‘in’ operator in ‘if’ condition
        if (count in 1..10 && count !in 5..7) {
            println("Number is between 1 to 10 but not 5 to 7")
        }
        val array: IntArray = intArrayOf(1, 2, 3, 4, 5)
        if (count in array) {
            println("Number is present in property array")
        }

        //‘in’ operator in ‘when’ condition
        when(count){
            in 11..20 -> println("Number is between 10 and 20 including both")
            !in 21..30 -> println("Number is not between 21 to 30")
            in array -> println("Number is in the property array")
            !in array -> println("Number is not in the property array")
        }

        //in’ operator in ‘for’ loop
        for (item in 1..8){
            println("Iterates loop from 1 to 10")
        }
        for (item in array){
            println("Iterates all items in array")
        }

    }

    // is Operator
    open class Base
    class Derived : Base()

    fun isOperator(){
        val b = Base()
        val d = Derived()

        println(b is Base)
        println(b is Derived)
        println(d is Base)
        println(d is Derived)
        println(d is Any)

    }

   // lambda Operator
    fun lambdaOperator(){
       val color = arrayOf("red", "green", "blue", "orange", "yellow")
       Arrays.sort(color) {s1: String, s2: String -> s1.compareTo(s2) }
       println(Arrays.toString(color))
   }

   // range Operator
     fun rangeOperator(){
       for(i in 1..13 step 2){
           println(i)
       }
   }

   // Non-null assertion operator
   fun notNullAssertionOperator() {
      // val words = listOf("forest", "river", null, "mountains")
       val words = listOf("forest", "river", "mountains")

       var noOfChars : Int = 0
       for(word in words) {
           val n = word !!.length
           noOfChars += n
       }
       println("There are ${noOfChars} characters in the list")
   }

   // Elvis operator
     fun elvisOperator(){
       val words = listOf("forest", "river", null, "mountains")
       for(word in words){
           val n = word ?.length ?:0
           println("${word} has ${n} letters")
       }
   }

   // null-Safety operator
      fun nullSafetyOperator(){
       val words = listOf("forest", "river", null, "mountains")
       for(word in words){
           val n= word ?.toUpperCase()
           println(n)
       }
   }
