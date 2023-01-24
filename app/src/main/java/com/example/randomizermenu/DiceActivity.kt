package com.example.randomizermenu

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class DiceActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        imageView = findViewById(R.id.imageView)

    }
    fun rollDice(view: View) {
        val diceRoll = random.nextInt(6) + 1 // generates a random number between 1 and 6
        when (diceRoll) {
            1 -> imageView.setImageResource(R.drawable.alea_1)
            2 -> imageView.setImageResource(R.drawable.alea_2)
            3 -> imageView.setImageResource(R.drawable.alea_3)
            4 -> imageView.setImageResource(R.drawable.alea_4)
            5 -> imageView.setImageResource(R.drawable.alea_5)
            6 -> imageView.setImageResource(R.drawable.alea_6)
        }
    }
}