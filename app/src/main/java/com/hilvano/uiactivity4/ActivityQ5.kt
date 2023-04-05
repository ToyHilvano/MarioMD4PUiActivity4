package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityQ5Binding

class ActivityQ5 : AppCompatActivity() {

    private lateinit var binding: ActivityQ5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQ5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupProceedButtonQ5()

    }
    private fun setupProceedButtonQ5() {
        binding.proceedBtn.setOnClickListener {
            val intent = Intent(this, ActivityResults::class.java)
            startActivity(intent)
        }
    }
}