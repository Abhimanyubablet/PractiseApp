package com.example.practiseapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecycleViewAdapter(val context: Context, val datalist :List<DataModel>)
    : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewAdapter.ViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.customer_recycller_view,parent,false)
        return ViewHolder(View)
    }
    override fun onBindViewHolder(holder: RecycleViewAdapter.ViewHolder, position: Int) {
        val data=datalist[position]
        holder.studentClass.text=data.name
        holder.studentName.text=data.clas
        Glide.with(context).load(data.image).into(holder.image)
    }
    override fun getItemCount(): Int {
        return datalist.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.image)
        val studentName=itemView.findViewById<TextView>(R.id.student_name)
        val studentClass=itemView.findViewById<TextView>(R.id.student_course)
    }
}