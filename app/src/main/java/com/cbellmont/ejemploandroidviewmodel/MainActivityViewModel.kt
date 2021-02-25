package com.cbellmont.ejemploandroidviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay


class MainActivityViewModel  : ViewModel() {


    fun getFilms() : MutableList<Film>{
        return mutableListOf(
            Film(1, "La Amenaza Fantasma", "aaaa"),
            Film(2, "El Ataque de los Clones", "aaaa"),
            Film(3, "La Venganza de los Sith", "aaaa"),
            Film(4, "Una Nueva Esperanza", "aaaa"),
            Film(5, "El Imperio Contraataca", "aaaa"),
            Film(6, "El Retorno del Jedi", "aaaa"),
            Film(4, "El Despertar de la Fuerza", "aaaa"),
            Film(5, "Los Útimos Jedi", "aaaa"),
            Film(6, "El Ascenso de Skywalker", "aaaa")
        )
    }
}