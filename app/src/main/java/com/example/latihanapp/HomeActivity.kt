package com.example.latihanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Remove title bar
        supportActionBar?.hide()

        //instance button
        val button : ImageButton = findViewById(R.id.imageButtonMath)
        val mathButton : ImageButton = findViewById(R.id.imageButtonMath)

        //button see more on click
        button.setOnClickListener {
            //intent explicit -> utk menampilkan activity about
            //1. instance intent -> create object
            val intent = Intent( this, MathActivity::class.java)
            startActivity(intent)
        }
                //button see more on click
            mathButton.setOnClickListener {
            //intent explicit -> utk menampilkan activity about
            //1. instance intent -> create object
            val intent = Intent( this, MathActivity::class.java)
            startActivity(intent)
        }

    }
}