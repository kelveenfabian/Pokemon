package com.example.pokemon

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PokemonViewModel(
    private val repository: PokemonRepository
) : ViewModel() {
    fun getPokemonNames(): Flow<List<String>> = repository.getPokemon().map { result ->
        result.pokemon.map { it.name }
    }

    fun getPokemonSpecies(): Flow<List<PokemonSpecies>> = repository.getPokemon().map { result ->
        result.pokemon
    }
}