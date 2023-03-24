package fr.iut.cinecool.interfaces

import fr.iut.cinecool.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ITheMovieDbService {
        @GET("movie/{movieId}")
        fun getMovieDetails(@Path("movieId") movieId: Int, @Query("api_key") apiKey: String): Call<Movie>
}
