package com.example.composealpha.network

import com.example.composealpha.network.reponses.MovieDiscoverResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("discover/movie")
    suspend fun discoverMovies(
        @Query("api_key") apiKey: String = "e9e690206c5709a32678c99230ce1a1e",
        @Query("language") language: String = "en-US",
        @Query("sort_by") sortBy: String = "popularity.desc",
        @Query("include_adult") includeAdult: Boolean = true,
        @Query("include_video") includeVideo: Boolean = true,
        @Query("page") page: Int = 1,
    ): MovieDiscoverResponse }