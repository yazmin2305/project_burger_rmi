package cliente.controladores.envioF;

import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public interface EnvioFacturaInt {
    public void envioFactura(ArrayList<HamburguesaDTO> lstHamburguesas);
}
