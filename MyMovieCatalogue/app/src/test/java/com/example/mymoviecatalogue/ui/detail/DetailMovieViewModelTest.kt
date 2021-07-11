package com.example.mymoviecatalogue.ui.detail

import com.example.mymoviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val judul = dummyMovie.judul

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(judul)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.judul)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.judul, movieEntity.judul)
        assertEquals(dummyMovie.deskripsi, movieEntity.deskripsi)
        assertEquals(dummyMovie.caption, movieEntity.caption)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.photo, movieEntity.photo)
        assertEquals(dummyMovie.tahun, movieEntity.tahun)
        assertEquals(dummyMovie.tonton, movieEntity.tonton)
    }

    @Test
    fun getMovies() {
        val movieEntities = viewModel.getMovies()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities.size.toLong())
    }
}