//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción: Usa un iterador para detectar temperaturas fuera de rango seguro

import scala.io.StdIn.readInt

object Ej1_Temperaturas {

  def verificarTemperaturas(temperaturas: List[Int], minimo: Int, maximo: Int): Unit = {
    // Creamos un iterador a partir de la lista
    val it = temperaturas.iterator
    var hayAlerta = false

    // Recorremos el iterador elemento por elemento
    while (it.hasNext) {
      val temp = it.next()
      // Si la temperatura esta fuera del rango seguro, se imprime y se marca alerta
      if (temp < minimo || temp > maximo) {
        println(s"Temperatura fuera de rango: $temp°C")
        hayAlerta = true
      }
    }

    // Al terminar de iterar, si hubo al menos una fuera de rango, mostramos la alerta
    if (hayAlerta) {
      println("Alerta de estabilidad")
    }
  }

  def main(args: Array[String]): Unit = {
    val temperaturas = List(5, 15, 22, 45, 30, 8, 41)

    print("Ingrese la temperatura minima segura: ")
    val minimo = readInt()
    print("Ingrese la temperatura maxima segura: ")
    val maximo = readInt()

    verificarTemperaturas(temperaturas, minimo, maximo)
  }
}

 
