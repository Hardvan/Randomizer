package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b_roll = findViewById<Button>(R.id.b_roll)
        val tv_result = findViewById<TextView>(R.id.tv_result)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        b_roll.setOnClickListener {

            val rand = Random().nextInt(seekBar.progress) + 1
            tv_result.text = rand.toString()

        }

    }
}