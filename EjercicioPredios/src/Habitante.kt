data class Habitante (val nombre: String, val edad: Int,
                      val sexo: String, val madreSoltera: Boolean) {
    fun getName(): String {
        println("El nombre es: $nombre")
        return nombre
    }
    fun getedad(): Int{
        println("La edad es: $edad")
        return edad
    }




}