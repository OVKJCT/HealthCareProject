package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDisease4Binding
import com.example.healthcareproject.databinding.ActivityDisease5Binding

class Disease5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disease5)

        val binding = ActivityDisease5Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent26 = Intent(this, Food::class.java)
        binding.BackToFoodButton5.setOnClickListener {startActivity(intent26)}

        val intent63 = Intent(this, Dis5ex::class.java)
        binding.Disease5ExButton.setOnClickListener {startActivity(intent63)}

    }
}