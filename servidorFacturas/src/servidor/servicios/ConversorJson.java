package servidor.servicios;

import servidor.DTO.FacturaDTO;
import com.google.gson.Gson;

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
