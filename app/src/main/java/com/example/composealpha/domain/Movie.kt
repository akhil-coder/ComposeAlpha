package com.example.composealpha.domain
import android.os.Parcelable
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

// TODO: Support parcelable
@Parcelize
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
): Parcelable