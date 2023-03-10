package com.example.vvvv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vvvv.databinding.ActivityBookingBinding

class BookingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}