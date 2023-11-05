package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.healthcareproject.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

private var auth : FirebaseAuth = Firebase.auth

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        auth = Firebase.auth

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent14 = Intent(this, Membership::class.java)

        binding.MembershipButton1.setOnClickListener { startActivity(intent14) }

        val intent16 = Intent(this, MainActivity::class.java)

        binding.LoginButton.setOnClickListener {
            val email: String = binding.EmailAddressText1.text.toString()
            val password: String = binding.PasswordText1.text.toString()

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    binding.EmailAddressText1.text.clear()
                    binding.PasswordText1.text.clear()

                    if (task.isSuccessful) {
                        Toast.makeText(this, "로그인에 성공했습니다!", Toast.LENGTH_SHORT).show()
                        startActivity(intent16)
                    }
                    else {
                        Toast.makeText(this, "아이디와 비밀번호를 정확하게 입력해주세요.", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        val userUID = auth.currentUser?.uid.orEmpty()

        val addFB = Firebase.database.reference.child("Users").child(userUID)

        val userINMP = mutableMapOf<String,Any>()

        userINMP["user ID"] = userUID

        addFB.updateChildren(userINMP)

    }
}