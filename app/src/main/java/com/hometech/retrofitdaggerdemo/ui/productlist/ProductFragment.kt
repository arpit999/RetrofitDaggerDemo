package com.hometech.retrofitdaggerdemo.ui.productlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hometech.retrofitdaggerdemo.R

class ProductFragment : Fragment() {

    private lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

}