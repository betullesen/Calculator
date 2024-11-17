package com.betulesen.calculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.betulesen.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun collect(view : View){
        number1 = binding.number1EditText.text.toString().toDoubleOrNull()
        number2 = binding.number2EditText.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){
            result = number1!! + number2!!
            binding.textViewResult.text ="${result}"

        }else{
            binding.textViewResult.text="Please enter valid numbers!"
        }

    }

    fun divide(view: View){
        number1 = binding.number1EditText.text.toString().toDoubleOrNull()
        number2 = binding.number2EditText.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){

            result = number1!! / number2!!
            binding.textViewResult.text = "${result}"

        }else{

            binding.textViewResult.text="Please enter valid numbers!"

        }


    }

    fun impact(view: View){
        number1 = binding.number1EditText.text.toString().toDoubleOrNull()
        number2 = binding.number2EditText.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){

            result = number1!! * number2!!
            binding.textViewResult.text = "${result}"

        }else{
            binding.textViewResult.text = "Please enter valid numbers!"
        }

    }

    fun extraction(view: View){
        number1 = binding.number1EditText.text.toString().toDoubleOrNull()
        number2 = binding.number2EditText.text.toString().toDoubleOrNull()

        if(number1 != null && number2 != null){

            result = number1!! - number2!!
            binding.textViewResult.text = "${result}"

        }else{
            binding.textViewResult.text = "Please enter valid numbers!"
        }

    }
}