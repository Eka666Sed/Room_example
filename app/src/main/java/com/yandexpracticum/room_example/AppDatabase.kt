package com.yandexpracticum.room_example

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        MovieEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getMovieDao(): MovieDao
}