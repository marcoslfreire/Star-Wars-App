package com.dio.starwarsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycle_view_list: RecyclerView
    private lateinit var progressbar_load_indicator : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle_view_list = findViewById(R.id.recycle_view_list)
        progressbar_load_indicator = findViewById(R.id.progressbar_load_indicator)


    }

    private fun showData(list: List<People>){
        recycle_view_list.adapter
        list.forEach { people ->
            recycle_view_list.apply {
                hasFixedSize()
                ("${people.name}-" +
                    "${people.birth_year}-${people.gender}-" +
                    "${people.homeworld} \n\n")
        }
    } }
    private fun showLoadingIndicator(){
        progressbar_load_indicator.visibility = View.VISIBLE
    }

}


