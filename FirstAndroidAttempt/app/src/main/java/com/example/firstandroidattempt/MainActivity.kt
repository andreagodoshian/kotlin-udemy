package com.example.firstandroidattempt

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myText:TextView
    // var myText:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.textExamlpe)
        // "R" stands for resources

        myText.setTextColor(Color.CYAN)
        myText.setText("This is an example from MainActivity!")

        myText.setOnClickListener {
            myText.setTextColor(Color.MAGENTA)
            myText.setBackgroundColor(Color.BLUE)
        }
    }

}