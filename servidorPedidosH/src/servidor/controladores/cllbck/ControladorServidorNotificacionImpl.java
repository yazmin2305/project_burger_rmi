package servidor.controladores.cllbck;

import cliente.controladores.cllbck.CocineroCllbckInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class ControladorServidorNotificacionImpl extends UnicastRemoteObject implements ControladorServidorNotificacionInt {

    private final List<CocineroCllbckInt> cocineros;//lista que almacena la referencia remota de los clientes

    public ControladorServidorNotificacionImpl() throws RemoteException {
        super();
        cocineros = new ArrayList();
    }

    @Override
    public boolean registrarReferenciaCocinero(CocineroCllbckInt cocinero) throws RemoteException {
        System.out.println("Invocando al método registrar cocinero desde el servidor");
        boolean bandera = false;
        if (!cocineros.contains(cocinero)) {
            bandera = cocineros.add(cocinero);
        }
        return bandera;
    }

    public void notificarCocineros(ArrayList<HamburguesaDTO> lstHamburguesas) throws RemoteException {
        System.out.println("Invocando al método notificar cocineros desde el servidor");
        for (CocineroCllbckInt objCocinero : cocineros) {
            objCocinero.notificar(lstHamburguesas, cocineros.size());//el servidor hace el callback
        }
    }
}
