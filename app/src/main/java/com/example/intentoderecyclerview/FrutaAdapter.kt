package com.example.intentoderecyclerview

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

 class FrutaAdapter ( private val frutasLista:List<Fruta>,
     private val  onClickListener:(Fruta)->Unit): RecyclerView.Adapter<FrutaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrutaViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return FrutaViewHolder(layoutInflater.inflate(R.layout.item_fruta, parent, false))
    }

     override fun onBindViewHolder(holder:FrutaViewHolder, position:Int){
         val item=frutasLista[position]
         holder.render(item, onClickListener)
     }

    override fun getItemCount(): Int {
        return frutasLista.size
    }
}
