package com.example.movies_show_booking_system

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.NotificationCompat


class RateUsFragment : Fragment() {

    private lateinit var ratingBar1: RatingBar
    private lateinit var ratingBar2: RatingBar
    private lateinit var ratingBar3: RatingBar

    private lateinit var submitButton: Button

    private lateinit var sharedPreferences: SharedPreferences

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_rate_us, container, false)

        ratingBar1 = view.findViewById(R.id.ratingBar1)
        ratingBar2 = view.findViewById(R.id.ratingBar2)
        ratingBar3 = view.findViewById(R.id.ratingBar3)
        submitButton = view.findViewById(R.id.submit_button)

        // Get the SharedPreferences instance
        sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        submitButton.setOnClickListener {
            val rating1 = ratingBar1.rating
            val rating2 = ratingBar2.rating
            val rating3 = ratingBar3.rating

            // Do something with the rating value
            val overall=String.format("%.1f", (rating1+rating2+rating3)/3)
            sharedPreferences.edit().putFloat("rating_value", overall.toFloat()).apply()
            Toast.makeText(activity, "Rating: ${overall.toDouble()}", Toast.LENGTH_SHORT).show()
            onRatingbarSubmitButtonClick(overall.toDouble())
        }

        return view
    }

    fun onRatingbarSubmitButtonClick(rating:Double) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Thank You For Rating Us")
        builder.setMessage("Wishing you a wonderful day filled with joy, laughter, and all the good things that make life worth living. ")
        builder.setIcon(R.drawable.ic_info)


        builder.setPositiveButton("Ok") { dialogInterface, which ->
            // Show notification
            context?.let {
                val notificationManager = it.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                val channelId = "my_channel_id"
                val notificationBuilder = NotificationCompat.Builder(it, channelId)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentTitle("Rated Us")
                    .setContentText("You have successfully rated us "+ rating)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    val channel = NotificationChannel(
                        channelId,
                        "My Channel",
                        NotificationManager.IMPORTANCE_DEFAULT
                    )
                    notificationManager.createNotificationChannel(channel)
                }

                notificationManager.notify(1, notificationBuilder.build())
            }
        }

//        builder.setNegativeButton("No") { dialogInterface, which ->
//            Toast.makeText(context, "clicked No", Toast.LENGTH_LONG).show()
//        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()

    }
}