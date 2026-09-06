//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Usa un iterador para detectar cantidades por debajo de un umbral

def revisarInventario(cantidades: List[Int], umbral: Int): Unit =
  // Creamos un iterador a partir del Map
  val it = cantidades.iterator // creacion de un iterador a partir del Map

  while it.hasNext do //se recorre el iterador elemento por elemento
    val cantidad = it.next()
    
    if cantidad < umbral then //si la cantidad es menor al umbral, entonces se imprime y marca la alerta 
      println(s"Cantidad $cantidad requiere reposicion inmediata")
      
@main def S2Ej3_Inventario(): Unit =
  val cantidades = List(50, 3, 20, 8, 100, 1)
  val umbral = 10

  revisarInventario(cantidades, umbral)