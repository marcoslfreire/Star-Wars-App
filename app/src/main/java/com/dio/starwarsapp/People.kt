package com.dio.starwarsapp

import com.google.gson.annotations.SerializedName



data class People (

@SerializedName("name")
var name: String?,
@SerializedName("homeworld")
var planet_origin: String?,
@SerializedName("gender")
var gender: String?,
@SerializedName("birth_year")
var birth_year: String?

)