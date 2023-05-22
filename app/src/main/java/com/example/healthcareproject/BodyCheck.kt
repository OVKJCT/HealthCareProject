package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityBodyCheckBinding
import com.example.healthcareproject.databinding.ActivityCalenderBinding

class BodyCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_check)

        val binding = ActivityBodyCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent10 = Intent(this, MainActivity::class.java)
        binding.HomeButton4.setOnClickListener {startActivity(intent10)}

    }
}