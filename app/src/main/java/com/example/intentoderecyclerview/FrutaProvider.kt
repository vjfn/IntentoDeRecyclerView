package com.example.intentoderecyclerview

 class FrutaProvider {
    companion object{
        val listaFrutas= listOf(
            Fruta("Fresas","La fresa de Huelva, la mejor del mundo",R.drawable.fresa),
            Fruta("Manzanas","Manzanas golden, pink lady...", R.drawable.manzana),
            Fruta("Peras","Peras blanquilla, conferencia, limonera...",R.drawable.pera),
            Fruta("Platanos","Plátanos de Canarias, mejor que las bananas",R.drawable.platano),
            Fruta("Cerezas","Las más ricas del mundo",R.drawable.cereza),
            Fruta("Naranjas","Estas no son de valencia",R.drawable.naranja),
            Fruta("Frambuesas","Las frambuesas aportan potasio,calcio...",R.drawable.frambuesa))
    }
}