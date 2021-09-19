import java.time.LocalDate

//data class Pago (val fecha: LocalDate, val predios: List<Predio>) {
 data class Pago (val fecha: LocalDate, val predios: List<Predio>) {

 fun importeTotal():Double {
        //sumOf toma una función de selector y devuelve una suma de sus valores en todos los elementos de una colección
        var total= predios.sumOf {
            it.calcularPago()
            //it(iterrado)-> para recorrer automaticamente cada elemento de la lista <predio>
        }
     println("La multipliacion del predio por el numero de unidades son: $total")
        val habitante = predios.get(0).habitante
        if(habitante.edad>=70 || habitante.madreSoltera)
            total = if (fecha.monthValue<=2)total*0.70
            else total*0.50
        else if (fecha.monthValue>2)
            total = total*0.40
               println("El total a pagar por los prediales es:")
        return (total)


    }





}


