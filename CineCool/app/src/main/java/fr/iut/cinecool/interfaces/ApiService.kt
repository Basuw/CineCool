package fr.iut.cinecool.interfaces

import fr.iut.cinecool.model.Movie
import fr.iut.cinecool.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

        @GET("movie/popular")
        fun getPopularMovies(@Query("api_key") apiKey: String): Call<MovieResponse>


}
