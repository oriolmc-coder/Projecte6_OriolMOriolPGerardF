
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
public class CursFederat extends CursClient {
    public String nivellFederat;
    public String numCarnet_fed;

    public CursFederat(String nivellFederat, String numCarnet, int referencia, int id_curs, int id_client, String data, double hores,String dni,double preu) {
        super(referencia, id_curs, id_client, data, hores,dni,preu);
        this.nivellFederat = nivellFederat;
        this.numCarnet_fed = numCarnet;
    }
    public CursFederat(){
        
    }

    public String getNivellFederat() {
        return nivellFederat;
    }

    public void setNivellFederat(String nivellFederat) {
        this.nivellFederat = nivellFederat;
    }

    public String getNumCarnet_fed() {
        return numCarnet_fed;
    }

    public void setNumCarnet(String numCarnet_fed) {
        this.numCarnet_fed = numCarnet_fed;
    }
      @Override
    public String toString(){
     return ("Id Curs:"+ this.id_curs + "Nivell Carnet:"+this.nivellFederat+"Numero Carnet"+this.numCarnet_fed+"Hores"+this.hores+"Data"+this.data+"Dni"+this.dni );
 }
    
    
}
