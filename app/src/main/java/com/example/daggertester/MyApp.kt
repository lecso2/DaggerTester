package com.example.daggertester

import android.app.Application

class MyApp :Application() {

    val appComponent: ApplicationComponent = DaggerApplicationComponent.factory().create()
}