package com.turing.alan.cpifp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampionDetailBinding

class ChampionDetailFragment : Fragment() {

    private lateinit var binding: FragmentChampionDetailBinding
    private val repository: ChampionsRepository = InMemoryChampionsRepository.getInstance()
    private val args: ChampionDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChampionDetailBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val championId = args.championId
        val champion = repository.readOne(championId)
        binding.championImage.load(
            champion.imageUrl
        ) {
            placeholder(R.drawable.loading)
            error(R.drawable.loading)
        }
        binding.championName.text = champion.name
        binding.championTitle.text = champion.title
        binding.championLore.text = champion.lore
        binding.returnButton.setOnClickListener { findNavController().popBackStack() }
    }

}