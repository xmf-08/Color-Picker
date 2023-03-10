package com.example.colorpicker.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.colorpicker.R
import com.example.colorpicker.databinding.FragmentBlankBinding
import com.example.colorpicker.databinding.FragmentHomeBinding
import com.example.colorpicker.models.MyData

class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)

        binding.kokRang.setOnClickListener{
            MyData.color = "#2196F3"
        }
        binding.pushtiRang.setOnClickListener{
            MyData.color = "#E91E63"
        }
        return binding.root
    }
}