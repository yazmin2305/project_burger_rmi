package servidor.DTO;

import java.util.ArrayList;
/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class FacturaDTO {
    private ArrayList<HamburguesaDTO> lstHamburguesas;
    private float costoTotal;
    
    public FacturaDTO(){}
    public FacturaDTO(float costoTotal) {
        this.costoTotal = costoTotal;
        this.lstHamburguesas = new ArrayList();
    }

    public ArrayList<HamburguesaDTO> getLstHamburguesas() {
        return lstHamburguesas;
    }

    public void setLstHamburguesas(ArrayList<HamburguesaDTO> lstHamburguesas) {
        this.lstHamburguesas = lstHamburguesas;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }    
}
