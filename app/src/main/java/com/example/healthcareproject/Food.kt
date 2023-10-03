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

        val intent19 = Intent(this, Disease1::class.java)
        binding.disease1Button.setOnClickListener {startActivity(intent19)}

        val intent21 = Intent(this, Disease2::class.java)
        binding.disease2Button.setOnClickListener {startActivity(intent21)}

        val intent23 = Intent(this, Disease3::class.java)
        binding.disease3Button.setOnClickListener {startActivity(intent23)}

        val intent25 = Intent(this, Disease4::class.java)
        binding.disease4Button.setOnClickListener {startActivity(intent25)}

        val intent27 = Intent(this, Disease5::class.java)
        binding.disease5Button.setOnClickListener {startActivity(intent27)}

    }
}