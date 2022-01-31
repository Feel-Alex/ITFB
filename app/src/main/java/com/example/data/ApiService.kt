package com.example.data

import com.example.domain.pojo.Artist
import io.reactivex.Single
import retrofit2.http.GET
import rx.Observable

interface ApiService {

    @GET("?method=chart.gettopartists&api_key=55913eab78943f3a5b3c21c7342d0226&format=json")
    fun getArtist(): Observable<Artist>
}