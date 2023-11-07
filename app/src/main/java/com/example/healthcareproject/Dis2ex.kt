package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDis2exBinding

class Dis2ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dis2ex)

        val binding = ActivityDis2exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent65 = Intent(this, Disease2::class.java)
        binding.BackToDisease2Button.setOnClickListener { startActivity(intent65) }

    }
}