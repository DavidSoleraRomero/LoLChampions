package com.turing.alan.cpifp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.turing.alan.cpifp.R
import com.turing.alan.cpifp.data.Champion
import com.turing.alan.cpifp.databinding.ChampionViewBinding

class ChampionListAdapter(): ListAdapter<Champion, ChampionListAdapter.ChampionViewHolder>(ChampionComparer) {

    class ChampionViewHolder(private val binding: ChampionViewBinding): RecyclerView.ViewHolder(binding.root) {

        // Asocia las propiedades del campeón a las propiedades de las vistas
        fun bind(champion: Champion) {
            binding.championImage.load(champion.imageUrl) {
                placeholder(R.drawable.loading)
            }
            binding.championName.text = champion.name
            binding.championTitle.text = champion.title
            binding.championLore.text = champion.lore
        }

    }

    // Se crea un ViewHolder que apunta a las referencias del XML del campeón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionViewHolder {
        val binding: ChampionViewBinding = ChampionViewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ChampionViewHolder(binding);
    }

    // Se vincula un campeón al ViewHolder
    override fun onBindViewHolder(holder: ChampionViewHolder, position: Int) {
        val champion: Champion = getItem(position); // Obtiene el campeón de la posición de la lista
        holder.bind(champion); // Vincula el campeón a una vista XML
    }

    // Permite al RecyclerView comparar objetos
    object ChampionComparer: DiffUtil.ItemCallback<Champion>() {
        override fun areItemsTheSame(oldItem: Champion, newItem: Champion): Boolean = oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Champion, newItem: Champion): Boolean =
            oldItem.name == newItem.name &&
                    oldItem.title == newItem.title &&
                        oldItem.lore == newItem.lore

    }

}