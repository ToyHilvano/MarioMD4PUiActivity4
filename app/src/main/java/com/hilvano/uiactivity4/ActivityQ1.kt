package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityQ1Binding

class ActivityQ1 : AppCompatActivity() {

    private lateinit var binding: ActivityQ1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQ1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupProceedButtonQ1()

    }
    private fun setupProceedButtonQ1() {
        binding.proceedBtn.setOnClickListener {
            val intent = Intent(this, ActivityQ2::class.java)
            startActivity(intent)
        }
    }
}