package com.example.offlineanime.data.db

import androidx.room.TypeConverter
import com.example.offlineanime.data.models.Source
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {

    private val gson = Gson()

    @TypeConverter
    fun fromStringList(value: List<String>): String = gson.toJson(value)

    @TypeConverter
    fun toStringList(value: String): List<String> {
        val type = object : TypeToken<List<String>>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun fromSourceList(value: List<Source>): String = gson.toJson(value)

    @TypeConverter
    fun toSourceList(value: String): List<Source> {
        val type = object : TypeToken<List<Source>>() {}.type
        return gson.fromJson(value, type)
    }
}
