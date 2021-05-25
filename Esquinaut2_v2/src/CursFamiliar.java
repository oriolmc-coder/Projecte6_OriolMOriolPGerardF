
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clientFX
 */
public abstract class CursFamiliar extends CursClient {
    public boolean familiaNombrosa;
    public String numCarnet;

    public CursFamiliar(boolean familiaNombrosa, String numCarnet, int referencia, int id_curs, int id_client, LocalDate data, double hores) {
        super(referencia, id_curs, id_client, data, hores);
        this.familiaNombrosa = familiaNombrosa;
        this.numCarnet = numCarnet;
    }

    public boolean isFamiliaNombrosa() {
        return familiaNombrosa;
    }

    public void setFamiliaNombrosa(boolean familiaNombrosa) {
        this.familiaNombrosa = familiaNombrosa;
    }

    public String getNumCarnet() {
        return numCarnet;
    }

    public void setNumCarnet(String numCarnet) {
        this.numCarnet = numCarnet;
    }
    
    
}
