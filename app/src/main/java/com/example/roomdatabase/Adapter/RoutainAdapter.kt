package com.example.roomdatabase.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.Room.RoutainEntity

class RoutainAdapter(
    val routainList: List<RoutainEntity>) : RecyclerView.Adapter<RoutainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return RoutainViewHolder(view)
    }

    override fun onBindViewHolder(holder: RoutainViewHolder, position: Int) {
        val routainModel = routainList.get(position)
       return  holder.setData(routainModel)
    }

    override fun getItemCount(): Int {
       return routainList.size
    }
}