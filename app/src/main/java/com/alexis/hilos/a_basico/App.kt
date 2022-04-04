package com.alexis.hilos.a_basico

import java.util.Random

fun main(){

    //HILO PRINCIPAL
    println("INICIANDO HILO PRINCIPAL")
    println("ESPERANDO 0 SEGUNDOS EL HILO PRINCIPAL")
    println("HILO PRINCIPAL HA TERMINADO")
    ////HILO PRINCIPAL



    for (i in 1..5){
        var azar = (1000..9000).random().toLong()
        crearHilo(i,azar)
    }
}

fun crearHilo(num:Int, dormir:Long){
    var hilo = Thread(Runnable {
        println("HILO SECUNDARIO $num INICIANDO")
        println("HILO SECUNDARIO $num DORMIDO POR ${dormir/1000} SEGUNDOS")
        Thread.sleep(dormir)
        println("HILO SECUNDARIO $num HA TERMINADO")
    })
    hilo.start()
}