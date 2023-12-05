package com.riyad.quoteswithkotlin.Adapter

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.riyad.quoteswithkotlin.AllQuotesActivity
import com.riyad.quoteswithkotlin.MainActivity
import com.riyad.quoteswithkotlin.databinding.ItemCatBinding
import com.riyad.quoteswithkotlin.model.catModel

class CatAdapter(val mainActivity: MainActivity, val list: ArrayList<catModel>) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {


    val colorsList = arrayListOf<String>("#341f97","#eb3b5a","#f1c40f","#000000","#27ae60","#8e44ad","#F97F51","#34495e","#0fb9b1","#6D214F","#227093","#ff5252","#006266","#aaa69d")

    class CatViewHolder(val binding: ItemCatBinding) : RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
       return CatViewHolder(ItemCatBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {

        if(position % 14 ==0){
      holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[0]))
        }else if(position % 14 ==1){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[1]))
        }
else if(position % 14 ==2){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[2]))
        }
else if(position % 14==3){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[3]))
        }
else if(position % 14 ==4){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[4]))
        }
else if(position % 14 ==5){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[5]))
        } else if(position % 14 ==6){
      holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[6]))
        }else if(position % 14 ==7){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[7]))
        }
else if(position % 14 ==8){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[8]))
        }
else if(position % 14==9){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[9]))
        }
else if(position % 14 ==10){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[10]))
        }
else if(position % 14 ==11){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[11]))
        }else if(position % 14 ==12){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[12]))
        }
else if(position % 14 ==13){
            holder.binding.colorId.setBackgroundColor(Color.parseColor(colorsList[13]))
        }







        holder.binding.itemText.text = list[position].name.toString()
        holder.binding.root.setOnClickListener(){
            val intent = Intent(mainActivity, AllQuotesActivity::class.java)
            intent.putExtra("id",list[position].id)
            intent.putExtra("name",list[position].name)

            mainActivity.startActivity(intent)

        }


    }


    override fun getItemCount() = list.size
}