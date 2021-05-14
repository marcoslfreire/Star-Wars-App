package com.dio.starwarsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycle_view_list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun showData(list: List<People>){
        recycle_view_list.text =""
        list.forEach { people ->
            recycle_view_list.append("${people.name}-" +
                    "${people.birth_year}-${people.gender}-" +
                    "${people.homeworld} \n\n")
        }
    }
    

}


