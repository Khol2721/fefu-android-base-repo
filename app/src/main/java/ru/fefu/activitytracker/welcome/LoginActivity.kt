package ru.fefu.activitytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.fefu.activitytracker.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun back (view: View) {
        val bk = Intent(this, WelcomeActivity::class.java)
        startActivity(bk)
    }

    fun go_to_main (view: View) {
        val mn = Intent(this, MainActivity::class.java)
        startActivity(mn)
    }
}