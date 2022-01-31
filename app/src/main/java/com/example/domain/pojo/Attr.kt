package com.example.domain.pojo

import com.google.gson.annotations.SerializedName


data class Attr(

    @SerializedName("page") var page: String? = null,
    @SerializedName("perPage") var perPage: String? = null,
    @SerializedName("totalPages") var totalPages: String? = null,
    @SerializedName("total") var total: String? = null

)