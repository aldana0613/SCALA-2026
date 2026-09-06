//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Genera un reporte de lecturas rapidas usando funciones

case class Libro(titulo: String, autor: String, paginas: Int)

object Ej1_Libros {

  // Funcion que filtra manualmente los libros con menos de 200 paginas
  def filtrarLibrosCortos(libros: List[Libro]): List[Libro] = {
    var resultado: List[Libro] = List()
    for (libro <- libros) {
      if (libro.paginas < 200) {
        resultado = resultado :+ libro
      }
    }
    resultado
  }

  // Funcion que transforma los titulos a mayusculas con el prefijo
  def formatearTitulos(libros: List[Libro]): List[String] = {
    var titulos: List[String] = List()
    for (libro <- libros) {
      titulos = titulos :+ ("LECTURA CORTA: " + libro.titulo.toUpperCase)
    }
    titulos
  }

  // Funcion que cuenta el total de caracteres de todos los titulos combinados
  def contarCaracteres(titulos: List[String]): Int = {
    var total = 0
    for (titulo <- titulos) {
      total += titulo.length
    }
    total
  }

  def main(args: Array[String]): Unit = {
    val libros = List(
      Libro("El Principito", "Saint-Exupery", 96),
      Libro("Cien Anios de Soledad", "Garcia Marquez", 471),
      Libro("La Metamorfosis", "Kafka", 90),
      Libro("Rayuela", "Cortazar", 635)
    )

    val librosCortos = filtrarLibrosCortos(libros)
    val titulosFormateados = formatearTitulos(librosCortos)
    val totalCaracteres = contarCaracteres(titulosFormateados)

    println("Reporte de Lecturas Rapidas:")
    titulosFormateados.foreach(println)
    println(s"Total de caracteres combinados: $totalCaracteres")
  }
}