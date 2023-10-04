package com.example.intentoderecyclerview;


import android.view.View;
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.intentoderecyclerview.databinding.ItemFrutaBinding

class FrutaViewHolder(view:View): RecyclerView.ViewHolder(view) {

    val binding = ItemFrutaBinding.bind(view)

    fun render(item:Fruta, onClickListener: (Fruta)->Unit){
        binding.tvFrutaNombre.text=item.nombre
        binding.tvDescripcion.text=item.descripcion
        binding.ivFruta.setImageResource(item.imagen)
        itemView.setOnClickListener{
            onClickListener(item)
            /*Toast.makeText(
                binding.ivFruta.context,
                "Has pulsado sobre ${item.nombre}",
                Toast.LENGTH_SHORT
            ).show()*/
        }
    }

}
