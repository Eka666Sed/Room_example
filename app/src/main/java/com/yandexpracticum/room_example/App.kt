package com.yandexpracticum.room_example

import android.app.Application
import androidx.room.Room

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val database = Room.databaseBuilder(
            this, AppDatabase::class.java, "database.bd").build()
    database.getMovieDao().insertNewMovie(MovieEntity(1, "Звездные войны", "В далекой-далекой галактике.."))

        val movies = database.getMovieDao().getMovies()
    }
}