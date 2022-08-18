package com.example.androidbuttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var layout : LinearLayout // changing background
    lateinit var black : RadioButton
    lateinit var green : RadioButton
    lateinit var yellow : RadioButton
    lateinit var red : RadioButton
    lateinit var change : Button

    lateinit var spinner: Spinner
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.linearLayout)
        black = findViewById(R.id.blackButton)
        green = findViewById(R.id.greenButton)
        yellow = findViewById(R.id.yellowButton)
        red = findViewById(R.id.redButton)
        change = findViewById(R.id.changeButton)

        spinner = findViewById(R.id.spinnerCountry)
        result = findViewById(R.id.resultText)

        spinner.onItemSelectedListener = this

        var arrayAdapter = ArrayAdapter.createFromResource(
                this, R.array.countries,
            android.R.layout.simple_spinner_item)

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = arrayAdapter

        change.setOnClickListener {
            if (black.isChecked) layout.setBackgroundColor(Color.BLACK)
            else if (green.isChecked) layout.setBackgroundColor(Color.GREEN)
            else if (yellow.isChecked) layout.setBackgroundColor(Color.YELLOW)
            else if (red.isChecked) layout.setBackgroundColor(Color.RED)
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, index: Int, id: Long) {
        if (parent != null) {
            result.text = parent.getItemAtPosition(index).toString()
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }
}