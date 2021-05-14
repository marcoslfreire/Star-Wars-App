package com.dio.starwarsapp

import okhttp3.OkHttpClient
import okhttp3.Request

class PeopleRepository {
    val client = OkHttpClient()
    val request = Request.Builder()
        .url("https://swapi.dev/api/people/")
        .build()
}