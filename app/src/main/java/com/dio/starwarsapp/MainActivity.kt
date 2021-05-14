package com.dio.starwarsapp

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycle_view_list: RecyclerView
    private lateinit var progressbar_load_indicator : ConstraintLayout

    //private lateinit var button_load_planetas: Button
    private lateinit var button_list_personagens: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_list_personagens.setOnClickListener{
            launchPeopleTask()
        }

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

    fun hideLoadigIndicator(){
        progressbar_load_indicator.visibility = View.GONE
    }
    fun launchPeopleTask(){
        val task = TaskPeople()
        task.execute()
    }
    private inner class TaskPeople(): AsyncTask<Void, Int, List<People>>(){
        val repository = PeopleRepository()

        override fun onPreExecute() {
            super.onPreExecute()
            showLoadingIndicator()
        }
        override fun doInBackground(vararg params: Void?): List<People>? {
            onProgressUpdate()
            return repository.loadData()
        }

        override fun onPostExecute(result: List<People>?) {
            super.onPostExecute(result)
            hideLoadigIndicator()
            if (result != null) {
                showData(result)
            }
        }

    }

}


