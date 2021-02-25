package com.cbellmont.ejemploandroidviewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FilmsAdapter(private val films: List<Film>) : RecyclerView.Adapter<FilmsAdapter.FilmsViewHolder>() {


    class FilmsViewHolder(root: View, var tvNombre: TextView, var tvIntro: TextView) : RecyclerView.ViewHolder(root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.film_layout, parent, false)
        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvIntro = view.findViewById<TextView>(R.id.tvIntro)
        return FilmsViewHolder(view, tvName, tvIntro)
    }

    override fun getItemCount(): Int {
        return films.size
    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        holder.tvIntro.text = films[position].intro
        holder.tvNombre.text = films[position].name
    }
}
