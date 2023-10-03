package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExercise2Binding
import com.example.healthcareproject.databinding.ActivityExercise3Binding

class Exercise3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise3)

        val binding = ActivityExercise3Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent35 = Intent(this, Exercise::class.java)
        binding.BackToExerciseButton3.setOnClickListener {startActivity(intent35)}

    }
}