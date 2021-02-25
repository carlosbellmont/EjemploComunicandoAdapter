package com.cbellmont.ejemploandroidviewmodel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbellmont.ejemploandroidviewmodel.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Log.d(MainActivity::class.java.simpleName, "Iniciando ViewModel")
        val model = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //Log.d(MainActivity::class.java.simpleName, "ViewModel iniciado")

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = FilmsAdapter(model.downloadFilms())
    }

}