//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026Usa un iterador para detectar temperaturas fuera de rango seguro
//Descripción: Usa un iterador sobre un Map para buscar un producto por nombre

import scala.io.StdIn

object Ejercicio1 {

  def temperaturasFueraDeRango(temperaturas: List[Int], minimo: Int, maximo: Int): Unit = {
    val it = temperaturas.iterator
    var hayAlerta = false

    while (it.hasNext) {
      val temp = it.next()

      if (temp < minimo || temp > maximo) {
        println(s"Temperatura fuera de rango: $temp°C")
        hayAlerta = true
      }
      else {
        println(s"Temperatura dentro del rango: $temp°C")
      }
    }

    if (hayAlerta) {
      println("Alerta de estabilidad")
    }
  }

  def main(args: Array[String]): Unit = {
    val temperaturas = List(5, 15, 22, 38, 42, 8, 25)

    println("Ingrese la temperatura mínima segura:")
    val minimo = StdIn.readInt()

    println("Ingrese la temperatura máxima segura:")
    val maximo = StdIn.readInt()

    temperaturasFueraDeRango(temperaturas, minimo, maximo)
  }
}