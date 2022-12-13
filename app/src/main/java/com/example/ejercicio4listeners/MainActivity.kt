package com.example.ejercicio4listeners

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.ejercicio4listeners.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6
    private var onSave = 7
    private var onRestore = 8

    etContent.addTextChangedListener(object : TextWatcher{
        override fun afterTextChanged(s: Editable?) {}
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int){}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onStart $onCreate")
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        println("onStart $onStart")
    }
    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        println("onResume $onResume")
    }
    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        println("onPause $onPause")
    }
    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        println("onRestart $onRestart")
    }
    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        println("onStop $onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        println("onDestroy $onDestroy")
    }
    private fun addListenerToEditText(){
        binding.etContent
    }
}