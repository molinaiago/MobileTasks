package com.example.atv1.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.example.atv1.R

class configParametersUsersChoices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config_parameters_users_choices)

        val buttonConfirm = findViewById<Button>(R.id.btnConfirmParameters)
        val editDuration = findViewById<EditText>(R.id.editDuration)
        val checkBoxEasy = findViewById<CheckBox>(R.id.checkBoxEasy)
        val checkBoxMedium = findViewById<CheckBox>(R.id.checkBoxMedium)
        val checkBoxHard = findViewById<CheckBox>(R.id.checkBoxHard)

        buttonConfirm.setOnClickListener {
            val duration = editDuration.text.toString()
            val selectedOptions = mutableListOf<String>()

            if (checkBoxEasy.isChecked) {
                selectedOptions.add("Fácil")
            }

            if (checkBoxMedium.isChecked) {
                selectedOptions.add("Médio")
            }

            if (checkBoxHard.isChecked) {
                selectedOptions.add("Difícil")
            }

            val difficulty = selectedOptions.joinToString(", ")

            val intent = Intent(this, resumeChoicesUser::class.java)
            intent.putExtra("duration", duration)
            intent.putExtra("difficulty", difficulty)
            startActivity(intent)
        }

    }
}