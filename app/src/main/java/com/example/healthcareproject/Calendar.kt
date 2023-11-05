package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.healthcareproject.databinding.ActivityCalendarBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private var auth : FirebaseAuth = Firebase.auth

class Calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent9 = Intent(this, MainActivity::class.java)

        binding.HomeButton3.setOnClickListener {startActivity(intent9)}

        binding.calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->

            binding.diarytextView.visibility = View.VISIBLE
            binding.textInputLayout.visibility = View.VISIBLE
            binding.memodeletebutton.visibility = View.VISIBLE
            binding.modifybutton.visibility = View.VISIBLE
            binding.savebutton.visibility = View.VISIBLE

        }

        binding.savebutton.setOnClickListener {

        }

    }
}