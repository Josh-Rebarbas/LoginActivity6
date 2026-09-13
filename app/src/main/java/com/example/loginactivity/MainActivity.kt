package com.example.loginactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val message = findViewById<TextView>(R.id.message)

        loginButton.setOnClickListener {

            val enteredUsername = username.text.toString()
            val enteredPassword = password.text.toString()

            if (enteredUsername == "admin" && enteredPassword == "1234") {

                message.text = "Welcome, admin!"

            } else {

                message.text = "Invalid username or password."

            }
        }
    }
}