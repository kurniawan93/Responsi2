package com.example.latihanapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterMath: RecyclerView.Adapter<RecyclerAdapterMath.ViewHolder>() {
    //list data
    private val gambar = intArrayOf(R.drawable.number1, R.drawable.calculation, R.drawable.shape1)
    private var nama = arrayOf("Numbers", "Counts", "Shapes")
    private var keterangan = arrayOf("Lets learn the numbers", "How many is this ?", "Do you know this shapes ?")



    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemNama: TextView
        var itemKeterangan: TextView

        init {
            itemImage=itemView.findViewById(R.id.item_image)
            itemNama=itemView.findViewById(R.id.item_nama)
            itemKeterangan=itemView.findViewById(R.id.item_keterangan)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapterMath.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return nama.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapterMath.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(gambar[position])
        holder.itemNama.text=nama[position]
        holder.itemKeterangan.text=keterangan[position]
    }
}