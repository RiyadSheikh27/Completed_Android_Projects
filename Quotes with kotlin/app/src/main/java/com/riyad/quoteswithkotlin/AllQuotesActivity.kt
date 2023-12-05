package com.riyad.quoteswithkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.riyad.quoteswithkotlin.Adapter.AllQuotesAdapter
import com.riyad.quoteswithkotlin.databinding.ActivityAllQuotesBinding
import com.riyad.quoteswithkotlin.model.quotesModel

class AllQuotesActivity : AppCompatActivity() {
    lateinit var binding: ActivityAllQuotesBinding
    lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val id = intent.getStringExtra("id")
        db = FirebaseFirestore.getInstance()

        binding.btnback.setOnClickListener {
            onBackPressed()
        }
        supportActionBar?.hide()

        binding.catName.text = name.toString()

        db.collection("quotes").document(id!!).collection("all")
            .addSnapshotListener { value, error ->

                val quotesList = arrayListOf<quotesModel>()
                val data = value?.toObjects(quotesModel::class.java)
                quotesList.addAll(data!!)
                binding.allQuotes.layoutManager = LinearLayoutManager(this)
                binding.allQuotes.adapter = AllQuotesAdapter(this, quotesList)
            }


    }
}