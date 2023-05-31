package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityLoginBinding
import com.example.healthcareproject.databinding.ActivityRecommendationBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent14 = Intent(this, Membership::class.java)
        binding.MembershipButton1.setOnClickListener { startActivity(intent14) }

    }
}