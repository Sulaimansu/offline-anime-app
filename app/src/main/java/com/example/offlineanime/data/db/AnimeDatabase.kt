package com.example.offlineanime.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.offlineanime.data.models.Anime
import com.example.offlineanime.data.models.UserStatus

@Database(entities = [Anime::class, UserStatus::class], version = 1)
@TypeConverters(Converters::class)
abstract class AnimeDatabase : RoomDatabase() {
    abstract fun animeDao(): AnimeDao
    abstract fun userStatusDao(): UserStatusDao
}
