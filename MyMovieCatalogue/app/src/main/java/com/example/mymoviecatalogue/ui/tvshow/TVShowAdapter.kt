package com.example.mymoviecatalogue.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.data.TVShowEntity
import com.example.mymoviecatalogue.databinding.ItemsBinding
import com.example.mymoviecatalogue.ui.detail.DetailTVShowActivity

class TVShowAdapter (private val callback: TVShowFragmentCallback) : RecyclerView.Adapter<TVShowAdapter.TvshowViewHolder>() {
    private val listTVShow = ArrayList<TVShowEntity>()

    fun setTvshows(tvshow: List<TVShowEntity>?) {
        if (tvshow == null) return
        this.listTVShow.clear()
        this.listTVShow.addAll(tvshow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvshowViewHolder {
        val itemsBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvshowViewHolder(itemsBinding)
    }

    override fun onBindViewHolder(holder: TvshowViewHolder, position: Int) {
        val tvshows = listTVShow[position]
        holder.bind(tvshows)
    }

    override fun getItemCount(): Int = listTVShow.size

    inner class TvshowViewHolder(private val binding: ItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshows: TVShowEntity) {
            with(binding) {
                tvItemTitle.text = tvshows.judul
                tvItemGenre.text = tvshows.genre
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTVShowActivity::class.java)
                    intent.putExtra(DetailTVShowActivity.EXTRA_TVSHOW, tvshows.judul)
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener { callback.onShareClick(tvshows) }
                Glide.with(itemView.context)
                    .load(tvshows.photo)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}