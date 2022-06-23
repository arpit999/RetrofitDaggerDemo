package com.hometech.retrofitdaggerdemo.ui.productlist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hometech.retrofitdaggerdemo.MyApplication
import com.hometech.retrofitdaggerdemo.databinding.FragmentProductBinding
import com.hometech.retrofitdaggerdemo.retrofit.model.Product
import javax.inject.Inject

class ProductFragment : Fragment() {


    private lateinit var productViewModel: ProductViewModel

    @Inject
    lateinit var factory: ProductViewModelFactory

    private lateinit var binding: FragmentProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity().application as MyApplication).applicationComponent.inject(this)
        productViewModel = ViewModelProvider(this, factory)[ProductViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        productViewModel.productLiveData.observe(requireActivity()) {
            Log.d("ProductList", "onViewCreated: $it")
            val adapter = ProductListAdapter(it, requireActivity())
            binding.productRecyclerView.layoutManager = LinearLayoutManager(requireActivity())
            binding.productRecyclerView.adapter = adapter

        }

    }


}