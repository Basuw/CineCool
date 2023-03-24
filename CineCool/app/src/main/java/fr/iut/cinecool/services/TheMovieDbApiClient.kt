package fr.iut.cinecool.services

import fr.iut.cinecool.interfaces.ITheMovieDbApiCallback
import fr.iut.cinecool.interfaces.ITheMovieDbService
import fr.iut.cinecool.model.MovieAPI
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TheMovieDbApiClient(apiKey: String) {
    private val service: ITheMovieDbService = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ITheMovieDbService::class.java)

    private val apiKeyInterceptor = Interceptor { chain ->
        val url = chain.request().url.newBuilder()
            .addQueryParameter("tmdb_api_key", apiKey)
            .build()

        val request = chain.request().newBuilder()
            .url(url)
            .build()

        chain.proceed(request)
    }

    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(apiKeyInterceptor)
        .build()

    /*fun getMovieDetails(movieId: Int, callback: ITheMovieDbApiCallback<MovieAPI>) {
        service.getMovieDetails(movieId).enqueue(object : Callback<MovieAPI> {
            override fun onResponse(call: Call<MovieAPI>, response: Response<MovieAPI>) {
                if (response.isSuccessful) {
                    val result = response.body()
                    if (result != null) {
                        callback.onSuccess(result)
                    } else {
                        callback.onError(Throwable("Empty response body"))
                    }
                } else {
                    callback.onError(Throwable("Error ${response.code()}: ${response.message()}"))
                }
            }

            override fun onFailure(call: Call<MovieAPI>, t: Throwable) {
                callback.onError(t)
            }
        })
    }*/
}
