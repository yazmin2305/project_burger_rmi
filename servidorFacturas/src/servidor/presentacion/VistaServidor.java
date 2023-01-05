package servidor.presentacion;

import java.util.Scanner;
import servidor.modelo.FabricaServidor;
import servidor.modelo.PlantillaServidor;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class VistaServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( Scanner objScanner = new Scanner(System.in)) {
            String tipo = "";
            int puerto = 0;
            FabricaServidor fabrica = new FabricaServidor();
            System.out.println("\nDigite el puerto de escucha: ");
            puerto = objScanner.nextInt();
            PlantillaServidor objServidor = fabrica.obtenerTipoServidor(tipo);
            objServidor.inicializarServidor(puerto);
            objServidor.ejecutarServidor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
