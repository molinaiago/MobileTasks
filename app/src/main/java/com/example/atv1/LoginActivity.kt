package com.example.atv1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.atv1.layout.Constraint
import com.example.atv1.layout.Home
import com.example.atv1.layout.Linear
import com.example.atv1.layout.Relative
import com.example.atv1.layout.Table
import com.example.atv1.layout.converter
import com.example.atv1.layout.travel_main

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()

            val msg = "Email: $email\nPassword: $password"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Home::class.java)
            startActivity(intent)

        }


        val buttonTable = findViewById<Button>(R.id.buttonTable)

        buttonTable.setOnClickListener {
            val intent = Intent(this, Table::class.java)
            startActivity(intent)
        }

        val buttonRelative = findViewById<Button>(R.id.buttonRelative)

        buttonRelative.setOnClickListener {
            val intent = Intent(this, Relative::class.java)
            startActivity(intent)
        }

        val buttonLinear = findViewById<Button>(R.id.buttonLinear)

        buttonLinear.setOnClickListener {
            val intent = Intent(this, Linear::class.java)
            startActivity(intent)
        }

        val buttonConstraint = findViewById<Button>(R.id.buttonConstraint)

        buttonConstraint.setOnClickListener {
            val intent = Intent(this, Constraint::class.java)
            startActivity(intent)
        }

        val buttonConverter = findViewById<Button>(R.id.buttonConverter)

        buttonConverter.setOnClickListener {
            val intent = Intent(this, converter::class.java)
            startActivity(intent)
        }

        val buttonTravel = findViewById<Button>(R.id.buttonTravel)

        buttonTravel.setOnClickListener {
            val intent = Intent(this, travel_main::class.java)
            startActivity(intent)
        }


    }
}