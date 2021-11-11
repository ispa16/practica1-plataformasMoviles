package com.example.primera

class Ciudadano (val nombre: String, val apellido: String, val edad: Int) {
    fun edadLegal() {
        if (edad >= 18) {
            println("$apellido $nombre  es legal")
        } else {
            println("$apellido $nombre  es ilegal")
        }
    }
}