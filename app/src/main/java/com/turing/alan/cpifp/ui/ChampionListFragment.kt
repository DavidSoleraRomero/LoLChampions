package com.turing.alan.cpifp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.data.ChampionsRepository
import com.turing.alan.cpifp.data.InMemoryChampionsRepository
import com.turing.alan.cpifp.databinding.FragmentChampionListBinding

class ChampionListFragment : Fragment() {

    private lateinit var binding: FragmentChampionListBinding
    private val repository: ChampionsRepository = InMemoryChampionsRepository.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChampionListBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.championsList
        val adapter = ChampionListAdapter(::toChampionDetail, ::shareChampion)
        recyclerView.adapter = adapter
        (recyclerView.adapter as ChampionListAdapter).submitList(repository.getChampions())
    }

    private fun toChampionDetail(champion: Champion) {
        val action = ChampionListFragmentDirections.actionChampionListFragmentToChampionDetail(champion.id)
        findNavController().navigate(action)
    }

    private fun shareChampion(champion: Champion) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "El campeón compartido se llama ${champion.name}, con el título ${champion.title}"
        )
        val chooser = Intent.createChooser(intent, "")
        startActivity(chooser)
    }

}