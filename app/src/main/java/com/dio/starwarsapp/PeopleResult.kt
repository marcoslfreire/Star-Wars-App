package com.dio.starwarsapp

import com.google.gson.annotations.SerializedName

class PeopleResult (
    //
    //swapi.dev/api/planets/
    //swapi.dev/api/films/
    @SerializedName("count")
    val count : String,
    @SerializedName("next")
    val next : String,
    @SerializedName("previous")
    val previous : String,
    @SerializedName("results")
    val results: List<People>
        )



