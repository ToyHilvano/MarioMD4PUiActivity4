package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityQ2Binding

class ActivityQ2 : AppCompatActivity() {

    private lateinit var binding: ActivityQ2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQ2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupProceedButtonQ2()
    }
    private fun setupProceedButtonQ2() {
        binding.proceedBtn.setOnClickListener {
            val intent = Intent(this, ActivityQ3::class.java)
            startActivity(intent)
        }
    }
}