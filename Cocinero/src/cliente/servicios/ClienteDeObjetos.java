package cliente.servicios;

import cliente.controladores.cllbck.CocineroCllbckImpl;
import cliente.utilidades.UtilidadesConsola;
import cliente.utilidades.UtilidadesRegistroC;
import servidor.controladores.cllbck.ControladorServidorNotificacionInt;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */

public class ClienteDeObjetos {

    public static void main(String[] args) {

        try {
            ControladorServidorNotificacionInt servidor;
            int numPuertoRMIRegistry = 0;
            String direccionIpRMIRegistry = "";
            System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
            direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
            System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
            numPuertoRMIRegistry = UtilidadesConsola.leerEntero();

            servidor = (ControladorServidorNotificacionInt) UtilidadesRegistroC.obtenerObjRemoto(numPuertoRMIRegistry, direccionIpRMIRegistry, 
                    "controladorNotificacion");

            CocineroCllbckImpl objNuevoCocinero = new CocineroCllbckImpl();
            servidor.registrarReferenciaCocinero(objNuevoCocinero);
        } catch (Exception e) {
            System.out.println("No se pudo realizar la conexion...");
            System.out.println(e.getMessage());
        }
    }
}
