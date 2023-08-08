package servidor.Repositorios;

import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public interface HamburguesaRepositoryInt {
    public boolean registrarHamburguesa(ArrayList<HamburguesaDTO> lstHamburguesas);
}
