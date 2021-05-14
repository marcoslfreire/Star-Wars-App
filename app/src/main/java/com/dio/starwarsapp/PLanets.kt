package com.dio.starwarsapp

import com.google.gson.annotations.SerializedName

class PLanets (
    @SerializedName("name")
    val name: String,
    @SerializedName("population")
    val population: String,
    @SerializedName("climate")
    val climate: String
        )