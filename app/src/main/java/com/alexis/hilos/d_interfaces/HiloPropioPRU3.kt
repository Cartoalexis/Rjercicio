package com.alexis.hilos.d_interfaces

class HiloPropioPRU3(var pelicula:String): ListenerDescarga2 {

    fun descargarPelicula(){
        var tiempo:Long = (1000..10000).random().toLong()
        var hilo = Thread(Runnable {
            println("Descargando película $pelicula")
            println("Esperando descarga de $pelicula")
            mientrasSeDescarga()
            Thread.sleep(tiempo) //simulación de la descarga
            println("${tiempo/1000} SEGUNDOS")
            descargaFinalizada()
        })
        hilo.start()
    }




    override fun descargaFinalizada() {
        println("DESCARGA DE PELICULA ${pelicula} FINALIZADA")
        println("PLAY PELICULA ${pelicula}")
    }

    override fun mientrasSeDescarga() {
        println("CARGANDO ${pelicula}..........")
    }
}