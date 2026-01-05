package com.example.offlineanime.utils

import com.example.offlineanime.data.models.Anime
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken

fun parseAnimeJson(json: String): List<Anime> {
    val gson = Gson()
    val root = gson.fromJson(json, JsonObject::class.java)
    val dataArray = root.getAsJsonArray("data")
    val type = object : TypeToken<List<Anime>>() {}.type
    return gson.fromJson(dataArray, type)
}
