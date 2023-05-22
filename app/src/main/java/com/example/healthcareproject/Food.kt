package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityFoodBinding
import com.example.healthcareproject.databinding.ActivityProfileBinding

class Food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val binding = ActivityFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent12 = Intent(this, Recommendation::class.java)
        binding.BackButton1.setOnClickListener {startActivity(intent12)}

    }
}