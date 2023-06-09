package eu.danielschmidt.jitpacktest

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.delay

class UserStateViewModel : ViewModel() {

    var isLoggedIn by mutableStateOf(false)
    var isBusy by mutableStateOf(false)

    suspend fun signIn(email: String, password: String) {
        isBusy = true
        delay(1000)
        isLoggedIn = true
        isBusy = false
    }

    suspend fun signOut() {
        isBusy = true
        delay(1000)
        isLoggedIn = false
        isBusy = false
    }
}

val UserState = compositionLocalOf<UserStateViewModel> { error("User State Context Not Found!") }
