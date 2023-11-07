package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.healthcareproject.databinding.ActivityCalendarBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

private var auth : FirebaseAuth = Firebase.auth

private var STORE = FirebaseFirestore.getInstance()

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

            binding.savebutton.visibility = View.VISIBLE
            binding.textInput123.visibility = View.VISIBLE
            binding.diarytextView.visibility = View.VISIBLE

            binding.diarytextView.text = String.format("%d 년 %d 월 %d 일", year, month + 1, dayOfMonth)

        }

        binding.savebutton.setOnClickListener {
            binding.diarytextView.visibility = View.VISIBLE
            binding.savebutton.visibility = View.INVISIBLE
            binding.memodeletebutton.visibility = View.VISIBLE

            val str: String = binding.textInput123.text.toString()
            val day: String = binding.diarytextView.text.toString()

            binding.littletextView.text = str

            binding.littletextView.visibility = View.VISIBLE
            binding.textInput123.visibility = View.INVISIBLE

            val userUID4 = auth.currentUser?.uid.orEmpty()

            data class USERS(
                val ID: String? = null,
                val MEMO: List<String>? = null,
                val Todolist: List<String>? = null,
            )

            val users = USERS (
                userUID4,
                arrayListOf(day + " " + str)
            )


            STORE.collection("USERS").document("users").update("users", users)


        }

        binding.memodeletebutton.setOnClickListener {

        }

    }
}