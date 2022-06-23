package com.hometech.retrofitdaggerdemo.retrofit

import com.hometech.retrofitdaggerdemo.retrofit.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductAPI {

    @GET("products")
    suspend fun getProductList(): Response<List<Product>>

}