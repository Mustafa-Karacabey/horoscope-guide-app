package com.example.horoscope_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var burclar = resources.getStringArray(R.array.burclar)
        var burcTarihler = resources.getStringArray(R.array.burcTarih)
        var burcResimler = arrayOf(R.drawable.kocburcu, R.drawable.bogaburcu, R.drawable.ikizler, R.drawable.yengecburcu, R.drawable.aslanburcu,
            R.drawable.basakburcu, R.drawable.teraziburcu, R.drawable.akrepburcu, R.drawable.yayburcu, R.drawable.oglakburcu, R.drawable.kovaburcu, R.drawable.balikburcu )

        var adapter = myArrayAdapter(this, R.layout.activity_main_burc, R.id.burclar_view, burclar, burcTarihler, burcResimler )

        burclar_view.adapter = adapter



    }
}

/* BASIC : ARRAYADAPTER
      //var burclarAdaptor = ArrayAdapter(this, android.R.layout.simple_list_item_1, burclar) //Datayı alıp 1 tek viewa dönüştürür
      //var burclarAdaptor = ArrayAdapter(this, R.layout.activity_burc_item, R.id.burc_text, burclar)  bizim ihtiyaçlarımız için yetmiyor bunun yerine Custom Array Adaptor yazıcağız ya da BaseAdaptor Kullanacağız

      //burclar_view.adapter = burclarAdaptor
      burclar_view.setOnItemClickListener { adapterView, view, i, l ->
          var deneme = view as TextView
          Toast.makeText(this, "${deneme.text.toString()} tıklanılı ve id : ${deneme.id}", LENGTH_LONG)
          println("Tıklanıldı ${deneme.text.toString()}")

      }*/