package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.healthcareproject.databinding.ActivityMainBinding
import com.example.healthcareproject.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserInfo
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase



class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent8 = Intent(this, MainActivity::class.java)
        binding.HomeButton1.setOnClickListener { startActivity(intent8) }

        val database = Firebase.database

        val myRef = database.getReference("message")

        myRef.setValue("Success!")

    }
}