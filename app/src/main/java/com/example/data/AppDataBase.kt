package com.example.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.domain.pojo.Artist


@Database(entities = [Artist::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {

    abstract fun artistListDao(): ArtistListDao

    companion object {
        private var INSTANCE: AppDataBase? = null
        private val LOCK = Any()
        private const val DB_NAME = "artistItem.db"

        fun getInstance(application: Application): AppDataBase {
            INSTANCE?.let {
                return it
            }
            //Double check
            synchronized(LOCK) {
                INSTANCE?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    AppDataBase::class.java,
                    DB_NAME
                ).build()
                INSTANCE = db
                return db
            }
        }
    }

}