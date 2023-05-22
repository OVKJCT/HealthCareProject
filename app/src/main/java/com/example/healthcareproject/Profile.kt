package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.healthcareproject.databinding.ActivityMainBinding
import com.example.healthcareproject.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent8 = Intent(this, MainActivity::class.java)
        binding.HomeButton1.setOnClickListener {startActivity(intent8)}
    }
}