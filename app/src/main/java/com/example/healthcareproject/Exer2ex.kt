package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExer2exBinding

class Exer2ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer2ex)

        val binding = ActivityExer2exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent51 = Intent(this, Exercise2::class.java)
        binding.BackToExercise2Button.setOnClickListener { startActivity(intent51) }

    }
}