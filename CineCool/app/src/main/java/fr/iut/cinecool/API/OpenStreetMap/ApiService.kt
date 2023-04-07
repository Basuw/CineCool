package fr.iut.cinecool.API.OpenStreetMap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @Headers("User-Agent: MyApp")
    @GET("search")
    fun searchCinemas(
        @Query("q") query: String,
        @Query("format") format: String = "json",
        @Query("limit") limit: Int = 10
    ): Call<List<Cinema>>
}