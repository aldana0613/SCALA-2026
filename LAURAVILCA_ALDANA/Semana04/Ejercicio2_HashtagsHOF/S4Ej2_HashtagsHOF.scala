//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Limpia y normaliza un Set de hashtags usando funciones de orden superior

@main def S4Ej2_HashtagsHOF(): Unit =
  val tagsOriginales = Set(" Scala ", "scala", "IA", " BigData", "bigdata ", "js")

  // map: aplicamos trim + minusculas a cada etiqueta (el Set elimina duplicados automaticamente)
  // filter: descartamos las etiquetas con menos de 3 caracteres
  val tagsLimpios = tagsOriginales
    .map(tag => tag.trim.toLowerCase)
    .filter(tag => tag.length >= 3)

  // mkString: concatenamos todas las etiquetas restantes separadas por coma
  val cadenaFinal = tagsLimpios.mkString(",")

  println(s"Hashtags finales: $cadenaFinal")