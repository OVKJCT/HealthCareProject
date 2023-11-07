package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityExercise4Binding
import com.example.healthcareproject.databinding.ActivityExercise5Binding

class Exercise5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise5)


        val binding = ActivityExercise5Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent37 = Intent(this, Exercise::class.java)
        binding.BackToExerciseButton5.setOnClickListener {startActivity(intent37)}

        val intent58 = Intent(this, Exer5ex::class.java)
        binding.Exercise5ExButton.setOnClickListener {startActivity(intent58)}

    }
}