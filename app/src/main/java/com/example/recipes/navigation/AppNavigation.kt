package com.example.recipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recipes.screens.*
import com.example.recipes.models.sampleRecipes
import com.example.recipes.models.sampleUser

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(onLoginClick = {
                navController.navigate("recipe_list")
            })
        }
        composable("recipe_list") {
            RecipeListScreen(recipes = sampleRecipes, onRecipeClick = { recipe ->
                navController.navigate("recipe_detail/${recipe.name}")
            })
        }
        composable("recipe_detail/{recipeName}") { backStackEntry ->
            val recipeName = backStackEntry.arguments?.getString("recipeName")
            val recipe = sampleRecipes.find { it.name == recipeName }
            recipe?.let {
                RecipeDetailScreen(recipe = it)
            }
        }
        composable("user_profile") {
            UserProfileScreen(user = sampleUser, favorites = sampleRecipes)
        }
    }
}
