package com.muhammedtenlik.farkliaktiviteler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
    fun aktiviteDegistir(view :View){
        val editText=findViewById<EditText>(R.id.editText)
        val kullaniciVerisi=editText.text.toString()
        val intent =Intent(applicationContext,MainActivity2::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)

    }

}