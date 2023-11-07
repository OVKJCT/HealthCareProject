package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExer1exBinding

class Exer1ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer1ex)

        val binding = ActivityExer1exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent49 = Intent(this, Exercise1::class.java)
        binding.BackToExercise1Button.setOnClickListener { startActivity(intent49) }

    }
}