package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityLoginBinding
import com.example.healthcareproject.databinding.ActivityMembershipBinding

class Membership : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membership)

        val binding = ActivityMembershipBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent15 = Intent(this, Login::class.java)
        binding.LoginBackButton.setOnClickListener { startActivity(intent15) }


    }
}