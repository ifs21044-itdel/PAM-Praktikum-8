package com.ifs21044.whatsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val emplist: ArrayList<Employee>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_list, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return emplist.size
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentEmp = emplist[position]
        holder.profileImage.setImageResource(currentEmp.profileImage)
        holder.name.text = currentEmp.name
        holder.email.text = currentEmp.email
        holder.waktunya.text = currentEmp.waktunya

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            Toast.makeText(context, "Pesan dari ${currentEmp.name} diklik", Toast.LENGTH_SHORT).show()
        }

    }



    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.profileImage)
        val name: TextView = itemView.findViewById(R.id.tvName)
        val email: TextView = itemView.findViewById(R.id.tvEmail)
        val waktunya: TextView = itemView.findViewById(R.id.waktunya)
    }

}