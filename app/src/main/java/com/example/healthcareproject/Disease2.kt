package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDisease1Binding
import com.example.healthcareproject.databinding.ActivityDisease2Binding

class Disease2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disease2)

        val binding = ActivityDisease2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent20 = Intent(this, Food::class.java)
        binding.BackToFoodButton2.setOnClickListener {startActivity(intent20)}
    }
}