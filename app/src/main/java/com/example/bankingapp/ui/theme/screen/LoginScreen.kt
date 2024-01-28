package com.example.bankingapp.ui.theme.screen

import androidx.compose.foundation.Image
import com.example.bankingapp.Authentication.AuthViewModel
import com.example.bankingapp.Navigation.ROUTE_REGISTER
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.bankingapp.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {

    var email by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue())}
    var context= LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(text = "Login Here",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )

        Image(painter = painterResource(id = R.drawable.faith), contentDescription = "Faith Pic" )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            label= { Text(text = "Enter Email") },
            onValueChange = { email = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = password, label = { Text(text = "Password") },
            onValueChange = {
                password = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            val myLogin = AuthViewModel(navController, context)
            myLogin.login(email.text.trim(), password.text.trim())
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.width(300.dp)){
            Text(text = "Login",
                fontSize = 28.sp,
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .width(300.dp)
                .height(30.dp)) {
            Text(text = " Don't have an account? Click to Register",
                fontSize = 10.sp,
                color= Color.DarkGray)
        }
    }
}

@Preview
@Composable
fun LoginScreenprev() {

    LoginScreen(rememberNavController())

}