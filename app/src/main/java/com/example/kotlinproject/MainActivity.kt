
package com.example.kotlinproject
/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
*/

fun main(args:Array<String>)
{
    println("New Project")
    val NewClass = Kotlin()
    NewClass.name = "Kotlin Language"
    println("The new language is : ${NewClass.name}")

    var Second = Kotlin()
    Second.name = "Second Language"
    println("the second name is: ${Second.name}")

    Second = Kotlin()
    println("the second name is: ${Second.name}")


    // operators
    var number1 : Int=6
    var number2 : Int=10
    println(number1 + number2)
}