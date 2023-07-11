package com.example.movies_show_booking_system

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.NotificationCompat


class PlatinumSeatBookingFragment : Fragment() {

    lateinit var seatInfoTextViews: Array<TextView>

    lateinit var movieImageView1: ImageView
    lateinit var movieImageView2: ImageView
    lateinit var movieImageView3: ImageView
    lateinit var movieImageView4: ImageView
    lateinit var movieImageView5: ImageView
    lateinit var movieImageView6: ImageView
    lateinit var movieImageView7: ImageView
    lateinit var movieImageView8: ImageView
    lateinit var movieImageView9: ImageView
    lateinit var movieImageView10: ImageView
    lateinit var movieImageView11: ImageView
    lateinit var movieImageView12: ImageView
    lateinit var movieImageView13: ImageView
    lateinit var movieImageView14: ImageView
    lateinit var movieImageView15: ImageView
    lateinit var movieImageView16: ImageView
    lateinit var movieImageView17: ImageView
    lateinit var movieImageView18: ImageView
    lateinit var movieImageView19: ImageView
    lateinit var movieImageView20: ImageView
    lateinit var movieImageView21: ImageView
    lateinit var movieImageView22: ImageView
    lateinit var movieImageView23: ImageView
    lateinit var movieImageView24: ImageView
    lateinit var movieImageView25: ImageView
    lateinit var movieImageView26: ImageView
    lateinit var movieImageView27: ImageView

    lateinit var movieImageView28: ImageView
    lateinit var movieImageView29: ImageView
    lateinit var movieImageView30: ImageView
    lateinit var movieImageView31: ImageView
    lateinit var movieImageView32: ImageView
    lateinit var movieImageView33: ImageView
    lateinit var movieImageView34: ImageView
    lateinit var movieImageView35: ImageView
    lateinit var movieImageView36: ImageView
    lateinit var movieImageView37: ImageView
    lateinit var movieImageView38: ImageView
    lateinit var movieImageView39: ImageView
    lateinit var movieImageView40: ImageView
    lateinit var movieImageView41: ImageView
    lateinit var movieImageView42: ImageView
    lateinit var movieImageView43: ImageView
    lateinit var movieImageView44: ImageView
    lateinit var movieImageView45: ImageView
    lateinit var movieImageView46: ImageView
    lateinit var movieImageView47: ImageView
    lateinit var movieImageView48: ImageView
    lateinit var movieImageView49: ImageView
    lateinit var movieImageView50: ImageView

    lateinit var movieImageView51: ImageView
    lateinit var movieImageView52: ImageView
    lateinit var movieImageView53: ImageView
    lateinit var movieImageView54: ImageView
    lateinit var movieImageView55: ImageView
    lateinit var movieImageView56: ImageView
    lateinit var movieImageView57: ImageView
    lateinit var movieImageView58: ImageView
    lateinit var movieImageView59: ImageView
    lateinit var movieImageView60: ImageView
    lateinit var movieImageView61: ImageView

    lateinit var movieImageView62: ImageView
    lateinit var movieImageView63: ImageView
    lateinit var movieImageView64: ImageView
    lateinit var movieImageView65: ImageView
    lateinit var movieImageView66: ImageView
    lateinit var movieImageView67: ImageView
    lateinit var movieImageView68: ImageView
    lateinit var movieImageView69: ImageView
    lateinit var movieImageView70: ImageView
    lateinit var movieImageView71: ImageView
    lateinit var movieImageView72: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_platinum_seat_booking, container, false)

        // FOR TAKING THE REFERENCES OF THE IMAGEVIEW OF STARS PRESENT IN THE APP

        movieImageView1 = view.findViewById(R.id.silver_seat_image1)
        movieImageView2 = view.findViewById(R.id.silver_seat_image2)
        movieImageView3 = view.findViewById(R.id.silver_seat_image3)
        movieImageView4 = view.findViewById(R.id.silver_seat_image4)
        movieImageView5 = view.findViewById(R.id.silver_seat_image5)
        movieImageView6 = view.findViewById(R.id.silver_seat_image6)
        movieImageView7 = view.findViewById(R.id.silver_seat_image7)
        movieImageView8 = view.findViewById(R.id.silver_seat_image8)
        movieImageView9 = view.findViewById(R.id.silver_seat_image9)
        movieImageView10 = view.findViewById(R.id.silver_seat_image10)
        movieImageView11 = view.findViewById(R.id.silver_seat_image11)
        movieImageView12 = view.findViewById(R.id.silver_seat_image12)
        movieImageView13 = view.findViewById(R.id.silver_seat_image13)
        movieImageView14 = view.findViewById(R.id.silver_seat_image14)
        movieImageView15 = view.findViewById(R.id.silver_seat_image15)
        movieImageView16 = view.findViewById(R.id.silver_seat_image16)
        movieImageView17 = view.findViewById(R.id.silver_seat_image17)
        movieImageView18 = view.findViewById(R.id.silver_seat_image18)
        movieImageView19 = view.findViewById(R.id.silver_seat_image19)
        movieImageView20 = view.findViewById(R.id.silver_seat_image20)
        movieImageView21 = view.findViewById(R.id.silver_seat_image21)
        movieImageView22 = view.findViewById(R.id.silver_seat_image22)
        movieImageView23 = view.findViewById(R.id.silver_seat_image23)
        movieImageView24 = view.findViewById(R.id.silver_seat_image24)
        movieImageView25 = view.findViewById(R.id.silver_seat_image25)
        movieImageView26 = view.findViewById(R.id.silver_seat_image26)
        movieImageView27 = view.findViewById(R.id.silver_seat_image27)
        movieImageView28 = view.findViewById(R.id.silver_seat_image28)
        movieImageView29 = view.findViewById(R.id.silver_seat_image29)
        movieImageView30 = view.findViewById(R.id.silver_seat_image30)
        movieImageView31 = view.findViewById(R.id.silver_seat_image31)
        movieImageView32 = view.findViewById(R.id.silver_seat_image32)
        movieImageView33 = view.findViewById(R.id.silver_seat_image33)
        movieImageView34 = view.findViewById(R.id.silver_seat_image34)
        movieImageView35 = view.findViewById(R.id.silver_seat_image35)
        movieImageView36 = view.findViewById(R.id.silver_seat_image36)
        movieImageView37 = view.findViewById(R.id.silver_seat_image37)
        movieImageView38 = view.findViewById(R.id.silver_seat_image38)
        movieImageView39 = view.findViewById(R.id.silver_seat_image39)
        movieImageView40 = view.findViewById(R.id.silver_seat_image40)
        movieImageView41 = view.findViewById(R.id.silver_seat_image41)
        movieImageView42 = view.findViewById(R.id.silver_seat_image42)
        movieImageView43 = view.findViewById(R.id.silver_seat_image43)
        movieImageView44 = view.findViewById(R.id.silver_seat_image44)
        movieImageView45 = view.findViewById(R.id.silver_seat_image45)
        movieImageView46 = view.findViewById(R.id.silver_seat_image46)
        movieImageView47 = view.findViewById(R.id.silver_seat_image47)
        movieImageView48 = view.findViewById(R.id.silver_seat_image48)
        movieImageView49 = view.findViewById(R.id.silver_seat_image49)
        movieImageView50 = view.findViewById(R.id.silver_seat_image50)
        movieImageView51 = view.findViewById(R.id.silver_seat_image51)
        movieImageView52 = view.findViewById(R.id.silver_seat_image52)
        movieImageView53 = view.findViewById(R.id.silver_seat_image53)
        movieImageView54 = view.findViewById(R.id.silver_seat_image54)
        movieImageView55 = view.findViewById(R.id.silver_seat_image55)
        movieImageView56= view.findViewById(R.id.silver_seat_image56)
        movieImageView57 = view.findViewById(R.id.silver_seat_image57)
        movieImageView58 = view.findViewById(R.id.silver_seat_image58)
        movieImageView59 = view.findViewById(R.id.silver_seat_image59)
        movieImageView60 = view.findViewById(R.id.silver_seat_image60)
        movieImageView61 = view.findViewById(R.id.silver_seat_image61)
        movieImageView62 = view.findViewById(R.id.silver_seat_image62)
        movieImageView63 = view.findViewById(R.id.silver_seat_image63)
        movieImageView64 = view.findViewById(R.id.silver_seat_image64)
        movieImageView65 = view.findViewById(R.id.silver_seat_image65)
        movieImageView66 = view.findViewById(R.id.silver_seat_image66)
        movieImageView67 = view.findViewById(R.id.silver_seat_image67)
        movieImageView68 = view.findViewById(R.id.silver_seat_image68)
        movieImageView69 = view.findViewById(R.id.silver_seat_image69)
        movieImageView70 = view.findViewById(R.id.silver_seat_image70)
        movieImageView71 = view.findViewById(R.id.silver_seat_image71)
        movieImageView72 = view.findViewById(R.id.silver_seat_image72)

        seatInfoTextViews = arrayOf(

            // FOR MOVIE TIME
            view.findViewById(R.id.movie_time1),
            view.findViewById(R.id.movie_time2),
            view.findViewById(R.id.movie_time3),
            view.findViewById(R.id.movie_time4),
            view.findViewById(R.id.movie_time5),
            view.findViewById(R.id.movie_time6),
            view.findViewById(R.id.movie_time7),
            view.findViewById(R.id.movie_time8),

            view.findViewById(R.id.movie_time9),
            view.findViewById(R.id.movie_time10),
            view.findViewById(R.id.movie_time11),
            view.findViewById(R.id.movie_time12),
            view.findViewById(R.id.movie_time13),
            view.findViewById(R.id.movie_time14),
            view.findViewById(R.id.movie_time15),
            view.findViewById(R.id.movie_time16),

            view.findViewById(R.id.movie_time17),
            view.findViewById(R.id.movie_time18),
            view.findViewById(R.id.movie_time19),
            view.findViewById(R.id.movie_time20),
            view.findViewById(R.id.movie_time21),
            view.findViewById(R.id.movie_time22),
            view.findViewById(R.id.movie_time23),
            view.findViewById(R.id.movie_time24),

            // FOR TICKET PRICE
            view.findViewById(R.id.ticket1_price),
            view.findViewById(R.id.ticket2_price),
            view.findViewById(R.id.ticket3_price),
            view.findViewById(R.id.ticket4_price),
            view.findViewById(R.id.ticket5_price),
            view.findViewById(R.id.ticket6_price),
            view.findViewById(R.id.ticket7_price),
            view.findViewById(R.id.ticket8_price),

            view.findViewById(R.id.ticket9_price),
            view.findViewById(R.id.ticket10_price),
            view.findViewById(R.id.ticket11_price),
            view.findViewById(R.id.ticket12_price),
            view.findViewById(R.id.ticket13_price),
            view.findViewById(R.id.ticket14_price),
            view.findViewById(R.id.ticket15_price),
            view.findViewById(R.id.ticket16_price),

            view.findViewById(R.id.ticket17_price),
            view.findViewById(R.id.ticket18_price),
            view.findViewById(R.id.ticket19_price),
            view.findViewById(R.id.ticket20_price),
            view.findViewById(R.id.ticket21_price),
            view.findViewById(R.id.ticket22_price),
            view.findViewById(R.id.ticket23_price),
            view.findViewById(R.id.ticket24_price),

            // FOR TICKET STATUS
            view.findViewById(R.id.ticket1_status),
            view.findViewById(R.id.ticket2_status),
            view.findViewById(R.id.ticket3_status),
            view.findViewById(R.id.ticket4_status),
            view.findViewById(R.id.ticket5_status),
            view.findViewById(R.id.ticket6_status),
            view.findViewById(R.id.ticket7_status),
            view.findViewById(R.id.ticket8_status),

            view.findViewById(R.id.ticket9_status),
            view.findViewById(R.id.ticket10_status),
            view.findViewById(R.id.ticket11_status),
            view.findViewById(R.id.ticket12_status),
            view.findViewById(R.id.ticket13_status),
            view.findViewById(R.id.ticket14_status),
            view.findViewById(R.id.ticket15_status),
            view.findViewById(R.id.ticket16_status),

            view.findViewById(R.id.ticket17_status),
            view.findViewById(R.id.ticket18_status),
            view.findViewById(R.id.ticket19_status),
            view.findViewById(R.id.ticket20_status),
            view.findViewById(R.id.ticket21_status),
            view.findViewById(R.id.ticket22_status),
            view.findViewById(R.id.ticket23_status),
            view.findViewById(R.id.ticket24_status),

            // FOR SHOW TIME HEADER
            view.findViewById(R.id.show_timing_header1),
            view.findViewById(R.id.show_timing_header2),
            view.findViewById(R.id.show_timing_header3),
        )

        val Ticket1=view.findViewById<RelativeLayout>(R.id.ticket1)
        val Ticket2=view.findViewById<RelativeLayout>(R.id.ticket2)
        val Ticket3=view.findViewById<RelativeLayout>(R.id.ticket3)
        val Ticket4=view.findViewById<RelativeLayout>(R.id.ticket4)
        val Ticket5=view.findViewById<RelativeLayout>(R.id.ticket5)
        val Ticket6=view.findViewById<RelativeLayout>(R.id.ticket6)
        val Ticket7=view.findViewById<RelativeLayout>(R.id.ticket7)
        val Ticket8=view.findViewById<RelativeLayout>(R.id.ticket8)
        val Ticket9=view.findViewById<RelativeLayout>(R.id.ticket9)
        val Ticket10=view.findViewById<RelativeLayout>(R.id.ticket10)
        val Ticket11=view.findViewById<RelativeLayout>(R.id.ticket11)
        val Ticket12=view.findViewById<RelativeLayout>(R.id.ticket12)
        val Ticket13=view.findViewById<RelativeLayout>(R.id.ticket13)
        val Ticket14=view.findViewById<RelativeLayout>(R.id.ticket14)
        val Ticket15=view.findViewById<RelativeLayout>(R.id.ticket15)
        val Ticket16=view.findViewById<RelativeLayout>(R.id.ticket16)
        val Ticket17=view.findViewById<RelativeLayout>(R.id.ticket17)
        val Ticket18=view.findViewById<RelativeLayout>(R.id.ticket18)
        val Ticket19=view.findViewById<RelativeLayout>(R.id.ticket19)
        val Ticket20=view.findViewById<RelativeLayout>(R.id.ticket20)
        val Ticket21=view.findViewById<RelativeLayout>(R.id.ticket21)
        val Ticket22=view.findViewById<RelativeLayout>(R.id.ticket22)
        val Ticket23=view.findViewById<RelativeLayout>(R.id.ticket23)
        val Ticket24=view.findViewById<RelativeLayout>(R.id.ticket24)


        Ticket1.setOnClickListener{
            if (seatInfoTextViews.getOrNull(48)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[48].text = "Booked"
                setMovieBookedImageResource1(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket1)
                seatInfoTextViews[48].text = "Available"
                setMovieBookedImageResource1(R.drawable.silver_seat_icon)
            }
        }

        Ticket2.setOnClickListener{
            if (seatInfoTextViews.getOrNull(49)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[49].text = "Booked"
                setMovieBookedImageResource2(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket2)
                seatInfoTextViews[49].text = "Available"
                setMovieBookedImageResource2(R.drawable.silver_seat_icon)
            }
        }

        Ticket3.setOnClickListener{
            if (seatInfoTextViews.getOrNull(50)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[50].text = "Booked"
                setMovieBookedImageResource3(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket3)
                seatInfoTextViews[50].text = "Available"
                setMovieBookedImageResource3(R.drawable.silver_seat_icon)
            }
        }

        Ticket4.setOnClickListener{
            if (seatInfoTextViews.getOrNull(51)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[51].text = "Booked"
                setMovieBookedImageResource4(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket4)
                seatInfoTextViews[51].text = "Available"
                setMovieBookedImageResource4(R.drawable.silver_seat_icon)
            }
        }

        Ticket5.setOnClickListener{
            if (seatInfoTextViews.getOrNull(52)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[52].text = "Booked"
                setMovieBookedImageResource5(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket5)
                seatInfoTextViews[52].text = "Available"
                setMovieBookedImageResource5(R.drawable.silver_seat_icon)
            }
        }

        Ticket6.setOnClickListener{
            if (seatInfoTextViews.getOrNull(53)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[53].text = "Booked"
                setMovieBookedImageResource6(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket6)
                seatInfoTextViews[53].text = "Available"
                setMovieBookedImageResource6(R.drawable.silver_seat_icon)
            }
        }

        Ticket7.setOnClickListener{
            if (seatInfoTextViews.getOrNull(54)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[54].text = "Booked"
                setMovieBookedImageResource7(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket7)
                seatInfoTextViews[54].text = "Available"
                setMovieBookedImageResource7(R.drawable.silver_seat_icon)
            }
        }

        Ticket8.setOnClickListener{
            if (seatInfoTextViews.getOrNull(55)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[55].text = "Booked"
                setMovieBookedImageResource8(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket8)
                seatInfoTextViews[55].text = "Available"
                setMovieBookedImageResource8(R.drawable.silver_seat_icon)
            }
        }

        Ticket9.setOnClickListener{
            if (seatInfoTextViews.getOrNull(56)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[56].text = "Booked"
                setMovieBookedImageResource9(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket9)
                seatInfoTextViews[56].text = "Available"
                setMovieBookedImageResource9(R.drawable.silver_seat_icon)
            }
        }

        Ticket10.setOnClickListener{
            if (seatInfoTextViews.getOrNull(57)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[57].text = "Booked"
                setMovieBookedImageResource10(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket10)
                seatInfoTextViews[57].text = "Available"
                setMovieBookedImageResource10(R.drawable.silver_seat_icon)
            }
        }

        Ticket11.setOnClickListener{
            if (seatInfoTextViews.getOrNull(58)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[58].text = "Booked"
                setMovieBookedImageResource11(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket11)
                seatInfoTextViews[58].text = "Available"
                setMovieBookedImageResource11(R.drawable.silver_seat_icon)
            }
        }

        Ticket12.setOnClickListener{
            if (seatInfoTextViews.getOrNull(59)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[59].text = "Booked"
                setMovieBookedImageResource12(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket12)
                seatInfoTextViews[59].text = "Available"
                setMovieBookedImageResource12(R.drawable.silver_seat_icon)
            }
        }

        Ticket13.setOnClickListener{
            if (seatInfoTextViews.getOrNull(60)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[60].text = "Booked"
                setMovieBookedImageResource13(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket13)
                seatInfoTextViews[60].text = "Available"
                setMovieBookedImageResource13(R.drawable.silver_seat_icon)
            }
        }

        Ticket14.setOnClickListener{
            if (seatInfoTextViews.getOrNull(61)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[61].text = "Booked"
                setMovieBookedImageResource14(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket14)
                seatInfoTextViews[61].text = "Available"
                setMovieBookedImageResource14(R.drawable.silver_seat_icon)
            }
        }

        Ticket15.setOnClickListener{
            if (seatInfoTextViews.getOrNull(62)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[62].text = "Booked"
                setMovieBookedImageResource15(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket15)
                seatInfoTextViews[62].text = "Available"
                setMovieBookedImageResource15(R.drawable.silver_seat_icon)
            }
        }

        Ticket16.setOnClickListener{
            if (seatInfoTextViews.getOrNull(63)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[63].text = "Booked"
                setMovieBookedImageResource16(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket16)
                seatInfoTextViews[63].text = "Available"
                setMovieBookedImageResource16(R.drawable.silver_seat_icon)
            }
        }
        Ticket17.setOnClickListener{
            if (seatInfoTextViews.getOrNull(64)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[64].text = "Booked"
                setMovieBookedImageResource17(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket17)
                seatInfoTextViews[64].text = "Available"
                setMovieBookedImageResource17(R.drawable.silver_seat_icon)
            }
        }
        Ticket18.setOnClickListener{
            if (seatInfoTextViews.getOrNull(65)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[65].text = "Booked"
                setMovieBookedImageResource18(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket18)
                seatInfoTextViews[65].text = "Available"
                setMovieBookedImageResource18(R.drawable.silver_seat_icon)
            }
        }

        Ticket19.setOnClickListener{
            if (seatInfoTextViews.getOrNull(66)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[66].text = "Booked"
                setMovieBookedImageResource19(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket19)
                seatInfoTextViews[66].text = "Available"
                setMovieBookedImageResource19(R.drawable.silver_seat_icon)
            }
        }

        Ticket20.setOnClickListener{
            if (seatInfoTextViews.getOrNull(67)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[67].text = "Booked"
                setMovieBookedImageResource20(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket20)
                seatInfoTextViews[67].text = "Available"
                setMovieBookedImageResource20(R.drawable.silver_seat_icon)
            }
        }

        Ticket21.setOnClickListener{
            if (seatInfoTextViews.getOrNull(68)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[68].text = "Booked"
                setMovieBookedImageResource21(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket21)
                seatInfoTextViews[68].text = "Available"
                setMovieBookedImageResource21(R.drawable.silver_seat_icon)
            }
        }

        Ticket22.setOnClickListener{
            if (seatInfoTextViews.getOrNull(69)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[69].text = "Booked"
                setMovieBookedImageResource22(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket22)
                seatInfoTextViews[69].text = "Available"
                setMovieBookedImageResource22(R.drawable.silver_seat_icon)
            }
        }

        Ticket23.setOnClickListener{
            if (seatInfoTextViews.getOrNull(70)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[70].text = "Booked"
                setMovieBookedImageResource23(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket23)
                seatInfoTextViews[70].text = "Available"
                setMovieBookedImageResource23(R.drawable.silver_seat_icon)
            }
        }

        Ticket24.setOnClickListener{
            if (seatInfoTextViews.getOrNull(71)?.text?.toString() == "Available") {
                onBookingClick()
                seatInfoTextViews[71].text = "Booked"
                setMovieBookedImageResource24(R.drawable.booked_star_icon)
            }
            else {
                onCancelBookingClick(Ticket24)
                seatInfoTextViews[71].text = "Available"
                setMovieBookedImageResource24(R.drawable.silver_seat_icon)
            }
        }

        return view
    }

    fun onBookingClick() {

        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Would you like to booked this seat ?")
        builder.setMessage("One hour prior to the movie's scheduled start time, you will receive your ticket.")
        builder.setIcon(R.drawable.ic_info)


        builder.setPositiveButton("Yes") { dialogInterface, which ->
            // Show notification
            context?.let {
                val notificationManager = it.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                val channelId = "my_channel_id"
                val notificationBuilder = NotificationCompat.Builder(it, channelId)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentTitle("Seat Booked")
                    .setContentText("You have successfully booked your seat ")
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

        builder.setNegativeButton("No") { dialogInterface, which ->
            Toast.makeText(context, "clicked No", Toast.LENGTH_LONG).show()
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()

    }


    fun onCancelBookingClick(view: View) {

        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Would you like to revoke the reservation you made for this seat?")
        builder.setMessage("If you choose yes, your reservation will be cancelled, and you will need to make a new reservation to verify your reservation status.")
        builder.setIcon(R.drawable.ic_info)
//        addDutyLeave()

        builder.setPositiveButton("Yes") { dialogInterface, which ->
            // Show notification
            context?.let {
                val notificationManager = it.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                val channelId = "my_channel_id"
                val notificationBuilder = NotificationCompat.Builder(it, channelId)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentTitle("Booking Canceled")
                    .setContentText("You've been successful in cancelling your reserved seat. ")
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

        builder.setNegativeButton("No") { dialogInterface, which ->
            if (view.id == R.id.ticket1){
                setMovieBookedImageResource1(R.drawable.booked_star_icon)
                seatInfoTextViews[48].text = "Booked"

            }
            if (view.id == R.id.ticket2){
                setMovieBookedImageResource2(R.drawable.booked_star_icon)
                seatInfoTextViews[49].text = "Booked"
            }
            if (view.id == R.id.ticket3){
                setMovieBookedImageResource3(R.drawable.booked_star_icon)
                seatInfoTextViews[50].text = "Booked"
            }
            if (view.id == R.id.ticket4){
                setMovieBookedImageResource4(R.drawable.booked_star_icon)
                seatInfoTextViews[51].text = "Booked"
            }
            if (view.id == R.id.ticket5){
                setMovieBookedImageResource5(R.drawable.booked_star_icon)
                seatInfoTextViews[52].text = "Booked"
            }
            if (view.id == R.id.ticket6){
                setMovieBookedImageResource6(R.drawable.booked_star_icon)
                seatInfoTextViews[53].text = "Booked"
            }
            if (view.id == R.id.ticket7){
                setMovieBookedImageResource2(R.drawable.booked_star_icon)
                seatInfoTextViews[54].text = "Booked"
            }
            if (view.id == R.id.ticket8){
                setMovieBookedImageResource7(R.drawable.booked_star_icon)
                seatInfoTextViews[55].text = "Booked"
            }
            if (view.id == R.id.ticket9){
                setMovieBookedImageResource9(R.drawable.booked_star_icon)
                seatInfoTextViews[56].text = "Booked"
            }
            if (view.id == R.id.ticket10){
                setMovieBookedImageResource10(R.drawable.booked_star_icon)
                seatInfoTextViews[57].text = "Booked"
            }
            if (view.id == R.id.ticket11){
                setMovieBookedImageResource11(R.drawable.booked_star_icon)
                seatInfoTextViews[58].text = "Booked"
            }
            if (view.id == R.id.ticket12){
                setMovieBookedImageResource12(R.drawable.booked_star_icon)
                seatInfoTextViews[59].text = "Booked"
            }

            if (view.id == R.id.ticket13){
                setMovieBookedImageResource13(R.drawable.booked_star_icon)
                seatInfoTextViews[60].text = "Booked"
            }

            if (view.id == R.id.ticket14){
                setMovieBookedImageResource14(R.drawable.booked_star_icon)
                seatInfoTextViews[61].text = "Booked"
            }

            if (view.id == R.id.ticket15){
                setMovieBookedImageResource15(R.drawable.booked_star_icon)
                seatInfoTextViews[62].text = "Booked"
            }

            if (view.id == R.id.ticket16){
                setMovieBookedImageResource16(R.drawable.booked_star_icon)
                seatInfoTextViews[63].text = "Booked"
            }

            if (view.id == R.id.ticket17){
                setMovieBookedImageResource17(R.drawable.booked_star_icon)
                seatInfoTextViews[64].text = "Booked"
            }

            if (view.id == R.id.ticket18){
                setMovieBookedImageResource18(R.drawable.booked_star_icon)
                seatInfoTextViews[65].text = "Booked"
            }

            if (view.id == R.id.ticket19){
                setMovieBookedImageResource19(R.drawable.booked_star_icon)
                seatInfoTextViews[66].text = "Booked"
            }

            if (view.id == R.id.ticket20){
                setMovieBookedImageResource20(R.drawable.booked_star_icon)
                seatInfoTextViews[67].text = "Booked"
            }

            if (view.id == R.id.ticket21){
                setMovieBookedImageResource21(R.drawable.booked_star_icon)
                seatInfoTextViews[68].text = "Booked"
            }

            if (view.id == R.id.ticket22){
                setMovieBookedImageResource22(R.drawable.booked_star_icon)
                seatInfoTextViews[69].text = "Booked"
            }

            if (view.id == R.id.ticket23){
                setMovieBookedImageResource23(R.drawable.booked_star_icon)
                seatInfoTextViews[70].text = "Booked"
            }

            if (view.id == R.id.ticket24){
                setMovieBookedImageResource24(R.drawable.booked_star_icon)
                seatInfoTextViews[71].text = "Booked"
            }

//            Toast.makeText(context, "clicked No", Toast.LENGTH_LONG).show()
        }

        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()

    }



    fun setMovieBookedImageResource1(resId: Int){
        movieImageView1.setImageResource(resId)
        movieImageView2.setImageResource(resId)
        movieImageView3.setImageResource(resId)
    }

    fun setMovieBookedImageResource2(resId: Int){
        movieImageView4.setImageResource(resId)
        movieImageView5.setImageResource(resId)
        movieImageView6.setImageResource(resId)
    }

    fun setMovieBookedImageResource3(resId: Int){
        movieImageView7.setImageResource(resId)
        movieImageView8.setImageResource(resId)
        movieImageView9.setImageResource(resId)
    }

    fun setMovieBookedImageResource4(resId: Int){
        movieImageView10.setImageResource(resId)
        movieImageView11.setImageResource(resId)
        movieImageView12.setImageResource(resId)
    }
    fun setMovieBookedImageResource5(resId: Int){
        movieImageView13.setImageResource(resId)
        movieImageView14.setImageResource(resId)
        movieImageView15.setImageResource(resId)
    }
    fun setMovieBookedImageResource6(resId: Int){
        movieImageView16.setImageResource(resId)
        movieImageView17.setImageResource(resId)
        movieImageView18.setImageResource(resId)
    }
    fun setMovieBookedImageResource7(resId: Int){
        movieImageView19.setImageResource(resId)
        movieImageView20.setImageResource(resId)
        movieImageView21.setImageResource(resId)
    }
    fun setMovieBookedImageResource8(resId: Int){
        movieImageView22.setImageResource(resId)
        movieImageView23.setImageResource(resId)
        movieImageView24.setImageResource(resId)
    }
    fun setMovieBookedImageResource9(resId: Int){
        movieImageView25.setImageResource(resId)
        movieImageView26.setImageResource(resId)
        movieImageView27.setImageResource(resId)
    }
    fun setMovieBookedImageResource10(resId: Int){
        movieImageView28.setImageResource(resId)
        movieImageView29.setImageResource(resId)
        movieImageView30.setImageResource(resId)
    }
    fun setMovieBookedImageResource11(resId: Int){
        movieImageView31.setImageResource(resId)
        movieImageView32.setImageResource(resId)
        movieImageView33.setImageResource(resId)
    }
    fun setMovieBookedImageResource12(resId: Int){
        movieImageView34.setImageResource(resId)
        movieImageView35.setImageResource(resId)
        movieImageView36.setImageResource(resId)
    }
    fun setMovieBookedImageResource13(resId: Int){
        movieImageView37.setImageResource(resId)
        movieImageView38.setImageResource(resId)
        movieImageView39.setImageResource(resId)
    }
    fun setMovieBookedImageResource14(resId: Int){
        movieImageView40.setImageResource(resId)
        movieImageView41.setImageResource(resId)
        movieImageView42.setImageResource(resId)
    }
    fun setMovieBookedImageResource15(resId: Int){
        movieImageView43.setImageResource(resId)
        movieImageView44.setImageResource(resId)
        movieImageView45.setImageResource(resId)
    }
    fun setMovieBookedImageResource16(resId: Int){
        movieImageView46.setImageResource(resId)
        movieImageView47.setImageResource(resId)
        movieImageView48.setImageResource(resId)
    }
    fun setMovieBookedImageResource17(resId: Int){
        movieImageView49.setImageResource(resId)
        movieImageView50.setImageResource(resId)
        movieImageView51.setImageResource(resId)
    }

    fun setMovieBookedImageResource18(resId: Int){
        movieImageView52.setImageResource(resId)
        movieImageView53.setImageResource(resId)
        movieImageView54.setImageResource(resId)
    }
    fun setMovieBookedImageResource19(resId: Int){
        movieImageView55.setImageResource(resId)
        movieImageView56.setImageResource(resId)
        movieImageView57.setImageResource(resId)
    }
    fun setMovieBookedImageResource20(resId: Int){
        movieImageView58.setImageResource(resId)
        movieImageView59.setImageResource(resId)
        movieImageView60.setImageResource(resId)
    }
    fun setMovieBookedImageResource21(resId: Int){
        movieImageView61.setImageResource(resId)
        movieImageView62.setImageResource(resId)
        movieImageView63.setImageResource(resId)
    }
    fun setMovieBookedImageResource22(resId: Int){
        movieImageView64.setImageResource(resId)
        movieImageView65.setImageResource(resId)
        movieImageView66.setImageResource(resId)
    }
    fun setMovieBookedImageResource23(resId: Int){
        movieImageView67.setImageResource(resId)
        movieImageView68.setImageResource(resId)
        movieImageView69.setImageResource(resId)
    }
    fun setMovieBookedImageResource24(resId: Int){
        movieImageView70.setImageResource(resId)
        movieImageView71.setImageResource(resId)
        movieImageView72.setImageResource(resId)
    }

}