package com.example.iteradmin.leanintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val i=Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
        }
    }
}
