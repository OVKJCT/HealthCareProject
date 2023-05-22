package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.example.healthcareproject.databinding.ActivityDailyHealthRecordsBinding
import com.example.healthcareproject.databinding.ActivityProfileBinding

class DailyHealthRecords : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_health_records)

        val binding = ActivityDailyHealthRecordsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val intent9 = Intent(this, MainActivity::class.java)
        binding.HomeButton2.setOnClickListener {startActivity(intent9)}
    }
}