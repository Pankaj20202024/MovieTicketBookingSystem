package com.example.movies_show_booking_system

import android.app.AlarmManager
import android.app.DatePickerDialog
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TimePicker
import java.time.LocalDate
import java.time.Month
import java.util.*


class User_Booking_History_Fragment : Fragment() {
    private lateinit var timePicker: TimePicker

    private lateinit var alarmManager: AlarmManager
    private lateinit var alarmIntent: PendingIntent

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_user__booking__history_, container, false)

        var select_data = view.findViewById<Button>(R.id.datepicker)
        var ShowAll = view.findViewById<Button>(R.id.show_all)

        val booked_movie_container1 = view.findViewById<LinearLayout>(R.id.first_film_container)
        val booked_movie_container2 = view.findViewById<LinearLayout>(R.id.second_film_container)
        val booked_movie_container3 = view.findViewById<LinearLayout>(R.id.third_film_container)
        val booked_movie_container4 = view.findViewById<LinearLayout>(R.id.fourth_film_container)
        val booked_movie_container5 = view.findViewById<LinearLayout>(R.id.fifth_film_container)
        val booked_movie_container6 = view.findViewById<LinearLayout>(R.id.sixth_film_container)
        val booked_movie_container7 = view.findViewById<LinearLayout>(R.id.seventh_film_container)
        val booked_movie_container8 = view.findViewById<LinearLayout>(R.id.eigth_film_container)
        val booked_movie_container9 = view.findViewById<LinearLayout>(R.id.nineth_film_container)


        select_data.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog =
                DatePickerDialog(requireContext(), { _, year, monthOfYear, dayOfMonth ->
                    val specificDate1 = LocalDate.of(2023, Month.MAY, 10)
                    val specificDate2 = LocalDate.of(2023, Month.MAY, 12)
                    val specificDate3 = LocalDate.of(2023, Month.MAY, 14)


                    var selectedDate = LocalDate.of(year, monthOfYear + 1, dayOfMonth)


                    if (selectedDate == specificDate1) {
                        booked_movie_container1.visibility = View.VISIBLE
                        booked_movie_container2.visibility = View.VISIBLE
                        booked_movie_container3.visibility = View.GONE
                        booked_movie_container4.visibility = View.GONE
                        booked_movie_container5.visibility = View.VISIBLE
                        booked_movie_container6.visibility = View.GONE
                        booked_movie_container7.visibility = View.GONE
                        booked_movie_container8.visibility = View.GONE
                        booked_movie_container9.visibility = View.GONE
                        ShowAll.visibility = View.VISIBLE
                    }

                    if (selectedDate == specificDate2) {
                        booked_movie_container1.visibility = View.GONE
                        booked_movie_container2.visibility = View.GONE
                        booked_movie_container3.visibility = View.VISIBLE
                        booked_movie_container4.visibility = View.VISIBLE
                        booked_movie_container5.visibility = View.GONE
                        booked_movie_container6.visibility = View.GONE
                        booked_movie_container7.visibility = View.GONE
                        booked_movie_container8.visibility = View.GONE
                        booked_movie_container9.visibility = View.VISIBLE
                        ShowAll.visibility = View.VISIBLE
                    }

                    if (selectedDate == specificDate3) {
                        booked_movie_container1.visibility = View.GONE
                        booked_movie_container2.visibility = View.GONE
                        booked_movie_container3.visibility = View.GONE
                        booked_movie_container4.visibility = View.GONE
                        booked_movie_container5.visibility = View.GONE
                        booked_movie_container6.visibility = View.VISIBLE
                        booked_movie_container7.visibility = View.VISIBLE
                        booked_movie_container8.visibility = View.VISIBLE
                        booked_movie_container9.visibility = View.GONE
                        ShowAll.visibility = View.VISIBLE
                    }
                }, year, month, day)
            datePickerDialog.show()
        }

        ShowAll.setOnClickListener {
            booked_movie_container1.visibility = View.VISIBLE
            booked_movie_container2.visibility = View.VISIBLE
            booked_movie_container3.visibility = View.VISIBLE
            booked_movie_container4.visibility = View.VISIBLE
            booked_movie_container5.visibility = View.VISIBLE
            booked_movie_container6.visibility = View.VISIBLE
            booked_movie_container7.visibility = View.VISIBLE
            booked_movie_container8.visibility = View.VISIBLE
            booked_movie_container9.visibility = View.VISIBLE
            ShowAll.visibility = View.GONE
        }

        // writing code for alarm manager  so that user can get the reminder

        // writing the code setting the alarm

        timePicker = view.findViewById(R.id.timePicker)
        var alarmbtn1 = view.findViewById<Button>(R.id.setalarm1)
        var alarmbtn2 = view.findViewById<Button>(R.id.setalarm2)
        var alarmbtn3 = view.findViewById<Button>(R.id.setalarm3)
        var alarmbtn4 = view.findViewById<Button>(R.id.setalarm4)
        var alarmbtn5 = view.findViewById<Button>(R.id.setalarm5)
        var alarmbtn6 = view.findViewById<Button>(R.id.setalarm6)
        var alarmbtn7 = view.findViewById<Button>(R.id.setalarm7)
        var alarmbtn8 = view.findViewById<Button>(R.id.setalarm8)
        var alarmbtn9 = view.findViewById<Button>(R.id.setalarm9)

        // Get the AlarmManager service
        alarmManager = requireContext().getSystemService(Context.ALARM_SERVICE) as AlarmManager
        // Create an intent to start the alarm receiver
        val intent = Intent(context, AlarmReceiver::class.java)
        alarmIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_IMMUTABLE)

        alarmbtn1.setOnClickListener{
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        alarmbtn2.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }


        alarmbtn3.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        alarmbtn4.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }


        alarmbtn5.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        alarmbtn6.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        alarmbtn7.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        alarmbtn8.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        alarmbtn9.setOnClickListener{

            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val timePickerDialog = TimePickerDialog(
                requireContext(),
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    // Set the alarm using the selected time
                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    calendar.set(Calendar.MINUTE, minute)
                    calendar.set(Calendar.SECOND, 0)
                    alarmManager.setExact(
                        AlarmManager.RTC_WAKEUP,
                        calendar.timeInMillis,
                        alarmIntent
                    )
                },
                hour,
                minute,
                false
            )
            timePickerDialog.show()
        }

        return view
    }

}