package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityCalenderBinding
import com.example.healthcareproject.databinding.ActivityProfileBinding

class Calender : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        val binding = ActivityCalenderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent9 = Intent(this, MainActivity::class.java)
        binding.HomeButton3.setOnClickListener {startActivity(intent9)}

    }
}