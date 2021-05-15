package com.dio.starwarsapp.usercase

import com.dio.starwarsapp.PeopleRepository

class PeopleListUseCase(private val peopleRepository: PeopleRepository) {
    operator fun invoke() = peopleRepository.getAllPeopleFromDataSource()
}