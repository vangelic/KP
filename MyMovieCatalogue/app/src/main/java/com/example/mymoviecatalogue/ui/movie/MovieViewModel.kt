package com.example.mymoviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import com.example.mymoviecatalogue.data.MovieEntity
import com.example.mymoviecatalogue.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovie(): List<MovieEntity> = DataDummy.generateDummyMovie()
}