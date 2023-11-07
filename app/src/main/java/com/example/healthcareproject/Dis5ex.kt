package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDis5exBinding

class Dis5ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dis5ex)

        val binding = ActivityDis5exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent68 = Intent(this, Disease5::class.java)
        binding.BackToDisease5Button.setOnClickListener { startActivity(intent68) }

    }
}