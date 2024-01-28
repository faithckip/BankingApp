package com.example.bankingapp.ui.theme.screen.core.Card

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.bankingapp.ui.theme.BlueEnd
import com.example.bankingapp.ui.theme.BlueStart
import com.example.bankingapp.ui.theme.GreenEnd
import com.example.bankingapp.ui.theme.GreenStart
import com.example.bankingapp.ui.theme.OrangeEnd
import com.example.bankingapp.ui.theme.OrangeStart
import com.example.bankingapp.ui.theme.PurpleEnd
import com.example.bankingapp.ui.theme.PurpleStart


val cards = listOf(
    Card(
        cardType = "VISA",
        cardNumber = "3664 5674 3456 3748",
        cardName = "Business",
        balance = 4657.90,
        color = getGradient(PurpleStart, PurpleEnd),
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "7644 0674 3456 9948",
        cardName = "Savings",
        balance = 97657.90,
        color = getGradient(BlueStart, BlueEnd),
    ),
    Card(
        cardType = "VISA",
        cardNumber = "3564 5674 0000 3748",
        cardName = "School",
        balance = 2317.90,
        color = getGradient(OrangeStart, OrangeEnd),
    ),
    Card(
        cardType = "MASTER CARD ",
        cardNumber = "9764 5674 3456 3740",
        cardName = "Trips",
        balance = 44557.90,
        color = getGradient(GreenStart, GreenEnd),
    ),

)

fun getGradient(
    startColor: Color,
    endColor: Color,
): Brush{
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}