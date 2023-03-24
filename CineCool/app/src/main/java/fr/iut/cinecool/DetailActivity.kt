package fr.iut.cinecool

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import fr.iut.cinecool.interfaces.ITheMovieDbApiCallback
import fr.iut.cinecool.model.Movie
import fr.iut.cinecool.model.MovieAPI
import fr.iut.cinecool.services.TheMovieDbApiClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

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