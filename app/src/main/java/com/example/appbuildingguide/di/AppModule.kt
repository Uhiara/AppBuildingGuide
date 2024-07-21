package com.example.appbuildingguide.di

import com.example.appbuildingguide.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }
}