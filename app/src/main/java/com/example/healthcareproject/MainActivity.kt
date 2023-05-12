package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.healthcareproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //뷰 바인딩 책 p.169
        //바인딩 객체 획득
        val binding = ActivityMainBinding.inflate(layoutInflater)
        //액티비티 화면 출력
        setContentView(binding.root)

        //책 p.405
        //뷰 객체를 이용해서 버튼을 누르면 프로필 액티비티로 전환
        val intent1 = Intent(this, Profile::class.java)
        binding.ProfileButton.setOnClickListener {startActivity(intent1)}

        //뷰 객체를 이용해서 버튼을 누르면 daily 건강기록 액티비티로 전환
        val intent2 = Intent(this, DailyHealthRecords::class.java)
        binding.DailyHealthRecordsButton.setOnClickListener {startActivity(intent2)}

        //뷰 객체를 이용해서 버튼을 누르면 캘린더 액티비티로 전환
        val intent3 = Intent(this, Calender::class.java)
        binding.CalenderButton.setOnClickListener {startActivity(intent3)}

        //뷰 객체를 이용해서 버튼을 누르면 몸 상태 변화 액티비티로 전환
        val intent4 = Intent(this, BodyCheck::class.java)
        binding.BodyCheckButton.setOnClickListener {startActivity(intent4)}

        //뷰 객체를 이용해서 버튼을 누르면 추천 액티비티로 전환
        val intent5 = Intent(this, Recommendation::class.java)
        binding.RecommendationButton.setOnClickListener {startActivity(intent5)}

    }
}