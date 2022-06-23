package com.hometech.retrofitdaggerdemo.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hometech.retrofitdaggerdemo.retrofit.ProductAPI
import com.hometech.retrofitdaggerdemo.retrofit.model.Product
import javax.inject.Inject

class ProductRepository @Inject constructor(private val productAPI: ProductAPI) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProductList() {
        val result = productAPI.getProductList()
        if (result.isSuccessful && result != null) {
            _products.postValue(result.body())
        }
    }

}