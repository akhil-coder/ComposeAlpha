package com.example.composealpha.network.reponses

import com.example.composealpha.network.model.MovieDTO
import com.google.gson.annotations.SerializedName

data class MovieDiscoverResponse(
    @SerializedName("page")
    val page: Int? = null,
    @SerializedName("results")
    val movies: List<MovieDTO>
)