package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.NextBtn.setOnClickListener {
            val userName = binding.InputLayoutET1.text.toString().trim()
            val intent = Intent(this,calculator::class.java)
            intent.putExtra("Username",userName)

            var isValid = true
            if (userName.isEmpty()){
                binding.InputLayoutET1.error = "Please complete this field"
                isValid = false
            }
            if (!isValid) return@setOnClickListener

            startActivity(intent)
        }

    }
}