package com.example.daggertester.main

import com.example.daggertester.resource.ResourceModule
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent(modules = [ResourceModule::class])
@Singleton
interface MainComponent {

    fun inject(activity: MainActivity)
}


//    @Subcomponent.Factory
//    interface Factory {
//        fun create(): MainComponent
//    }
