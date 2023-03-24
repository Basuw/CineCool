package fr.iut.cinecool.model

import android.graphics.drawable.Drawable
import com.google.gson.annotations.SerializedName
data class Movie(val id:Int, val name:String, var mark:Int, val realisator:String, var duration: Double, val icon:Int)

// D'après l'API (TheMovieDB)
data class MovieAPI(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("vote_average") val voteAverage: Float
)
