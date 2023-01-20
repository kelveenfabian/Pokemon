package com.example.pokemon

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("count")
    val count: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("results")
    val pokemon: List<PokemonSpecies>
)

data class PokemonSpecies(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)