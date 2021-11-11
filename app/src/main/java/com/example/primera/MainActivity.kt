package com.example.primera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listadoEstudiantes()
        Insercion()
        validarCedula ()
    }
    private fun verEdad() {
        val persona1 = Ciudadano(nombre = "Israel", apellido = "Tapia", edad = 21)
        persona1.edadLegal()
    }

    private fun multiplicar() {
        var aux = 4

        println("Tabla  ascendente")
        for (i in 0..12) {
            var resultado = aux * i
            println("$aux x$i=" + resultado)
        }

        println("Tabla descendente")
        for (i in 12 downTo 0) {
            var resultado2 = aux * i
            println("$aux x$i=" + resultado2)
        }
    }

    private fun listadoEstudiantes() {
        val estudiantes = listOf(
            "Ian Ortega", "Jeferson Cueva","Edgar Guamo", "Erick Jaramillo", "Daniel Medina",
            "David Pillco", "Israel Tapia", "Jordy Esparza", "Ricardo Freire"
        )

        val grupo = mutableMapOf(
            "Ian Ortega" to 1, "Jeferson Cueva" to 1, "Edgar Guamo"
                    to 2, "Erick Jaramillo" to 2, "Daniel Medina" to 2, "David Pillco" to 3,
            "Israel Tapia" to 1, "Jordy Esparza" to 3, "Ricardo Freire" to 4
        )


        // ordenar estudiantes
        val ordenado = estudiantes.sorted()
        for (x in ordenado) {
            println(x)
        }


        // grupo ordenado
        val grupoorden = grupo.toSortedMap()
        // grupo ordenado por valor
        val grupoorden2 = grupo.toList().sortedBy { (k, v) -> v }.toMap()

        for (sub in grupoorden) {
            println("key :${sub.key} - value: ${sub.value}")
        }

    }

    private fun autos() {
        val vehiculo1 = Vehiculo(tipo = Vehiculo.Tipo.Autobus,traccion = "delantera",asientos = 60,motor = "4WD",color = "rojo")

        val vehiculo2 = Vehiculo(tipo = Vehiculo.Tipo.Tractor,traccion = "4x4",asientos = 3,motor = "10WD",color = "amarillo")

        vehiculo1.propiedades()
    }

    //ordenar lista
    private fun Insercion () {
        var num = mutableListOf(1,3,6,4,5,6)
        var i: Int
        var j: Int
        var first: Int
        var temp: Int
        i = num.size - 1
        while (i > 0) {
            first = 0
            j = 1
            while (j <= i) {
                if (num.get(j) < num.get(first)) first = j
                j++
            }
            temp = num.get(first)
            num[first] = num.get(i)
            num[i] = temp
            i--
        }
        println(num)

    }
    private fun validarCedula () {
        val num = mutableListOf(2,1,2,1,2,1,2,1,2)
        var num2 = mutableListOf(2,1,2,1,2,1,2,1,2)
        var cedula = "1104076797"
        var b = 0
        val digits = cedula.map(Character::getNumericValue).toIntArray()
        for (i in digits){
            if ( b < digits.size-1 ){
                var aux = i* num[b]
                //println(i.toString() +"s" + num[b])
                if(aux.toString().length > 1 ){
                    val digits2 = aux.toString().map(Character::getNumericValue).toIntArray()
                    aux=0
                    for( x in digits2){
                        aux += x
                    }
                }
                //println(aux)
                num2[b]= aux
                b += 1
            }


        }
        var resultado =  digits.sum() - num2.sum()
        println(resultado)


    }
}