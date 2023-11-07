package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutr1exBinding

class Nutr1ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutr1ex)

        val binding = ActivityNutr1exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent74 = Intent(this, Nutrient1::class.java)
        binding.BackToNutrient1Button.setOnClickListener { startActivity(intent74) }

    }
}