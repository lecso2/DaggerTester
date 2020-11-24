package com.example.daggertester.resource

import dagger.Subcomponent

@Subcomponent(modules = [ResourceModule::class])
interface ResourceComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ResourceComponent
    }

}