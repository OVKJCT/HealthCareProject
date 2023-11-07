package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutr4exBinding

class Nutr4ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutr4ex)

        val binding = ActivityNutr4exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent77 = Intent(this, Nutrient4::class.java)
        binding.BackToNutrient4Button.setOnClickListener { startActivity(intent77) }

    }
}