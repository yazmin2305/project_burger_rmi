package cliente.controladores.envioF;

import cliente.servicios.Conexion_cliente_servidor;
import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class EnvioFacturaImpl implements EnvioFacturaInt{
    Conexion_cliente_servidor cliente = new Conexion_cliente_servidor();
    int option = -1;
    int puerto=8080;
    String dirIP="localhost";
    @Override
    public void envioFactura(ArrayList<HamburguesaDTO> lstHamburguesas) {
        try {
            cliente.ServerConnection(dirIP, puerto);
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
        cliente.peticion_respuesta(lstHamburguesas);
    }
}
