package com.dio.starwarsapp.domain

import com.google.gson.annotations.SerializedName

data class People (
    @SerializedName("name")
    var name: String?,
    @SerializedName("homeworld")
    var homeworld: String?,
    @SerializedName("gender")
    var gender: String?,
    @SerializedName("birth_year")
    var birth_year: String?

)