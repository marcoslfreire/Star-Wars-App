package com.dio.starwarsapp.api

import com.dio.starwarsapp.domain.People
import retrofit2.Call
import retrofit2.http.GET

interface PeopleApi {
    @GET("api/people/")
    fun getAllPeople(): Call<List<People>>
}