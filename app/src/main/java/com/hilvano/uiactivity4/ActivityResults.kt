package com.hilvano.uiactivity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uiactivity4.databinding.ActivityResultsBinding

class ActivityResults : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupExitButton()
        setupBackToMainButton()

    }
    private fun setupExitButton() {
        binding.exitBtn.setOnClickListener {
            val intent = Intent(this, ActivityThankYou::class.java)
            startActivity(intent)
        }
    }
    private fun setupBackToMainButton() {
        binding.mainMenuBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}