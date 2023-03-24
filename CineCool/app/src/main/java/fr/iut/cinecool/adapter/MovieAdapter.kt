package fr.iut.cinecool.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.iut.cinecool.R
import fr.iut.cinecool.model.Movie

class MovieAdapter(private val moviesList: ArrayList<Movie>) :

    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val MovieName = itemView.findViewById<TextView>(R.id.MovieName)
        val OtherInformations = itemView.findViewById<TextView>(R.id.OtherInformations)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  moviesList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.imageView.setImageResource(movie.icon)
        holder.MovieName.text = movie.name
        holder.OtherInformations.text = movie.realisator +" "+ movie.duration +" "+ movie.mark
    }
}