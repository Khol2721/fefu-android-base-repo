package ru.fefu.activitytracker.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.main_page.MainActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun back (view: View) {
        finish()
    }

    fun go_to_main (view: View) {
        val mn = Intent(this, MainActivity::class.java)
        startActivity(mn)
    }
}