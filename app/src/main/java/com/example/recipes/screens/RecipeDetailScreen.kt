package com.example.recipes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipes.models.Recipe
import androidx.compose.material.MaterialTheme
import com.example.recipes.R


@Composable
fun RecipeDetailScreen(recipe: Recipe) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.croissant_image),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().height(200.dp)
        )

        Text(
            text = recipe.name,
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text(
            text = recipe.description,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text("Ingredientes", style = MaterialTheme.typography.h6)
        Text("• Farinha\n• Sal\n• Leite\n• Chocolate")

        Spacer(modifier = Modifier.height(16.dp))

        Text("Modo de preparo", style = MaterialTheme.typography.h6)
        Text("1. Cozinhe\n2. Prepare\n3. Asse\n4. Emprate\n5. Pronto!")
    }
}
