package com.dio.starwarsapp.api

import com.dio.starwarsapp.People
import retrofit2.Call
import retrofit2.http.GET

interface PeopleApi {
    @GET("https://swapi.dev/api/people/")
    fun getAllPeoples(): Call<List<People>>
}