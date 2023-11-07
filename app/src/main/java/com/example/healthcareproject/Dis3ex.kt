package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDis3exBinding

class Dis3ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dis3ex)

        val binding = ActivityDis3exBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent66 = Intent(this, Disease3::class.java)
        binding.BackToDisease3Button.setOnClickListener { startActivity(intent66) }

    }
}