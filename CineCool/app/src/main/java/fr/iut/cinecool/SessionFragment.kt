package fr.iut.cinecool

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import fr.iut.cinecool.API.Movie

class SessionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_session, container, false)
        return  view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        init()
        val button = view.findViewById<ImageButton>(R.id.returnButton)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_SessionFragment_to_fragment_movies)
        }
    }
    private fun init() {
        val movie = arguments?.getParcelable<Movie>("movie")
        if(movie!=null){
            requireView().findViewById<TextView>(R.id.title).text=movie.title
            requireView().findViewById<TextView>(R.id.description).text=movie.overview
            //requireView().findViewById<TextView>(R.id.afficheFilm).setText()=movie.poster_path
        }
    }
}