package com.example.firstandroidattempt

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var myText:TextView
    // var myText:TextView? = null

    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var name:EditText
    lateinit var password:EditText
    lateinit var multiLine:EditText
    lateinit var submit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // "R" stands for resources

        myText = findViewById(R.id.textExamlpe)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        name = findViewById(R.id.editTextName)
        password = findViewById(R.id.editTextPassword)
        multiLine = findViewById(R.id.editTextMultiLine)
        submit = findViewById(R.id.submit)

        myText.setTextColor(Color.CYAN)
        myText.setText("This is an example from MainActivity!")

        myText.setOnClickListener {
            myText.setTextColor(Color.MAGENTA)
            myText.setBackgroundColor(Color.BLUE)
        }

        button1.setOnClickListener {
            button1.setTextColor(Color.YELLOW)
            button1.setBackgroundColor(Color.BLACK)
            button1.setText("Sleepy...")
            myText.isVisible = false
        }

        button2.setOnClickListener {
            myText.isVisible = true
        }

        submit.setOnClickListener {
            var user:String = name.text.toString()
            myText.setText(user)
        }
    }

}