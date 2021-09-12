package com.example.composealpha.domain
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
// TODO: Support parcelable
data class Movie(
    @PrimaryKey
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("title")
    val title: String? = null
)