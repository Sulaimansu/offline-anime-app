package com.example.offlineanime.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Status { WATCHING, PAUSED, COMPLETED, PLANNING }

@Entity(tableName = "user_status")
data class UserStatus(
    @PrimaryKey val animeId: Int,
    val status: Status
)
