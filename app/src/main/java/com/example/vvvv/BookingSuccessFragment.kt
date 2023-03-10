package com.example.vvvv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.vvvv.databinding.FragBookingSuccessBinding

class BookingSuccessFragment : Fragment(){
    private lateinit var binding: FragBookingSuccessBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragBookingSuccessBinding.inflate(inflater, container, false)
        return binding.root
    }
}