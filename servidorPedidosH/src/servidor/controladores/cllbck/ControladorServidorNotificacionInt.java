package servidor.controladores.cllbck;

import cliente.controladores.cllbck.CocineroCllbckInt;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public interface ControladorServidorNotificacionInt extends Remote {
    public boolean registrarReferenciaCocinero(CocineroCllbckInt cocinero) throws RemoteException;
   // public void enviarMensaje(String mensaje)throws RemoteException;
}
