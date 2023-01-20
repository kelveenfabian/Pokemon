package com.example.pokemon.ui.theme

import com.example.pokemon.Pokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.http.GET

class PokemonRemoteDataSource(private val pokemonApi: PokemonApi) {

    fun getPokemon(): Flow<Pokemon> = flow {
        val pokemon = pokemonApi.fetchPokemon()
        emit(pokemon)
    }
}

interface PokemonApi {

    @GET("pokemon")
    suspend fun fetchPokemon(): Pokemon

}