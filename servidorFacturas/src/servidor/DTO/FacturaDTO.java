/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.DTO;

import java.util.ArrayList;

/**
 *
 * @author eri-k
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
