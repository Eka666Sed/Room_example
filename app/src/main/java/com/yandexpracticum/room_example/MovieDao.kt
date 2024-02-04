package com.yandexpracticum.room_example

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface MovieDao {
    @Insert(entity = MovieEntity::class, onConflict = OnConflictStrategy.REPLACE)
    fun insertNewMovie(movieEntity: MovieEntity)

    @Insert(entity = MovieEntity::class, onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MovieEntity>)

    @Update(entity = MovieEntity::class, onConflict = OnConflictStrategy.REPLACE)
    fun updateMovie(movieEntity: MovieEntity)

    @Delete(entity = MovieEntity::class)
    fun deleteMovieEntity(movieEntity: MovieEntity)

    @Query("SELECT * FROM movie_table")
    fun getMovies():List<MovieEntity>

//    @Query("SELECT * FROM movie_table WHERE id = :movieId")
//    fun getMovieById(movieId: Long): MovieEntity

    @Query("SELECT * FROM movie_table WHERE movie_name LIKE :search")
    fun searchMoviesByName (search: String): List<MovieEntity>
}