//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción: Usa un iterador sobre un Map para buscar un producto por nombre

def buscarProducto(catalogo: Map[String, Double], nombreBuscado: String): Unit =
  // Creamos un iterador a partir del Map
  val it = catalogo.iterator // creacion de un iterador a partir del Map
  var encontrado = false

  while it.hasNext && !encontrado do //se recorre el iterador elemento por elemento
    val (producto, precio) = it.next()
    
    if producto == nombreBuscado then //si el producto coincide con el nombre buscado, entonces se imprime y marca como encontrado
      println(s"El precio de '$producto' es: $$$precio")
      encontrado = true

  if !encontrado then // Cuando se termina de iterar, si no se encontró el producto, se muestra el mensaje correspondiente
    println(s"Producto no encontrado en el catálogo actual.")

@main def S2Ej2_Catalogo(): Unit =
  val catalogo = Map(
    "Laptop" -> 2500.00,
    "Mouse" -> 35.50,
    "Teclado" -> 80.00,
    "Monitor" -> 650.00
  )

  buscarProducto(catalogo, "Teclado") // Ejemplo de búsqueda de un producto que no está en el catálogo
  buscarProducto(catalogo, "Tablet") // Ejemplo de búsqueda de un producto que sí está en el catálogo