package com.alexis.hilos.c_interfaces

import com.alexis.hilos.d_interfaces.HiloPropioPRU3

fun main(){

    var lista:List<String> = listOf("La Mascara", "The Joker", "The Batman", "Iron Man", "Capitan America")
    var a:String

    for(i in 0..4){
        var a = lista[i]
        var peli = HiloPropioPRU2(a)
        peli.descargarPelicula(object: ListenerDescarga{
            override fun descargaFinalizada() {
                println("PELÍCULA ${peli.pelicula} DESCARGADA")
                println("PLAY A LAS PELÍCULA ${peli.pelicula}")
            }
        })
    }


}