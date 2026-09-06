//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción: Usa un iterador para detectar temperaturas fuera de rango seguro

import scala.io.StdIn.readInt

def verificarTemperaturas(temperaturas: List[Int], minimo: Int, maximo: Int): Unit =
  
  val it = temperaturas.iterator // creacion de un iterador a partir de la lista
  var hayAlerta = false

  while it.hasNext do //se recorre el iterador elemento por elemento
    val temp = it.next()
    
    if temp < minimo || temp > maximo then //si la temperatura no esta en el rango seguro, entonces se imprime y marca la alerta 
      println(s"Temperatura fuera de rango: $temp°C")
      hayAlerta = true

  if hayAlerta then // Cuando se termina de iterar, si hubo al menos una fuera de rango, se muestra la alerta
    println("Alerta de estabilidad")

@main def S2Ej1_Temperaturas(): Unit =
  val temperaturas = List(5, 15, 22, 45, 30, 8, 41)

  print("Ingrese la temperatura minima segura: ")
  val minimo = readInt()
  print("Ingrese la temperatura maxima segura: ")
  val maximo = readInt()

  verificarTemperaturas(temperaturas, minimo, maximo)

 
