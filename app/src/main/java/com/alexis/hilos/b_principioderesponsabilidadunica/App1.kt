package com.alexis.hilos.b_principioderesponsabilidadunica

fun main(){

    var lista:ArrayList<HiloPropioPRU> = ArrayList()


    for(i in 0..4){
        var objetoHilo =HiloPropioPRU()
        lista.add(objetoHilo)
    }

    for(i in 0..4){

        var azar = (1000..9000).random().toLong()
        lista[i].crearHilo(i,azar)

    }


}