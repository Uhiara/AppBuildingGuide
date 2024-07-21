package com.example.appbuildingguide

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appbuildingguide.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val userRepository: UserRepository) : ViewModel() {
    val isOnboardingComplete: StateFlow<Boolean> = userRepository.isOnboardingComplete

    fun completeOnboarding() {
        viewModelScope.launch {
            userRepository.completeOnboarding()
        }
    }
}