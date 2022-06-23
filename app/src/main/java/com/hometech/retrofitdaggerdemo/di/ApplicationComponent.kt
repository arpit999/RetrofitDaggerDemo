package com.hometech.retrofitdaggerdemo.di

import com.hometech.retrofitdaggerdemo.ui.productlist.ProductFragment
import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(productFragment: ProductFragment)
}