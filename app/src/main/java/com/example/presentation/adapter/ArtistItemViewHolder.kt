package com.example.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.itfb.R

class ArtistItemViewHolder (val view: View) : RecyclerView.ViewHolder(view) {
    val tv_name = view.findViewById<TextView>(R.id.tv_name)
    val tv_listeners = view.findViewById<TextView>(R.id.tv_listeners )
    val imageView = view.findViewById<ImageView>(R.id.imageView)

}