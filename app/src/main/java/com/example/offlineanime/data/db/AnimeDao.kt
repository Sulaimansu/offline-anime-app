package com.example.offlineanime.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.offlineanime.data.models.Anime

@Dao
interface AnimeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(anime: List<Anime>)

    @Query("SELECT * FROM anime")
    suspend fun getAll(): List<Anime>

    @Query("SELECT * FROM anime WHERE title LIKE '%' || :query || '%'")
    suspend fun searchByTitle(query: String): List<Anime>

    @Query("SELECT * FROM anime WHERE :tag IN (tags)")
    suspend fun searchByTag(tag: String): List<Anime>
}
