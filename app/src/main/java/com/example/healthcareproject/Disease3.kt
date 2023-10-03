package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDisease2Binding
import com.example.healthcareproject.databinding.ActivityDisease3Binding

class Disease3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disease3)

        val binding = ActivityDisease3Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent22 = Intent(this, Food::class.java)
        binding.BackToFoodButton3.setOnClickListener {startActivity(intent22)}

    }
}