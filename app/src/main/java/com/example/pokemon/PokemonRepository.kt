package com.example.pokemon

import com.example.pokemon.ui.theme.PokemonRemoteDataSource
import kotlinx.coroutines.flow.Flow

class PokemonRepository(
    private val pokemonRemoteDataSource: PokemonRemoteDataSource
) {
    fun getPokemon(): Flow<Pokemon> = pokemonRemoteDataSource.getPokemon()
}