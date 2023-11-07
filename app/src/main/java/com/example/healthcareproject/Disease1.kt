package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDisease1Binding

class Disease1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disease1)

        val binding = ActivityDisease1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent18 = Intent(this, Food::class.java)
        binding.BackToFoodButton1.setOnClickListener {startActivity(intent18)}

        val intent59 = Intent(this, Dis1ex::class.java)
        binding.Disease1ExButton.setOnClickListener {startActivity(intent59)}
    }
}