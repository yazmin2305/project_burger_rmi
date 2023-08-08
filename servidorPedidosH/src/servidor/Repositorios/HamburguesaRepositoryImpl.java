package servidor.Repositorios;

import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class HamburguesaRepositoryImpl implements HamburguesaRepositoryInt
{
    private ArrayList<HamburguesaDTO> misHamburguesas;
    

    public HamburguesaRepositoryImpl()
    {        
        this.misHamburguesas = new ArrayList();
    }
    @Override
    public boolean registrarHamburguesa(ArrayList<HamburguesaDTO> lstHamburguesas) {
        System.out.println("Entrando a registrar Hamburguesa");
        boolean bandera=false;
        misHamburguesas = lstHamburguesas;

        if (misHamburguesas != null) {
            bandera = true;
            System.out.println("Hamburguesas registradas");
        } 
        
        return bandera;
    }
    
}
