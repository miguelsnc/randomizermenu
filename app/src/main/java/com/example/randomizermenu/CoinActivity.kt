package com.example.randomizermenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.Random

class CoinActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        imageView = findViewById(R.id.imageView)
    }
    fun Coin(view: View) {
        val rollcoin = random.nextInt(6) + 1 // generates a random number between 1 and 6
        when (rollcoin) {
            1 -> imageView.setImageResource(R.drawable.face )
            2 -> imageView.setImageResource(R.drawable.cross)

        }
    }
}