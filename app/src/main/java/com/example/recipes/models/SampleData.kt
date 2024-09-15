package com.example.recipes.models

val sampleRecipes = listOf(
    Recipe(
        name = "Croissant",
        description = "Um croissant delicioso e crocante.",
        ingredients = listOf("Farinha", "Sal", "Leite", "Chocolate"),
        steps = listOf("Cozinhe", "Prepare", "Asse", "Emprate", "Pronto!")
    ),
    Recipe(
        name = "Pão de Queijo",
        description = "Tradicional pão de queijo brasileiro.",
        ingredients = listOf("Polvilho", "Queijo", "Leite", "Ovos"),
        steps = listOf("Misture", "Modele", "Asse", "Sirva")
    ),
    // Adicione mais receitas aqui, se necessário
)

val sampleUser = User(
    name = "Nome do Usuário",
    email = "email@exemplo.com",
    avatarUrl = "https://linkparaavatar.com/imagem.jpg"
)
