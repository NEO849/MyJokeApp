package com.example.myjokeapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myjokeapp.adapter.CategoryAdapter
import com.example.myjokeapp.adapter.JokeAdapter
import com.example.myjokeapp.databinding.FragmentJokeBinding

class JokeFragment : Fragment() {

    private lateinit var binding: FragmentJokeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initialisiert das View Binding
        binding = FragmentJokeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categorys = listOf("Alle","Coden", "Verschiedenes", "Düster", "Wortspiele", "Gespenstisch", "Weihnachten")              // Dummy-Daten für die Kategorien
        val jokes = listOf("Witz 1", "Witz 2", "Witz 3", "Witz 4", "Witz 5", "Witz 6", "Witz 7", "Witz 8", "Witz 9", "Witz 10")

        val categoryAdapter = CategoryAdapter(categorys)                                // Initialisiert den CategoryAdapter
        val jokeAdapter = JokeAdapter(jokes)                                            // Initialisiert den JokeAdapter

        // Setzt den LayoutManager für die Kategorie-RV auf´en horizontalen LinearLayoutManager
        binding.fragmentJokeCategoryRV.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.fragmentJokeListRV.layoutManager = LinearLayoutManager(requireContext())
        binding.fragmentJokeCategoryRV.adapter = categoryAdapter                       // Verbindet den CategoryAdapter mit dem RecyclerView für Kategorie
        binding.fragmentJokeListRV.adapter = jokeAdapter                               // Verbindet den JokeAdapter mit dem RecyclerView für Witze


    }
}