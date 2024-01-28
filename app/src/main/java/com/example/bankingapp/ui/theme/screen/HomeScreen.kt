package com.example.bankingapp.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.bankingapp.Navigation.ROUTE_CARD
import com.example.bankingapp.Navigation.ROUTE_CURRENCY
import com.example.bankingapp.Navigation.ROUTE_FINANCE
import com.example.bankingapp.Navigation.ROUTE_LOGIN
import com.example.bankingapp.Navigation.ROUTE_REGISTER
import com.example.bankingapp.Navigation.ROUTE_WALLET
import com.example.bankingapp.data.BottomNavigationBar
import com.example.bankingapp.ui.theme.screen.core.Card.CardsSection
import com.example.bankingapp.ui.theme.screen.core.Currency.CurrenciesSection
import com.example.bankingapp.ui.theme.screen.core.Finance.FinanceSection
import com.example.bankingapp.ui.theme.screen.core.Wallet.WalletSection

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold (
        bottomBar = {
            BottomNavigationBar()
        }
    ){ padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ){
            WalletSection(rememberNavController())
            CardsSection(rememberNavController())
            Spacer(modifier = Modifier.height(5.dp))
            FinanceSection(rememberNavController())
            CurrenciesSection(rememberNavController())

            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ROUTE_REGISTER) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)

            ) {
                Text(text = "Sign up here",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)

            ) {
                Text(text = "Login here",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ROUTE_CARD) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)

            ) {
                Text(text = "Visa/Master Cards",
                    fontSize = 36.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ROUTE_CURRENCY) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)

            )
            {
                Text(text = "Exchange Rate",
                    fontSize = 36.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ROUTE_FINANCE) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)

            ) {
                Text(text = "Finances",
                    fontSize = 36.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ROUTE_WALLET) },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Blue)

            ) {
                Text(text = "Wallet",
                    fontSize = 36.sp,
                    fontFamily = FontFamily.SansSerif,
                )
            }

        }


    }

}

@Preview
@Composable
fun Homepreview() {
    HomeScreen(rememberNavController())

}