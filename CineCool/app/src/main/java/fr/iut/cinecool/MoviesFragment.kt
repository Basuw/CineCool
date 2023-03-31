package fr.iut.cinecool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.iut.cinecool.adapter.MovieAdapter
import fr.iut.cinecool.databinding.FragmentMoviesBinding
import fr.iut.cinecool.model.Movie
import fr.iut.cinecool.model.Stub

class MoviesFragment : Fragment() {
    private var _binding: FragmentMoviesBinding? = null
    private val binding get() = _binding!!
    private lateinit var movieAdapter: MovieAdapter

    private val movieViewModel: MovieViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.movies_to_sessions)
        }

        initRecyclerView()

        // Observe les changements des données des films populaires
        movieViewModel.popularMovies.observe(viewLifecycleOwner, { movies ->
            movieAdapter.updateMovies(movies)
        })

        // Charge les films populaires
        loadPopularMovies()
    }

    private fun initRecyclerView() {
        binding.recyclerMovie.setHasFixedSize(true)
        binding.recyclerMovie.layoutManager = LinearLayoutManager(context)
        movieAdapter = MovieAdapter(ArrayList())
        binding.recyclerMovie.adapter = movieAdapter
    }

    private fun loadPopularMovies() {
        // Remplacez YOUR_API_KEY par votre clé d'API The Movie DB
        movieViewModel.getPopularMovies("a97243d7813d31446f6c43284e6854d5", 1)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}