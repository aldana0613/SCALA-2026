//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Genera un reporte de lecturas rapidas usando funciones

case class Libro(titulo: String, autor: String, paginas: Int)

def filtrarLibrosCortos(libros: List[Libro]): List[Libro] =
  // Creamos un iterador a partir de la lista
  var resultado: List[Libro] = List()
  for libro <- libros do //se recorre el iterador elemento por elemento
    if libro.paginas < 200 then //si el libro tiene menos de 100 paginas, entonces se agrega a la lista resultado
      resultado = resultado :+ libro
  resultado

def formatearTitulos(libros: List[Libro]): List[String] =
  var titulos: List[String] = List()
  for libro <- libros do
    titulos = titulos :+ ("LECTURA CORTA: " + libro.titulo.toUpperCase)
  titulos

def contarCaracteres(titulos: List[String]): Int =
  var total = 0
  for titulo <- titulos do
    total += titulo.length
  total

@main def S3Ej1_Libros(): Unit =
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