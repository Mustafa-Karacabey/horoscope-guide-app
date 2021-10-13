package com.example.horoscope_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var burclar = arrayOf("Koç", "Boğa", "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak", "Kova","balık")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var burclarAdaptor = ArrayAdapter(this, android.R.layout.simple_list_item_1, burclar) //Datayı alıp 1 tek viewa dönüştürür

        burclar_view.adapter = burclarAdaptor

        burclar_view.setOnItemClickListener { adapterView, view, i, l ->
            var deneme = view as TextView
            Toast.makeText(this, "${deneme.text.toString()} tıklanılı ve id : ${deneme.id}", LENGTH_LONG)
            println("Tıklanıldı ${deneme.text.toString()}")

        }

    }
}