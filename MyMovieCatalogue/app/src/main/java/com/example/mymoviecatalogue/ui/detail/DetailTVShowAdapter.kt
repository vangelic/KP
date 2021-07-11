package com.example.mymoviecatalogue.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviecatalogue.data.TVShowEntity
import com.example.mymoviecatalogue.databinding.ItemsBinding

class DetailTVShowAdapter : RecyclerView.Adapter<DetailTVShowAdapter.TVShowViewHolder>() {

    private val listTVShows = ArrayList<TVShowEntity>()

    fun setTVShows(tvshows: List<TVShowEntity>?) {
        if (tvshows == null) return
        this.listTVShows.clear()
        this.listTVShows.addAll(tvshows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowViewHolder {
        val itemBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TVShowViewHolder(itemBinding)
    }

    override fun onBindViewHolder(viewHolder: TVShowViewHolder, position: Int) {
        val tvshow = listTVShows[position]
        viewHolder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTVShows.size

    inner class TVShowViewHolder(private val binding: ItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TVShowEntity) {
            binding.tvItemTitle.text = tvshow.judul
        }
    }
}