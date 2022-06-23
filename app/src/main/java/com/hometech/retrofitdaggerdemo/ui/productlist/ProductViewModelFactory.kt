package com.hometech.retrofitdaggerdemo.ui.productlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hometech.retrofitdaggerdemo.repository.ProductRepository
import javax.inject.Inject

class ProductViewModelFactory @Inject constructor(private val productRepository: ProductRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductViewModel(productRepository) as T
    }

}