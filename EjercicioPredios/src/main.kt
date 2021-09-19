import com.sun.jdi.connect.Connector
import java.time.LocalDate
fun main(arg:Array<String>){

    val localDate = LocalDate.now()
    //val datosH = Habitante("juana perez canseco",30,"F",true)
    //val datosZ = Zona("RES","Residencial")
   // val datosP = Predio(datosH,5,datosZ)
    val datosH = Habitante("Mario Yobany Chavez",25,"M",false)
    val datosZ = Zona("RES","Residencial")
    val datosP = Predio(datosH,5,datosZ)
    datosH.getName()
    datosH.getedad()
    val datosPago = Pago(localDate, listOf(datosP))
    datosP.getPredio()
    val total = datosPago.importeTotal()
   println(total)



    }






