package com.proway.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.proway.example.myapplication.R
import com.proway.example.myapplication.adapter.AdapterListaNomes

class PrimeiraListaActivity : AppCompatActivity() {

    lateinit var recyclerViewNomes : RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_lista)


        val arrayNomes = arrayListOf("Gabriela","Paula","Rose")


        recyclerViewNomes = findViewById(R.id.recyclerViewNomes)
        recyclerViewNomes.adapter = AdapterListaNomes(arrayNomes)

        //linha importante, não esquecer de adicionar
        recyclerViewNomes.layoutManager = LinearLayoutManager(this)


    }
}