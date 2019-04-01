package com.mivas.thecocktailmenu

import java.util.Timer
import java.util.TimerTask

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.support.v17.leanback.app.BackgroundManager
import android.support.v17.leanback.app.BrowseFragment
import android.support.v17.leanback.widget.ArrayObjectAdapter
import android.support.v17.leanback.widget.HeaderItem
import android.support.v17.leanback.widget.ListRow
import android.support.v17.leanback.widget.ListRowPresenter
import android.support.v17.leanback.widget.OnItemViewSelectedListener
import android.support.v17.leanback.widget.Presenter
import android.support.v17.leanback.widget.Row
import android.support.v17.leanback.widget.RowPresenter
import android.support.v4.content.ContextCompat
import android.util.DisplayMetrics
import com.mivas.thecocktailmenu.model.Cocktail
import com.mivas.thecocktailmenu.util.CocktailProvider

class MainFragment : BrowseFragment() {

    private val handler = Handler()
    private lateinit var backgroundManager: BackgroundManager
    private var defaultBackground: Drawable? = null
    private lateinit var metrics: DisplayMetrics
    private var backgroundTimer: Timer? = null
    private var backgroundRes: Int? = null

    companion object {
        private const val BACKGROUND_UPDATE_DELAY = 200
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        prepareBackgroundManager()
        setupUIElements()
        loadRows()
        setupEventListeners()
    }

    private fun prepareBackgroundManager() {

        backgroundManager = BackgroundManager.getInstance(activity)
        backgroundManager.attach(activity.window)
        defaultBackground = ContextCompat.getDrawable(activity, R.drawable.default_background)
        metrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(metrics)
    }

    private fun setupUIElements() {
        title = getString(R.string.app_name)
        headersState = BrowseFragment.HEADERS_ENABLED
        isHeadersTransitionOnBackEnabled = true
        brandColor = ContextCompat.getColor(activity, R.color.fastlane_background)
        searchAffordanceColor = ContextCompat.getColor(activity, R.color.search_opaque)
    }

    private fun loadRows() {
        val tags = listOf(
            "All",
            "",
            "Nonalcoholic",
            "Weak",
            "Light",
            "Medium",
            "Strong",
            "Extremely Strong",
            "",
            "Sparkling",
            "Classic",
            "Creamy",
            "Frozen",
            "Hot",
            "Longdrink",
            "Martini",
            "Shooter",
            "Short",
            "Smoothie",
            "Tropical",
            "",
            "Wine",
            "Tequila",
            "Rum",
            "Gin",
            "Champagne",
            "Liqueur",
            "Vodka",
            "Whiskey",
            "Brandy",
            "Beer"
        )
        val cocktails = CocktailProvider.cocktails
        val rowsAdapter = ArrayObjectAdapter(ListRowPresenter())
        val presenter = CocktailPresenter()

        for (i in 0 until tags.size) {
            val tag = tags[i]
            val header = HeaderItem(i.toLong(), tag)
            val listRowAdapter = ArrayObjectAdapter(presenter)
            if (tag.isNotEmpty()) {
                if (tag == "All") {
                    cocktails.sortedBy { it.name }.forEach { listRowAdapter.add(it) }
                }
                cocktails.filter { it.tags.contains(tag) }.sortedBy { it.name }.forEach { listRowAdapter.add(it) }
            }
            rowsAdapter.add(ListRow(header, listRowAdapter))
        }
        adapter = rowsAdapter
    }

    private fun setupEventListeners() {
        onItemViewSelectedListener = ItemViewSelectedListener()
    }

    private inner class ItemViewSelectedListener : OnItemViewSelectedListener {
        override fun onItemSelected(
            itemViewHolder: Presenter.ViewHolder?,
            item: Any?,
            rowViewHolder: RowPresenter.ViewHolder,
            row: Row
        ) {
            if (item is Cocktail) {
                backgroundRes = item.background
                startBackgroundTimer()
            }
        }
    }

    private fun updateBackground(res: Int) {
        backgroundManager.drawable = resources.getDrawable(res)
        backgroundTimer?.cancel()
    }

    private fun startBackgroundTimer() {
        backgroundTimer?.cancel()
        backgroundTimer = Timer()
        backgroundTimer?.schedule(UpdateBackgroundTask(), BACKGROUND_UPDATE_DELAY.toLong())
    }

    private inner class UpdateBackgroundTask : TimerTask() {

        override fun run() {
            handler.post { updateBackground(backgroundRes!!) }
        }
    }

    override fun onDestroy() {
        backgroundTimer?.cancel()
        super.onDestroy()
    }
}
