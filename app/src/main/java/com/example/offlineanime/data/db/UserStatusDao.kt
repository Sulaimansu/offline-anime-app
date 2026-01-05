
package com.example.offlineanime.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.offlineanime.data.models.UserStatus

@Dao
interface UserStatusDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStatus(status: UserStatus)

    @Query("SELECT * FROM user_status WHERE animeId = :animeId")
    suspend fun getStatusForAnime(animeId: Int): UserStatus?

    @Query("SELECT * FROM user_status WHERE status = :status")
    suspend fun getAllByStatus(status: String): List<UserStatus>
}
