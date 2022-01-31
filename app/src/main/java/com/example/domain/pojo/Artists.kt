package com.example.domain.pojo

import com.google.gson.annotations.SerializedName


data class Artists(

    @SerializedName("artist") var artist: ArrayList<Artist> = arrayListOf(),
    @SerializedName("@attr") var attr: Attr? = Attr()

)
