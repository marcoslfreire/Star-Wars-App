package com.dio.starwarsapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PeopleRestApiTask {
    companion object{
        const val BASE_URL = "api/people/"
    }

    private fun peopleProvider(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun retrofitApi(): PeopleApi = peopleProvider().create(PeopleApi::class.java)
    fun getAllPeoples() {}
}