package cliente.servicios;

import servidor.DTO.FacturaDTO;
import com.google.gson.Gson;

public class GestionJSON {
    public static FacturaDTO JsonToObject(String json){
        Gson gson = new Gson();
        FacturaDTO response = new FacturaDTO();
        response = gson.fromJson(json, FacturaDTO.class);
        return response;
    }
}
