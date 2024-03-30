package com.ifs21044.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdapterPanggilan(private val pangList: ArrayList<Panggilan>) : RecyclerView.Adapter<AdapterPanggilan.MyViewHolder>() {

    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.panggilan_list, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return pangList.size
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentEmp = pangList[position]
        holder.pppanggilan.setImageResource(currentEmp.pppanggilan)
        holder.namapemanggil.text = currentEmp.namapemanggil
        holder.kapan.text = currentEmp.kapan
        holder.masuk.setImageResource(currentEmp.masuk)
        holder.call.setImageResource(currentEmp.call)
    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val pppanggilan: ImageView = itemView.findViewById(R.id.pppanggilan)
        val namapemanggil: TextView = itemView.findViewById(R.id.namapemanggil)
        val kapan: TextView = itemView.findViewById(R.id.kapan)
        val masuk: ImageView = itemView.findViewById(R.id.masuk)
        val call: ImageView = itemView.findViewById(R.id.call)
    }
}