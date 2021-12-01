package com.example.test20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val timer = object: CountDownTimer(1000,100){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val int = Intent(this@LaunchActivity, GuideActivity::class.java)
                startActivity(int)
            }

        }
        timer.start()
    }
}