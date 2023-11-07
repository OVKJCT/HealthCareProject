package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDis1exBinding

class Dis1ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dis1ex)

        val binding = ActivityDis1exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent64 = Intent(this, Disease1::class.java)
        binding.BackToDisease1Button.setOnClickListener { startActivity(intent64) }

    }
}