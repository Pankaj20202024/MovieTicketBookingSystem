package com.example.movies_show_booking_system

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class UserProfileFragment : Fragment() {

    private lateinit var sharedPreferences1: SharedPreferences
    private lateinit var sharedPreferences2: SharedPreferences

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_user_profile, container, false)
        // Get the SharedPreferences instance
        sharedPreferences1 = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        sharedPreferences2 = requireContext().getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE)

//        getting the references of the content which i want to change in profile section
        val User_name=view.findViewById<TextView>(R.id.user_registered_name)
        val User_email=view.findViewById<TextView>(R.id.user_registered_email)
        val User_overall_rating=view.findViewById<TextView>(R.id.user_given_rating)


        val savedRating = sharedPreferences1.getFloat("rating_value", 0.0f)
        val savedUserName = sharedPreferences2.getString("username"," ")
        val savedUserEmail = sharedPreferences2.getString("email", " ")

        User_overall_rating.setText("Overall Rating : "+savedRating.toString())
        User_name.setText("User Name : "+ savedUserName)
        User_email.setText("Registered Email : "+savedUserEmail)


        val Delete_Account=view.findViewById<Button>(R.id.btn_delete_account)
        Delete_Account.setOnClickListener{
            with(sharedPreferences2.edit()) {
                putString("username", "")
                putString("email", "")
                putString("password","")
                apply()
            }
            val intent=Intent(requireContext(),SignInPage::class.java)
            startActivity(intent)
        }
        return view
    }

}

