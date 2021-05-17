package com.example.makemyreciepe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemyreciepe.R
import com.example.makemyreciepe.entities.Recipies
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.item_sublayout.view.*

class SubCategoryAdapter: RecyclerView.Adapter<RecipeSubViewHolder>() {
    var arraySubCategory = ArrayList<Recipies>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeSubViewHolder {
        return RecipeSubViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sublayout,parent,false))
    }
  fun setData(arrData:List<Recipies>){
      arraySubCategory = arrData as ArrayList<Recipies>
  }
    override fun getItemCount(): Int {
        return arraySubCategory.size
    }

    override fun onBindViewHolder(holder: RecipeSubViewHolder, position: Int) {
       holder.itemView.dish_name.text = arraySubCategory[position].dishName

    }

    
}

class RecipeSubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

}