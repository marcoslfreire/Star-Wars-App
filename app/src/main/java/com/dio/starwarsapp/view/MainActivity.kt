package com.dio.starwarsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.dio.starwarsapp.R
import com.dio.starwarsapp.domain.People


class MainActivity : AppCompatActivity() {
    private lateinit var peopleListViewModel: PeopleListViewModel
    private lateinit  var peoplelist: RecyclerView
    private lateinit var progressbarList: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peoplelist =  findViewById(R.id.recycle_view_list)
        progressbarList = findViewById(R.id.progressbar_load_indicator)

        peopleListViewModel = ViewModelProvider.NewInstanceFactory().create(PeopleListViewModel::class.java)
        peopleListViewModel.init()
        initObserver()
        loadingVisibility(true)

    }
    private fun initObserver(){
        peopleListViewModel.peoplesList.observe(this, { list ->
            if (list.isNotEmpty()){
                populateList(list)

                loadingVisibility(false)
            }

        })
    }



    private fun populateList(list: List<People>) {
        peoplelist.apply{
            hasFixedSize()
            adapter = PeopleAdapter(list)
        }

    }

    private fun loadingVisibility(isLoading: Boolean){
        progressbarList.visibility = if (isLoading) View.VISIBLE else View.GONE
    }}


