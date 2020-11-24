package com.example.daggertester.second

import com.example.daggertester.resource.ResourceModule
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent(modules = [ResourceModule::class])
@Singleton
interface SecondComponent {

    fun inject(activity: SecondActivity)

}