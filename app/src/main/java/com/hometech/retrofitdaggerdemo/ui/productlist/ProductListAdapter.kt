package com.hometech.retrofitdaggerdemo.ui.productlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.hometech.retrofitdaggerdemo.databinding.ProductItemBinding
import com.hometech.retrofitdaggerdemo.retrofit.ProductAPI
import com.hometech.retrofitdaggerdemo.retrofit.model.Product

class ProductListAdapter(private val productList: List<Product>, private val context: Context) :
    RecyclerView.Adapter<ProductListAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
        ProductItemBinding.inflate(LayoutInflater.from(context), parent, false).root
    )

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val product:Product = productList[position]
        ProductItemBinding.bind(holder.itemView).apply {
            productTextView.text = product.title
            relativeLayout.setOnClickListener {

                Toast.makeText(context, "Click $position - ${product.title}", Toast.LENGTH_SHORT).show()

            }
        }

    }

    override fun getItemCount(): Int {
        return productList.size
    }


    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)


}