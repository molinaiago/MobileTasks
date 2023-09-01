package com.example.atv1.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.EditText
import com.example.atv1.R

class travel_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_main)

        val btnConfirm = findViewById<Button>(R.id.btnConfirm)
        val etDestino = findViewById<EditText>(R.id.etDestination)
        val datePickerIda = findViewById<DatePicker>(R.id.datePickerDeparture)
        val datePickerVolta = findViewById<DatePicker>(R.id.datePickerReturn)
        val cbBeach = findViewById<CheckBox>(R.id.cbBeach)
        val cbAdventure = findViewById<CheckBox>(R.id.cbAdventure)
        val cbCulture = findViewById<CheckBox>(R.id.cbCulture)

        btnConfirm.setOnClickListener {
            val intent = Intent(this, userConfigPreferences::class.java)

            val destinations = etDestino.text.toString()
            intent.putExtra("destination", destinations)

            val departureDates = "${datePickerIda.dayOfMonth}/${datePickerIda.month + 1}/${datePickerIda.year}"
            val returnDates = "${datePickerVolta.dayOfMonth}/${datePickerVolta.month + 1}/${datePickerVolta.year}"
            intent.putExtra("departureDate", departureDates)
            intent.putExtra("returnDate", returnDates)

            if (cbBeach.isChecked) {
                intent.putExtra("preference_beach", true)
            }
            if (cbAdventure.isChecked) {
                intent.putExtra("preference_adventure", true)
            }
            if (cbCulture.isChecked) {
                intent.putExtra("preference_culture", true)
            }
            startActivity(intent)
        }
    }
}