//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción: Genera un reporte de lecturas rapidas usando funciones de orden superior

case class Libro(titulo: String, autor: String, paginas: Int)

@main def S4Ej1_LibrosHOF(): Unit =
  val libros = List(
    Libro("El Principito", "Saint-Exupery", 96),
    Libro("Cien Anios de Soledad", "Garcia Marquez", 471),
    Libro("La Metamorfosis", "Kafka", 90),
    Libro("Rayuela", "Cortazar", 635)
  )

  // filter: nos quedamos solo con libros de menos de 200 paginas
  // map: transformamos cada libro en su titulo formateado
  val titulosFormateados = libros
    .filter(libro => libro.paginas < 200)
    .map(libro => "LECTURA CORTA: " + libro.titulo.toUpperCase)

  // map + sum: obtenemos la longitud de cada titulo y las sumamos todas
  val totalCaracteres = titulosFormateados.map(titulo => titulo.length).sum

  println("Reporte de Lecturas Rapidas:")
  titulosFormateados.foreach(println)
  println(s"Total de caracteres combinados: $totalCaracteres")