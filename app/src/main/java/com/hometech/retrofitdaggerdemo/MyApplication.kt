package com.hometech.retrofitdaggerdemo

import android.app.Application
import com.hometech.retrofitdaggerdemo.di.ApplicationComponent

class MyApplication:Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

//        applicationComponent =

    }
}