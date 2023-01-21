package com.example.pokemon

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun PokemonScreen(pokemonSpecies: List<PokemonSpecies>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(pokemonSpecies) { item: PokemonSpecies ->
            Spacer(modifier = Modifier.padding(4.dp))
            PokemonCard(item)
        }
    }
}

@Composable
fun PokemonCard(pokemon: PokemonSpecies) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row {
            AsyncImage(model = pokemon.url, contentDescription = pokemon.name)
            Spacer(modifier = Modifier.padding(4.dp))
            Text(pokemon.name)
        }
    }
}
