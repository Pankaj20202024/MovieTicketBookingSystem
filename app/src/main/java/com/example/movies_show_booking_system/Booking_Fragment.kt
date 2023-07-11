package com.example.movies_show_booking_system


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout


class Booking_Fragment : Fragment() {

    private lateinit var silver_Seat_BookingFragment: SilverSeatBookingFragment
    private lateinit var golden_Seat_BookingFragment: GoldenSeatFramgment
    private lateinit var platinum_Seat_BookingFragment: PlatinumSeatBookingFragment

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_booking_, container, false)
        val background = arguments?.getInt("background")

        view.findViewById<LinearLayout>(R.id.booking_fragment).setBackgroundResource(background ?: R.drawable.piratesofthecarrabian)

        silver_Seat_BookingFragment = SilverSeatBookingFragment()

        childFragmentManager.beginTransaction().add(
            R.id.bookingfragmentcontainer,
            silver_Seat_BookingFragment
        ).commit()

        golden_Seat_BookingFragment = GoldenSeatFramgment()

        childFragmentManager.beginTransaction().add(
            R.id.bookingfragmentcontainer2,
            golden_Seat_BookingFragment
        ).commit()

        platinum_Seat_BookingFragment =PlatinumSeatBookingFragment()

        childFragmentManager.beginTransaction().add(
            R.id.bookingfragmentcontainer3,
            platinum_Seat_BookingFragment
        ).commit()


        val silver_Seat_Btn=view.findViewById<Button>(R.id.Silver_Seat)
        val golden_Seat_Btn=view.findViewById<Button>(R.id.Gold_Seat)
        val platinum_Seat_Btn=view.findViewById<Button>(R.id.Platinium_Seat)

        val silver_seat_booking_container=view.findViewById<RelativeLayout>(R.id.Silver_Seat_Booking_Container)
        val golden_seat_booking_container=view.findViewById<RelativeLayout>(R.id.Golden_Seat_Booking_Container)
        val platinum_seat_booking_container=view.findViewById<RelativeLayout>(R.id.Platinium_Seat_Booking_Container)


        silver_Seat_Btn.setOnClickListener{
            golden_seat_booking_container.visibility=View.GONE
            platinum_seat_booking_container.visibility=View.GONE
            silver_seat_booking_container.visibility=View.VISIBLE
        }

        golden_Seat_Btn.setOnClickListener{
            silver_seat_booking_container.visibility=View.GONE
            platinum_seat_booking_container.visibility=View.GONE
            golden_seat_booking_container.visibility=View.VISIBLE
        }

        platinum_Seat_Btn.setOnClickListener{
            silver_seat_booking_container.visibility=View.GONE
            golden_seat_booking_container.visibility=View.GONE
            platinum_seat_booking_container.visibility=View.VISIBLE
        }


        // Set OnClickListener on the back button
        val backButton = view.findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        return view
    }

}