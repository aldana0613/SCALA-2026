//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción: Usa un iterador sobre un Map para buscar un producto por nombre

object Ej2_Catalogo {

  def buscarProducto(catalogo: Map[String, Double], nombreBuscado: String): Unit = {
    // Iterador sobre las entradas (clave, valor) del mapa
    val it = catalogo.iterator
    var encontrado = false

    while (it.hasNext && !encontrado) {
      val (producto, precio) = it.next()
      if (producto == nombreBuscado) {
        println(s"El precio de $producto es $$$precio")
        encontrado = true
      }
    }

    // Si el iterador se agoto y no se encontro, mostramos el mensaje correspondiente
    if (!encontrado) {
      println("Producto no encontrado en el catalogo actual")
    }
  }

  def main(args: Array[String]): Unit = {
    val catalogo = Map(
      "Laptop" -> 2500.00,
      "Mouse" -> 35.50,
      "Teclado" -> 80.00,
      "Monitor" -> 650.00
    )

    buscarProducto(catalogo, "Teclado")   // caso: si existe
    buscarProducto(catalogo, "Impresora") // caso: no existe
  }
}