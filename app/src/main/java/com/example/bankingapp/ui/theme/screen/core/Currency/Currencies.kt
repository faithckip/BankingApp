package com.example.bankingapp.ui.theme.screen.core.Currency

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyBitcoin
import androidx.compose.material.icons.rounded.CurrencyRupee
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro

val Currencies = listOf(
    Currency(
        name ="USD",
        buy = 153.35f,
        sell = 123.47f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name ="EUR",
        buy = 188.35f,
        sell = 183.47f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name ="YEN",
        buy = 73.35f,
        sell = 83.47f,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name ="Bit Coin",
        buy = 253.35f,
        sell = 223.47f,
        icon = Icons.Rounded.CurrencyBitcoin
    ),
    Currency(
        name ="INDIAN RUPEE",
        buy = 13.35f,
        sell = 12.47f,
        icon = Icons.Rounded.CurrencyRupee
    ),
)