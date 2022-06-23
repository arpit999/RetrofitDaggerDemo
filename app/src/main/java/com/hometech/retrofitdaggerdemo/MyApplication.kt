package com.hometech.retrofitdaggerdemo

import android.app.Application
import com.hometech.retrofitdaggerdemo.di.ApplicationComponent
import com.hometech.retrofitdaggerdemo.di.DaggerApplicationComponent

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()

    }
}