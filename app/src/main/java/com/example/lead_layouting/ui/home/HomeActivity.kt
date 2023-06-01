package com.example.lead_layouting.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private  var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}