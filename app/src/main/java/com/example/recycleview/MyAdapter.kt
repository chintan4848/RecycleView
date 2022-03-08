package com.example.recycleview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:List<String>):RecyclerView.Adapter<MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var inflater=LayoutInflater.from(parent.context)
        var view=inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text=songs[position]
        holder.discription.text="not set"

//        var color="#ccccc"
//        if(position%2==0)
//        {
//            color="#DA6A6A"
//            holder.container.setBackgroundColor(Color.parseColor(color))
//        }


    }

    override fun getItemCount(): Int {
        return songs.size
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var title=itemView.findViewById<TextView>(R.id.txttitle)
    var discription=itemView.findViewById<TextView>(R.id.txtdescription)
    var container=itemView.findViewById<LinearLayout>(R.id.container)

}