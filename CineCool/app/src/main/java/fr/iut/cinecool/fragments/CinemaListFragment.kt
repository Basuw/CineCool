package fr.iut.cinecool.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import fr.iut.cinecool.R
import fr.iut.cinecool.adapter.CinemaAdapter

class CinemaListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CinemaAdapter
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_cinema_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter = CinemaAdapter { cinema ->
            val fragment = CinemaDetailFragment.newInstance(cinema)
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        recyclerView.adapter = adapter

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireActivity())

        // Récupérez la position de l'utilisateur et affichez les cinémas à proximité
    }
}
