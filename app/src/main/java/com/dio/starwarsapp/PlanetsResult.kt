package com.dio.starwarsapp

import com.google.gson.annotations.SerializedName

class PlanetsResult (
    @SerializedName("count")
    val count: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<PLanets>
        )