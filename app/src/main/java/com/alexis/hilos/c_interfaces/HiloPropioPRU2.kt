package com.alexis.hilos.c_interfaces

class HiloPropioPRU2(var pelicula:String) {

    fun descargarPelicula(listener: ListenerDescarga){
        var tiempo:Long = (1000..10000).random().toLong()
        var hilo = Thread(Runnable {
            println("Descargando película $pelicula")
            println("Esperando descarga de $pelicula")
            Thread.sleep(tiempo)
            listener.descargaFinalizada()
        })
        hilo.start()
    }

}