package com.example.roomdatabase.Adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.Room.RoutainEntity

class RoutainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var textView = itemView.findViewById<TextView>(R.id.tvText1)
    private var textView1 = itemView.findViewById<TextView>(R.id.tvText2)
    private var textView2 = itemView.findViewById<TextView>(R.id.tvText3)
    private var textView3 = itemView.findViewById<TextView>(R.id.tvText4)
    fun setData(routainEntity: RoutainEntity){
        textView.text = routainEntity.Scrum
        textView1.text = routainEntity.DSA
        textView2.text = routainEntity.skillthon
        textView3.text = routainEntity.AndroidCoding

    }
}