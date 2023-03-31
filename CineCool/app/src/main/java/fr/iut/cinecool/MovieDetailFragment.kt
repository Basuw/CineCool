package fr.iut.cinecool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import fr.iut.cinecool.API.Movie
// import fr.iut.cinecool.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment() {
    /*private var _binding: FragmentDetailMovieBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailMovieBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Récupérez le film passé en argument
        val movie: Movie? = arguments?.getParcelable("movie")

        // Mettez à jour les vues avec les données du film
        if (movie != null) {
            binding.titreFilm.text = movie.title
            binding.description.text = movie.overview

            val imageUrl = "https://image.tmdb.org/t/p/w500${movie.poster_path}"
            Glide.with(binding.afficheFilm.context)
                .load(imageUrl)
                .placeholder(R.drawable.imitation_game)
                .into(binding.afficheFilm)
        }

        // Gérer le clic sur le bouton de retour
        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }*/
}

