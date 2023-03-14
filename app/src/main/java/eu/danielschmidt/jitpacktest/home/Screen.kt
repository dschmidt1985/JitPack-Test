package eu.danielschmidt.jitpacktest.home

import androidx.annotation.StringRes
import eu.danielschmidt.jitpacktest.R


sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Banking: Screen("banking", R.string.banking)
    object Investing: Screen("investing", R.string.investing)
}
