package com.example.colorpicker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.colorpicker.databinding.ActivityMainBinding
import com.example.colorpicker.fragments.HomeFragment
import com.example.colorpicker.models.MyData

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.my_conteiner, HomeFragment())
            .commit()
    }
}