package com.alexis.hilos.b_principioderesponsabilidadunica

class HiloPropioPRU {

    fun crearHilo(num:Int, dormir:Long){
        var a = Thread(Runnable {
            println("HILO SECUNDARIO $num INICIANDO")
            println("HILO SECUNDARIO $num DORMIDO POR ${dormir/1000} SEGUNDOS")
            Thread.sleep(dormir)
            println("HILO SECUNDARIO $num HA TERMINADO")
        })
        a.start()
    }




}