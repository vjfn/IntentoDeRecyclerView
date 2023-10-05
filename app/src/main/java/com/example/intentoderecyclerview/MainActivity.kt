package com.example.intentoderecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.intentoderecyclerview.FrutaProvider.Companion.listaFrutas
import com.example.intentoderecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FrutaAdapter
    private lateinit var layoutManager:LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        layoutManager=LinearLayoutManager(this)
        binding.rvFrutas.layoutManager=layoutManager
        adapter=FrutaAdapter(FrutaProvider.listaFrutas){fruta ->
            onItemSelected(fruta)
        }
        binding.rvFrutas.adapter=adapter
        binding.rvFrutas.setHasFixedSize(true)
        binding.rvFrutas.itemAnimator=DefaultItemAnimator()
        val decoration=DividerItemDecoration(this,RecyclerView.VERTICAL)
        binding.rvFrutas.addItemDecoration(decoration)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.addFruta -> {
                addFruta()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun addFruta() {
        listaFrutas.add(listaFrutas.size,Fruta("Nueva fruta ${listaFrutas.size}",
            "Desconocida", R.drawable.ciruela))
    adapter.notifyItemInserted(listaFrutas.size)
    layoutManager.scrollToPosition(listaFrutas.size)
    }

    private fun onItemSelected(fruta: Fruta) {
        Toast.makeText(this,"Has pulsado sobre ${fruta.nombre}",Toast.LENGTH_SHORT).show()
    }
}