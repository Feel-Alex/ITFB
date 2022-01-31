package com.example.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.domain.pojo.Artist

class ArtistItemDiffCallback : DiffUtil.ItemCallback<Artist>(){
        override fun areItemsTheSame(oldItem: Artist, newItem: Artist): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Artist, newItem: Artist): Boolean {
            return oldItem == newItem
        }


}
