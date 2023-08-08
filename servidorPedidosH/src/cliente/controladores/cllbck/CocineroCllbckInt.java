package cliente.controladores.cllbck;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public interface CocineroCllbckInt extends Remote {
    public void notificar(ArrayList<HamburguesaDTO> lstHamburguesas, int cantidadCocineros) throws RemoteException;
}
