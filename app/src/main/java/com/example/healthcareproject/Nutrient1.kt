package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExercise5Binding
import com.example.healthcareproject.databinding.ActivityNutrient1Binding

class Nutrient1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient1)

        val binding = ActivityNutrient1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent43 = Intent(this, Nutrient::class.java)
        binding.BackToNutrientButton1.setOnClickListener {startActivity(intent43)}

        val intent69 = Intent(this, Nutr1ex::class.java)
        binding.Nutrient1Button.setOnClickListener {startActivity(intent69)}

    }
}