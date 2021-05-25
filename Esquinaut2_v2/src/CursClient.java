
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
    public LocalDate data;
    public double hores;

    public CursClient(int referencia, int id_curs, int id_client, LocalDate data, double hores) {
        this.referencia = referencia;
        this.id_curs = id_curs;
        this.id_client = id_client;
        this.data = data;
        this.hores = hores;
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

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getHores() {
        return hores;
    }

    public void setHores(double hores) {
        this.hores = hores;
    }

 
    
    
    
    
    
    
    
    
    
            
}

