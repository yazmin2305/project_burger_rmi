package cliente.controladores.cllbck;

import servidor.DTO.HamburguesaDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */

public interface CocineroCllbckInt extends Remote
{	
    public void notificar(ArrayList<HamburguesaDTO> lstHamburguesas, int cantidadUsuarios) throws RemoteException;
}


