package com.example.appbuildingguide.navgraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appbuildingguide.MainViewModel
import com.example.appbuildingguide.ui.HomeScreen
import com.example.appbuildingguide.ui.onboarding.OnBoardingScreen
import com.example.appbuildingguide.ui.onboarding.SplashScreen
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun NavGraph(mainViewModel: MainViewModel = hiltViewModel()) {
    val navController = rememberNavController()

    // Collect the state from the ViewModel
    val isOnboardingComplete = mainViewModel.isOnboardingComplete.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = if (isOnboardingComplete) "home" else "splash"
    ) {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("onboarding") {
            OnBoardingScreen(navController = navController, mainViewModel = mainViewModel)
        }
        composable("home") {
            HomeScreen()
        }
    }
}