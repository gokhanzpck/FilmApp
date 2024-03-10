package com.gokhanzopcuk.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.gokhanzopcuk.filmlerapp.R
import com.gokhanzopcuk.filmlerapp.databinding.FragmentAnasayfaBinding
import com.gokhanzopcuk.filmlerapp.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
         binding= FragmentDetayBinding.inflate(layoutInflater, container, false)
      val bundle:DetayFragmentArgs by navArgs()
        val film=bundle.film
        binding.toolbarDetay.title=film.ad
        binding.imageViewFilm.setImageResource(
            resources.getIdentifier(film.resim,"drawable",requireContext().packageName))
         binding.textView.text="${film.fiyat}"



        return binding.root
    }


}