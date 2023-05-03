package com.example.healthcareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        //일정 시간 지연 이후 실행 하기 위한 코드
        Handler(Looper.getMainLooper()).postDelayed({
            //일정 시간이 지나면 Main Activity 로 이동
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //이전 키를 눌렀을 때 splash 스크린 화면 으로 이동을 방지 하기 위해 이동한 다음
            //사용 안함 으로 finish 처리
            finish()
        },4000) // 4초 이후 main 화면 실행

    }
}