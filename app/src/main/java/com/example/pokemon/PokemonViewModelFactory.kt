package com.example.pokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PokemonViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        modelClass.getConstructor(PokemonRepository::class.java).newInstance(
            PokemonRepository(PokemonRemoteDataSource(PokemonApiProvider.pokemonApi))
        )
}
