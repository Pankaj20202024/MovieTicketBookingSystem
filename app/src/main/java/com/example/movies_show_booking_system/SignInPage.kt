package com.example.movies_show_booking_system

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInPage : AppCompatActivity() {
    private val PREFS_NAME = "MyPrefsFile"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_page)

        val sharedPref = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        val usernameEditText = findViewById<EditText>(R.id.et_name)
        val emailEditText = findViewById<EditText>(R.id.et_email)
        val passwordEditText = findViewById<EditText>(R.id.et_password)
        val signInButton = findViewById<Button>(R.id.btn_signin)

        val already_have_account=findViewById<TextView>(R.id.already_account)

        already_have_account.setOnClickListener{
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
            finish()
        }

        signInButton.setOnClickListener {
            with(sharedPref.edit()) {
                putString("username", usernameEditText.text.toString())
                putString("email", emailEditText.text.toString())
                putString("password", passwordEditText.text.toString())
                apply()
            }

            if (usernameEditText.text.isEmpty() || emailEditText.text.isEmpty() || passwordEditText.text.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Sign in successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LogInPage::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}