package com.example.latihanapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //Remove tittle bar
        supportActionBar?.hide()

        //instance image button
        val imgButtonCall : ImageButton = findViewById(R.id.imageButtonCall)
        val imgButtonMap : ImageButton = findViewById(R.id.imageButtonLocation)
        val imgButtonWeb : ImageButton = findViewById(R.id.imageButtonWeb)

        //image button call on click
        imgButtonCall.setOnClickListener {
            //instance intent (implicit)
            val callIntent : Intent = Uri.parse( "tel:089639660334").let {
                number -> Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }

        //image button map on click
        imgButtonMap.setOnClickListener {
            //instance intent (implicit)
            val mapIntent : Intent = Intent(Intent.ACTION_VIEW).apply{
            data = Uri.parse("geo:47.6, -122.3?z=10")
            }

            if (mapIntent.resolveActivity(packageManager)!= null){
                startActivity(mapIntent)
            }
        }

        //image button website on click
        imgButtonWeb.setOnClickListener {
            //instance Intent (implicit)
            val webIntent : Intent = Uri.parse("https://home.amikom.ac.id/").let {
                webpage -> Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(webIntent)
        }
    }
}