
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
public  class CursFamiliar extends CursClient {
    public String familiaNombrosa;
    public String numCarnet_fam;

    public CursFamiliar(String familiaNombrosa, String numCarnet_fam, int referencia, int id_curs, int id_client, String data, double hores,String dni,double preu) {
        super(referencia, id_curs, id_client, data, hores,dni,preu);
        this.familiaNombrosa = familiaNombrosa;
        this.numCarnet_fam = numCarnet_fam;
    }

    CursFamiliar() {
        
    }
    

    public String FamiliaNombrosa() {
        return familiaNombrosa;
    }

    public void setFamiliaNombrosa(String familiaNombrosa) {
        this.familiaNombrosa = familiaNombrosa;
    }

    public String getNumCarnet_fam() {
        return numCarnet_fam;
    }

    public void setNumCarnet(String numCarnet_fam) {
        this.numCarnet_fam = numCarnet_fam;
    }
    @Override
    public String toString(){
     return ("Id Curs:"+ this.id_curs + "Familia Nombrosa:"+this.familiaNombrosa+"Numero Carnet"+this.numCarnet_fam+"Hores"+this.hores+"Data"+this.data+"Dni"+this.dni );
 }
    
    
}
