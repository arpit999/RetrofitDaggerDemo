package com.hometech.retrofitdaggerdemo.di

import com.hometech.retrofitdaggerdemo.ui.productlist.ProductFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(productFragment: ProductFragment)
}