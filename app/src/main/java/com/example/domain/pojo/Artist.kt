package com.example.domain.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "artist")
data class Artist(
    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0,
    @SerializedName("name") var name: String? = null,
    @SerializedName("playcount") var playcount: String? = null,
    @SerializedName("listeners") var listeners: String? = null,
    @SerializedName("mbid") var mbid: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("streamable") var streamable: String? = null,
//    @SerializedName("image") var image: ArrayList<Image> = arrayListOf()

)