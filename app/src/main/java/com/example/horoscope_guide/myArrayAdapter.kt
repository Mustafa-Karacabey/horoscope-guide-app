package com.example.horoscope_guide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main_burc.view.*


class myArrayAdapter(context: Context, resource: Int, textViewResourceId: Int, var  burcAdlari : Array<String>, var  burcTarihleri : Array<String>, var burcResimleri : Array<Int>) : ArrayAdapter<String>(context, resource, textViewResourceId, burcAdlari){



    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var inflater = LayoutInflater.from(context)

        var view = inflater.inflate(R.layout.activity_main_burc,parent, false)

        var burc_resmi = view.burc_image
        var burc_adi = view.burc_adi
        var burc_tarih = view.burc_tarihi

        burc_resmi.setImageResource(burcResimleri[position])
        burc_adi.setText(burcAdlari[position])
        burc_tarih.setText(burcTarihleri[position])


        return view//super.getView(position, convertView, parent)
    }
}

