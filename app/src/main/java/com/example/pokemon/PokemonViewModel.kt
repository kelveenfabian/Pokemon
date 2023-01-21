package com.example.pokemon

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PokemonViewModel(
    private val repository: PokemonRepository
) : ViewModel() {

    // Dead code. This is not being used.
    fun getPokemonNames(): Flow<List<String>> = getPokemonSpecies().map {
        it.map { pokemonSpecies -> pokemonSpecies.name }
    }

    fun getPokemonSpecies(): Flow<List<PokemonSpecies>> = repository.getPokemon().map { result ->
        result.pokemon
    }
}
