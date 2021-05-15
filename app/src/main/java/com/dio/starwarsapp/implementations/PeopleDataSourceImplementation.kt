package com.dio.starwarsapp.implementations

import android.util.Log
import com.dio.starwarsapp.domain.People
import com.dio.starwarsapp.api.PeopleRestApiTask
import com.dio.starwarsapp.data.PeopleDataSource

class PeopleDataSourceImplementation(private val peopleRestApiTask: PeopleRestApiTask):
    PeopleDataSource {

    companion object {
        const val TAG = "PeopleRepository"
    }

    //lista vazia
    private val peoplesList = arrayListOf<People>()

    val request = peopleRestApiTask.retrofitApi().getAllPeople().execute()
     fun getAllPeoples(): List<People> {

        if (request.isSuccessful) {
            request.body()?.let {
                peoplesList.addAll(it)
            }
        } else {
            request.errorBody()?.let {
                Log.d(TAG, it.toString())
            }
        }
        return peoplesList
    }
}