package com.thiagoleite06.mymovieskotlin.model

import com.google.gson.annotations.SerializedName

data class Series(
    @SerializedName("Title")
    val title: String,
    @SerializedName("totalSeasons")
    val totalSeasons: Int,
//    @SerializedName("Ratings")
//    val ratings: Double,
    @SerializedName("Actors")
    val actors: String,
    @SerializedName("Poster")
    val poster: String,
    @SerializedName("Plot")
    val sinopse: String
)

