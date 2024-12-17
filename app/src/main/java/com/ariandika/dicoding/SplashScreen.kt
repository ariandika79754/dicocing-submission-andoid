package com.hardeka.dicoding

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashText : TextView = findViewById(R.id.splash_text)
        val backgroundImg : ImageView = findViewById(R.id.splash_logo)
        val sideAnimation = AnimationUtils.loadAnimation(this,R.anim.slide)
        splashText.startAnimation(sideAnimation)
        backgroundImg.startAnimation(sideAnimation)


        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 2000)
    }
}