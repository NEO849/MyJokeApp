package com.example.myjokeapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        val categorys = listOf("Kategorie 1", "Kategorie 2", "Kategorie 3")              // Dummy-Daten für die Kategorien
        val jokes = listOf("Witz 1", "Witz 2", "Witz 3")                                 // Dummy-Daten für die Witze

        val categoryAdapter = CategoryAdapter(categorys)                                // Initialisiert den CategoryAdapter
        val jokeAdapter = JokeAdapter(jokes)                                            // Initialisiert den JokeAdapter

        binding.fragmentJokeCategoryRV.adapter = categoryAdapter                       // Verbindet den CategoryAdapter mit dem RecyclerView für Kategorie
        binding.fragmentJokeListRV.adapter = jokeAdapter                              // Verbindet den JokeAdapter mit dem RecyclerView für Witze


    }
}