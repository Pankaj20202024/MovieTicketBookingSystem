package com.example.movies_show_booking_system


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class LogInPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val loginButton = findViewById<Button>(R.id.btn_login)
        val userNameEditText = findViewById<EditText>(R.id.et_login_name)
        val emailEditText = findViewById<EditText>(R.id.et_login_email)
        val passwordEditText = findViewById<EditText>(R.id.et_login_password)

        val have_no_account=findViewById<TextView>(R.id.no_account)

        have_no_account.setOnClickListener{
            val intent1 = Intent(this, SignInPage::class.java)
            startActivity(intent1)
            finish()
        }

        loginButton.setOnClickListener {
            val userName = userNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (userName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
            else{
                if (checkUserCredentials(userName, email, password)) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }

    private fun checkUserCredentials(userName: String, email: String, password: String): Boolean {
        val sharedPref = getSharedPreferences("MyPrefsFile", Context.MODE_PRIVATE)
        val savedUserName = sharedPref.getString("username", null)
        val savedEmail = sharedPref.getString("email", null)
        val savedPassword = sharedPref.getString("password", null)
        return userName == savedUserName && email == savedEmail && password == savedPassword
    }
}
