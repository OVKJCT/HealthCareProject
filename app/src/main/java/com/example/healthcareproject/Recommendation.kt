package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityBodyCheckBinding
import com.example.healthcareproject.databinding.ActivityMainBinding
import com.example.healthcareproject.databinding.ActivityRecommendationBinding

class Recommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        val binding = ActivityRecommendationBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent6 = Intent(this, Food::class.java)
        binding.FoodButton.setOnClickListener { startActivity(intent6) }

        val intent7 = Intent(this, Exercise::class.java)
        binding.ExerciseButton.setOnClickListener { startActivity(intent7) }

        val intent11 = Intent(this, MainActivity::class.java)
        binding.HomeButton5.setOnClickListener { startActivity(intent11) }
    }
}