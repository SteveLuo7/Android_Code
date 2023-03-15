package com.example.shazhi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

            Toast.makeText(this, "Dice Rolled!!!", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun rollDice() {
       val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val luckyTextView: TextView = findViewById(R.id.textView2)
        val luckNumber = 6
        if (luckNumber == diceRoll) {
            luckyTextView.text = "Lucky Number!!!"
        } else {
            luckyTextView.text = ""
        }

        val diceImage: ImageView = findViewById(R.id.imageView)
        when(diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }


    }
}

class Dice(val numSides: Int) {
    fun roll() : Int {
        return (1..numSides).random()
    }
}
