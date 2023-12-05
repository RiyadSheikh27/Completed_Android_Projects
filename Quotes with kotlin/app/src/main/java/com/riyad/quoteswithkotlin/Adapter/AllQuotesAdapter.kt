package com.riyad.quoteswithkotlin.Adapter

import android.content.ActivityNotFoundException
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.riyad.quoteswithkotlin.AllQuotesActivity
import com.riyad.quoteswithkotlin.BuildConfig
import com.riyad.quoteswithkotlin.R
import com.riyad.quoteswithkotlin.databinding.ItemQuotesBinding
import com.riyad.quoteswithkotlin.model.quotesModel


class AllQuotesAdapter(val allQuotesActivity: AllQuotesActivity,val quotesList: ArrayList<quotesModel>) : RecyclerView.Adapter<AllQuotesAdapter.QuotesViewHolder>() {
    class QuotesViewHolder(val binding: ItemQuotesBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesViewHolder {
       return QuotesViewHolder(ItemQuotesBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: QuotesViewHolder, position: Int) {

        if(position % 15 ==0){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_1)
        }else if(position % 15 ==1){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_2)
        }
        else if(position % 15 ==2){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_3)
        }
        else if(position % 15== 3){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_4)
        }
        else if(position %15 ==4){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_5)
        }
        else if(position % 15 ==5){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_6)
        }
 else if(position % 15 ==6){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_7)
        }
 else if(position % 15 ==7){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_8)
        }
 else if(position % 15 ==8){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_9)
        }
 else if(position % 15 ==9){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_10)
        }
 else if(position % 15 ==10){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_11)
        }
 else if(position % 15 ==11){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_12)
        }
 else if(position % 15 ==12){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_13)
        }
 else if(position % 15 ==13){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_14)
        }
 else if(position % 15 ==14){
            holder.binding.mainBackground.setBackgroundResource(R.drawable.gradient_15)
        }

         holder.binding.itemQuotes.text = quotesList[position].data.toString()

        holder.binding.copyID.setOnClickListener {
            val clipboardManager = allQuotesActivity.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager?
            val clipData = ClipData.newPlainText(
                "label",
                quotesList[position].data.toString()
            ) // Example: In real-time, Value from textview

            clipboardManager?.setPrimaryClip(clipData)

            Toast.makeText(allQuotesActivity,"Copied Successfully...",Toast.LENGTH_SHORT).show()

        }
        holder.binding.shareID.setOnClickListener {
            try {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
                var shareMessage = "\n${quotesList[position].data}\n\n"
                shareMessage =
                    """
        ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}
        
        """.trimIndent()
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                allQuotesActivity.startActivity(Intent.createChooser(shareIntent, "choose one"))
            } catch (e: Exception) {
                //e.toString();
            }
            Toast.makeText(allQuotesActivity,"Shared Successfully...",Toast.LENGTH_SHORT).show()
        }
        holder.binding.whatsappID.setOnClickListener {

            val whatsappIntent = Intent(Intent.ACTION_SEND)
            whatsappIntent.type = "text/plain"
            whatsappIntent.setPackage("com.whatsapp")
            whatsappIntent.putExtra(Intent.EXTRA_TEXT, quotesList[position].data.toString())
            try {
               allQuotesActivity.startActivity(whatsappIntent)
            } catch (ex: ActivityNotFoundException) {

            }
        }




    }
    override fun getItemCount() = quotesList.size
    }
