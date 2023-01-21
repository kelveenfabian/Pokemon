package com.example.pokemon

import kotlinx.coroutines.flow.Flow

class PokemonRepository(
    private val pokemonRemoteDataSource: PokemonRemoteDataSource
) {
    fun getPokemon(): Flow<Pokemon> = pokemonRemoteDataSource.getPokemon()
}
