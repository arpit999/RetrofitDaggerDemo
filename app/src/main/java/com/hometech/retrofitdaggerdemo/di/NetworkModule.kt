package com.hometech.retrofitdaggerdemo.di

import com.hometech.retrofitdaggerdemo.retrofit.ProductAPI
import com.hometech.retrofitdaggerdemo.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Provides
    fun provideProductAPI(retrofit: Retrofit): ProductAPI {
        return retrofit.create(ProductAPI::class.java)
    }

}