package cliente.vista;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;
import servidor.controladores.ControladorGestorHamburguesasInt;

public class Menu {
    
    private final ControladorGestorHamburguesasInt objRemoto;
    
    public Menu(ControladorGestorHamburguesasInt objRemoto)
    {
        this.objRemoto=objRemoto;
    }
    
    public void ejecutarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            System.out.println("==Menu==");
            System.out.println("1. Registrar Hamburguesa");			
            System.out.println("2. Salir");

            opcion = UtilidadesConsola.leerEntero();

            switch(opcion)
            {
                case 1:
                        Opcion1();
                        break;
                case 2:
                        System.out.println("Salir...");
                        break;
                default:
                        System.out.println("Opción incorrecta");
            }

        }while(opcion != 2);
    }

    private void Opcion1() 
    {
        try
        {
            ArrayList<HamburguesaDTO> lstH = new ArrayList();    
            int costoH = 0;
            int costoIngExtra = 1000;
            
            System.out.println("==Registro Hamburguesa==");
            System.out.println("Cuántas hamburguesas desea pedir?");
            int cantHamburguesas = UtilidadesConsola.leerEntero();
            
            for (int i = 0; i < cantHamburguesas; i++) {
                HamburguesaDTO objHamburguesa = new HamburguesaDTO();
                System.out.println("Ingrese el identificador de la hamburguesa");
                objHamburguesa.setIdentificador(UtilidadesConsola.leerCadena());
                System.out.println("Ingrese el tipo de Hamburguesa (pequeña, mediana o grande) ");
                objHamburguesa.setTipo(UtilidadesConsola.leerCadena());
                switch (objHamburguesa.getTipo().toLowerCase()) {
                    case "pequeña":
                        costoH = 8000;
                        break;
                    case "mediana":
                        costoH = 12000;
                        break;                
                    case "grande":
                        costoH = 18000;
                        break;
                    default:
                        break;
                }
                System.out.println("Ingrese la cantidad de ingredientes extra: ");
                objHamburguesa.setIngredientesExtra(UtilidadesConsola.leerEntero());
                int cantIngredientesExtra = objHamburguesa.getIngredientesExtra();
                objHamburguesa.setCosto(costoH+(costoIngExtra*cantIngredientesExtra));
                lstH.add(objHamburguesa);
                System.out.println("\n");
            }
            
            boolean valor = objRemoto.registrarHamburguesa(lstH);//invocación del método remoto
            if (valor)
                System.out.println("Registro realizado satisfactoriamente...");
            else
                System.out.println("No se pudo realizar el registro...");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }    
}
