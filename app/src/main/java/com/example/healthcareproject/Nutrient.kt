package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutrientBinding
import com.example.healthcareproject.databinding.ActivityProfileBinding

class Nutrient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient)

        val binding = ActivityNutrientBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent16 = Intent(this, Recommendation::class.java)
        binding.BackButton3.setOnClickListener {startActivity(intent16)}
    }
}