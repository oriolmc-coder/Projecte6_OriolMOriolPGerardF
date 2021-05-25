
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
public abstract class CursFederat extends CursClient {
    public String nivellFederat;
    public String numCarnet;

    public CursFederat(String nivellFederat, String numCarnet, int referencia, int id_curs, int id_client, LocalDate data, double hores) {
        super(referencia, id_curs, id_client, data, hores);
        this.nivellFederat = nivellFederat;
        this.numCarnet = numCarnet;
    }

    public String getNivellFederat() {
        return nivellFederat;
    }

    public void setNivellFederat(String nivellFederat) {
        this.nivellFederat = nivellFederat;
    }

    public String getNumCarnet() {
        return numCarnet;
    }

    public void setNumCarnet(String numCarnet) {
        this.numCarnet = numCarnet;
    }
    
    
}
