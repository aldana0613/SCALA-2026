//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Actualiza precios de un catalogo usando funciones de orden superior

@main def S4Ej3_PreciosHOF(): Unit =
  val catalogo = Map(
    "Laptop" -> 2500.00,
    "Mouse" -> 35.50,
    "Teclado" -> 80.00,
    "Monitor" -> 650.00,
    "Cable USB" -> 15.00
  )

  // filter: nos quedamos solo con productos de precio mayor a 50
  // map: aplicamos 20% de descuento a cada precio restante
  val rebajados = catalogo
    .filter { case (_, precio) => precio > 50.00 }
    .map { case (producto, precio) => producto -> (precio * 0.8) }

  // map: transformamos cada entrada del mapa en un String formateado
  val listaFormateada = rebajados.map { case (producto, precio) =>
    val precioRedondeado = math.round(precio * 100) / 100.0
    s"Producto: $producto | Precio Rebajado: $$$precioRedondeado"
  }.toList

  // map + sum: calculamos el precio promedio de los productos resultantes
  val promedio =
    if rebajados.isEmpty then 0.0
    else rebajados.values.sum / rebajados.size

  listaFormateada.foreach(println)
  println(s"Precio promedio: $$${math.round(promedio * 100) / 100.0}")