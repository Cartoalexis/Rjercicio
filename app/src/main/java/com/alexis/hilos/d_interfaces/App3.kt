package com.alexis.hilos.d_interfaces

fun main(){

    var lista:List<String> = listOf("La Mascara", "The Joker", "The Batman", "Iron Man", "Capitan America")
    var a:String

    for(i in 0..4){
        var a = lista[i]
        var hilo = HiloPropioPRU3(a)
        hilo.descargarPelicula()
    }

}