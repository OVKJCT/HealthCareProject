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

        val intent28 = Intent(this, Exercise1::class.java)
        binding.exercise1Button.setOnClickListener {startActivity(intent28)}

        val intent29 = Intent(this, Exercise2::class.java)
        binding.exercise2Button.setOnClickListener {startActivity(intent29)}

        val intent30 = Intent(this, Exercise3::class.java)
        binding.exercise3Button.setOnClickListener {startActivity(intent30)}

        val intent31 = Intent(this, Exercise4::class.java)
        binding.exercise4Button.setOnClickListener {startActivity(intent31)}

        val intent32 = Intent(this, Exercise5::class.java)
        binding.exercise5Button.setOnClickListener {startActivity(intent32)}

    }
}