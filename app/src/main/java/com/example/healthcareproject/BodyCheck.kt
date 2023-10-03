package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import com.example.healthcareproject.databinding.ActivityBodyCheckBinding


class BodyCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_check)

        val binding = ActivityBodyCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent10 = Intent(this, MainActivity::class.java)
        binding.HomeButton4.setOnClickListener {startActivity(intent10)}

        val schedules = ArrayList<String>()

        schedules.add("일정 1")
        schedules.add("일정 2")
        schedules.add("일정 3")
        schedules.add("일정 4")
        schedules.add("일정 5")
        schedules.add("일정 6")
        schedules.add("일정 7")
        schedules.add("일정 8")

        val schedules_Adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, schedules)
        binding.listSchedules.adapter = schedules_Adapter

    }
}