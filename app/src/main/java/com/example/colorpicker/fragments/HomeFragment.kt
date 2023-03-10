package com.example.colorpicker.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.colorpicker.R
import com.example.colorpicker.databinding.ActivityMainBinding
import com.example.colorpicker.databinding.FragmentHomeBinding
import com.example.colorpicker.models.MyData

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.btnNext.setOnClickListener {
            val blankFragment = BlankFragment()
            val fragManager = parentFragmentManager

            fragManager.beginTransaction()
                .replace(R.id.my_conteiner, blankFragment)
                .addToBackStack(blankFragment.toString())
                .commit()
        }
        return binding.root
    }
    override fun onResume() {
        super.onResume()
            binding.root.setBackgroundColor(Color.parseColor("${MyData.color}"))
    }
}