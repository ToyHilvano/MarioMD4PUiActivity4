package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityQ4Binding

class ActivityQ4 : AppCompatActivity() {

    private lateinit var binding: ActivityQ4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQ4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupProceedButtonQ4()

    }
    private fun setupProceedButtonQ4() {
        binding.proceedBtn.setOnClickListener {
            val intent = Intent(this, ActivityQ5::class.java)
            startActivity(intent)
        }
    }
}