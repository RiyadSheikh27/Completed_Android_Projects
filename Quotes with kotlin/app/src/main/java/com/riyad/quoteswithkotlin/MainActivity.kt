package com.riyad.quoteswithkotlin

import android.app.SearchManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.PopupMenu
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.contains
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.lottie.LottieAnimationView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.firebase.firestore.FirebaseFirestore
import com.riyad.quoteswithkotlin.Adapter.CatAdapter
import com.riyad.quoteswithkotlin.databinding.ActivityMainBinding
import com.riyad.quoteswithkotlin.model.catModel
import com.riyad.quoteswithkotlin.model.quotesModel
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var db: FirebaseFirestore




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        db = FirebaseFirestore.getInstance()
        val imageList =  ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.six))
        imageList.add(SlideModel(R.drawable.seven))
        imageList.add(SlideModel(R.drawable.one))
        imageList.add(SlideModel(R.drawable.two))
        imageList.add(SlideModel(R.drawable.three))
        imageList.add(SlideModel(R.drawable.four))
        imageList.add(SlideModel(R.drawable.five))




        val image = findViewById<ImageSlider>(R.id.imageSlider)
        image.setImageList(imageList)

        db.collection("quotes").addSnapshotListener { value, error ->

            val list = arrayListOf<catModel>()

            val data = value?.toObjects(catModel:: class.java)
            if (data != null) {
                list.addAll(data)
            }
            Log.e(data.toString(),"data")

            binding.rcvCat.adapter = CatAdapter(this,list)

            binding.rcvCat.layoutManager = LinearLayoutManager(this)
        }



        binding.btnmenu.setOnClickListener(){
            if(binding.drawerID.isDrawerOpen(Gravity.LEFT)){
                binding.drawerID.closeDrawer(Gravity.LEFT)
            }else{
                binding.drawerID.openDrawer(Gravity.LEFT)
            }

        }





        binding.navigationID.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.share -> {
                    try {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
                        var shareMessage = "\nInstall this application for advance level quotes.\n\n"
                        shareMessage =
                            """
        ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}
        
        """.trimIndent()
                        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                        startActivity(Intent.createChooser(shareIntent, "choose one"))
                    } catch (e: Exception) {
                        //e.toString();
                    }
                    true
                }
                R.id.rate -> {
                    val uri = Uri.parse("market://details?id=$packageName")
                    val myAppLinkToMarket = Intent(Intent.ACTION_VIEW, uri)
                    try {
                        startActivity(myAppLinkToMarket)
                    } catch (e: ActivityNotFoundException) {
                        Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show()
                    }
                    true
                }
                R.id.more -> {
                    try {
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName")))
                    } catch (e: ActivityNotFoundException) {
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
                    }
                    true
                }
                else -> {
                    false
                }




            }
        }
    }
    //------------------------------------------------------------------------



//--------------------------------------------------------------------------------------

    override fun onBackPressed() {
        if(binding.drawerID.isDrawerOpen(Gravity.LEFT)){
            binding.drawerID.closeDrawer(Gravity.LEFT)
        }else{
            super.onBackPressed()
        }
    }

}






