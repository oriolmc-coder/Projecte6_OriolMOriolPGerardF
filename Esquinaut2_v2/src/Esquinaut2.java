
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 *
 * @author 
 */
public class Esquinaut2 extends Application {
      static Scanner sc = new Scanner(System.in);
    Scene miEscena;
    Pane contenedor;
    Label lblNombre, lblApellidos, lblMensaje,l1,l2,labelNom,labelID,labelDni;
    TextField txtNombre,txtApellidos,tfNom,tfID,tfDni;
    Button btnInserir, btnGuardarBD, btnConsultar;
    Connection conn =null;
   TableView<Curs> table;
   TableView<Curs> taulaArray;
   TableView<CursClient> table2;
   
 
 
 //Es crea un ArrayList per guardar objectes de tipo Curs.
    //static ArrayList<Curs> cursos = new ArrayList();
    


    

 
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Application.launch(args);
       Esquinaut2 curs = new Esquinaut2();
      
       
      
          
    }
//   private void visualitzarCursos() throws SQLException, ClassNotFoundException{
//        
//        conectar();
//        obtenirCursosClients();
////        llegirCursos();
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
 
    public void start(Stage miEscenario) throws SQLException, ClassNotFoundException{  
     //TAULA
        TableColumn<Curs,String> colCurs = new TableColumn<>("Curs");
         TableColumn<Curs,String> idcursColumn = new TableColumn<>("id_curs");
      idcursColumn.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
       //nomcurs column 
       TableColumn<Curs,String> nomColumn = new TableColumn<>("nom_curs");
      nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom_curs"));
    
       //preu
        TableColumn<Curs,String> preuColumn = new TableColumn<>("preu_curs");
        preuColumn.setCellValueFactory(new PropertyValueFactory<>("preu_curs"));
        
        //nivell federat
        TableColumn<Curs,String> nivellColumn = new TableColumn<>("nivell_curs");
        nivellColumn.setCellValueFactory(new PropertyValueFactory<>("nivell_curs"));
        
        //hores
      TableColumn<Curs,Double> horesColumn = new TableColumn<>("hores_curs");
      horesColumn.setCellValueFactory(new PropertyValueFactory<>("hores_curs"));
     table = new TableView<>();
         table.getColumns().addAll(idcursColumn,nomColumn,preuColumn,nivellColumn,horesColumn);

        
        table.relocate(100,50);
        table.setItems(getCurs());
        
        //--------------FI TAULA-------------
        
        //----------BOTONS----------------
        
        Button btnInserir = new Button("Inserir");
        btnInserir.relocate(700, 600);
//        btnInserir.setOnAction(e->agregarCurs());
        btnInserir.setOnAction((event)->{
          agregarCurs();  
        }
        
        );
        
         btnConsultar = new Button("Carregar array");
        btnConsultar.relocate(770, 600);
        
         btnGuardarBD = new Button("GuardarBD");
        btnGuardarBD.relocate(890, 600);
        //LABELFIELD
        labelDni = new Label("Introdueix DNI: ");
         labelDni.relocate(590, 200);
        labelNom = new Label("Introdueix el NOM: ");
         labelNom.relocate(590, 250);
        labelID = new Label("Introdueix el ID: ");
        labelID.relocate(590, 300);
         
       
        //TEXTFIELD
//        TextField tfDni = new TextField();
//        tfDni.relocate(740, 200);
        tfID = new TextField();
        tfID.relocate(740, 250);
        tfNom = new TextField();
        tfNom.relocate(740, 300);
        
        contenedor = new Pane();
       // contenedor.getChildren().addAll(lblNombre,txtNombre,lblApellidos,txtApellidos,btnNuevo,btnGuardar,btnCancelar,lblMensaje,table);
         contenedor.getChildren().addAll(table,btnInserir,btnConsultar,btnGuardarBD,labelNom,labelID,tfID,tfNom,labelDni);
        miEscena = new Scene(contenedor);
        table = new TableView<>();
            
        
        miEscenario.setTitle("Esquinaut");
        miEscenario.setMinWidth(1280);
        miEscenario.setHeight(720);
        miEscenario.setScene(miEscena);
        miEscenario.show();
      
        
     
       
    
}
    private ObservableList<Curs>curs;
       public ObservableList<Curs> getCurs() throws SQLException, ClassNotFoundException{
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
          public  Connection conectar() throws SQLException, ClassNotFoundException{
           
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
           
          public void agregarCurs(){
                Curs a = new Curs();
               a.setNom_curs(tfNom.getText());
               a.setId_curs(tfID.getText());
                
              
               tfNom.clear();
               tfID.clear();
              
               System.out.println(a);
          }

   
}