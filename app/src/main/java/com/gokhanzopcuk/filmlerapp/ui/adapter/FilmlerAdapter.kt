package com.gokhanzopcuk.filmlerapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.gokhanzopcuk.filmlerapp.data.entity.filmler
import com.gokhanzopcuk.filmlerapp.databinding.CardTasarimBinding
import com.gokhanzopcuk.filmlerapp.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext:Context,var filmlerListesi:List<filmler>):RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)

    }
    override fun getItemCount(): Int {
        return filmlerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
      val film=filmlerListesi.get(position)
        val t=holder.tasarim
        t.imageView.setImageResource(
            mContext.resources.getIdentifier(film.resim,"drawable",mContext.packageName))
        //resmi görüntüledik

        t.textViewFiyat.text="${film.fiyat}"
      t.cardViewFilm.setOnClickListener {
      val gecis=AnasayfaFragmentDirections.detayGecis(film =film)
          Navigation.findNavController(it).navigate(gecis)

      }
        t.button.setOnClickListener {
            Snackbar.make(it,"${film.ad}  sepete eklendi",Snackbar.LENGTH_SHORT).show()

        }

    }

}