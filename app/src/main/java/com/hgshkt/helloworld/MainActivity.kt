package com.hgshkt.helloworld

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: Activity() {

    private lateinit var plusButton: Button
    private lateinit var minusButton: Button

    private var number: Int = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        init()

        plusButton.setOnClickListener {
            number++
            showNumberValue()
        }

        minusButton.setOnClickListener {
            if(number < 1) showMessage()
            else {
                number--
                showNumberValue()
            }
        }
    }

    private fun showMessage() {
        Toast.makeText(this, "Number value < 1", Toast.LENGTH_SHORT).show()
    }

    private fun showNumberValue() {
        Toast.makeText(this, "Number value: $number", Toast.LENGTH_SHORT).show()
    }

    private fun init() {
        plusButton = findViewById(R.id.plus_button)
        minusButton = findViewById(R.id.minus_button)
    }
}