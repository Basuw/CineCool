package fr.iut.cinecool.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.lifecycle.MutableLiveData
import fr.iut.cinecool.API.Movie
import fr.iut.cinecool.API.Repository

class MovieViewModel : ViewModel() {
    private val repository = Repository()

    val popularMovies = MutableLiveData<List<Movie>>()
    val searchResults = MutableLiveData<List<Movie>>()

    fun getPopularMovies(apiKey: String, page: Int) {
        viewModelScope.launch {
            val movies = repository.getPopularMovies(apiKey, page)
            popularMovies.postValue(movies.results)
        }
    }

    fun searchMovies(apiKey: String, query: String, page: Int) {
        viewModelScope.launch {
            val movies = repository.searchMovies(apiKey, query, page)
            searchResults.postValue(movies.results)
        }
    }
}
