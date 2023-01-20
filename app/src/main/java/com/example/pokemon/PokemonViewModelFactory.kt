package com.example.pokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.pokemon.ui.theme.PokemonRemoteDataSource

class PokemonViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(PokemonRepository::class.java).newInstance(
            PokemonRepository(PokemonRemoteDataSource(PokemonApiProvider.pokemonApi))
        )
    }
}