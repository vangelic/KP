package com.example.mymoviecatalogue.ui.detail

import com.example.mymoviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTVShowViewModelTest {
    private lateinit var viewModel: DetailTVShowViewModel
    private val dummyTVShow = DataDummy.generateDummyTVShow()[0]
    private val judul = dummyTVShow.judul

    @Before
    fun setUp() {
        viewModel = DetailTVShowViewModel()
        viewModel.setSelectedTVShow(judul)
    }

    @Test
    fun getTVShow() {
        viewModel.setSelectedTVShow(dummyTVShow.judul)
        val tvshowEntity = viewModel.getTVShow()
        assertNotNull(tvshowEntity)
        assertEquals(dummyTVShow.judul, tvshowEntity.judul)
        assertEquals(dummyTVShow.deskripsi, tvshowEntity.deskripsi)
        assertEquals(dummyTVShow.caption, tvshowEntity.caption)
        assertEquals(dummyTVShow.genre, tvshowEntity.genre)
        assertEquals(dummyTVShow.photo, tvshowEntity.photo)
        assertEquals(dummyTVShow.tahun, tvshowEntity.tahun)
        assertEquals(dummyTVShow.tonton, tvshowEntity.tonton)
    }

    @Test
    fun getTVShows() {
        val tvshowEntities = viewModel.getTVShows()
        assertNotNull(tvshowEntities)
        assertEquals(10, tvshowEntities.size.toLong())
    }
}