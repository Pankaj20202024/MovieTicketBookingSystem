package com.example.movies_show_booking_system

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var imageview=findViewById<ImageView>(R.id.imageView)

        Handler().postDelayed({
            imageview.animate().apply {
                duration=200
                scaleX(0.0F)
                scaleY(0.0F)
            }.start()
        },2697)

        Handler().postDelayed({
            var intent=Intent(this,SignInPage::class.java)
            startActivity(intent)
            finish()
        }, 2870)
    }
}