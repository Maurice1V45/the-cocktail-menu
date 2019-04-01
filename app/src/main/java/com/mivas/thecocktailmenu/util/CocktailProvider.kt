package com.mivas.thecocktailmenu.util

import com.mivas.thecocktailmenu.R
import com.mivas.thecocktailmenu.model.Cocktail

object CocktailProvider {

    val cocktails: List<Cocktail> = listOf(
        Cocktail("Daiquiri", "Rum, Lime, Sugar", R.drawable.c_daiquiri, R.drawable.bg_daiquiri, listOf("Rum", "Classic", "Tropical", "Frozen", "Strong")),
        Cocktail("Old Fashioned", "Whiskey, Angostura, Sugar", R.drawable.c_old_fashioned, R.drawable.bg_old_fashioned, listOf("Whiskey", "Classic", "Short", "Medium")),
        Cocktail("Americano", "Campari, Vermouth, Soda", R.drawable.c_americano, R.drawable.bg_americano, listOf("Liqueur", "Short", "Classic", "Medium")),
        Cocktail("B52", "Kahlua, Bailey, Cointreau", R.drawable.c_b52, R.drawable.bg_b52, listOf("Liqueur", "Shooter", "Classic", "Creamy", "Strong")),
        Cocktail("Caipirinha", "Rum, Lime, Sugar", R.drawable.c_caipirinha, R.drawable.bg_caipirinha, listOf("Rum", "Classic", "Short", "Extremely Strong")),
        Cocktail("Bronx", "Gin, Vermouth, Orange", R.drawable.c_bronx, R.drawable.bg_bronx, listOf("Gin", "Classic", "Martini", "Strong")),
        Cocktail("Clover Club", "Gin, Raspberry, Lemon, Egg", R.drawable.c_clover_club, R.drawable.bg_clover_club, listOf("Gin", "Classic", "Martini", "Medium")),
        Cocktail("Cuba Libre", "Rum, Cola, Lime", R.drawable.c_cuba_libre, R.drawable.bg_cuba_libre, listOf("Rum", "Classic", "Longdrink", "Light")),
        Cocktail("French 75", "Champagne, Gin, Lemon, Sugar", R.drawable.c_french_75, R.drawable.bg_french_75, listOf("Champagne", "Classic", "Sparkling", "Medium")),
        Cocktail("Gin Tonic", "Gin, Tonic, Lemon", R.drawable.c_gin_tonic, R.drawable.bg_gin_tonic, listOf("Gin", "Longdrink", "Light")),
        Cocktail("Godfather", "Whiskey, Amaretto", R.drawable.c_godfather, R.drawable.bg_godfather, listOf("Whiskey", "Classic", "Short", "Extremely Strong")),
        Cocktail("Godmother", "Vodka, Amaretto", R.drawable.c_godmother, R.drawable.bg_godmother, listOf("Vodka", "Short", "Extremely Strong")),
        Cocktail("Manhattan", "Whiskey, Vermouth, Angostura", R.drawable.c_manhattan, R.drawable.bg_manhattan, listOf("Whiskey", "Classic", "Martini", "Extremely Strong")),
        Cocktail("Dry Martini", "Gin, Vermouth, Lemon", R.drawable.c_dry_martini, R.drawable.bg_dry_martini, listOf("Gin", "Classic", "Martini", "Extremely Strong")),
        Cocktail("Espresso Martini", "Vodka, Coffee, Kahlua, Sugar", R.drawable.c_espresso_martini, R.drawable.bg_espresso_martini, listOf("Vodka", "Classic", "Martini", "Creamy", "Extremely Strong")),
        Cocktail("Dirty Martini", "Vodka, Vermouth, Olive", R.drawable.c_dirty_martini, R.drawable.bg_dirty_martini, listOf("Vodka", "Classic", "Martini", "Strong")),
        Cocktail("Mimosa", "Champagne, Orange", R.drawable.c_mimosa, R.drawable.bg_mimosa, listOf("Champagne", "Classic", "Sparkling", "Light")),
        Cocktail("Negroni", "Gin, Vermouth, Campari", R.drawable.c_negroni, R.drawable.bg_negroni, listOf("Gin", "Classic", "Short", "Strong")),
        Cocktail("Yellow Bird", "Rum, Galliano, Cointreau, Lime", R.drawable.c_yellow_bird, R.drawable.bg_yellow_bird, listOf("Rum", "Classic", "Strong")),
        Cocktail("White Lady", "Gin, Cointreau, Lime", R.drawable.c_white_lady, R.drawable.bg_white_lady, listOf("Gin", "Classic", "Martini", "Strong")),
        Cocktail("White Russian", "Vodka, Kahlua, Cream", R.drawable.c_white_russian, R.drawable.bg_white_russian, listOf("Vodka", "Classic", "Creamy", "Short", "Medium")),
        Cocktail("Mojito", "Rum, Mint, Lime, Sugar, Soda", R.drawable.c_mojito, R.drawable.bg_mojito, listOf("Rum", "Classic", "Longdrink", "Light")),
        Cocktail("Screwdriver", "Vodka, Orange", R.drawable.c_screwdriver, R.drawable.bg_screwdriver, listOf("Vodka", "Longdrink", "Classic", "Light")),
        Cocktail("Margarita", "Tequila, Cointreau, Lime", R.drawable.c_margarita, R.drawable.bg_margarita, listOf("Tequila", "Classic", "Martini", "Strong")),
        Cocktail("Lemon Cocktail", "Lemon, Orange", R.drawable.c_lemon_cocktail, R.drawable.bg_lemon_cocktail, listOf("Juice", "Nonalcoholic")),
        Cocktail("Baby Belle", "Pineapple, Orange, Grenadine, Lime", R.drawable.c_baby_belle, R.drawable.bg_baby_belle, listOf("Juice", "Nonalcoholic")),
        Cocktail("Red Eye", "Beer, Vodka, Tomato", R.drawable.c_red_eye, R.drawable.bg_red_eye, listOf("Beer", "Longdrink", "Weak")),
        Cocktail("Irish Coffee", "Whiskey, Coffee, Cream, Sugar", R.drawable.c_irish_coffee, R.drawable.bg_irish_coffee, listOf("Whiskey", "Hot", "Classic", "Creamy", "Light")),
        Cocktail("Blue Tequila", "Tequila, Curacao", R.drawable.c_blue_tequila, R.drawable.bg_blue_tequila, listOf("Tequila", "Shooter", "Strong")),
        Cocktail("Orgasm", "Amaretto, Kahlua, Bailey", R.drawable.c_orgasm, R.drawable.bg_orgasm, listOf("Liqueur", "Shooter", "Creamy", "Strong")),
        Cocktail("Grapefruit Orange Cocktail", "Grapefruit, Orange", R.drawable.c_grapefruit_orange_cocktail, R.drawable.bg_grapefruit_orange_cocktail, listOf("Juice", "Smoothie", "Nonalcoholic")),
        Cocktail("Aperol Spritz", "Aperol, Champagne, Soda", R.drawable.c_aperol_spritz, R.drawable.bg_alerol_spritz, listOf("Wine", "Classic", "Sparkling", "Light"))
    )

}