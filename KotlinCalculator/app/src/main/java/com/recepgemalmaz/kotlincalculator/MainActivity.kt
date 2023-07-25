package com.recepgemalmaz.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.recepgemalmaz.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var myString : String
    private lateinit var binding: ActivityMainBinding

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        myString = ""

    }

    fun mySum(view : View) {

        number1 = binding.number1text.text.toString().toIntOrNull()
        number2 = binding.number2text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.textViewResult.text = "Error!"

        } else {
            result = number1!! + number2!!
            binding.textViewResult.text = "Result: $result"
        }




    }

    fun mySub(view : View) {

        number1 = binding.number1text.text.toString().toIntOrNull()
        number2 = binding.number2text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.textViewResult.text = "Error!"

        } else {
            result = number1!! - number2!!
            binding.textViewResult.text = "Result: $result"
        }


    }

    fun myMultiply(view: View) {

        number1 = binding.number1text.text.toString().toIntOrNull()
        number2 = binding.number2text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.textViewResult.text = "Error!"

        } else {
            result = number1!! * number2!!
            binding.textViewResult.text = "Result: $result"
        }


    }

    fun myDiv(view: View) {

        number1 = binding.number1text.text.toString().toIntOrNull()
        number2 = binding.number2text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.textViewResult.text = "Error!"

        } else {
            result = number1!! / number2!!
            binding.textViewResult.text = "Result: $result"
        }

    }





}