package com.example.movies_show_booking_system

import android.annotation.SuppressLint

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.core.content.ContextCompat

class Home_fragment_container : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home_container, container, false)
        // find and configure UI elements here
        val button1=view.findViewById<Button>(R.id.hollywood_movies)
        val button2=view.findViewById<Button>(R.id.bollywood_movies)
        val button3=view.findViewById<Button>(R.id.south_movies)
        val button4=view.findViewById<Button>(R.id.cartoon_movies)

        val ImageView1=view.findViewById<ImageView>(R.id.movie1)
        val ImageView2=view.findViewById<ImageView>(R.id.movie2)
        val ImageView3=view.findViewById<ImageView>(R.id.movie3)
        val ImageView4=view.findViewById<ImageView>(R.id.movie4)
        val ImageView5=view.findViewById<ImageView>(R.id.movie5)
        val ImageView6=view.findViewById<ImageView>(R.id.movie6)

        // Set up click listeners for the buttons
        button1.setOnClickListener {
            // Change the image resource of the ImageView
            ImageView1.setImageResource(R.drawable.piratesofthecarrabian)
            ImageView2.setImageResource(R.drawable.avenger_endgame)
            ImageView3.setImageResource(R.drawable.fast_and_furious9)
            ImageView4.setImageResource(R.drawable.spider_man_no_way_home)
            ImageView5.setImageResource(R.drawable.avenger_infinity_war)
            ImageView6.setImageResource(R.drawable.aquaman)
        }

        button2.setOnClickListener {
            // Change the image resource of the ImageView
            ImageView1.setImageResource(R.drawable.pathaan)
            ImageView2.setImageResource(R.drawable.krish)
            ImageView3.setImageResource(R.drawable.baji_rao_mastani)
            ImageView4.setImageResource(R.drawable.shershaah)
            ImageView5.setImageResource(R.drawable.parmanu)
            ImageView6.setImageResource(R.drawable.war)
        }

        button3.setOnClickListener {
            // Change the image resource of the ImageView
            ImageView1.setImageResource(R.drawable.rrr)
            ImageView2.setImageResource(R.drawable.puspha)
            ImageView3.setImageResource(R.drawable.varisu)
            ImageView4.setImageResource(R.drawable.sahoo)
            ImageView5.setImageResource(R.drawable.bahubali)
            ImageView6.setImageResource(R.drawable.bigil)
        }

        button4.setOnClickListener {
            // Change the image resource of the ImageView
            ImageView1.setImageResource(R.drawable.push_in_boot)
            ImageView2.setImageResource(R.drawable.how_to_train_your_dragon)
            ImageView3.setImageResource(R.drawable.moana)
            ImageView4.setImageResource(R.drawable.frozen)
            ImageView5.setImageResource(R.drawable.big_hero)
            ImageView6.setImageResource(R.drawable.coco)
        }

//        setting the setOnClickListner for first image present on the every container(HollyWood , BollyWood , South , Cartoon )
        ImageView1.setOnClickListener{
            val drawable=ImageView1.drawable
            val newFragment = Booking_Fragment()
            val bundle = Bundle()

            when {
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.piratesofthecarrabian)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.piratesofthecarrabian)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.pathaan)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.pathaan)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.rrr)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.rrr)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.push_in_boot)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.push_in_boot)
                }
            }

            newFragment.arguments = bundle

            // Open the new fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.HomePageContainer, newFragment)
                .addToBackStack(null)
                .commit()
        }


        // setting the setOn_Click_listner for second image present on the every container(HollyWood , BollyWood , South , Cartoon )
        ImageView2.setOnClickListener{
            val drawable=ImageView2.drawable
            val newFragment = Booking_Fragment()
            val bundle = Bundle()

            when {
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.avenger_endgame)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.avenger_endgame)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.krish)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.krish)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.puspha)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.puspha)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.how_to_train_your_dragon)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.how_to_train_your_dragon)
                }
            }

            newFragment.arguments = bundle

            // Open the new fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.HomePageContainer, newFragment)
                .addToBackStack(null)
                .commit()
        }

        // setting the setOn_Click_listner for third image present on the every container(HollyWood , BollyWood , South , Cartoon )
        ImageView3.setOnClickListener{
            val drawable=ImageView3.drawable
            val newFragment = Booking_Fragment()
            val bundle = Bundle()

            when {
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.fast_and_furious9)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.fast_and_furious9)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.baji_rao_mastani)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.baji_rao_mastani)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.varisu)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.varisu)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.moana)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.moana)
                }
            }

            newFragment.arguments = bundle

            // Open the new fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.HomePageContainer, newFragment)
                .addToBackStack(null)
                .commit()
        }

        // setting the setOn_Click_listner for fourth image present on the every container(HollyWood , BollyWood , South , Cartoon )
        ImageView4.setOnClickListener{
            val drawable=ImageView4.drawable
            val newFragment = Booking_Fragment()
            val bundle = Bundle()

            when {
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.spider_man_no_way_home)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.spider_man_no_way_home)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.shershaah)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.shershaah)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.sahoo)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.sahoo)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.frozen)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.frozen)
                }
            }

            newFragment.arguments = bundle

            // Open the new fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.HomePageContainer, newFragment)
                .addToBackStack(null)
                .commit()
        }

        // setting the setOn_Click_listner for fifth image present on the every container(HollyWood , BollyWood , South , Cartoon )
        ImageView5.setOnClickListener{
            val drawable=ImageView5.drawable
            val newFragment = Booking_Fragment()
            val bundle = Bundle()

            when {
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.avenger_infinity_war)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.avenger_infinity_war)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.parmanu)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.parmanu)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.bahubali)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.bahubali)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.big_hero)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.big_hero)
                }
            }

            newFragment.arguments = bundle

            // Open the new fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.HomePageContainer, newFragment)
                .addToBackStack(null)
                .commit()
        }

        // setting the setOn_Click_listner for sixth image present on the every container(HollyWood , BollyWood , South , Cartoon )
        ImageView6.setOnClickListener{
            val drawable=ImageView6.drawable
            val newFragment = Booking_Fragment()
            val bundle = Bundle()

            when {
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.aquaman)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.aquaman)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.war)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.war)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.bigil)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.bigil)
                }
                drawable?.constantState?.equals(ContextCompat.getDrawable(requireContext(), R.drawable.coco)?.constantState) == true -> {
                    bundle.putInt("background", R.drawable.coco)
                }
            }

            newFragment.arguments = bundle

            // Open the new fragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.HomePageContainer, newFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}