package com.example.appbuildingguide.ui.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appbuildingguide.MainViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController, mainViewModel: MainViewModel = viewModel()) {
    LaunchedEffect(key1 = true) {
        delay(3000) // Simulate loading time
        navController.navigate("onboarding") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Splash Screen",
            color = Color.Black,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}