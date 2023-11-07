package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExer5exBinding

class Exer5ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer5ex)

        val binding = ActivityExer5exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent54 = Intent(this, Exercise5::class.java)
        binding.BackToExercise5Button.setOnClickListener { startActivity(intent54) }

    }
}