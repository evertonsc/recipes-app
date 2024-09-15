package com.example.recipes.screens

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.draw.clip
import com.example.recipes.models.Recipe
import com.example.recipes.models.User
import com.example.recipes.R


@Composable
fun UserProfileScreen(user: User, favorites: List<Recipe>) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.croissant_image),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Olá, ${user.name}!",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text("Favoritos", style = MaterialTheme.typography.h6)

        LazyColumn {
            items(favorites) { recipe ->
                RecipeItem(recipe = recipe, onClick = { /* Navegar para detalhes */ })
            }
        }
    }
}
