package com.mivas.thecocktailmenu

import android.content.Context
import android.support.v17.leanback.widget.ImageCardView
import android.support.v17.leanback.widget.Presenter
import android.support.v4.content.ContextCompat
import android.view.ViewGroup
import com.mivas.thecocktailmenu.model.Cocktail

class CocktailPresenter : Presenter() {

    private lateinit var context: Context
    companion object {
        private const val CARD_WIDTH = 300
        private const val CARD_HEIGHT = 540
    }

    override fun onCreateViewHolder(parent: ViewGroup): Presenter.ViewHolder {
        context = parent.context
        val cardView = object : ImageCardView(parent.context) {
            override fun setSelected(selected: Boolean) {
                updateCardBackgroundColor(this, selected)
                super.setSelected(selected)
            }
        }

        cardView.isFocusable = true
        cardView.isFocusableInTouchMode = true
        updateCardBackgroundColor(cardView, false)
        return Presenter.ViewHolder(cardView)
    }

    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder, item: Any) {
        val cocktail = item as Cocktail
        val cardView = viewHolder.view as ImageCardView

        cardView.titleText = cocktail.name
        cardView.contentText = cocktail.ingredients
        cardView.setMainImageDimensions(CARD_WIDTH, CARD_HEIGHT)
        cardView.mainImageView.setImageResource(cocktail.image)
    }

    private fun updateCardBackgroundColor(view: ImageCardView, selected: Boolean) {
        val color = ContextCompat.getColor(context, if (selected) R.color.selected_background else R.color.default_background)
        view.setBackgroundColor(color)
        view.setInfoAreaBackgroundColor(color)
    }

    override fun onUnbindViewHolder(viewHolder: Presenter.ViewHolder) {
        val cardView = viewHolder.view as ImageCardView
        cardView.badgeImage = null
        cardView.mainImage = null
    }

}