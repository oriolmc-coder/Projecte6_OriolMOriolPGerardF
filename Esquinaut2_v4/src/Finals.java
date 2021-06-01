
import javafx.collections.ObservableList;

public class Finals {
    public String referencia;
    public String id_client;
    public String id_curs;
    public String data;


    public Finals (String referencia, String id_curs, String id_client, String data) {
        this.referencia = referencia;
        this.id_curs = id_curs;
        this.id_client = id_client;
        this.data = data;
    }

    Finals(int aInt) {
    }

    Finals() {
       
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public String getId_Client2() {
        return id_client;
    }

    public void setId_Client2(String id_client) {
        this.id_client = id_client;
    }
    
    public String getId_curs() {
        return id_curs;
    }

    public void setId_curs(String id_curs) {
        this.id_curs = id_curs;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

  
    @Override
    public String toString(){
        return ("REFERÈNCIA: " + this.referencia + "  NOM DEL CURS: " + this.id_client + "  ID DE CURS: " + this.id_curs + "  DATA: " + this.data);
    }
    
     
     
}
