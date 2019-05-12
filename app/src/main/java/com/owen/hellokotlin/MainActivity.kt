package com.owen.hellokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Check for the button click using the onclick Listner button with the assigned ID
        btn1.setOnClickListener{

            val  intent = Intent(this,KotlinActivity2::class.java)

             //now take the response of the clicked btn
            startActivity(intent);

        }

    }
}
