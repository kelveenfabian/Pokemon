package com.example.pokemon

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonApiProvider {
    private const val BASE_URL = "https://pokeapi.co/api/v2/"

    val pokemonApi: PokemonApi by lazy { createPokemonApi() }
    private fun createPokemonApi(): PokemonApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PokemonApi::class.java)
}
