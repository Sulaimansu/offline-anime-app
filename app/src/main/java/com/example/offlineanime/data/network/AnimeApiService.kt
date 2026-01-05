package com.example.offlineanime.data.network

import retrofit2.http.GET
import retrofit2.http.Url

interface AnimeApiService {
    @GET
    suspend fun downloadJson(@Url url: String): String
}
