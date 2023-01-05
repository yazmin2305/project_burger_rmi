package servidor.modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import servidor.DTO.FacturaDTO;
import servidor.servicios.GestionJSON;

public class GestorDeHilo extends Thread {

    private Socket objSocketCliente;

    public GestorDeHilo(Socket objSocket) {
        this.objSocketCliente = objSocket;
    }

    @Override
    public void run() {
        try {
            System.out.println("id del hilo generado:" + Thread.currentThread().getId());
            System.out.println("Atendiendo hilo de cliente");
            DataInputStream flujoEntrada;
            DataOutputStream flujoSalida;
            String message;
            flujoEntrada = new DataInputStream(objSocketCliente.getInputStream());
            flujoSalida = new DataOutputStream(objSocketCliente.getOutputStream());
            message = flujoEntrada.readUTF();//se bloquea el servidor
            String tmp = null;
            if (message.equals("caracteristicas")) {
                tmp = flujoEntrada.readUTF();// operacion bloqueante
                FacturaDTO objF = GestionJSON.JsonToObject(tmp);
                mostrarFactura(objF);
            }
            objSocketCliente.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void mostrarFactura(FacturaDTO objF) {
        System.out.println("===== Listado de hamburguesas compradas =====");

        for (int i = 0; i < objF.getLstHamburguesas().size(); i++) {
            System.out.println("Hamburguesa No: " + (i + 1));
            System.out.println("Identificador: " + objF.getLstHamburguesas().get(i).getIdentificador());
            System.out.println("Tipo: " + objF.getLstHamburguesas().get(i).getTipo());
            System.out.println("Cantidad de ingredientes extra: " + objF.getLstHamburguesas().get(i).getIngredientesExtra());
            System.out.println("Costo: " + objF.getLstHamburguesas().get(i).getCosto());
        }
        System.out.println("Costo con IVA del pedido: " + ((objF.getCostoTotal() * 0.19) + objF.getCostoTotal()));
        System.out.println("\n");
    }
}
