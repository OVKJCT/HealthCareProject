package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutr3exBinding

class Nutr3ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutr3ex)

        val binding = ActivityNutr3exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent76 = Intent(this, Nutrient3::class.java)
        binding.BackToNutrient3Button.setOnClickListener { startActivity(intent76) }

    }
}