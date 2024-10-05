package com.example.roomconfigured.util

import android.app.Application
import androidx.room.Room
import com.example.roomconfigured.data.AppDatabase

open class MyApplication: Application() {

    companion object {
        var database: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, AppDatabase::class.java, "my-db").allowMainThreadQueries().build()
    }
}