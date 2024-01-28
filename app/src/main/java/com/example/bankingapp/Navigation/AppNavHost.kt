package com.example.bankingapp.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bankingapp.ui.theme.screen.HomeScreen
import com.example.bankingapp.ui.theme.screen.LoginScreen
import com.example.bankingapp.ui.theme.screen.RegisterScreen
import com.example.bankingapp.ui.theme.screen.core.Card.CardsSection
import com.example.bankingapp.ui.theme.screen.core.Currency.CurrenciesSection
import com.example.bankingapp.ui.theme.screen.core.Finance.FinanceSection
import com.example.bankingapp.ui.theme.screen.core.Wallet.WalletSection

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_LOGIN)
{

    NavHost(navController=navController,
        modifier = modifier,
        startDestination = startDestination)
    {

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_CARD) {
            CardsSection(navController)
        }

        composable(ROUTE_CURRENCY) {
            CurrenciesSection(navController)
        }
        composable(ROUTE_FINANCE) {
            FinanceSection(navController)
        }

        composable(ROUTE_WALLET) {
            WalletSection(navController)
        }

    }}
