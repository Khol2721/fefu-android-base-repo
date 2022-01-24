package ru.fefu.activitytracker.main_page

import android.app.Application
import androidx.room.Room
import ru.fefu.activitytracker.main_page.room.ActivityDataBase

class App: Application() {

    companion object {
        lateinit var INSTANCE: App
    }

    val db by lazy {
        Room.databaseBuilder(
            this,
            ActivityDataBase::class.java,
            "my_database"
        ).allowMainThreadQueries().build()
    }

    override fun onCreate() {
        super.onCreate()

        INSTANCE = this
    }
}