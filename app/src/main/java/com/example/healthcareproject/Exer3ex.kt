package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExer3exBinding

class Exer3ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exer3ex)

        val binding = ActivityExer3exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent52 = Intent(this, Exercise3::class.java)
        binding.BackToExercise3Button.setOnClickListener { startActivity(intent52) }

    }
}