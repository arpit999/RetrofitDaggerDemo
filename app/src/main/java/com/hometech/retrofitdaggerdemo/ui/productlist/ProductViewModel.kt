package com.hometech.retrofitdaggerdemo.ui.productlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hometech.retrofitdaggerdemo.repository.ProductRepository
import com.hometech.retrofitdaggerdemo.retrofit.model.Product
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductViewModel @Inject constructor(private val productRepository: ProductRepository) :
    ViewModel() {

    val productLiveData: LiveData<List<Product>>
        get() = productRepository.products


    init {
        viewModelScope.launch {
            productRepository.getProductList()
        }

    }

}