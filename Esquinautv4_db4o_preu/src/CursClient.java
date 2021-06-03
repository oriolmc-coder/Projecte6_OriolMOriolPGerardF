
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
    public int hores;
    public String dni;
    public double preu;
    public double preufinal;

    public CursClient(int referencia, int id_curs, int id_client, String data, int hores,String dni,double preu,double preufinal) {
        this.referencia = referencia;
        this.id_curs = id_curs;
        this.id_client = id_client;
        this.data = data;
        this.hores = hores;
        this.dni = dni;
        this.preu = preu;
        this.preufinal = preufinal;
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
     public double getPreufinal() {
        return preufinal;
    }

    public void setPreufinal(double preufinal) {
        this.preufinal = preufinal;
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

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }
    

 
    
    
    
    
    
    
    
    
    
            
}

