package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityCalendarBinding


class Calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent9 = Intent(this, MainActivity::class.java)
        binding.HomeButton3.setOnClickListener {startActivity(intent9)}


    }
}