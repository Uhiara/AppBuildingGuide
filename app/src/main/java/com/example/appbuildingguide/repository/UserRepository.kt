package com.example.appbuildingguide.repository

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserRepository {
    private val _isOnboardingComplete = MutableStateFlow(false)
    val isOnboardingComplete: StateFlow<Boolean> = _isOnboardingComplete

    fun completeOnboarding() {
        _isOnboardingComplete.value = true
    }
}