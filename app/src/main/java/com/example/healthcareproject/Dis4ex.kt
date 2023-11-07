package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDis4exBinding

class Dis4ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dis4ex)

        val binding = ActivityDis4exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent67 = Intent(this, Disease4::class.java)
        binding.BackToDisease4Button.setOnClickListener { startActivity(intent67) }

    }
}