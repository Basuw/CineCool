package fr.iut.cinecool

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vu_detail)

        // Récupérer l'identifiant du film depuis les extras de l'intent
        val movieId = intent.getIntExtra("movieId", -1)

        // Appeler la méthode pour charger les détails du film
        // loadMovieDetails(movieId)
    }

    /*private fun loadMovieDetails(movieId: Int) {
        val apiClient = TheMovieDbApiClient(getString(R.string.tmdb_api_key))
        apiClient.getMovieDetails(movieId, object : ITheMovieDbApiCallback<MovieAPI> {
            override fun onSuccess(result: MovieAPI) {
                // Afficher les détails du film dans la vue
                titreFilm.text = result.title
                description.text = result.overview
                Picasso.get().load("https://image.tmdb.org/t/p/w500/${result.posterPath}").into(afficheFilm)
            }

            override fun onError(error: Throwable) {
                // Gérer l'erreur de récupération des détails du film
            }
        })
    }*/

}