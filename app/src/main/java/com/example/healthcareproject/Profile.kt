package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.healthcareproject.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

private var auth : FirebaseAuth = Firebase.auth

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        auth = Firebase.auth

        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent8 = Intent(this, MainActivity::class.java)
        binding.HomeButton1.setOnClickListener { startActivity(intent8) }

        val intent16 = Intent(this, MainActivity::class.java)

        binding.UserProfileButton.setOnClickListener {

            val name: String = binding.UserName.text.toString()
            val age: String = binding.UserAge.text.toString()
            val height: String = binding.UserHeight.text.toString()
            val weight: String = binding.UserWeight.text.toString()

            val userUID2 = auth.currentUser?.uid.orEmpty()

            val addFB2 = Firebase.database.reference.child("Users").child(userUID2)

            val userINMP2 = mutableMapOf<String,Any>()

            userINMP2["name"] = name

            userINMP2["age"] = age

            userINMP2["height"] = height

            userINMP2["weight"] = weight

            addFB2.updateChildren(userINMP2)

            Toast.makeText(this, "프로필 정보 입력 완료", Toast.LENGTH_SHORT).show()
            startActivity(intent16)

        }

    }

}

