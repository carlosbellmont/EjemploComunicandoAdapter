package com.cbellmont.ejemploandroidviewmodel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbellmont.ejemploandroidviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Log.d(MainActivity::class.java.simpleName, "Iniciando ViewModel")
        val model = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //Log.d(MainActivity::class.java.simpleName, "ViewModel iniciado")

        val adapter = FilmsAdapter(model.getFilms(), this)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

    }

    fun escribirToast(){
        Toast.makeText(this, "Has clickado", Toast.LENGTH_SHORT).show()
    }

}