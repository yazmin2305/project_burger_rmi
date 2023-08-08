package cliente.servicios;

import java.util.ArrayList;
import servidor.DTO.FacturaDTO;
import servidor.DTO.HamburguesaDTO;
/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */

public class InformacionFactura {

    public static String enviarPeticion(ArrayList<HamburguesaDTO> lstH) {
        FacturaDTO informacion = new FacturaDTO();
        float costoTotal = 0;
        informacion.setLstHamburguesas(lstH);
        for (int i = 0; i < lstH.size(); i++) {
            costoTotal = costoTotal + lstH.get(i).getCosto();
        }
        informacion.setCostoTotal(costoTotal);
        return ConversorJson.objectToJson(informacion);
    }
}
