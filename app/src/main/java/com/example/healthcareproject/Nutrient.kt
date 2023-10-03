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

        val intent38 = Intent(this, Nutrient1::class.java)
        binding.Nutrient1Button.setOnClickListener {startActivity(intent38)}

        val intent39 = Intent(this, Nutrient2::class.java)
        binding.Nutrient2Button.setOnClickListener {startActivity(intent39)}

        val intent40 = Intent(this, Nutrient3::class.java)
        binding.Nutrient3Button.setOnClickListener {startActivity(intent40)}

        val intent41 = Intent(this, Nutrient4::class.java)
        binding.Nutrient4Button.setOnClickListener {startActivity(intent41)}

        val intent42 = Intent(this, Nutrient5::class.java)
        binding.Nutrient5Button.setOnClickListener {startActivity(intent42)}
    }
}