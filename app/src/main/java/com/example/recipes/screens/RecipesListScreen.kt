package com.example.recipes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.recipes.models.Recipe
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import com.example.recipes.R

@Composable
fun RecipeListScreen(recipes: List<Recipe>, onRecipeClick: (Recipe) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(
            title = { Text("Receitas") },
            actions = {
                IconButton(onClick = { /* ação de busca */ }) {
                    Icon(Icons.Default.Search, contentDescription = "Search")
                }
            }
        )

        LazyColumn {
            items(recipes) { recipe ->
                RecipeItem(recipe = recipe, onClick = { onRecipeClick(recipe) })
            }
        }
    }
}

@Composable
fun RecipeItem(recipe: Recipe, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.croissant_image),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = recipe.name, style = MaterialTheme.typography.h6)
                Text(text = recipe.description)
            }
        }
    }
}
