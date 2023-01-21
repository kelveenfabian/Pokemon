package com.example.pokemon

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.http.GET

class PokemonRemoteDataSource(private val pokemonApi: PokemonApi) {

    // Strongly consider architecting this in a way where you aren't just crashing if you can't fetch from the API
    // Think about creating a Result class that with subtype Success and Error that you can react to
    // downstream.
    fun getPokemon(): Flow<Pokemon> = flow {
        val pokemon = pokemonApi.fetchPokemon()
        emit(pokemon)
    }
}

interface PokemonApi {

    @GET("pokemon")
    suspend fun fetchPokemon(): Pokemon

}
