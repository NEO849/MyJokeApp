package com.example.myjokeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myjokeapp.databinding.CategoryJokeBinding

// ist für die Darstellung der Witzkategorien in der horizontalen RecyclerView verantwortlich.
class CategoryAdapter(private val categorys: List<String>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    // Ein ViewHolder repräsentiert ein einzelnes Item in der RecyclerView.
    inner class CategoryViewHolder(val binding: CategoryJokeBinding) : RecyclerView.ViewHolder(binding.root)

    // onCreateViewHolder wird aufgerufen, um einen neuen ViewHolder zu erstellen, LayoutInflater wird verwendet, um das XML-Layout in ein View-Objekt umzuwandeln.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = CategoryJokeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    // onBindViewHolder wird aufgerufen, um den Inhalt eines ViewHolders zu füllen.
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        // Holt den Kategorienamen aus dem dataset
        val category = categorys[position]

        // Setze den Text des TextViews im ViewHolder
        holder.binding.jokeCategoryTV.text = category

        // OnClickListener für den CardView
        holder.binding.categoryJokeCV.setOnClickListener {
            // Hier Logik , um die darunter liegende FragmentContainerView zu aktualisieren
        }
    }

    //  gibt die Anzahl der Elemente in der Datenquelle zurück.
    override fun getItemCount(): Int {
        return categorys.size
    }
}