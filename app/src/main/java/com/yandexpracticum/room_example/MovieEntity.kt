package com.yandexpracticum.room_example

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.ColumnInfo.Companion.TEXT
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "movie_table")
data class MovieEntity(
//    @Ignore
//    private val image: Bitmap
    @PrimaryKey @ColumnInfo(name = "movie_id")
    val id: Long,
    @ColumnInfo( name = "movie_name",typeAffinity = TEXT)
    val title: String,
    val description: String
)

