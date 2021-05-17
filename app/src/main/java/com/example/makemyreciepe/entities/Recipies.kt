package com.example.makemyreciepe.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipies")
data class Recipies(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name = "name")
    var dishName:String
) : Serializable