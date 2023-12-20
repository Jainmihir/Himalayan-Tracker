package com.example.himalayantracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BookHotels : AppCompatActivity() {
    lateinit var hotelslist : RecyclerView
    lateinit var layoutManager : RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_hotels)
        hotelslist = findViewById(R.id.ht_recyclerview)
        layoutManager = LinearLayoutManager(this@BookHotels)



    }
}