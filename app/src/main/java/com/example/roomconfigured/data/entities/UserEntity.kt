package com.example.roomconfigured.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(var name: String,
                      var age: Int) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}