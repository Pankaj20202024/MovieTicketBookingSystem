package com.example.movies_show_booking_system

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.RelativeLayout
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = Home_fragment_container()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, homeFragment)
            .commit()


        val historyFragment = User_Booking_History_Fragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container2, historyFragment)
            .commit()

        val rateus_fragment = RateUsFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container3, rateus_fragment)
            .commit()

        val profile_fragment = UserProfileFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container4, profile_fragment)
            .commit()


        val Home_Container=findViewById<RelativeLayout>(R.id.nav_item1_container)
        val Booking_History=findViewById<RelativeLayout>(R.id.nav_item2_container)
        val Rate_us=findViewById<RelativeLayout>(R.id.nav_item3_container)
        val User_profile=findViewById<RelativeLayout>(R.id.nav_item4_container)
        val Logout_btn=findViewById<RelativeLayout>(R.id.nav_item5_container)

        val home_container=findViewById<RelativeLayout>(R.id.HomePageContainer)
        val booking_history_container=findViewById<RelativeLayout>(R.id.BookingHistoryContainer)
        val rate_us_container=findViewById<RelativeLayout>(R.id.RateUsContainer)
        val user_profile_container=findViewById<RelativeLayout>(R.id.User_Profile_Container)

        Home_Container.setOnClickListener{
            booking_history_container.visibility=View.GONE
            rate_us_container.visibility=View.GONE
            user_profile_container.visibility=View.GONE
            home_container.visibility=View.VISIBLE
        }
        Booking_History.setOnClickListener{
            home_container.visibility=View.GONE
            rate_us_container.visibility=View.GONE
            user_profile_container.visibility=View.GONE
            booking_history_container.visibility=View.VISIBLE
        }
        Rate_us.setOnClickListener{
            booking_history_container.visibility=View.GONE
            home_container.visibility=View.GONE
            user_profile_container.visibility=View.GONE
            rate_us_container.visibility=View.VISIBLE
        }

        User_profile.setOnClickListener{
            booking_history_container.visibility=View.GONE
            home_container.visibility=View.GONE
            rate_us_container.visibility=View.GONE
            user_profile_container.visibility=View.VISIBLE
        }

        Logout_btn.setOnClickListener{
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}