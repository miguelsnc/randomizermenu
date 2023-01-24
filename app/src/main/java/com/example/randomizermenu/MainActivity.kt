package com.example.randomizermenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
    }
    fun iraDiceactivity(view: View) {
        val intent = Intent(this, DiceActivity::class.java)
        startActivity(intent)
    }
    fun iraCoinactivity(view: View) {
        val intent = Intent(this, CoinActivity::class.java)
        startActivity(intent)
    }


}