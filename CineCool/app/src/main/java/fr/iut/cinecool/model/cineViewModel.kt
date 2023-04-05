package fr.iut.cinecool.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class cineViewModel : ViewModel() {
    private val _cine = MutableLiveData<fr.iut.cinecool.API.Movie>()
    val cine: LiveData<fr.iut.cinecool.API.Movie> = _cine

    fun setCine(cine: fr.iut.cinecool.API.Movie) {
        _cine.value = cine
    }

}
