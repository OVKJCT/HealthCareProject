package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutrient1Binding
import com.example.healthcareproject.databinding.ActivityNutrient4Binding

class Nutrient4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient4)

        val binding = ActivityNutrient4Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent46 = Intent(this, Nutrient::class.java)
        binding.BackToNutrientButton4.setOnClickListener {startActivity(intent46)}

        val intent72 = Intent(this, Nutr4ex::class.java)
        binding.Nutrient4Button.setOnClickListener {startActivity(intent72)}

    }
}