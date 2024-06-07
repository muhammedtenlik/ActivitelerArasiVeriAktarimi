package com.muhammedtenlik.farkliaktiviteler

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val textView=findViewById<TextView>(R.id.textView2)
        val intent=getIntent().getStringExtra("yollananVeri")
        textView.text=intent
    }




}