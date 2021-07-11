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
import com.example.mymoviecatalogue.data.MovieEntity
import com.example.mymoviecatalogue.databinding.ActivityDetailMovieBinding
import com.example.mymoviecatalogue.databinding.ContentDetailBinding

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    private lateinit var detailContentBinding: ContentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailMovieBinding.detailContent
        setContentView(activityDetailMovieBinding.root)

        setSupportActionBar(activityDetailMovieBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val adapter = DetailMovieAdapter()

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val judul = extras.getString(EXTRA_MOVIE)
            if (judul != null) {
                viewModel.setSelectedMovie(judul)
                val movies = viewModel.getMovies()
                adapter.setMovies(movies)
                populateMovie(viewModel.getMovie())
            }
        }
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        detailContentBinding.textTitle.text = movieEntity.judul
        detailContentBinding.textDescription.text = movieEntity.deskripsi
        detailContentBinding.textCapt.text = movieEntity.caption
        detailContentBinding.textGenre.text = movieEntity.genre
        detailContentBinding.textTahun.text = movieEntity.tahun

        Glide.with(this)
            .load(movieEntity.photo)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(detailContentBinding.imagePoster)

        Glide.with(this)
            .load(movieEntity.photo)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
            .into(detailContentBinding.imageBgposter)

        val url = movieEntity.tonton
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