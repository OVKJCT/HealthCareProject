package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.healthcareproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //바인딩 객체 획득
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //액티비티 화면 출력
        setContentView(binding.root)

        val intent1 = Intent(this, Profile::class.java)
        binding.ProfileButton.setOnClickListener {startActivity(intent1)}

        val intent2 = Intent(this, DailyHealthRecords::class.java)
        binding.DailyHealthRecordsButton.setOnClickListener {startActivity(intent2)}

        val intent3 = Intent(this, Calender::class.java)
        binding.CalenderButton.setOnClickListener {startActivity(intent3)}

        val intent4 = Intent(this, BodyCheck::class.java)
        binding.BodyCheckButton.setOnClickListener {startActivity(intent4)}

        val intent5 = Intent(this, Recommendation::class.java)
        binding.RecommendationButton.setOnClickListener {startActivity(intent5)}

    }
}