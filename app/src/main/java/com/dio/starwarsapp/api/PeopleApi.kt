package com.dio.starwarsapp.api

import com.dio.starwarsapp.domain.People
import retrofit2.Call
import retrofit2.http.GET

interface PeopleApi {
    @GET("https://swapi.dev/api/people/")
    fun getAllPeople(): Call<List<People>>
}