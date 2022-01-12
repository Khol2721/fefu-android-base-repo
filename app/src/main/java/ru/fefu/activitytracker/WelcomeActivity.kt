package ru.fefu.activitytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registrationGo (view: View) {
        val reg = Intent(this, RegistrationActivity::class.java)
        startActivity(reg)
    }

    fun loginGo (view: View) {
        val log = Intent(this, LoginActivity::class.java)
        startActivity(log)
    }
}

