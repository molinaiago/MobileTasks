package com.example.atv1.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.atv1.R

class resumeChoicesUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume_choices_user)

        val duration = intent.getStringExtra("duration")
        val difficulty = intent.getStringExtra("difficulty")
        val textViewDuration = findViewById<TextView>(R.id.textViewDuration)
        val textViewDifficulty = findViewById<TextView>(R.id.textViewDifficulty)

        val destination = intent.getStringExtra("destination")
        val departureDate = intent.getStringExtra("departureDate")
        val returnDate = intent.getStringExtra("returnDate")
        val textViewDestination = findViewById<TextView>(R.id.textViewDestination)
        val textViewDepartureDate = findViewById<TextView>(R.id.textViewDepartureDate)
        val textViewReturnDate = findViewById<TextView>(R.id.textViewReturnDate)

        textViewDuration.text = "Duração: $duration"
        textViewDifficulty.text = "Nível de Dificuldade: $difficulty"
        textViewDestination.text = "Destino: $destination"
        textViewDepartureDate.text = "Data de Partida: $departureDate"
        textViewReturnDate.text = "Data de Retorno: $returnDate"
    }
}

