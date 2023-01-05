package servidor.DTO;

import java.io.Serializable;

/**
 *
 * @author Erika Camacho - Yazmin Gutierrez
 */
public class HamburguesaDTO implements Serializable
{
    private String identificador;
    private String tipo;
    private int ingredientesExtra;
    private int costo;

    public HamburguesaDTO(){}
    public HamburguesaDTO(String identificador, String tipo, int ingredientesExtra, int costo) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.ingredientesExtra = ingredientesExtra;
        this.costo = costo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIngredientesExtra() {
        return ingredientesExtra;
    }

    public void setIngredientesExtra(int ingredientesExtra) {
        this.ingredientesExtra = ingredientesExtra;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
