//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción: Genera un reporte de lecturas rapidas usando funciones de orden superior

case class LibroHOF(titulo: String, autor: String, paginas: Int)

object Ej1_LibrosHOF {

  def main(args: Array[String]): Unit = {
    val libros = List(
      LibroHOF("El Principito", "Saint-Exupery", 96),
      LibroHOF("Cien Anios de Soledad", "Garcia Marquez", 471),
      LibroHOF("La Metamorfosis", "Kafka", 90),
      LibroHOF("Rayuela", "Cortazar", 635)
    )

    // filter: nos quedamos solo con libros de menos de 200 paginas
    // map: transformamos cada libro en su titulo formateado
    val titulosFormateados = libros
      .filter(libros => libros.paginas < 200)
      .map(libros => "LECTURA CORTA: " + libros.titulo.toUpperCase)

    // map + sum: obtenemos la longitud de cada titulo y las sumamos todas
    val totalCaracteres = titulosFormateados.map(titulo => titulo.length).sum

    println("Reporte de Lecturas Rapidas:")
    titulosFormateados.foreach(println)
    println(s"Total de caracteres combinados: $totalCaracteres")
  }
}