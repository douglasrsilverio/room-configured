package com.example.roomconfigured.data

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.roomconfigured.data.dao.UserDao
import com.example.roomconfigured.data.entities.UserEntity

@Database(version = 1, entities = [UserEntity::class])
abstract class AppDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun createOpenHelper(config: DatabaseConfiguration): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }
}