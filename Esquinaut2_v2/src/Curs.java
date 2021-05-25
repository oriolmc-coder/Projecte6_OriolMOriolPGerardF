
import javafx.collections.ObservableList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clientFX
 */
public class Curs {
    public String id_curs;
    public String nom_curs;
    public String preu_curs;
    public String nivell_curs;
    public double hores_curs;

    public Curs(String id_curs, String nom_curs, String preu_curs, String nivell_curs, double hores_curs) {
        this.id_curs = id_curs;
        this.nom_curs = nom_curs;
        this.preu_curs = preu_curs;
        this.nivell_curs = nivell_curs;
        this.hores_curs = hores_curs;
    }

//    Curs(int aInt) {
//    }

    Curs() {
       
    }

    public String getId_curs() {
        return id_curs;
    }

    public void setId_curs(String id_curs) {
        this.id_curs = id_curs;
    }

    public String getNom_curs() {
        return nom_curs;
    }

    public void setNom_curs(String nom_curs) {
        this.nom_curs = nom_curs;
    }

    public String getPreu_curs() {
        return preu_curs;
    }

    public void setPreu_curs(String preu_curs) {
        this.preu_curs = preu_curs;
    }

    public String getNivell_curs() {
        return nivell_curs;
    }

    public void setNivell_curs(String nivell_curs) {
        this.nivell_curs = nivell_curs;
    }

    public double getHores_curs() {
        return hores_curs;
    }

    public void setHores_curs(double hores_curs) {
        this.hores_curs = hores_curs;
    }

  @Override
  public String toString(){
     return ("ID CURS   "+ this.id_curs + "Nom Curs   " + this.nom_curs );
 }
   
    
     
     
}