package com.hometech.retrofitdaggerdemo.ui.productlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hometech.retrofitdaggerdemo.databinding.FragmentProductBinding

class ProductFragment : Fragment() {

    private lateinit var viewModel: ProductViewModel

    private lateinit var binding: FragmentProductBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

}