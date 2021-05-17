package com.example.makemyreciepe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.makemyreciepe.entities.Recipies

@Dao
interface RecipeDao {
    @get:Query("Select * from recipies order by id DESC")
    val allRecipes:List<Recipies>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipe:Recipies){

    }

}