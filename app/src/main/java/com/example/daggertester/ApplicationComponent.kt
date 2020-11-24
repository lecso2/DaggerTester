package com.example.daggertester

import com.example.daggertester.main.MainComponent
import com.example.daggertester.main.MainModule
import com.example.daggertester.second.SecondComponent
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MainModule::class])
@Singleton
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(): ApplicationComponent
    }

    fun mainComponent(): MainComponent
    fun secondComponent(): SecondComponent
}