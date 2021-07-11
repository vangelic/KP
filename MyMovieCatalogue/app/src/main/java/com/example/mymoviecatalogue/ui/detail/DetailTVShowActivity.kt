package com.example.mymoviecatalogue.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.data.TVShowEntity
import com.example.mymoviecatalogue.databinding.ActivityDetailTVShowBinding
import com.example.mymoviecatalogue.databinding.ContentDetailBinding

class DetailTVShowActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    private lateinit var detailContentBinding: ContentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailTVShowBinding = ActivityDetailTVShowBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailTVShowBinding.detailContent
        setContentView(activityDetailTVShowBinding.root)

        setSupportActionBar(activityDetailTVShowBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val adapter = DetailTVShowAdapter()

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTVShowViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val judul = extras.getString(EXTRA_TVSHOW)
            if (judul != null) {
                viewModel.setSelectedTVShow(judul)
                val tvshows = viewModel.getTVShows()
                adapter.setTVShows(tvshows)
                populateTVShow(viewModel.getTVShow())
            }
        }
    }

    private fun populateTVShow(tvshowEntity: TVShowEntity) {
        detailContentBinding.textTitle.text = tvshowEntity.judul
        detailContentBinding.textDescription.text = tvshowEntity.deskripsi
        detailContentBinding.textCapt.text = tvshowEntity.caption
        detailContentBinding.textGenre.text = tvshowEntity.genre
        detailContentBinding.textTahun.text = tvshowEntity.tahun

        Glide.with(this)
            .load(tvshowEntity.photo)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(detailContentBinding.imagePoster)

        Glide.with(this)
            .load(tvshowEntity.photo)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(detailContentBinding.imageBgposter)

        val url = tvshowEntity.tonton
        if (url == "") {
            detailContentBinding.btnTonton.isEnabled = false
            detailContentBinding.btnTonton.isClickable = false
            detailContentBinding.btnTonton.setBackgroundColor(R.drawable.bg_button_disable)
        } else {
            detailContentBinding.btnTonton.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        }
    }
}