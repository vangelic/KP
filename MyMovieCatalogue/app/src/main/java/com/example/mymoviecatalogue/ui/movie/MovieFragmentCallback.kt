package com.example.mymoviecatalogue.ui.movie

import com.example.mymoviecatalogue.data.MovieEntity

interface MovieFragmentCallback {
    fun onShareClick(course: MovieEntity)
}