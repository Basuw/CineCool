package fr.iut.cinecool

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MovieDetailFragment : Fragment() {
/*
    private lateinit var binding: FragmentMovieDetailBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        binding = FragmentMovieDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        val movieId = arguments?.getInt(ARG_MOVIE_ID)

        // Appel de l'API pour récupérer les détails du film
        CoroutineScope(Dispatchers.IO).launch {
            val response = movieId?.let { MovieApiService().getMovieDetails(it) }
            withContext(Dispatchers.Main)
            {
                if (response != null) {
                    if (response.isSuccessful)
                    {
                        val movie = response.body()
                        if (movie != null)
                        {
                            // Affichage des détails du film dans l'interface utilisateur
                            binding.titreFilm.text = movie.title
                            binding.description.text = movie.overview
                            binding.afficheFilm.load("https://image.tmdb.org/t/p/w500${movie.posterPath}") // Utilisation de la librairie Coil pour charger l'image
                        }
                    } else
                    {
                        Toast.makeText(
                            requireContext(),
                            getString(R.string.error_loading_movie),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
        // Ajout d'un écouteur de clic pour le bouton de retour
        binding.backButton.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        private const val ARG_MOVIE_ID = "movie_id"

        fun newInstance(movieId: Int): MovieDetailFragment {
            val args = Bundle().apply {
                putInt(ARG_MOVIE_ID, movieId)
            }
            return MovieDetailFragment().apply {
                arguments = args
            }
        }
    }*/
}