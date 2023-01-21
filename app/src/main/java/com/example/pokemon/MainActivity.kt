package com.example.pokemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.pokemon.ui.theme.PokemonTheme

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: PokemonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this, PokemonViewModelFactory())[PokemonViewModel::class.java]
        setContent {
            val pokemon = viewModel.getPokemonSpecies().collectAsState(emptyList())

            PokemonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PokemonScreen(pokemonSpecies = pokemon.value)
                }
            }
        }
    }
}
