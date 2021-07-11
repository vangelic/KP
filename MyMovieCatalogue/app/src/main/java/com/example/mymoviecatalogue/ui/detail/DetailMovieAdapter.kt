package com.example.mymoviecatalogue.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviecatalogue.data.MovieEntity
import com.example.mymoviecatalogue.databinding.ItemsBinding

class DetailMovieAdapter  : RecyclerView.Adapter<DetailMovieAdapter.MovieViewHolder>() {

    private val listMovies = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemBinding)
    }

    override fun onBindViewHolder(viewHolder: MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        viewHolder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    inner class MovieViewHolder(private val binding: ItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            binding.tvItemTitle.text = movie.judul
        }
    }
}