package com.example.makemyreciepe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemyreciepe.R
import com.example.makemyreciepe.entities.Recipies
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.item_sublayout.view.*

class MainCategoryAdapter: RecyclerView.Adapter<RecipeViewHolder>() {
    var arrayMainRecipe = ArrayList<Recipies>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false))
    }
  fun setData(arrData:List<Recipies>){
      arrayMainRecipe = arrData as ArrayList<Recipies>
  }
    override fun getItemCount(): Int {
        return arrayMainRecipe.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
       holder.itemView.DishName.text = arrayMainRecipe[position].dishName

    }

}

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

}