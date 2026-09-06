//Autor: Aldana Fátima Laura Vilca
//Código: u23100516
//Fecha de creacion: 05/09/2026
//Descripción:Limpia y normaliza un Set de hashtags usando funciones

object Ej2_Hashtags {

  // Funcion que limpia (trim + minusculas) y elimina duplicados manualmente
  def limpiarHashtags(tags: Set[String]): Set[String] = {
    var limpios: Set[String] = Set()
    for (tag <- tags) {
      val normalizado = tag.trim.toLowerCase
      limpios = limpios + normalizado  // el Set ya evita duplicados automaticamente
    }
    limpios
  }

  // Funcion que filtra las etiquetas con menos de 3 caracteres
  def filtrarValidos(tags: Set[String]): Set[String] = {
    var validos: Set[String] = Set()
    for (tag <- tags) {
      if (tag.length >= 3) {
        validos = validos + tag
      }
    }
    validos
  }

  // Funcion que concatena las etiquetas restantes separadas por coma
  def concatenarTags(tags: Set[String]): String = {
    var resultado = ""
    for (tag <- tags) {
      if (resultado.isEmpty) {
        resultado = tag
      } else {
        resultado = resultado + "," + tag
      }
    }
    resultado
  }

  def main(args: Array[String]): Unit = {
    val tagsOriginales = Set(" Scala ", "scala", "IA", " BigData", "bigdata ", "js")

    val limpios = limpiarHashtags(tagsOriginales)
    val validos = filtrarValidos(limpios)
    val cadenaFinal = concatenarTags(validos)

    println(s"Hashtags finales: $cadenaFinal")
  }
}
