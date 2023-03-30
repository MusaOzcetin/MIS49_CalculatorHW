package com.musaozcetin.musaozcetin_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.musaozcetin.musaozcetin_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    var firstNum : Int? = null
    var secNum : Int? = null
    var result : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun division(view : View) {
        firstNum = binding.editText1.text.toString().toIntOrNull()
        secNum = binding.editText2.text.toString().toIntOrNull()

        if (firstNum == null || secNum == null) {
            binding.resultText.text = "Values cannot be null! Please provide a number in order to calculate"
        } else {
            result = firstNum!! / secNum!!
            binding.resultText.text = "Result: $result"
        }
    }

    fun multiplication(view : View) {
        firstNum = binding.editText1.text.toString().toIntOrNull()
        secNum = binding.editText2.text.toString().toIntOrNull()

        if (firstNum == null || secNum == null) {
            binding.resultText.text = "Values cannot be null! Please provide a number in order to calculate"
        } else {
            result = firstNum!! * secNum!!
            binding.resultText.text = "Result: $result"
        }
    }

    fun subtraction(view : View) {
        firstNum = binding.editText1.text.toString().toIntOrNull()
        secNum = binding.editText2.text.toString().toIntOrNull()

        if (firstNum == null || secNum == null) {
            binding.resultText.text = "Values cannot be null! Please provide a number in order to calculate"
        } else {
            result = firstNum!! - secNum!!
            binding.resultText.text = "Result: $result"
        }
    }

    fun addition(view : View) {
        firstNum = binding.editText1.text.toString().toIntOrNull()
        secNum = binding.editText2.text.toString().toIntOrNull()

        if (firstNum == null || secNum == null) {
            binding.resultText.text = "Values cannot be null! Please provide a number in order to calculate"
        } else {
            result = firstNum!! + secNum!!
            binding.resultText.text = "Result: $result"
        }
    }
}
