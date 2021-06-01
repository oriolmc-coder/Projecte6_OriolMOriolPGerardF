
import java.awt.Insets;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Popup;
import javafx.stage.Stage;



/**
 *
 * @author 
 */
public class Esquinaut2 extends Application {
    
    Scene miEscena, miEscena2;
    Pane contenedor, contenedor2;
    Label lblNombre, labelDni, labelNom, labelID, lblApellidos, lblMensaje, labelTaula1, labelTaula2, labelTaula3, labelTaula4,labelData;
    TextField txtNombre,txtApellidos, tfID, tfNom, tfData;
    Button btnInserir, btnGuardarBD, btnConsultar;
    Connection conn = null;
    TableView<Curs> table;
    TableView<Client> table2;
    TableView<Reserva> table3;
    TableView<Finals> table4;


    

 
    public static void main(String[] args) throws SQLException, ClassNotFoundException, ExcepcioConnexio {
       Application.launch(args);
       Esquinaut2 curs = new Esquinaut2();
       //curs.visualitzarCursos();
       
      
          
    }
//   private void visualitzarCursos() throws SQLException, ClassNotFoundException{
//        
//        conectar();
//        obtenirCursosClients();
//        
//         
//            
//        }
//    private void obtenirCursosClients() throws SQLException, ClassNotFoundException{
//        obtenirCurs();
//    }
//    
//   
//       public void obtenirCurs() throws SQLException, ClassNotFoundException{
//           //getCurs();
//        
//           
//           
//           
//       }

    @Override
 
    public void start(Stage miEscenario) throws SQLException, ClassNotFoundException, FileNotFoundException, ExcepcioConnexio{
        
        final ImageView selectedImage = new ImageView();
        Image image1 = new Image(new FileInputStream("C:\\xampp\\htdocs\\ski\\media\\logo4.png"));
        selectedImage.setFitHeight(100);
        selectedImage.setFitWidth(135);
        
        
        selectedImage.setImage(image1);
        //TAULA
        TableColumn<Curs,String> colCurs = new TableColumn<>("Curs");
        TableColumn<Curs,String> idcursColumn = new TableColumn<>("ID CURS");
        idcursColumn.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
        //nomcurs column 
        TableColumn<Curs,String> nomColumn = new TableColumn<>("NOM DEL CURS");
     
        nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom_curs"));
    
        //preu
        TableColumn<Curs,String> preuColumn = new TableColumn<>("PREU DEL CURS");
       
        preuColumn.setCellValueFactory(new PropertyValueFactory<>("preu_curs"));
        
        //nivell federat
        TableColumn<Curs,String> nivellColumn = new TableColumn<>("NIVELL DEL CURS");
        nivellColumn.setCellValueFactory(new PropertyValueFactory<>("nivell_curs"));
        
        //hores
        TableColumn<Curs,Double> horesColumn = new TableColumn<>("HORES DEL CURS");
        horesColumn.setCellValueFactory(new PropertyValueFactory<>("hores_curs"));
        table = new TableView<>();
        table.getColumns().addAll(idcursColumn,nomColumn,preuColumn,nivellColumn,horesColumn);

        selectedImage.relocate(50,30);
        table.setMinWidth(510);
        table.setMaxHeight(200);
        table.relocate(50,170);
        table.setItems(getCurs());
        
        //--------------FI TAULA-------------
        
        //TAULA2
        TableColumn<Client,String> colClient = new TableColumn<>("Client");
        
        TableColumn<Client,String> idclientColumn = new TableColumn<>("ID CLIENT");
        idclientColumn.setCellValueFactory(new PropertyValueFactory<>("id_client"));
        
//nomcurs column 
        TableColumn<Client,String> nomclientColumn = new TableColumn<>("NOM");     
        nomclientColumn.setCellValueFactory(new PropertyValueFactory<>("nom_client"));
    
        //preu
        TableColumn<Client,String> cognomsColumn = new TableColumn<>("COGNOMS");
        cognomsColumn.setCellValueFactory(new PropertyValueFactory<>("cog_client"));
        
        //nivell federat
        TableColumn<Client,String> dniColumn = new TableColumn<>("DNI");
        dniColumn.setCellValueFactory(new PropertyValueFactory<>("dni"));
        
        //hores
        TableColumn<Client,String> carnetColumn = new TableColumn<>("NUM CARNET");
        carnetColumn.setCellValueFactory(new PropertyValueFactory<>("numCarnet_client"));
        
        //hores
        TableColumn<Client,String> famNombrosaColumn = new TableColumn<>("FAM. NOMBROSA");
        famNombrosaColumn.setCellValueFactory(new PropertyValueFactory<>("fam_nombrosa"));
        table2 = new TableView<>();
        table2.getColumns().addAll(idclientColumn,nomclientColumn,cognomsColumn,dniColumn,carnetColumn,famNombrosaColumn);

        table2.setMinWidth(510);
        table2.setMaxHeight(170);
        table2.relocate(50,400);
        table2.setItems(getClient());
        
        //--------------FI TAULA3-------------
        
        //TAULA3
        TableColumn<Reserva,String> colReserva = new TableColumn<>("Reserva");
        
        TableColumn<Reserva,String> idclientFormColumn = new TableColumn<>("DNI CLIENT");
        idclientFormColumn.setCellValueFactory(new PropertyValueFactory<>("dni"));
        
        //nomcurs column 
        TableColumn<Reserva,String> idcursFormColumn = new TableColumn<>("ID CURS");     
        idcursFormColumn.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
        
        //nomcurs column 
        TableColumn<Reserva,String> dataFormColumn = new TableColumn<>("DATA");     
        dataFormColumn.setCellValueFactory(new PropertyValueFactory<>("data"));
    
        table3 = new TableView<>();
        table3.getColumns().addAll(idclientFormColumn,idcursFormColumn,dataFormColumn);

        table3.setMinWidth(250);
        table3.setMaxHeight(170);
        table3.relocate(600,400);
        table3.setItems(getReserva());
        
        //--------------FI TAULA3-------------
        
        //TAULA4
        TableColumn<Finals,String> colFinals = new TableColumn<>("Finals");
        
        TableColumn<Finals,String> referenciaFinalColumn = new TableColumn<>("REFERENCIA");
        referenciaFinalColumn.setCellValueFactory(new PropertyValueFactory<>("referencia"));
        
        TableColumn<Finals,String> idclientFinalColumn = new TableColumn<>("DNI CLIENT");
        idclientFinalColumn.setCellValueFactory(new PropertyValueFactory<>("id_client"));
        
        //nomcurs column 
        TableColumn<Finals,String> idcursFinalColumn = new TableColumn<>("ID CURS");     
        idcursFinalColumn.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
        
        //nomcurs column 
        TableColumn<Finals,String> dataFinalColumn = new TableColumn<>("DATA");     
        dataFinalColumn.setCellValueFactory(new PropertyValueFactory<>("data"));
    
        table4 = new TableView<>();
        table4.getColumns().addAll(referenciaFinalColumn,idclientFinalColumn,idcursFinalColumn,dataFinalColumn);

        table4.setMinWidth(260);
        table4.setMaxHeight(170);
        table4.relocate(880,400);
        table4.setItems(getFinals());
        
        //--------------FI TAULA4-------------
        
        
        //----------BOTONS----------------
        
        btnInserir = new Button("Reservar");
        btnInserir.setStyle("-fx-font-weight: bold");
        btnInserir.setStyle("-fx-background-color: #7FFF00");
        btnInserir.relocate(590, 320);
        btnInserir.setOnAction(e->agregarCurs());
        btnInserir.setOnAction((event)->{
        agregarCurs();  
        }
         );
        
        
        btnGuardarBD = new Button("GuardarBD");
        btnGuardarBD.setStyle("-fx-font-weight: bold");
        btnGuardarBD.setStyle("-fx-background-color: #FFFF00");
        btnGuardarBD.relocate(50, 600);
        btnGuardarBD.setOnAction((event)->{
            try {  
                guardarReserves();
            } catch (SQLException ex) {
                
            } catch (ClassNotFoundException ex) {
                
            } catch (ExcepcioConnexio ex) {
               
            }
        }
        );
      
       //LABELFIELD

        labelNom = new Label("Introdueix el DNI del client: ");
        labelNom.setStyle("-fx-font-weight: bold");
        labelNom.relocate(590, 170);
        labelID = new Label("Introdueix el ID del curs: ");
        labelID.setStyle("-fx-font-weight: bold");
        labelID.relocate(590, 220);
        labelData = new Label("Introdueix la data: ");
        labelData.setStyle("-fx-font-weight: bold");
        labelData.relocate(590, 270);
        
        labelTaula1 = new Label("TAULA DE CURSOS DISPONIBLES");
        labelTaula1.setStyle("-fx-font-weight: bold");
        labelTaula1.relocate(50, 150);
        labelTaula2 = new Label("TAULA DE CLIENTS REGISTRATS");
        labelTaula2.setStyle("-fx-font-weight: bold");
        labelTaula2.relocate(50, 380);
        labelTaula3 = new Label("TAULA DE CURSOS RESERVATS ARA");
        labelTaula3.setStyle("-fx-font-weight: bold");
        labelTaula3.relocate(600, 380);
        labelTaula4 = new Label("TOTAL CURSOS RESERVATS");
        labelTaula4.setStyle("-fx-font-weight: bold");
        labelTaula4.relocate(880, 380);
         
       
        //TEXTFIELD
//        TextField tfDni = new TextField();
//        tfDni.relocate(740, 200);
        tfID = new TextField();
        tfID.setPromptText("NNNNNNNNL");
        tfID.relocate(760, 170);
        tfNom = new TextField();
        tfNom.relocate(760, 220);
        tfData = new TextField();
        tfData.setPromptText("DD/MM/AAAA");
        tfData.relocate(760, 270);
        
        
        
        
        
        
        
        
        
        
        
        
        
        contenedor = new Pane();
      // contenedor.getChildren().addAll(lblNombre,txtNombre,lblApellidos,txtApellidos,btnNuevo,btnGuardar,btnCancelar,lblMensaje,table);
        contenedor.getChildren().addAll(table, table2,btnInserir,btnGuardarBD,selectedImage,labelID, labelNom, tfID, tfNom, labelTaula1, labelTaula2,labelTaula3,labelTaula4,table3,tfData, labelData, table4);
        miEscena = new Scene(contenedor);
        table = new TableView<>();
        table2 = new TableView<>();
            
        
        miEscenario.setTitle("Esquinaut");
        miEscenario.setMinWidth(1280);
        miEscenario.setHeight(720);
        miEscenario.setScene(miEscena);
        miEscenario.show();
      
        
     
       
    
}
    
    public class ExcepcioConnexio extends Exception {
        public ExcepcioConnexio(String msg) {
            super(msg);
        }
    }
    
    private ObservableList<Reserva>reserva;
    public ObservableList<Reserva> getReserva(){
        reserva = FXCollections.observableArrayList();
        //Reserva a = new Reserva("2", "3434343434", "12/2/2022");
        //reserva.add(a);
        return reserva;
    }
    
    
    private ObservableList<Finals>finals;
       public ObservableList<Finals> getFinals() throws SQLException, ClassNotFoundException, ExcepcioConnexio{
        conectar();
        ObservableList<Finals> finals =FXCollections.observableArrayList();
     
        try{      
        String SQL = "Select * from cursosclients";            
        ResultSet rs = conn.createStatement().executeQuery(SQL);  
        while(rs.next()){
           Finals finals2 = new Finals();
           finals2.setReferencia(rs.getString("referencia"));
           finals2.setId_Client2(rs.getString("id_client"));
           finals2.setId_curs(rs.getString("id_curs"));
           finals2.setData(rs.getString("data"));
           finals.add(finals2);
           table4.setItems(finals);
    }
        } catch(SQLException e){
          e.printStackTrace();
          System.out.println("No mostra");            
    }
       // curs.getId_Curs(rs.getInt("id_curs"));
        
          
    return finals;
  
    }
    
    private ObservableList<Curs>curs;
       public ObservableList<Curs> getCurs() throws SQLException, ClassNotFoundException, ExcepcioConnexio{
        conectar();
        ObservableList<Curs> curs =FXCollections.observableArrayList();
     
        try{      
        String SQL = "Select * from curs";            
        ResultSet rs = conn.createStatement().executeQuery(SQL);  
        while(rs.next()){
           Curs curs2 = new Curs();
           curs2.setNom_curs(rs.getString("nom"));
           curs2.setId_curs(rs.getString("id_curs"));
           curs2.setPreu_curs(rs.getString("preu"));
           curs2.setNivell_curs(rs.getString("niv_federat"));
           curs2.setHores_curs(rs.getDouble("hores"));
           curs.add(curs2);
        table.setItems(curs);
    }
        } catch(SQLException e){
          e.printStackTrace();
          System.out.println("No mostra");            
    }
       // curs.getId_Curs(rs.getInt("id_curs"));
        
          
    return curs;
  
    }
       
    private ObservableList<Client>client;
       public ObservableList<Client> getClient() throws SQLException, ClassNotFoundException, ExcepcioConnexio{
        conectar();
        ObservableList<Client> client =FXCollections.observableArrayList();
     
        try{      
        String SQL = "Select * from client";            
        ResultSet rs = conn.createStatement().executeQuery(SQL);  
        while(rs.next()){
           Client client2 = new Client();
           client2.setId_client(rs.getInt("id_client"));
           client2.setNom_client(rs.getString("nom"));
           client2.setCog_client(rs.getString("cognoms"));
           client2.setDni(rs.getString("dni"));
           client2.setNumCarnet_client(rs.getInt("num_carnet"));
           client2.setFam_nombrosa(rs.getBoolean("fam_nombrosa"));
           client.add(client2);
           table2.setItems(client);
            System.out.println(rs.getString("dni"));
    }
        } catch(SQLException e){
          e.printStackTrace();
          System.out.println("No mostra");            
    }
       // curs.getId_Curs(rs.getInt("id_curs"));
        
          
    return client;
  
    }   
       
      
        public void guardarReserves() throws SQLException, ClassNotFoundException, ExcepcioConnexio{
            conectar();
            try{      
            String SQL = "INSERT INTO cursosclients (id_client, id_curs, data) VALUES (?, ?, ?)";   
            PreparedStatement sentencia = null;  
            sentencia = conectar().prepareStatement(SQL);
            
                if(sentencia != null){
                    for(int i=0; i<reserva.size(); i++){
                         System.out.println(reserva.get(i).getDni());   
                         sentencia.setString(1, reserva.get(i).getDni());
                         sentencia.setString(2, reserva.get(i).getId_curs());
                         sentencia.setString(3, reserva.get(i).getData());


                         //sentencia.addBatch();
                         //sentencia.executeUpdate();

                    }
                    //sentencia.executeBatch();
                    
                    sentencia.executeUpdate();
                    table3.getItems().clear();
                    getFinals();
                }
            
            }catch(SQLException e){
              e.printStackTrace();
              System.out.println("Error al desar" + e);            
            }
            
        }
        public void agregarCurs(){
               Reserva a = new Reserva();
               a.setId_curs(tfNom.getText());
               a.setDni(tfID.getText());
               a.setData(tfData.getText());
               
               table3.getItems().add(a);
              
               tfNom.clear();
               tfID.clear();
               tfData.clear();
               
              
               System.out.println(a);
          }
          public  Connection conectar() throws SQLException, ClassNotFoundException, ExcepcioConnexio{
           
            String servidor = "jdbc:mysql://192.168.111.1/esquinaut";
            String driver = "com.mysql.jdbc.Driver";
            String user = "topuser";
            String password = "Fat/3232";
            
        try{
            conn = DriverManager.getConnection(servidor , user , password);
            System.out.println(conn);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("No connectat");
        }
        return conn;
      }
    
}