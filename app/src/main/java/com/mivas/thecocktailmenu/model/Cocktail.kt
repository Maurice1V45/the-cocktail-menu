package com.mivas.thecocktailmenu.model

data class Cocktail(
    val name: String,
    val ingredients: String,
    val image: Int,
    val background: Int,
    val tags: List<String>
)