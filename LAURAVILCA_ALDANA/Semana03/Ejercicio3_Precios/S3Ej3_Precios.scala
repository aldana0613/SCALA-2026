//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Actualiza precios de un catalogo usando funciones

object Ej3_Precios {

  // Funcion que filtra productos con precio mayor a 50
  def filtrarCaros(catalogo: Map[String, Double]): Map[String, Double] = {
    var resultado: Map[String, Double] = Map()
    for ((producto, precio) <- catalogo) {
      if (precio > 50.00) {
        resultado = resultado + (producto -> precio)
      }
    }
    resultado
  }

  // Funcion que aplica 20% de descuento
  def aplicarDescuento(catalogo: Map[String, Double]): Map[String, Double] = {
    var resultado: Map[String, Double] = Map()
    for ((producto, precio) <- catalogo) {
      resultado = resultado + (producto -> (precio * 0.8))
    }
    resultado
  }

  // Funcion que transforma el mapa en una lista de strings formateados
  def formatearLista(catalogo: Map[String, Double]): List[String] = {
    var lista: List[String] = List()
    for ((producto, precio) <- catalogo) {
      val precioRedondeado = math.round(precio * 100) / 100.0
      lista = lista :+ s"Producto: $producto | Precio Rebajado: $$$precioRedondeado"
    }
    lista
  }

  // Funcion que calcula el precio promedio
  def calcularPromedio(catalogo: Map[String, Double]): Double = {
    var suma = 0.0
    var contador = 0
    for ((_, precio) <- catalogo) {
      suma += precio
      contador += 1
    }
    if (contador == 0) 0.0 else suma / contador
  }

  def main(args: Array[String]): Unit = {
    val catalogo = Map(
      "Laptop" -> 2500.00,
      "Mouse" -> 35.50,
      "Teclado" -> 80.00,
      "Monitor" -> 650.00,
      "Cable USB" -> 15.00
    )

    val caros = filtrarCaros(catalogo)
    val rebajados = aplicarDescuento(caros)
    val listaFormateada = formatearLista(rebajados)
    val promedio = calcularPromedio(rebajados)

    listaFormateada.foreach(println)
    println(s"Precio promedio: $$${math.round(promedio * 100) / 100.0}")
  }
}