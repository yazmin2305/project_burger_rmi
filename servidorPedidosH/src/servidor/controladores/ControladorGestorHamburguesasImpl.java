package servidor.controladores;

import cliente.controladores.envioF.EnvioFacturaInt;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;
import servidor.Repositorios.HamburguesaRepositoryInt;
import servidor.controladores.cllbck.ControladorServidorNotificacionImpl;
/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class ControladorGestorHamburguesasImpl extends UnicastRemoteObject implements ControladorGestorHamburguesasInt {
     private final HamburguesaRepositoryInt objHamburguesaRepository;
     private final ControladorServidorNotificacionImpl objNotificacion;
     private final EnvioFacturaInt objEnvioF;

    public ControladorGestorHamburguesasImpl(HamburguesaRepositoryInt objUsuariosRepository,EnvioFacturaInt objEnvioF, ControladorServidorNotificacionImpl objNotificacion) throws RemoteException
    {
        super(); //se asigna un puerto de escucha al OR
        this.objHamburguesaRepository=objUsuariosRepository;
        this.objNotificacion = objNotificacion;
        this.objEnvioF = objEnvioF;
        
    }
    @Override
    public boolean registrarHamburguesa(ArrayList<HamburguesaDTO> lstHamburguesas) throws RemoteException {
        boolean bandera = false;
        
        if(objHamburguesaRepository.registrarHamburguesa(lstHamburguesas)){
            this.objNotificacion.notificarCocineros(lstHamburguesas);
            this.objEnvioF.envioFactura(lstHamburguesas);
            bandera = true;
        }
        return bandera;
    }    
}
