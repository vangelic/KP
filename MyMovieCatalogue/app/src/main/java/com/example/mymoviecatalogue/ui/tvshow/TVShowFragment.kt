package com.example.mymoviecatalogue.ui.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.data.TVShowEntity
import com.example.mymoviecatalogue.databinding.FragmentTVShowBinding

class TVShowFragment : Fragment(), TVShowFragmentCallback {

    private lateinit var fragmentTVShowBinding: FragmentTVShowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        fragmentTVShowBinding = FragmentTVShowBinding.inflate(inflater, container, false)
        return fragmentTVShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TVShowViewModel::class.java]
            val tvshows = viewModel.getTVShow()
            val adapter = TVShowAdapter(this)
            adapter.setTvshows(tvshows)
            with(fragmentTVShowBinding.rvTvshow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

    override fun onShareClick(course: TVShowEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan tvshow ini sekarang.")
                .setText(resources.getString(R.string.share_text, course.judul))
                .startChooser()
        }
    }
}