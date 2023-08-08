package cliente.servicios;

import com.google.gson.Gson;
import servidor.DTO.FacturaDTO;

/**
 *
 * @author lmarango
 */
public class ConversorJson {
    public static String objectToJson(FacturaDTO information){
        Gson gson = new Gson();
        String response;
        response = gson.toJson(information);
        return response;
    }
}
