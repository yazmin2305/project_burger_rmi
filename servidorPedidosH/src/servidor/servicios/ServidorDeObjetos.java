package servidor.servicios;

import cliente.controladores.envioF.EnvioFacturaImpl;
import servidor.utilidades.UtilidadesRegistroS;
import servidor.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.Repositorios.HamburguesaRepositoryImpl;
import servidor.controladores.ControladorGestorHamburguesasImpl;
import servidor.controladores.cllbck.ControladorServidorNotificacionImpl;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class ServidorDeObjetos {

    public static void main(String[] args) throws RemoteException {

        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";

        System.out.println("Cual es la dirección ip donde se encuentra  el rmiRegistry ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry ");
        numPuertoRMIRegistry = UtilidadesConsola.leerEntero();

        HamburguesaRepositoryImpl objRepository = new HamburguesaRepositoryImpl();
        ControladorServidorNotificacionImpl objNotificacion = new ControladorServidorNotificacionImpl();
        EnvioFacturaImpl objEnvioFactura = new EnvioFacturaImpl();
        ControladorGestorHamburguesasImpl objRemoto = new ControladorGestorHamburguesasImpl(objRepository, objEnvioFactura, objNotificacion);//se leasigna el puerto de escucha del objeto remoto

        try {
            UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
            UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpRMIRegistry, numPuertoRMIRegistry, "controladorGestionHamburguesas");
            UtilidadesRegistroS.RegistrarObjetoRemoto(objNotificacion, direccionIpRMIRegistry, numPuertoRMIRegistry, "controladorNotificacion");        
        } catch (Exception e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }
    }
}
