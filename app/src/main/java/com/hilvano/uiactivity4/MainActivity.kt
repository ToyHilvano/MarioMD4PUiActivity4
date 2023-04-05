package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupExitButton()
        setupProceedButton()

    }

    private fun setupExitButton() {
        binding.exitBtn.setOnClickListener {
            val intent = Intent(this, ActivityThankYou::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun setupProceedButton() {
        binding.proceedBtn.setOnClickListener {
            val intent = Intent(this, ActivityQ1::class.java)
            startActivity(intent)
        }
    }

}