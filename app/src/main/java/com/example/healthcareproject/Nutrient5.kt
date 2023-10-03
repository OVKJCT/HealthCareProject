package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutrient1Binding
import com.example.healthcareproject.databinding.ActivityNutrient5Binding

class Nutrient5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient5)

        val binding = ActivityNutrient5Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent47 = Intent(this, Nutrient::class.java)
        binding.BackToNutrientButton5.setOnClickListener {startActivity(intent47)}

    }
}