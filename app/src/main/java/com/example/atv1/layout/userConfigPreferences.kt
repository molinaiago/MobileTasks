package com.example.atv1.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.example.atv1.R

class userConfigPreferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_config_preferences)

        val preferenceBeach = intent.getBooleanExtra("preference_beach", false)
        val preferenceAdventure = intent.getBooleanExtra("preference_adventure", false)
        val preferenceCulture = intent.getBooleanExtra("preference_culture", false)

        val layoutBeach = findViewById<LinearLayout>(R.id.layoutBeach)
        val layoutAdventure = findViewById<LinearLayout>(R.id.layoutAdventure)
        val layoutCulture = findViewById<LinearLayout>(R.id.layoutCulture)

        if (preferenceBeach) {
            layoutBeach.visibility = View.VISIBLE
        } else {
            layoutBeach.visibility = View.GONE
        }

        if (preferenceAdventure) {
            layoutAdventure.visibility = View.VISIBLE
        } else {
            layoutAdventure.visibility = View.GONE
        }

        if (preferenceCulture) {
            layoutCulture.visibility = View.VISIBLE
        } else {
            layoutCulture.visibility = View.GONE
        }

        val nextActivity = findViewById<Button>(R.id.nextActivity)

        nextActivity.setOnClickListener {
            val intent = Intent(this, configParametersUsersChoices::class.java)
            startActivity(intent)
        }

    }
}

