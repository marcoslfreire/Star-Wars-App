package com.dio.starwarsapp.data

import com.dio.starwarsapp.implementations.PeopleDataSourceImplementation

class PeopleRepository(private val peopleDataSourcer: PeopleDataSourceImplementation) {
    fun getAllPeopleFromDataSource() = peopleDataSourcer.getAllPeoples()
}

