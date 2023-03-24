package fr.iut.cinecool.interfaces

interface ITheMovieDbApiCallback<T> {
    fun onSuccess(result: T)
    fun onError(error: Throwable)
}
