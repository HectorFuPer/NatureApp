package com.example.natureapp.models

data class CardItem(
    val name: String,
    val imageUrl: String
)

val natureList = listOf(
    CardItem("Selva", "https://www.selva.com"),
    CardItem("Bosque", "https://www.bosque.com"),
    CardItem("Desierto", "https://www.desierto.com"),
    CardItem("Tundra", "https://www.tundra.com"),
    CardItem("Sabanas", "https://www.sabanas.com"),
    CardItem("Manglares", "https://www.manglares.com")
)

