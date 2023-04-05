package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityQ3Binding

class ActivityQ3 : AppCompatActivity() {

    private lateinit var binding: ActivityQ3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQ3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupProceedButtonQ3()

    }
    private fun setupProceedButtonQ3() {
        binding.proceedBtn.setOnClickListener {
            val intent = Intent(this, ActivityQ4::class.java)
            startActivity(intent)
        }
    }
}