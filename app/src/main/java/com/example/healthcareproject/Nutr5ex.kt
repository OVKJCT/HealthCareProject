package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutr5exBinding

class Nutr5ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutr5ex)

        val binding = ActivityNutr5exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent78 = Intent(this, Nutrient5::class.java)
        binding.BackToNutrient5Button.setOnClickListener { startActivity(intent78) }

    }
}