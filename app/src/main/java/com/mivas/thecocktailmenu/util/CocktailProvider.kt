package com.mivas.thecocktailmenu.util

import com.mivas.thecocktailmenu.R
import com.mivas.thecocktailmenu.model.Cocktail

object CocktailProvider {

    val cocktails: List<Cocktail> = listOf(
        Cocktail("Daiquiri", "Rum, Lime, Sugar", R.drawable.c_daiquiri, R.drawable.bg_daiquiri, listOf("Rum", "Classic", "Tropical", "Frozen", "Strong")),
        Cocktail("Old Fashioned", "Whiskey, Angostura, Sugar", R.drawable.c_old_fashioned, R.drawable.bg_old_fashioned, listOf("Whiskey", "Classic", "Short", "Medium")),
        Cocktail("Americano", "Campari, Vermouth, Soda", R.drawable.c_americano, R.drawable.bg_americano, listOf("Liqueur", "Short", "Classic", "Medium")),
        Cocktail("B52", "Kahlua, Bailey, Cointreau", R.drawable.c_b52, R.drawable.bg_b52, listOf("Liqueur", "Shooter", "Classic", "Creamy", "Strong")),
        Cocktail("Caipirinha", "Rum, Lime, Sugar", R.drawable.c_caipirinha, R.drawable.bg_caipirinha, listOf("Rum", "Classic", "Short", "Extremely Strong"))
    )

}