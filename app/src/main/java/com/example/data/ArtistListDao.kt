package com.example.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.domain.pojo.Artist


@Dao
interface ArtistListDao {
    @Query("SELECT * FROM artist")
    fun getArtistList (): LiveData<List<Artist>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addArtistItem ()
}