data class Predio (val habitante: Habitante, val numPredios:Int, var clave: Zona){

    fun catalogoCostos(): Double {
        var zonas: Zona
        var costo: Double=0.00
        when (clave.clave){
            "MAR" -> {
                zonas = Zona(clave.clave,"Marginado")
                costo = 2.00
                println("Zona: " + zonas.zona + " Clave:" + clave.clave + " Costo:" + costo)
            }

            "RUR" -> {
                zonas = Zona(clave.clave,"Rural")
                costo = 8.00
                println("Zona:"+zonas.zona+" Clave:"+clave.clave+" Costo:"+costo)
            }
            "URB" ->{
                zonas = Zona(clave.clave,"Urbana")
                costo = 10.00
                println("Zona: "+zonas.zona+" Clave:"+clave.clave+" Costo:"+costo)
            }
            "RES" ->{
                zonas = Zona(clave.clave,"Residencial")
                costo = 25.00
                println("Zona: "+zonas.zona+" Clave:"+clave.clave+" Costo:"+costo)
            }
            else -> println("No se encotro regsitro de la ZONA")

        }
        return costo
    }

   fun calcularPago():Double{
       val costo: Double = catalogoCostos()
      return  (costo*this.numPredios)
   }
    fun getPredio(): Int{
        println("El numero de predios son: $numPredios" )
        return numPredios
    }



/*
[
  {"clave": "MAR","zona": "Marginado", "costo":  "2.00"},
  {"clave": "RUR","zona": "Rural", "costo":  "8.00"},
  {"clave": "URB","zona": "Urbana", "costo":  "10.00"},
  {"clave": "RES","zona": "Residencial", "costo":  "25.00"}
]
 */
}
