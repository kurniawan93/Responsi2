package com.example.latihanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MathActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)

        //instance button -> create object
        val button1 : Button = findViewById(R.id.buttonTambah)
        val button2 : Button = findViewById(R.id.buttonKurang)

        //click listener untuk button Tambah
        button1.setOnClickListener {
            //instance TambahFragment
            val tambahFragment = TambahFragment()

            //fragment manager
            val manager: FragmentManager = supportFragmentManager
            val trans: FragmentTransaction = manager.beginTransaction()

            //Letakkan fragment di container (Linear Layout)
            trans.replace(R.id.fragmentContainer, tambahFragment)
            trans.addToBackStack(null )

            //finishing / execute
            trans.commit()
        }


            //click listener untuk button Kurang
            button2.setOnClickListener {
                //instance KurangFragment
                val kurangFragment = KurangFragment()

                //fragment manager
                val manager : FragmentManager = supportFragmentManager
                val trans : FragmentTransaction = manager.beginTransaction()

                //Letakkan fragment di container (Linear Layout)
                //Letakkan fragment di container (Linear Layout)
                trans.replace(R.id.fragmentContainer, kurangFragment)
                trans.addToBackStack( null )

                //finishing / execute
                trans.commit()

            }
    }
}
