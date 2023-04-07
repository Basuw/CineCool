package fr.iut.cinecool.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.iut.cinecool.API.OpenStreetMap.Cinema
import fr.iut.cinecool.R

class CinemaAdapter(private val onCinemaClickListener: (Cinema) -> Unit) :
    RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

    private val cinemas = mutableListOf<Cinema>()

    fun updateCinemas(newCinemas: List<Cinema>) {
        cinemas.clear()
        cinemas.addAll(newCinemas)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cinema, parent, false)
        return CinemaViewHolder(itemView, onCinemaClickListener)
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.bind(cinemas[position])
    }

    override fun getItemCount(): Int = cinemas.size

    class CinemaViewHolder(itemView: View, private val onCinemaClickListener: (Cinema) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        private val cinemaNameTextView: TextView = itemView.findViewById(R.id.cinemaNameTextView)

        fun bind(cinema: Cinema) {
            cinemaNameTextView.text = cinema.displayName
            itemView.setOnClickListener { onCinemaClickListener(cinema) }
        }
    }
}
