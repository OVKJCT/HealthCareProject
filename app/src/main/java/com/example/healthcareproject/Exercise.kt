package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExerciseBinding
import com.example.healthcareproject.databinding.ActivityFoodBinding

class Exercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        val binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent13 = Intent(this, Recommendation::class.java)
        binding.BackButton2.setOnClickListener {startActivity(intent13)}

    }
}