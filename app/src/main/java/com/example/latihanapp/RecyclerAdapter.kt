package com.example.latihanapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //list data
    private val gambar = intArrayOf(R.drawable.math, R.drawable.color, R.drawable.planet1)
    private var nama = arrayOf("Math", "Color", "Planet")
    private var keterangan = arrayOf("Math is fun", "Leat's learn color", "Do you know the planets ?")



    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemNama:TextView
        var itemKeterangan:TextView

        init {
            itemImage=itemView.findViewById(R.id.item_image)
            itemNama=itemView.findViewById(R.id.item_nama)
            itemKeterangan=itemView.findViewById(R.id.item_keterangan)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return nama.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(gambar[position])
        holder.itemNama.text=nama[position]
        holder.itemKeterangan.text=keterangan[position]
    }
}