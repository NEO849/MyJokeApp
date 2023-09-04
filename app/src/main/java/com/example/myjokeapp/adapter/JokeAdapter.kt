package com.example.myjokeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myjokeapp.databinding.ListJokeBinding

// ist verantwortlich für die Darstellung der Witze in der RecyclerView.
class JokeAdapter(private val jokes: List<String>) : RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    // JokeViewHolder repräsentiert ein einzelnes Item (einen Witz) in der RecyclerView.
    inner class JokeViewHolder(val binding: ListJokeBinding) : RecyclerView.ViewHolder(binding.root)

    // Diese Methode wird aufgerufen, um einen neuen ViewHolder zu erstellen.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val binding = ListJokeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return JokeViewHolder(binding)
    }

    // Diese Methode wird aufgerufen, um den Inhalt eines ViewHolders zu füllen.
    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        val joke = jokes[position]
        holder.binding.jokeTV.text = joke
    }

    // Diese Methode gibt die Anzahl der Elemente in der Datenquelle zurück.
    override fun getItemCount(): Int {
        return jokes.size
    }
}