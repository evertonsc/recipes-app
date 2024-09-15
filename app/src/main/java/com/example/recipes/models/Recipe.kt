package com.example.recipes.models

data class Recipe(
    val name: String,
    val description: String,
    val ingredients: List<String>,
    val steps: List<String>
)
