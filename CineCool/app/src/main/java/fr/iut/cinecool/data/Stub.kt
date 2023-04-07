package fr.iut.cinecool.data

import fr.iut.cinecool.R
import fr.iut.cinecool.model.Cinema
import fr.iut.cinecool.model.Movie
import fr.iut.cinecool.model.Session
import java.util.Date

class Stub(var sessions:ArrayList<Session> = ArrayList(), var movies:ArrayList<Movie> = ArrayList(), var cinemas:ArrayList<Cinema> = ArrayList()) {
    fun loading(){
        val date = Date(2023,3,12)
        sessions.addAll(listOf(Session(0,date,14,16,"2A"), Session(1,date,4,6,"5B")))
        movies.add(Movie(1,"trop bg",2,"Pas moi",2.0, R.drawable.no_pictures))
        movies.add(Movie(0,"Imitation Game",4,"Moi",3.0,R.drawable.imitation_game))
        cinemas.add(Cinema(0,12367,67894,"clf","CineJaude"))
        cinemas.add(Cinema(1,87634,43567,"Aubière","CGR Le Paris"))
    }
}