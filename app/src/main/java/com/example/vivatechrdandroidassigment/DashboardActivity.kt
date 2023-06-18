package com.example.vivatechrdandroidassigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class DashboardActivity : AppCompatActivity() {
    private lateinit var etEmail: TextView
    private lateinit var btLogout: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        etEmail=findViewById(R.id.tvEmail)
        btLogout=findViewById(R.id.button)

       if (intent!=null){
           etEmail.text=intent.getStringExtra("email")
       }

        btLogout.setOnClickListener {
logoutUser()
        }

    }

    private fun logoutUser() {
        auth.signOut()
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

}