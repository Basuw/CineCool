package fr.iut.cinecool

import retrofit2.Call
import com.google.android.gms.common.api.Response
import com.google.gson.GsonBuilder
import fr.iut.cinecool.interfaces.ApiService
import fr.iut.cinecool.model.MovieResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.security.auth.callback.Callback

class ApiClient {

    companion object {

        private const val BASE_URL = "https://api.themoviedb.org/3/"

        fun create(): ApiService {

            val gson = GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create()

            val logger = HttpLoggingInterceptor()
            logger.level = HttpLoggingInterceptor.Level.BASIC

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()

            return retrofit.create(ApiService::class.java)
        }

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val movieApiService = retrofit.create(ApiService::class.java)

        val apiKey = "a97243d7813d31446f6c43284e6854d5"
        val call = movieApiService.getPopularMovies(apiKey)

        // TO DO
        /*call.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                // Code à exécuter lorsque la réponse est reçue
                val movies = response.body()?.results
                // Traitez les films renvoyés ici
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                // Code à exécuter en cas d'échec de la requête
            }
        })*/

    }
}
