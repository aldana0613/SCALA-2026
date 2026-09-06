//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Usa un iterador para detectar cantidades por debajo de un umbral

object Ej3_Inventario {

  def revisarInventario(cantidades: List[Int], umbral: Int): Unit = {
    val it = cantidades.iterator

    while (it.hasNext) {
      val cantidad = it.next()
      // Solo imprimimos las cantidades que estan por debajo del umbral
      if (cantidad < umbral) {
        println(s"Cantidad $cantidad requiere reposicion inmediata")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val cantidades = List(50, 3, 20, 8, 100, 1)
    val umbral = 10

    revisarInventario(cantidades, umbral)
  }
}