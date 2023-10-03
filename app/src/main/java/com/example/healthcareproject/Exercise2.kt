package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExercise1Binding
import com.example.healthcareproject.databinding.ActivityExercise2Binding

class Exercise2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise2)

        val binding = ActivityExercise2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent34 = Intent(this, Exercise::class.java)
        binding.BackToExerciseButton2.setOnClickListener {startActivity(intent34)}

    }
}