package com.example.composealpha.network.model

import com.google.gson.annotations.SerializedName

data class MovieDTO(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("title")
    val title: String? = null
)