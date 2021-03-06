package com.hometech.retrofitdaggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hometech.retrofitdaggerdemo.databinding.ActivityMainBinding
import com.hometech.retrofitdaggerdemo.ui.productlist.ProductFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, ProductFragment()).commitNow()
        }

    }
}