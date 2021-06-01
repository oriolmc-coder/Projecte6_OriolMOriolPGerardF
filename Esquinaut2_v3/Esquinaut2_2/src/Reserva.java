
import javafx.collections.ObservableList;

public class Reserva {
    public String id_curs;
    public String dni;
    public String data;


    public Reserva (String id_curs, String dni, String data) {
        
        this.dni = dni;
        this.data = data;
    }

    Reserva(int aInt) {
    }

    Reserva() {
       
    }

    public String getId_curs() {
        return id_curs;
    }

    public void setId_curs(String id_curs) {
        this.id_curs = id_curs;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

  
    @Override
    public String toString(){
        return ("ID DE CURS: " + this.id_curs + "  NOM DEL CURS: " + this.dni + "  DATA: " + this.data);
    }
    
     
     
}
