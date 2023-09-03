package com.example.myjokeapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myjokeapp.R
import com.example.myjokeapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialisiert das View Binding
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Verwendet die View Binding-Instanz, um auf die Views zuzugreifen
        // Setzt einen OnClickListener für den "Witze"-Button
        binding.jokeBTN.setOnClickListener {
            // Navigiert zum JokeFragment
            findNavController().navigate(R.id.action_homeFragment_to_jokeFragment)
        }
    }
}