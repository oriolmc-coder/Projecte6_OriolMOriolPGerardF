public class Client {
    public int id_client;
    public String dni;
    public String nom_client;
    public String cog_client;
    public int numCarnet_client;
    public boolean fam_nombrosa;
    
 public Client(int id_client, String dni, String nom_client, String cog_client, int numCarnet_client, boolean fam_nombrosa) {
        this.id_client = id_client;
        this.dni = dni;
        this.nom_client = nom_client;
        this.cog_client = cog_client;
        this.numCarnet_client = numCarnet_client;
        this.fam_nombrosa = fam_nombrosa;
    }

    Client() {
       
    }
    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getCog_client() {
        return cog_client;
    }

    public void setCog_client(String cog_client) {
        this.cog_client = cog_client;
    }

    public int getNumCarnet_client() {
        return numCarnet_client;
    }

    public void setNumCarnet_client(int numCarnet_client) {
        this.numCarnet_client = numCarnet_client;
    }

    public boolean isFam_nombrosa() {
        return fam_nombrosa;
    }

    public void setFam_nombrosa(boolean fam_nombrosa) {
        this.fam_nombrosa = fam_nombrosa;
    }

    @Override
    public String toString(){
        return ("ID DE CURS: " + this.id_client + "  DNI: " + this.dni + "  NOM DEL CURS: " + this.nom_client + "  COGNOM: " + this.cog_client + "  CARNET: " + this.numCarnet_client + "  FAMILIA NOMBROSA: " + this.fam_nombrosa);
    }
    
}
