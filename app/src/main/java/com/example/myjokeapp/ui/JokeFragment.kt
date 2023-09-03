package com.example.myjokeapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myjokeapp.adapter.CategoryAdapter
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

        // Dummy-Daten für die Kategorien
        val categories = listOf("Kategorie 1", "Kategorie 2", "Kategorie 3")

        // Initialisiert den Adapter
        val categoryAdapter = CategoryAdapter(categories)

        // Verbindet den Adapter mit dem RecyclerView
        binding.fragmentJokeCategoryRV.adapter = categoryAdapter
    }
}