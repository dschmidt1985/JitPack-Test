package eu.danielschmidt.jitpacktest.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import eu.danielschmidt.jitpacktest.banking.BankingHome
import eu.danielschmidt.jitpacktest.investing.InvestingHome


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Banking.route) {
        composable(Screen.Banking.route) {
            BankingHome()
        }
        composable(Screen.Investing.route) {
            InvestingHome()
        }
    }
}
