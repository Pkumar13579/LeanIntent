package com.example.iteradmin.leanintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val i = Intent(applicationContext,Main2Activity::class.java)
            startActivity(i)
        }
    }
}
