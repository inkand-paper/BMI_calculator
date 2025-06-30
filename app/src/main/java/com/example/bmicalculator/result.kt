package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmicalculator.databinding.ActivityResultBinding

class result : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getAge = intent.getDoubleExtra("Age",0.0)
        val getHeight = intent.getDoubleExtra("Height",0.0)
        val getWeight = intent.getDoubleExtra("Weight",0.0)
        val result = intent.getDoubleExtra("bmi",0.0)


        binding.AgeTV.text = "Age\n$getAge"
        binding.HeightTV.text = "Height\n$getHeight"
        binding.WeightTV.text = "Weight\n$getWeight"

        when{
            result > 0.0 && result <= 16.0 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Severely Underweight"
                binding.StageText.text = "Critical level — medical attention needed"
            }
            result > 16.0 && result <= 16.9 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Moderately Underweight"
                binding.StageText.text = "Needs nutritional improvement"
            }
            result > 17.0 && result <= 18.4 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Mildly Underweight"
                binding.StageText.text = "Low weight, potential risk"
            }
            result > 18.5 && result <= 24.9 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Normal"
                binding.StageText.text = "Healthy weight"
            }
            result > 25.0 && result <= 29.9 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Overweight"
                binding.StageText.text = "May lead to health problems"
            }
            result > 30 && result <= 34.9 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Obese Class I (Moderate)"
                binding.StageText.text = "Start of obesity"
            }
            result > 35.0 && result <= 39.9 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Obese Class II (Severe)"
                binding.StageText.text = "High health risk"
            }
            result > 40.0 -> {
                binding.Result.text = "%.2f".format(result)
                binding.Stage.text = "Obese Class III (Very Severe)"
                binding.StageText.text = "Extremely high risk"
            }

        }
        binding.BackBtn2.setOnClickListener {
            val intent = Intent(this,calculator::class.java)
            startActivity(intent)
        }

    }
}