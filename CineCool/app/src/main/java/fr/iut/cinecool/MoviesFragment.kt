package fr.iut.cinecool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.iut.cinecool.adapter.MovieAdapter
import fr.iut.cinecool.model.Movie
import fr.iut.cinecool.model.Stub

class MoviesFragment : Fragment() {
    private lateinit var recycler: RecyclerView
    private lateinit var movieList: ArrayList<Movie>
    private lateinit var movieAdapter: MovieAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movies, container, false)
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            findNavController().navigate(R.id.movies_to_sessions)
        }
        recycler = view.findViewById(R.id.recyclerMovie)
        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(context)
        val stub = Stub()
        stub.loading()
        movieList=stub.movies
        movieAdapter = MovieAdapter(movieList)
        recycler.adapter = movieAdapter
        return  view
    }
}