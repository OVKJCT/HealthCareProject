package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.healthcareproject.databinding.ActivityLoginBinding
import com.example.healthcareproject.databinding.ActivityMembershipBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var auth : FirebaseAuth

class Membership : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        auth = Firebase.auth

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_membership)

        val binding = ActivityMembershipBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent15 = Intent(this, Login::class.java)

        binding.LoginBackButton.setOnClickListener { startActivity(intent15) }

        binding.MembershipButton2.setOnClickListener {
            val email: String = binding.EmailAddressText2.text.toString()
            val password: String = binding.PasswordText2.text.toString()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    binding.EmailAddressText2.text.clear()
                    binding.PasswordText2.text.clear()

                    if (task.isSuccessful) {
                        Toast.makeText(this, "회원가입에 성공했습니다!", Toast.LENGTH_SHORT).show()
                        startActivity(intent15)
                    }
                    else {
                        Toast.makeText(this, "회원가입에 실패하였습니다.", Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }
}