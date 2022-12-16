package com.example.ejercicio4listeners

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.ejercicio4listeners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var suma = 0

        findViewById<Button>(R.id.botonSumar).setOnClickListener{
            findViewById<Button>(R.id.botonSumar).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_700))
            findViewById<Button>(R.id.botonRestar).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_700))
            if (findViewById<EditText>(R.id.editText).text.isEmpty()) {
                Toast.makeText(this, "Escribe un número, por favor", Toast.LENGTH_LONG).show()
            }else {
                val val01 = findViewById<TextView>(R.id.editText).text.toString().toInt()
                val val02 = findViewById<TextView>(R.id.textView).text.toString().toInt()
                suma = val01 + val02
                findViewById<TextView>(R.id.textView).text = suma.toString()
            }
            true
        }

        var resta = 0

        findViewById<Button>(R.id.botonRestar).setOnClickListener {
            findViewById<Button>(R.id.botonSumar).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_700))
            findViewById<Button>(R.id.botonRestar).setBackgroundColor(ContextCompat.getColor(this,R.color.purple_700))
            if (findViewById<EditText>(R.id.editText).text.isEmpty()){
                Toast.makeText(this, "Ecribe un número, por favor", Toast.LENGTH_LONG).show()
            } else{
                if (findViewById<EditText>(R.id.editText).text.toString().toInt() <= findViewById<TextView>(R.id.textView).text.toString().toInt()) {
                    val val01 = findViewById<TextView>(R.id.editText).text.toString().toInt()
                    val val02 = findViewById<TextView>(R.id.textView).text.toString().toInt()
                    resta = val02 - val01
                    findViewById<TextView>(R.id.textView).text = resta.toString()
                } else{
                    Toast.makeText(this, "El número introducido es mayor que el número ya puesto", Toast.LENGTH_LONG).show()
                }
            }
            true
        }


        findViewById<EditText>(R.id.editText).setOnClickListener {
            findViewById<Button>(R.id.botonSumar).setBackgroundColor(Color.GRAY)
            findViewById<Button>(R.id.botonRestar).setBackgroundColor(Color.GRAY)
            true
        }

        findViewById<EditText>(R.id.editText2).setOnLongClickListener {
            findViewById<Button>(R.id.botonSumar).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_700))
            findViewById<Button>(R.id.botonRestar).setBackgroundColor(ContextCompat.getColor(this, R.color.purple_700))
            true
        }
    }

}