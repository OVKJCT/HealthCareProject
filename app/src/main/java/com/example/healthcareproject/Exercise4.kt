package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExercise3Binding
import com.example.healthcareproject.databinding.ActivityExercise4Binding

class Exercise4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise4)

        val binding = ActivityExercise4Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent36 = Intent(this, Exercise::class.java)
        binding.BackToExerciseButton4.setOnClickListener {startActivity(intent36)}

    }
}