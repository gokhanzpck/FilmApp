package com.gokhanzopcuk.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.gokhanzopcuk.filmlerapp.R
import com.gokhanzopcuk.filmlerapp.data.entity.filmler
import com.gokhanzopcuk.filmlerapp.databinding.FragmentAnasayfaBinding
import com.gokhanzopcuk.filmlerapp.ui.adapter.FilmlerAdapter
import kotlinx.coroutines.flow.asFlow

class AnasayfaFragment : Fragment() {
   private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
          binding=FragmentAnasayfaBinding.inflate(layoutInflater, container, false)
        binding.toolbarAnasayfa.title="FİLMLER"
        binding.filmRv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
         var filmlerListesi=ArrayList<filmler>()
        val f1=filmler(1,"Django","django",24)
        val f2=filmler(2,"Insteraller","interstellar",32)
        val f3=filmler(3,"Inception","inception",16)
        val f4=filmler(4,"The Hetaful Eight","thehatefuleight",28)
        val f5=filmler(5,"The Pyanist","thepianist",18)
        val f6=filmler(6,"Anadoluda","anadoluda",10)
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)
         val filmleradapter=FilmlerAdapter(requireContext(),filmlerListesi)
        binding.filmRv.adapter=filmleradapter




        return binding.root

    }

}