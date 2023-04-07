package fr.iut.cinecool.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.iut.cinecool.API.OpenStreetMap.Cinema
import fr.iut.cinecool.R
import fr.iut.cinecool.adapter.MovieAdapter

class CinemaDetailFragment : Fragment() {

    private lateinit var cinemaNameTextView: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MovieAdapter
    private lateinit var cinema: Cinema

    companion object {
        private const val ARG_CINEMA = "cinema"

        fun newInstance(cinema: Cinema): CinemaDetailFragment {
            val fragment = CinemaDetailFragment()
            val args = Bundle()
            args.putParcelable(ARG_CINEMA, cinema)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cinema = arguments?.getParcelable(ARG_CINEMA) ?: throw IllegalStateException("Cinema not provided")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cinema_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cinemaNameTextView = view.findViewById(R.id.cinemaNameTextView)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = MovieAdapter()
        recyclerView.adapter = adapter

        cinemaNameTextView.text = cinema.displayName

        // Récupérez et affichez la liste des films à l'affiche pour le cinéma sélectionné
    }
}
