package com.example.intentoderecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.intentoderecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvFrutas.layoutManager=LinearLayoutManager(this)
        binding.rvFrutas.adapter=FrutaAdapter(FrutaProvider.listaFrutas){fruta ->
            onItemSelected(fruta)
        }
        binding.rvFrutas.setHasFixedSize(true)
        binding.rvFrutas.itemAnimator=DefaultItemAnimator()
        val decoration=DividerItemDecoration(this,RecyclerView.VERTICAL)
        binding.rvFrutas.addItemDecoration(decoration)
    }

    private fun onItemSelected(fruta: Fruta) {
        Toast.makeText(this,"Has pulsado sobre ${fruta.nombre}",Toast.LENGTH_SHORT).show()
    }
}