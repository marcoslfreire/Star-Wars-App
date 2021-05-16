package com.dio.starwarsapp.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dio.starwarsapp.domain.People
import com.dio.starwarsapp.data.PeopleRepository
import com.dio.starwarsapp.api.PeopleRestApiTask
import com.dio.starwarsapp.implementations.PeopleDataSourceImplementation
import com.dio.starwarsapp.usercase.PeopleListUseCase
import java.lang.Exception

class PeopleListViewModel: ViewModel(){
    companion object{
        const val TAG = "PeopleRepository"
    }
    private val peopleRestApiTask = PeopleRestApiTask()
    private val peopleDataSource = PeopleDataSourceImplementation(peopleRestApiTask)
    private val peopleRepository = PeopleRepository(peopleDataSource)
    private val peopleListUseCase = PeopleListUseCase(peopleRepository)

    private val _peoplesList = MutableLiveData<List<People>>()
    val peoplesList : LiveData<List<People>>
        get() = _peoplesList

    fun init(){
        getAllPeoples()
    }

    private fun getAllPeoples(): LiveData<List<People>> {
        Thread{
            try {
                _peoplesList.postValue(peopleListUseCase.invoke())
            }catch (exception: Exception){
                Log.d(TAG, exception.message.toString())
            }
        }
        return peoplesList
    }
}