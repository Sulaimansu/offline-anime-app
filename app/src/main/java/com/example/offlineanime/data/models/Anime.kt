package com.example.offlineanime.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters

@Entity(tableName = "anime")
data class Anime(
    @PrimaryKey val id: Int,
    val title: String,
    val pictureUrl: String,
    val bannerUrl: String?,
    val tags: List<String>,
    val sources: List<Source>
)

data class Source(
    val name: String,
    val url: String,
    val logoUrl: String
)
