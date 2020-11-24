package com.example.daggertester.main

import com.example.daggertester.AppScope
import com.example.daggertester.resource.Resource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainModule {

    @Provides
    @AppScope
    fun provideResource() = Resource()
}