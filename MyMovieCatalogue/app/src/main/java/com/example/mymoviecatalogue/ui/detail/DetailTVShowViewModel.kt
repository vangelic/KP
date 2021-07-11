package com.example.mymoviecatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.example.mymoviecatalogue.data.TVShowEntity
import com.example.mymoviecatalogue.utils.DataDummy

class DetailTVShowViewModel : ViewModel() {

    private lateinit var judul: String

    fun setSelectedTVShow(judul: String) {
        this.judul = judul
    }

    fun getTVShow(): TVShowEntity {
        lateinit var tvshow: TVShowEntity
        val tvshowsEntities = DataDummy.generateDummyTVShow()
        for (TVShowEntity in tvshowsEntities) {
            if (TVShowEntity.judul == judul) {
                tvshow = TVShowEntity
            }
        }
        return tvshow
    }

    fun getTVShows(): List<TVShowEntity> = DataDummy.generateDummyTVShow()
}