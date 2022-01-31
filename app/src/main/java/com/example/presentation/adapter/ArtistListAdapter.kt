package com.example.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.domain.pojo.Artist
import com.example.itfb.R

class ArtistListAdapter : ListAdapter<Artist, ArtistItemViewHolder>(ArtistItemDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistItemViewHolder {
        val layout = R.layout.artist_item
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ArtistItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtistItemViewHolder, position: Int) {
        val viewHolderList = getItem(position)
        holder.tv_listeners.text = viewHolderList.listeners
        holder.tv_name.text = viewHolderList.name
        val url =
    }
}