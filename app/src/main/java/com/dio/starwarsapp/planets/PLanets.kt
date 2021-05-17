package com.dio.starwarsapp.planets

import com.google.gson.annotations.SerializedName

class PLanets (
    //planetId
    @SerializedName("name")
    val name: String,
    @SerializedName("population")
    val population: String,
    @SerializedName("climate")
    val climate: String
        )