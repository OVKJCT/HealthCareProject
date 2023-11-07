package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDisease5Binding
import com.example.healthcareproject.databinding.ActivityExercise1Binding

class Exercise1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise1)

        val binding = ActivityExercise1Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent33 = Intent(this, Exercise::class.java)
        binding.BackToExerciseButton1.setOnClickListener {startActivity(intent33)}

        val intent50 = Intent(this, Exer1ex::class.java)
        binding.Exercise1ExButton.setOnClickListener {startActivity(intent50)}

    }
}