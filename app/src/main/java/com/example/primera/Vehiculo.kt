package com.example.primera

class Vehiculo(
    val tipo: Tipo, val traccion: String, val motor: String,
    val asientos: Int, val color: String){
    enum class Tipo{
        Automobil,
        Tractor,
        Autobus
    }

    fun propiedades() {
        println("Propiedades del automobil: ")
        println("Tipo de vehículo: $tipo\tTracción: $traccion\tMotor: $motor\tCapacidad: $asientos\tColor: $color")
    }
}