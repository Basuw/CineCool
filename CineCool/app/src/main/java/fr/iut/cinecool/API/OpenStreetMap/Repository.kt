package fr.iut.cinecool.API.OpenStreetMap

import android.location.Location
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository {
    private fun fetchNearbyCinemas(location: Location) {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://nominatim.openstreetmap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val nominatimService = retrofit.create(NominatimService::class.java)
        val call = nominatimService.searchCinemas("cinema near ${location.latitude},${location.longitude}")
        call.enqueue(object : Callback<List<Cinema>> {
            override fun onResponse(call: Call<List<Cinema>>, response: Response<List<Cinema>>) {
                if (response.isSuccessful) {
                    val cinemas = response.body() ?: emptyList()
                    displayCinemas(cinemas)
                }
            }

            override fun onFailure(call: Call<List<Cinema>>, t: Throwable) {
                // Gérer l'erreur
            }
        })
    }


}