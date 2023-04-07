package fr.iut.cinecool.fragments

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
//import androidx.lifecycle.viewmodel.CreationExtras.Empty.map
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapFragment : Fragment() {
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_map)

        map = findViewById(R.id.map)

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        this.gMap = googleMap

        val mapIndia = LatLng(20.5937, 789629)
        this.gMap.addMarker(MarkerOptions().position(mapIndia).title("Marker in India"))
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia))
    }


    override fun onDestroyView() {
        super.onDestroyView()

    }

    // TODO https://youtu.be/JzxjNNCYt_o
    // https://console.cloud.google.com/apis/credentials?hl=fr&project=upbeat-grammar-382309
    */
}