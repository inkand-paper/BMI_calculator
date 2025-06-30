package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmicalculator.databinding.ActivityCalculatorBinding
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
        binding.BackBtn1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun calculate(){
        val weightStr = binding.WeightET.text.toString()
        val heightStr = binding.HeightET.text.toString()
        val ageStr = binding.AgeET.text.toString()
        if (weightStr.isEmpty() || heightStr.isEmpty() || ageStr.isEmpty()){
            Toast.makeText(this, "Complete All the fields!!", Toast.LENGTH_SHORT).show()
            return
        }
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