
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
public abstract class CursClient {
   public int referencia;
   public int id_curs;
    public int id_client;
    public String data;
    public double hores;
    public String dni;
    public double preu;

    public CursClient(int referencia, int id_curs, int id_client, String data, double hores,String dni,double preu) {
        this.referencia = referencia;
        this.id_curs = id_curs;
        this.id_client = id_client;
        this.data = data;
        this.hores = hores;
        this.dni = dni;
        this.preu = preu;
    }
    public CursClient(){
        
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getId_curs() {
        return id_curs;
    }

    public void setId_curs(int id_curs) {
        this.id_curs = id_curs;
    }
    
     public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
     public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getHores() {
        return hores;
    }

    public void setHores(double hores) {
        this.hores = hores;
    }

 
    
    
    
    
    
    
    
    
    
            
}

