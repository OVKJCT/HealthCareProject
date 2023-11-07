package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthcareproject.databinding.ActivityDisease3Binding
import com.example.healthcareproject.databinding.ActivityDisease4Binding

class Disease4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disease4)

        val binding = ActivityDisease4Binding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent24 = Intent(this, Food::class.java)
        binding.BackToFoodButton4.setOnClickListener {startActivity(intent24)}

        val intent62 = Intent(this, Dis4ex::class.java)
        binding.Disease4ExButton.setOnClickListener {startActivity(intent62)}

    }
}