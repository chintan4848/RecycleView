package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.RecyclerView.Recycler as Recycler1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data part
        var song= listOf<String>("classical","drama","pop","hiphop","rap","classical","drama","pop","hiphop","rap")

        //data pass to adapter
        songList.adapter=MyAdapter(song)

        //manage layout in recycleview
        songList.layoutManager=LinearLayoutManager(this)

    }
}