package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmicalculator.databinding.ActivityCalculatorBinding
import com.google.android.material.textfield.TextInputLayout
import kotlin.math.pow

class calculator : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val username = intent.getStringExtra("Username")?: "User"
        binding.GreetingsTV.text = "Hi, $username!"

        binding.calculateBtn.setOnClickListener {
            calculate()
        }

    }
    private fun calculate(){
        val weightStr = binding.WeightET.text.toString()
        val heightStr = binding.HeightET.text.toString()
        val ageStr = binding.AgeET.text.toString()

        var isValid = true
        if (weightStr.isEmpty()){
            binding.WeightET.error = "Please complete this field"
            isValid = false
        }
        if (heightStr.isEmpty()) {
            binding.HeightET.error = "Please complete this field"
            isValid = false
        }
        if (ageStr.isEmpty()){
            binding.AgeET.error = "Please complete this field"
            isValid = false
        }
        if (!isValid) return


        val weight = weightStr.toDouble()
        val height = heightStr.toDouble()
        val age = ageStr.toDouble()

        val BMI = weight / height.pow(2)
        val intent = Intent(this,result::class.java)
        intent.putExtra("bmi",BMI)
        intent.putExtra("Age",age)
        intent.putExtra("Height",height)
        intent.putExtra("Weight",weight)
        startActivity(intent)
    }
}