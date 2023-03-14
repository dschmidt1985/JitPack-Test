package eu.danielschmidt.jitpacktest

import androidx.compose.runtime.Composable
import eu.danielschmidt.jitpacktest.home.HomeScreen
import eu.danielschmidt.jitpacktest.login.LoginScreen

@Composable
fun ApplicationSwitcher() {
    val vm = UserState.current
    if (vm.isLoggedIn) {
        HomeScreen()
    } else {
        LoginScreen()
    }
}