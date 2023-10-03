package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutrient1Binding
import com.example.healthcareproject.databinding.ActivityNutrient3Binding

class Nutrient3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient3)

        val binding = ActivityNutrient3Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent45 = Intent(this, Nutrient::class.java)
        binding.BackToNutrientButton3.setOnClickListener {startActivity(intent45)}

    }
}