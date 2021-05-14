package com.dio.starwarsapp

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

class PeopleRepository {
    fun loadData(){
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("https://swapi.dev/api/people/")
            .build()
        val response = client.newCall(request).execute()
    }
    fun parseGsonToResult(json: String?) =
        Gson().fromJson(json, PeopleResult::class.java)
}

