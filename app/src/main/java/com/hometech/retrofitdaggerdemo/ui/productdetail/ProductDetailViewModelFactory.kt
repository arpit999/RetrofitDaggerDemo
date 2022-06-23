package com.hometech.retrofitdaggerdemo.ui.productdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hometech.retrofitdaggerdemo.repository.ProductRepository
import javax.inject.Inject

class ProductDetailViewModelFactory @Inject constructor(private val productRepository: ProductRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductDetailViewModel(productRepository) as T
    }
}