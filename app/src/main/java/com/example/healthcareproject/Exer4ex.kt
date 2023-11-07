package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExer4exBinding

class Exer4ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer4ex)

        val binding = ActivityExer4exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent53 = Intent(this, Exercise4::class.java)
        binding.BackToExercise4Button.setOnClickListener { startActivity(intent53) }

    }
}