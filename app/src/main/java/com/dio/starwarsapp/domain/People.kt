package com.dio.starwarsapp.domain

import com.dio.starwarsapp.PLanets
import com.google.gson.annotations.SerializedName

data class People (
    @SerializedName("name")
    var name: String?,
    @SerializedName("homeworld")
    var homeworld: String?,
    @SerializedName("gender")
    var gender: String?,
    @SerializedName("birth_year")
    var birth_year: String?,
    @SerializedName("count")
    val count: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<PLanets>

)