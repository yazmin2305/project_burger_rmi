package servidor.DTO;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class NotificacionDTO implements Serializable{
    private ArrayList<HamburguesaDTO> lstHamburguesas;

    public NotificacionDTO() {
        this.lstHamburguesas = new ArrayList<>();
    }

    public ArrayList<HamburguesaDTO> getLstHamburguesas() {
        return lstHamburguesas;
    }

    public void setLstHamburguesas(ArrayList<HamburguesaDTO> lstHamburguesas) {
        this.lstHamburguesas = lstHamburguesas;
    }
    
    
}
