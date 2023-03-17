package fr.iut.cinecool.model
import com.google.gson.annotations.SerializedName

//    MovieResponse pour stocker la réponse JSON de l'API :
data class MovieResponse(
    @SerializedName("results") val movies: List<Movie>
)
