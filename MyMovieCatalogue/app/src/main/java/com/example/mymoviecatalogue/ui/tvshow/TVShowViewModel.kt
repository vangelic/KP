package com.example.mymoviecatalogue.ui.tvshow

import androidx.lifecycle.ViewModel
import com.example.mymoviecatalogue.data.TVShowEntity
import com.example.mymoviecatalogue.utils.DataDummy

class TVShowViewModel : ViewModel() {

    fun getTVShow(): List<TVShowEntity> = DataDummy.generateDummyTVShow()
}