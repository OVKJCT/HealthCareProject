package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityNutrient1Binding
import com.example.healthcareproject.databinding.ActivityNutrient2Binding

class Nutrient2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient2)

        val binding = ActivityNutrient2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent44 = Intent(this, Nutrient::class.java)
        binding.BackToNutrientButton2.setOnClickListener {startActivity(intent44)}

        val intent70 = Intent(this, Nutr2ex::class.java)
        binding.Nutrient2Button.setOnClickListener {startActivity(intent70)}

    }
}