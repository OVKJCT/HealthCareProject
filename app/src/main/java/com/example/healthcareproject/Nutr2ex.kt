package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutr2exBinding

class Nutr2ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutr2ex)

        val binding = ActivityNutr2exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent75 = Intent(this, Nutrient2::class.java)
        binding.BackToNutrient2Button.setOnClickListener { startActivity(intent75) }

    }
}