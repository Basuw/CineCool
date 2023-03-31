package fr.iut.cinecool.API

data class MovieResponse(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)

data class Movie(
    val id: Int,
    val title: String,
    val poster_path: String?,
    val overview: String
)
