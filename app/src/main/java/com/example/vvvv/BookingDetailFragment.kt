package com.example.vvvv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.vvvv.databinding.FragBookingDetailBinding

class BookingDetailFragment : Fragment() {
    private lateinit var binding: FragBookingDetailBinding
    private val args: BookingDetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragBookingDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = args.bookingId
        binding.next.setOnClickListener {
            findNavController().navigate(R.id.action_bookingDetailFragment_to_bookingSuccessFragment)
        }
        binding.bookingDetailText.text = "Booking ID: $id"
    }
}