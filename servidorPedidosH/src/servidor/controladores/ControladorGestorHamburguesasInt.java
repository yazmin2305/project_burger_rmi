package servidor.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface ControladorGestorHamburguesasInt extends Remote {
    //Definicion del primer método remoto

    public boolean registrarHamburguesa(ArrayList<HamburguesaDTO> lstHamburguesas) throws RemoteException;
    //cada definición del método debe especificar que puede lanzar la excepción java.rmi.RemoteException
}
