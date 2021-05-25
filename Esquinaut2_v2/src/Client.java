
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
public abstract class Client extends CursClient {
   public String dni;

    public Client(String dni, int referencia, int id_curs, int id_client, LocalDate data, double hores) {
        super(referencia, id_curs, id_client, data, hores);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
   
   

   
    
}
