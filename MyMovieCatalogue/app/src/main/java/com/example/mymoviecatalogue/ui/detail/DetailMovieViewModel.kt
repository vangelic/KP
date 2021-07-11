package com.example.mymoviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.example.mymoviecatalogue.data.MovieEntity
import com.example.mymoviecatalogue.utils.DataDummy

class DetailMovieViewModel : ViewModel() {

    private lateinit var judul: String

    fun setSelectedMovie(judul: String) {
        this.judul = judul
    }

    fun getMovie(): MovieEntity {
        lateinit var movie: MovieEntity
        val moviesEntities = DataDummy.generateDummyMovie()
        for (MovieEntity in moviesEntities) {
            if (MovieEntity.judul == judul) {
                movie = MovieEntity
            }
        }
        return movie
    }

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovie()
}