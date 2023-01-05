package cliente.controladores.cllbck;

import servidor.DTO.HamburguesaDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */

public class CocineroCllbckImpl extends UnicastRemoteObject implements CocineroCllbckInt {

    public CocineroCllbckImpl() throws RemoteException {
        super();
    }

    @Override
    public void notificar(ArrayList<HamburguesaDTO> lstHamburguesas, int cantidadUsuarios) throws RemoteException {
        lstHamburguesas.forEach(
                a
                -> {
            System.out.println("Nombre: " + a.getIdentificador());
            System.out.println("Tipo hamburguesa: " + a.getTipo());
            System.out.println("Cantidad de ingredientes extra: " + a.getIngredientesExtra());
            System.out.println("\n");
        }
        );

        System.out.println("Cantidad de cocineros conectados: " + cantidadUsuarios);
    }

}
