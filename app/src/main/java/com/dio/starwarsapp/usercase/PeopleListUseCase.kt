package com.dio.starwarsapp.usercase

import com.dio.starwarsapp.data.PeopleRepository

class PeopleListUseCase(private val peopleRepository:  PeopleRepository) {
    operator fun invoke() = peopleRepository.getAllPeopleFromDataSource()
}