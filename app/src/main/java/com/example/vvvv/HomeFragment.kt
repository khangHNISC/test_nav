package com.example.vvvv

import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkBuilder
import com.example.vvvv.databinding.FragHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.createANotification.setOnClickListener {
            val id = (0..1000).random()

            val pendingIntent = NavDeepLinkBuilder(requireContext())
                .setGraph(R.navigation.booking_nav_graph)
                .setDestination(R.id.bookingSuccessFragment)
                .setComponentName(BookingActivity::class.java)
                .createPendingIntent()

            val channelId = "fcm_default_channel"
            val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val notificationBuilder = NotificationCompat.Builder(requireContext(), channelId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText("hello$id")
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent)

            val notificationManager =
                requireActivity().getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            notificationManager.notify(
                id,
                notificationBuilder.build()
            )
        }

        binding.next.setOnClickListener {
            startActivity(Intent(requireContext(), BookingActivity::class.java))
        }
    }
}